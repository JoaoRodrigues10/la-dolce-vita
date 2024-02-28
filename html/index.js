// Abre o modal quando o ícone do carrinho é clicado
document.getElementById('carrinho-icon').addEventListener('click', function(event) {
    event.stopPropagation(); // Evita que o clique se propague para o contêiner pai
    document.getElementById('myModal').style.display = 'block';
});

// Fecha o modal quando o usuário clica no botão de fechar (×)
document.querySelector('.close').addEventListener('click', function() {
    document.getElementById('myModal').style.display = 'none';
});

// Fecha o modal quando o usuário clica fora da área do modal
window.addEventListener('click', function(event) {
    if (event.target == document.getElementById('myModal')) {
        document.getElementById('myModal').style.display = 'none';
    }
});