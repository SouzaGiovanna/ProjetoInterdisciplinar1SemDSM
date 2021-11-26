function validarCadastro(){
    let senha = cadastro.senha.value;
    let confirma = cadastro.confirma.value;
    let registro = cadastro.registro_txt.value;
    
    let regex = /[A-Za-z\d@$!%*#?&]/;

    if(isNaN(registro)){
        alert("O número de Registro na Fatec precisa ser um número inteiro");
        return false;
    }

    if(regex.test(senha)){
        alert("Sua senha precisa ter pelo menos uma letra maiúscula, uma minuscula, um número e um caractere especial!");
        return false;
    }

    if(confirma != senha){
        alert("Senhas não conferem!");
        cadastro.confirma.focus();
        return false;
    }

    alert("Cadastro realizado com sucesso!");
    cadastro.reset();
    return false;
}

function mudarRegistro(){
    let registro = document.getElementById("registro_txt");
    let select = document.getElementById("registro");
    let value = select.options[select.selectedIndex].value;
    
    if(value == "RM"){
        registro.setAttribute('maxLength', 5);
        registro.value = "";
    } else {
        registro.setAttribute('maxLength', 13);
        registro.value = "";
    }
}