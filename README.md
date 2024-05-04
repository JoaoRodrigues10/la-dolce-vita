# La-Dolce-Vita
Projeto PI 3

Script Banco de Dados

CREATE TABLE CLIENTES (
    ID_CLIENTE INT PRIMARY KEY AUTO_INCREMENT,	 
    EMAIL VARCHAR(250) NOT NULL,
    CPF VARCHAR(11) NOT NULL UNIQUE,
    NOME VARCHAR(250) NOT NULL,
    DATA_NASCIMENTO DATE NOT NULL,
    SENHA VARCHAR(250) NOT NULL,
    TELEFONE VARCHAR(15) NOT NULL,
    ID_ENDERECO INT,
    ID_PEDIDO INT
);
	
CREATE TABLE ENDERECOS (
    ID_ENDERECO INT PRIMARY KEY AUTO_INCREMENT,
    ID_CLIENTE INT NOT NULL,
    CEP VARCHAR(8) NOT NULL,
    RUA VARCHAR(250) NOT NULL,
    CIDADE VARCHAR(250) NOT NULL,
    BAIRRO VARCHAR(250) NOT NULL,
    ESTADO VARCHAR(2) NOT NULL,
    NUMERO VARCHAR(10) NOT NULL,
    COMPLEMENTO VARCHAR(250),
    REFERENCIA VARCHAR(250)  
);
    ALTER TABLE CLIENTES ADD FOREIGN KEY (ID_ENDERECO) REFERENCES ENDERECOS(ID_ENDERECO);
    ALTER TABLE ENDERECOS ADD FOREIGN KEY (ID_CLIENTE) REFERENCES CLIENTES(ID_CLIENTE);	
	
    
CREATE TABLE PRODUTOS (
    ID_PRODUTO INT PRIMARY KEY AUTO_INCREMENT,
    NOME VARCHAR(255) NOT NULL,
    CATEGORIA VARCHAR(100) NOT NULL,
    DESCRICAO TEXT NOT NULL,
    PRECO DECIMAL(10, 2) NOT NULL
);

CREATE TABLE ITENS_DO_PEDIDO (
    ID_ITENS_DO_PEDIDO INT PRIMARY KEY AUTO_INCREMENT,
    ID_PRODUTO INT NOT NULL,
    NOME_DO_PRODUTO VARCHAR(255) NOT NULL,
    QUANTIDADE INT NOT NULL,
    PRECO_UNIDADE DECIMAL(10, 2) NOT NULL,
    FOREIGN KEY (ID_PRODUTO) REFERENCES PRODUTOS(ID_PRODUTO)
);
    	
CREATE TABLE PEDIDOS (
    ID_PEDIDO INT PRIMARY KEY AUTO_INCREMENT,
    ID_CLIENTE INT NOT NULL,
    ID_ENDERECO INT NOT NULL,
    ID_ITENS_DO_PEDIDO INT NOT NULL,
    VALOR_TOTAL DECIMAL(10, 2) NOT NULL,
    DATA_COMPRA DATE NOT NULL,
    STATUS VARCHAR(255) NOT NULL
);
    ALTER TABLE CLIENTES ADD FOREIGN KEY (ID_PEDIDO) REFERENCES PEDIDOS(ID_PEDIDO);	
    ALTER TABLE PEDIDOS ADD FOREIGN KEY (ID_CLIENTE) REFERENCES CLIENTES(ID_CLIENTE);
    ALTER TABLE PEDIDOS ADD FOREIGN KEY (ID_ENDERECO) REFERENCES ENDERECOS(ID_ENDERECO);
    ALTER TABLE PEDIDOS ADD FOREIGN KEY (ID_ITENS_DO_PEDIDO) REFERENCES ITENS_DO_PEDIDO(ID_ITENS_DO_PEDIDO); 
 
Requisitos Funcionais

1 – Permitir que os clientes se cadastrem no site fornecendo informações básicas, como nome,
endereço, e-mail e senha.

2 – Permitir que o administrador e o cliente façam login em suas respectivas áreas usando
credenciais únicas.

3 – O sistema deve conter um Painel do Administrador onde ele pode: Visualizar itens mais
vendidos (mostrar uma tabela ou gráfico com os produtos mais vendidos durante um período
específico); exibir o lucro total gerado pela venda de produtos e gerenciar/visualizar o estoque
(permitir adição, remoção e edição de itens no estoque).

4 – O Sistema deve conter atualizações automáticas após vendas (Atualizar todas as tabelas
com suas devidas informações e o estoque).

5 – Permitir aos clientes navegarem pelos produtos disponíveis na confeitaria.

6 – Adição ao Carrinho: Possibilitar que os clientes adicionem produtos ao carrinho de compras.

7 – Finalização de Compra: Permitir que os clientes finalizem suas compras, fornecendo
informações de envio e pagamento.

8 – Após o registro, os clientes devem ter acesso a uma área exclusiva onde possam visualizar o
histórico de pedidos realizados, acompanhar o status de entrega e acessar informações sobre
seus pedidos anteriores.

9 – A área exclusiva de clientes deve permitir que eles atualizem suas informações de perfil,
como endereço de entrega, número de telefone etc.

Requisitos não funcionais

1 – Garantir que todas as informações sensíveis, como senhas e informações de pagamento,
sejam criptografadas durante a transmissão.

2 – Implementar políticas de controle de acesso para proteger áreas sensíveis do sistema, como
o painel do administrador.

3 – Interface de usuário intuitiva e fácil de usar tanto para o administrador quanto para o cliente.

4 – Garantir tempos de resposta rápidos para o carregamento de páginas e processamento de
pedidos.

MER

![image](https://github.com/JoaoRodrigues10/la-dolce-vita/assets/143283670/e6563e83-04e3-44f9-9de9-242e0c6d4a6e)

 Diagrama UML
 
 ![Diagrama sem nome drawio](https://github.com/JoaoRodrigues10/la-dolce-vita/assets/133686132/cd1bf181-36ed-4905-8004-941210c838b0)

Prótotipo Área do Administrador

Paleta de cores

![image](https://github.com/JoaoRodrigues10/la-dolce-vita/assets/143104412/e2f9d27a-e952-4352-91e0-34f77530edf2)

Área de Login do Administrador

![image](https://github.com/JoaoRodrigues10/la-dolce-vita/assets/143104412/086721f4-5b3c-4757-8558-a6f14e49110a)

Menu com acesso aos Lucros, estoque e produtos mais vendidos.

![image](https://github.com/JoaoRodrigues10/la-dolce-vita/assets/143104412/e70a293b-f06e-41e3-99cd-4ad0f7919ec2)

Página para adicionar novos produtos com campos para preenchimento de dados, upload de imagem para a identificação do produto 
e a opção de limpar os campos.

![image](https://github.com/JoaoRodrigues10/la-dolce-vita/assets/143104412/536ae04f-33c2-4029-b6e7-7dd8b0d298ac)

Página de controle de estoque. Possível editar informações do produto, como: Preço, nome e quantidade. E também deletar produtos.

![image](https://github.com/JoaoRodrigues10/la-dolce-vita/assets/143104412/6f193800-0083-4e0b-a062-326a4419dd6a)

Página de fluxo de caixa. Exibe a entrada e saida de dinheiro e sendo possível filtrar por data, codigo do produto, cliente ou valor.

![image](https://github.com/JoaoRodrigues10/la-dolce-vita/assets/143104412/77b2cd43-4520-4bcc-b3d3-e99283e5787f)


Exibe o rank de produtos. Podendo vizualizar meses anteriores, pesquisar pelo codigo do produto. 

![image](https://github.com/JoaoRodrigues10/la-dolce-vita/assets/143104412/662f8b14-9ab6-428b-94a3-06019cb8355c)



Protótipo Usuários


- Tela Início

![image](https://github.com/JoaoRodrigues10/la-dolce-vita/assets/89986701/f446e8e2-e271-4df6-bfb5-353177e4979f)
![image](https://github.com/JoaoRodrigues10/la-dolce-vita/assets/89986701/69ce2152-4e7a-4306-a678-eaddda4362a0)

- Tela Menu

![image](https://github.com/JoaoRodrigues10/la-dolce-vita/assets/89986701/6539a577-5597-4232-a798-9ad324d8ddf3)

- Tela Bolos
  
![image](https://github.com/JoaoRodrigues10/la-dolce-vita/assets/89986701/2c6a5be2-7b40-4a76-b344-2aa5f6fa6ca3)

- Tela Bolos quando abre um item

![image](https://github.com/JoaoRodrigues10/la-dolce-vita/assets/89986701/29a96c90-7f65-4805-8490-6caf57203a17)

- Tela Tortas

![image](https://github.com/JoaoRodrigues10/la-dolce-vita/assets/89986701/da6a7a23-f76a-4bfd-a2b4-97d821776cb9)

- Tela Gateaus

![image](https://github.com/JoaoRodrigues10/la-dolce-vita/assets/89986701/023cebec-4e4f-4784-8c06-0ee4633bee97)

- Tela Doces

![image](https://github.com/JoaoRodrigues10/la-dolce-vita/assets/89986701/2113f5f7-63fe-4959-a2fd-e1f3ace1a3b1)

- Tela Perfil

![image](https://github.com/JoaoRodrigues10/la-dolce-vita/assets/89986701/571a9152-1873-42ce-94fc-416cd7cac18f)

- Tela Carrinho

![image](https://github.com/JoaoRodrigues10/la-dolce-vita/assets/89986701/fd50c136-abf2-4b04-831e-87ab98f4a60d)
