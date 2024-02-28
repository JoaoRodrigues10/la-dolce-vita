
document.getElementById('carrinho-icon').addEventListener('click', function(event) {
    event.stopPropagation(); // Evita que o clique se propague para o contêiner pai
    document.getElementById('myModal').style.display = 'block';
});


document.querySelector('.close').addEventListener('click', function() {
    document.getElementById('myModal').style.display = 'none';
});

window.addEventListener('click', function(event) {
    if (event.target == document.getElementById('myModal')) {
        document.getElementById('myModal').style.display = 'none';
    }
});