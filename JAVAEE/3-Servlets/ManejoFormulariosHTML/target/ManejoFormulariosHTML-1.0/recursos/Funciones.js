function validarForma(forma) {
    let usuario = forma.usuario;
    if (usuario.value === "" || usuario.value === "Escribir usuario") {
        alert("Debe proporcionar un nombre de usuario");
        usuario.focus();
        usuario.select();
        return false;
    }
    let pass = forma.password;
    if (pass.value === "" || pass.value.length <= 3) {
        alert("Debe proporcionar un password al menos de 3 caracteres");
        pass.focus();
        pass.select();
        return false;
    }
    let tec = forma.tecnologia;
    let checkSeleccionado = false;
    for (var i = 0; i < tec.length; i++) {
        if (tec[i].checked) {
            checkSeleccionado = true;
        }
    }

    if (!checkSeleccionado) {
        alert("Debe seleccionar una tecnologia");
        return false;
    }
    let genero = forma.genero;
    let radioSeleccionado = false;
    for (var i = 0; i < genero.length; i++) {
        if (genero[i].checked) {
            radioSeleccionado = true;
        }
    }
    if (!radioSeleccionado) {
        alert("Debe seleccionar un genero");
        return false;
    }
    let ocupacion = forma.ocupacion;
    if (ocupacion.value === "") {
        alert("Debe seleccionar una ocupacion");
        return false;
    }

    //Formulario es valido
    alert("Vormulario Valido, enviando datos...");
    return true;
}