package equipamento.aparelho;

import equipamento.internet.NavegadorInternet;
import equipamento.musica.ReprodutorMusical;
import equipamento.telefone.AparelhoTelefonico;

public class Iphone implements AparelhoTelefonico, ReprodutorMusical, NavegadorInternet{

	@Override
	public void exibirPagina() {
		System.out.println("Exibindo pagina no navegador pelo IPHONE");
		
	}

	@Override
	public void adicionarNovaAba() {
		System.out.println("Adicionando pagina no navegador pelo IPHONE");
		
	}

	@Override
	public void atualizarPagina() {
		System.out.println("Atualizando pagina no navegador pelo IPHONE");
		
	}

	@Override
	public void tocar() {
		System.out.println("Tocando musica pelo IPHONE");
		
	}

	@Override
	public void pausar() {
		System.out.println("Pausando musica pelo IPHONE");
		
	}

	@Override
	public void selecionarMusica() {
		System.out.println("Selecionando musica pelo IPHONE");
		
	}

	@Override
	public void ligar() {
		System.out.println("Ligando pelo IPHONE");
		
	}

	@Override
	public void atender() {
		System.out.println("Atendendo pelo IPHONE");
		
	}

	@Override
	public void iniciarCorreioVoz() {
		System.out.println("Iniciando correio de voz pelo IPHONE");
		
	}
	
}
