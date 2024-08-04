package equipamento.internet;

public class IphoneNavegadorInternet implements NavegadorInternet{

	@Override
	public void exibirPagina() {
		System.out.println("Página exibida");
	}

	@Override
	public void adicionarNovaAba() {
		System.out.println("Adicionando nova aba");
	}

	@Override
	public void atualizarPagina() {
		System.out.println("Página Atualizada");
	}

}
