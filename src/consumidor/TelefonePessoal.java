package consumidor;

import equipamento.aparelho.Iphone;
import equipamento.internet.NavegadorInternet;
import equipamento.musica.ReprodutorMusical;
import equipamento.telefone.AparelhoTelefonico;

public class TelefonePessoal {
	public static void main(String[] args) {
		
		Iphone iph = new Iphone();
		NavegadorInternet navegador = iph;
		ReprodutorMusical reprodutor = iph;
		AparelhoTelefonico aparelho = iph;
		
		System.out.println("NAVEGADOR");
		navegador.adicionarNovaAba();
		navegador.atualizarPagina();
		navegador.exibirPagina();
		
		System.out.println("REPRODUTOR MUSICAL");
		reprodutor.selecionarMusica();
		reprodutor.tocar();
		reprodutor.pausar();
		
		System.out.println("APARELHO TELEFONICO");
		aparelho.atender();
		aparelho.ligar();
		aparelho.iniciarCorreioVoz();
		
		
	}
}
