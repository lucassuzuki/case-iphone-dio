package consumidor;

import equipamento.aparelho.Iphone;
import equipamento.aparelho.Ipod;

public class Usuario {
	public static void main(String[] args) {

		Iphone iph = new Iphone();

		System.out.println("NAVEGADOR");
		iph.adicionarNovaAba();
		iph.atualizarPagina();
		iph.exibirPagina();

		System.out.println("REPRODUTOR MUSICAL");
		iph.selecionarMusica();
		iph.tocar();
		iph.pausar();

		System.out.println("APARELHO TELEFONICO");
		iph.atender();
		iph.ligar();
		iph.iniciarCorreioVoz();

		System.out.println("----------------------------");
		System.out.println("IPOD");
		Ipod ipod = new Ipod();

		ipod.tocar();
	}


}
