package equipamento.aparelho;

import equipamento.musica.ReprodutorMusical;

public class Ipod implements ReprodutorMusical {

    @Override
    public void tocar() {
        System.out.println("Tocando musica pelo IPOD");
    }

    @Override
    public void pausar() {
        System.out.println("Pausando musica pelo IPOD");

    }

    @Override
    public void selecionarMusica() {
        System.out.println("Selecionando musica pelo IPOD");

    }
}
