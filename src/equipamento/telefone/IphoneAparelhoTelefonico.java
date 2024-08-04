package equipamento.telefone;

public class IphoneAparelhoTelefonico implements AparelhoTelefonico{

	@Override
	public void ligar() {
		System.out.println("Ligando");
		
	}

	@Override
	public void atender() {
		System.out.println("Atendendo");
		
	}

	@Override
	public void iniciarCorreioVoz() {
		System.out.println("Iniciando correio de voz");
		
	}
	
}
