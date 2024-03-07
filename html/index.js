
const modalLogin = document.querySelector('.modalLogin');
const linkregistrar = document.querySelector('.link-register');
const linklogin = document.querySelector('.link-login');
const btnmodallogin = document.querySelector('.btn-modal-login');
const btnfecharmodallogin = document.querySelector('.icon-close');

linkregistrar.addEventListener('click', () => {
    modalLogin.classList.add('ativo');
});

linklogin.addEventListener('click', () => {
    modalLogin.classList.remove('ativo');
});

btnmodallogin.addEventListener('click', () => {
    modalLogin.classList.add('modal-ativo');
});

btnfecharmodallogin.addEventListener('click', () => {
    modalLogin.classList.remove('modal-ativo');
});