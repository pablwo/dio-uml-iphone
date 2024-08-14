import funcionalidades.AparelhoTelefonico;
import funcionalidades.NavegadorInternet;
import funcionalidades.ReprodutorMusical;

public class Iphone implements AparelhoTelefonico, NavegadorInternet, ReprodutorMusical {

    @Override
    public void tocar() {
        System.out.println("Unimplemented method 'tocar'");
    }

    @Override
    public void pausar() {
        System.out.println("Unimplemented method 'pausar'");
    }

    @Override
    public void selecionarMusica(String musica) {
        System.out.println("Unimplemented method 'selecionarMusica'");
    }

    @Override
    public void exibirPagina(String url) {
        System.out.println("Unimplemented method 'exibirPagina'");
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Unimplemented method 'adicionarNovaAba'");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Unimplemented method 'atualizarPagina'");
    }

    @Override
    public void ligar(String numero) {
        System.out.println("Unimplemented method 'ligar'");
    }

    @Override
    public void atender() {
        System.out.println("Unimplemented method 'atender'");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Unimplemented method 'iniciarCorreioVoz'");
    }
}
