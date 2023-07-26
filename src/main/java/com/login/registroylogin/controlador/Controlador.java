package com.login.registroylogin.controlador;

import com.login.registroylogin.modelo.ModeloUsuario;

public class Controlador {
	
public static ModeloUsuario usuario=new ModeloUsuario();
	
	public static boolean registrarUsuario(ModeloUsuario nuevoUsuario) {
		
		if(nuevoUsuario!=null) {
			usuario=nuevoUsuario;
			return true;
		}else {return false;}	
		
	}

}
