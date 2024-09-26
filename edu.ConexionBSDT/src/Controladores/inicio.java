package Controladores;

import Servicios.conexionImplementacion;
import Servicios.conexionInterfaz;

public class inicio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		conexionInterfaz ci = new conexionImplementacion();
		
		ci.conexionBSDT();

	}

}
