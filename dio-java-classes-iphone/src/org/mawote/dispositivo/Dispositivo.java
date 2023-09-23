package org.mawote.dispositivo;

import org.mawote.aparelho_telefonico.AparelhoTelefonico;
import org.mawote.navegador_da_internet.NavegadorDaInternet;
import org.mawote.reprodutor_musical.ReprodutorMusical;

public class Dispositivo implements ReprodutorMusical, AparelhoTelefonico, NavegadorDaInternet {
	
	private boolean ligado = false;
	
	public Dispositivo(boolean ligado){
		this.ligado = ligado;
	}
	
	public boolean isLigado() {
		return ligado;
	}

	public void setLigado(boolean ligado) {
		this.ligado = ligado;
	}



	@Override
	public void exibirPagina() {
		System.out.println("Exibindo pagina desde o navegador...");
		
	}

	@Override
	public void adicionarNovaAba() {
		System.out.println("Aberta nova aba no navegador...");
		
	}

	@Override
	public void atualizarPagina() {
		System.out.println("Atualizando pagina do navegador...");
		
	}

	@Override
	public void ligar() {
			System.out.println("Telefone ligando para...");
	}

	@Override
	public void atender() {
		System.out.println("Atendendo o telefone...");
		
	}

	@Override
	public void iniciarCorreioVoz() {
		System.out.println("Abrindo correio de voz...");
		
	}

	@Override
	public void selecionarMusica() {
		System.out.println("Selecionando musica...");
		
	}

	@Override
	public void tocarMusica() {
		System.out.println("Tocando musica...");
		
	}

	@Override
	public void pausarMusica() {
		System.out.println("Pausando musica...");
		
	}

}

