package org.mawote.app;

import org.mawote.dispositivo.Dispositivo;
import org.mawote.reprodutor_musical.*;
import org.mawote.navegador_da_internet.*;

public class AppDispositivo {

	public static void main(String[] args) {
		
		Dispositivo dispositivo = new Dispositivo(true);
		dispositivo.ligar();
		
		ReprodutorMusical reprodutorMusical = new Dispositivo(true);
		reprodutorMusical.selecionarMusica();
		
		NavegadorDaInternet navegadorDaInternet = new Dispositivo(true);
		navegadorDaInternet.atualizarPagina();
		
	}

}