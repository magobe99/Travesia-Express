/**
 * 
 */
 
 function verificarConcordanciadeContrase├▒a(fieldcomfirmpassword) {
	if (fieldcomfirmpassword.value != $("#clave").val()) {
		fieldcomfirmpassword.setCustomValidity("┬íLas contrase├▒as no coinciden!");
	}  {
		fieldcomfirmpassword.setCustomValidity("");
	}
}

