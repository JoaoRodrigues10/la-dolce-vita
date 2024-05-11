<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="UTF-8" />
    <meta http-equiv="X-UA-Compatible" content="IE=edge" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <title>Carrinho de Compras</title>
    <link rel="stylesheet" href="/css/carrinho.css" />
    <link
      href="https://unpkg.com/boxicons@2.1.4/css/boxicons.min.css"
      rel="stylesheet"
    />
  </head>
  <body>
<<<<<<< Updated upstream
  <span>${sessioScoped.id}</span>
              <input type="hidden" id="" name="" valeu="${sessionScoped.id}">
=======
>>>>>>> Stashed changes
    <main>
      <div class="title">CARRINHO</div>
      <div class="content">
        <div class="parte1">
            <section>
              <table>
                <thead>
                  <tr>
                    <th>Produto</th>
                    <th>Preço</th>
                    <th>Quantidade</th>
                    <th>Total</th>
                    <th>-</th>
                  </tr>
                </thead>
                <tbody>
                  <tr>
                    <td>
                      <div class="product">
                        <img src="img/bolocarrinho.png" alt="" />
                        <div class="info">
                          <div class="name">Nome do produto</div>
                          <div class="category">Categoria</div>
                        </div>
                      </div>
                    </td>
                    <td>R$ 120</td>
                    <td>
                      <div class="qty">
                        <button><i class="bx bx-minus"></i></button>
                        <span>2</span>
                        <button><i class="bx bx-plus"></i></button>
                      </div>
                    </td>
                    <td>R$ 240</td>
                    <td>
                      <button class="remove"><i class="bx bx-x"></i></button>
                    </td>
                  </tr>
                  <tr>
                    <td>
                      <div class="product">
                        <img src="img/bolocarrinho.png" alt="" />
                        <div class="info">
                          <div class="name">Nome do produto</div>
                          <div class="category">Categoria</div>
                        </div>
                      </div>
                    </td>
                    <td>R$ 120</td>
                    <td>
                      <div class="qty">
                        <button><i class="bx bx-minus"></i></button>
                        <span>2</span>
                        <button><i class="bx bx-plus"></i></button>
                      </div>
                    </td>
                    <td>R$ 240</td>
                    <td>
                      <button class="remove"><i class="bx bx-x"></i></button>
                    </td>
                  </tr>
                  <tr>
                    <td>
                      <div class="product">
                        <img src="img/bolocarrinho.png" alt="" />
                        <div class="info">
                          <div class="name">Nome do produto</div>
                          <div class="category">Categoria</div>
                        </div>
                      </div>
                    </td>
                    <td>R$ 120</td>
                    <td>
                      <div class="qty">
                        <button><i class="bx bx-minus"></i></button>
                        <span>2</span>
                        <button><i class="bx bx-plus"></i></button>
                      </div>
                    </td>
                    <td>R$ 240</td>
                    <td>
                      <button class="remove"><i class="bx bx-x"></i></button>
                    </td>
                  </tr>
                </tbody>
              </table>
            </section>

        <div class="parte2">
            <div class="title">RESUMO DA COMPRA</div>
            <aside>
              <div class="box">
                <div class="info">
                  <div><span>Sub-total</span><span>R$ 418</span></div>
                  <div><span>Frete</span><span>Gratuito</span></div>
                  <div>
                    <button>
                      Adicionar cupom de desconto
                      <i class="bx bx-right-arrow-alt"></i>
                    </button>
                  </div>
                </div>
                <footer>
                  <span>Total</span>
                  <span>R$ 418</span>
                </footer>
              </div>
              <button>Finalizar Compra</button>
            </aside>
        </div>
      </div>
    </main>
  </body>
</html>