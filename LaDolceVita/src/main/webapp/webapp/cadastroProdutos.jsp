<html>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<head>
<meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link href="/webjars/bootstrap/5.3.3/css/bootstrap.min.css" rel="stylesheet">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz" crossorigin="anonymous"></script>
    <link rel="stylesheet" href="css/login_style.css">
            <link rel="stylesheet" href="css/style.css">
            <link rel="stylesheet" href="css/menu.css">







</head>
<body>

 <div class="row">
                              <div class="col"></div>
                              <div class="col-md-auto"></div>

                              <div class="col col-lg-1">
                                   <c:if test="${sessionScope.loggedUser != null}">
                                       <span>${sessionScope.loggedUser}</span>
                                       <a href="/logout">Logout</a>
                                   </c:if>
                              </div>
                            </div>
                          </div>


<div class="main-login">


<div class="card-login">


<form class="login" action="/create-produto" method="post" enctype="multipart/form-data">
        <div class="textfield">
        <h1>Novo Produto</h1>
            <label>Nome</label>
            <input type="text" name="name-produto" id="name-produto" value="${param.name}">
            <input type="hidden" id="id" name="id" value="${param.id}">
        </div>


        <div class="textfield">
            <label>Preco</label>
            <input type="text" name="preco-produto" id="preco-produto" value="${param.preco}">
        </div>

        <div class="textfield">
            <label>Categoria</label>
            <select name="categoria-produto" id="categoria-produto" class="form-select" required aria-label="select example">
                        <option>-----Selecione uma opcao-----</option>
                        <option value="Bolo" ${param.categoria == 'Bolo' ? 'selected' : ''}>Bolo</option>
                        <option value="Torta" ${param.categoria == 'Torta' ? 'selected' : ''}>Torta</option>
                        <option value="Gateau" ${param.categoria == 'Gateau' ? 'selected' : ''}>Gateau</option>
            </select>
             <div class="invalid-feedback">Example invalid select feedback</div>

        </div>



        <div class="textfield">
            <label>Descricao</label>
            <input type="text"  name="descricao-produto" id="descricao-produto" value="${param.descricao}">
        </div>
    <br>
    <br>



        <div class="container" id="box">
            <h2 id="h2-avatar"></h2>


              <input type="file" name="image" id="image" class="form-control" aria-label="file example" required>
          </div>

 <script>
    const avatarImage = document.querySelector('#image');
    const h2Avatar = document.querySelector('#h2-avatar');

    avatarImage.addEventListener('change', event => {
      const preview = document.querySelector('#preview-image');

      if (preview) {
        preview.remove();
      }

      const reader = new FileReader;

      reader.onload = function(event) {
        const previewImage = document.createElement('img');
        previewImage.width = 150;
        previewImage.height = 110;
        previewImage.id = 'preview-image';
        previewImage.src = event.target.result;
        h2Avatar.insertAdjacentElement('afterend', previewImage);
      }

      reader.readAsDataURL(avatarImage.files[0]);

    })
  </script>



    <br>
    <button type="button" class="btn btn-custom" data-bs-toggle="modal" data-bs-target="#staticBackdrop">
      add produto
    </button>


    <div class="modal fade" id="staticBackdrop" data-bs-backdrop="static" data-bs-keyboard="false" tabindex="-1" aria-labelledby="staticBackdropLabel" aria-hidden="true">
      <div class="modal-dialog">
        <div class="modal-content">
          <div class="modal-header">
            <h1 class="modal-title fs-5" id="staticBackdropLabel">CONFIRMACAO</h1>
            <button type="button" class="btn-close" data-bs-dismiss="modal" aria-label="Close"></button>
          </div>

          <div class="modal-body">
            <p>Tenha certeza de que os dados foram preenchidos corretamente. <br>
            Você está certo de adicionar este produto no @LADOLCEVITA </p>
          </div>
          <div class="modal-footer">
            <button type="button" class="btn btn-secondary" data-bs-dismiss="modal">Cancelar</button>
            <button class="btn btn-customm" data-bs-toggle="modal" data-bs-target="#exampleModal" type="submit">Add </button>
          </div>
        </div>
      </div>
    </div>



</form>
</div>
</div>
        <div class="aviso">
            <div class="comunicado">WWW.LADOLCEVITA.COM.BR</div>
        </div>
</body>
</html>