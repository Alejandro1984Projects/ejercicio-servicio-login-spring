package com.login.registroylogin.api;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.login.registroylogin.controlador.Controlador;
import com.login.registroylogin.modelo.ModeloUsuario;

@RestController
public class ApiRegistroLogin {
	
	@PostMapping("/registrar-usuario")
	public String registrarUsuario(@RequestBody ModeloUsuario nuevoUsuario) {
				
		if(Controlador.registrarUsuario(nuevoUsuario)) {
			
			return "el usuario ha sido creado";
			
		}else {return "el usuario no esta creado";}		
				
	}
	
	@PostMapping("/autenticar-usuario")
	public String autenticarUsuario(@RequestBody ModeloUsuario nuevoUsuario) {

		ModeloUsuario _usuario=nuevoUsuario;
		
		if(_usuario!=null) {
			
			if(_usuario.getNombreUsuario().equals(Controlador.usuario.getNombreUsuario()) && _usuario.getPassword().equals(Controlador.usuario.getPassword())) {
				
				return "autenticacion satisfactoria";
				
			}else {return "error en la autenticacion";}
			
		}else {return "error en la autenticacion";}			
				
	}

}
