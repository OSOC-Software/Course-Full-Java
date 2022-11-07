function validateForm(forma) {
    try {
        debugger
        var usuario = forma.usuario;
        if (usuario.value == "" || usuario.value == "Escribir usuario") {
            alert('Debe proporcionar un usuario');
            usuario.focus();
            usuario.select();
            return false;
        }
        var password = forma.password;
        if (password.value == "" || password.value.length < 3) {
            alert('Password debe tener mas de 3 digitos');
            password.focus();
            password.select();
            return false;
        }

        var tecnologia = forma.tecnologia;
        var checkSeleccionado = false;
        for (var i = 0; i < tecnologia.length; i++) {
            if (tecnologia[i].checked) {
                checkSeleccionado = true;
            }
        }
        if (checkSeleccionado == false) {
            alert('Debe seleccionar una tecnologia');
            return false;
        }
        var generos = forma.genero;
        var radioSelect = false;
        for (var i = 0; i < generos.length; i++) {
            if (generos[i].checked) {
                radioSelect = true;
            }
        }
        if (radioSelect == false) {
            alert('Debe seleccionar un genero');
            return false;
        }

        var ocupacion = forma.ocupacion;
        if (ocupacion.value == "") {
            alert("Debe seleccionar una ocupacion");
            return false;
        }
        var as = 0;
        console.log(as);
        //Form valid
        alert('Formulario valido');
        return true;

    } catch (e) {
        console.log(e);
        debugger;
    }
}