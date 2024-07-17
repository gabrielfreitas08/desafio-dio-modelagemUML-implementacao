package classes;

import interfaces.AparelhoTelefonico;
import interfaces.NavegadorInternet;
import interfaces.ReprodutorMusical;

public class Iphone implements AparelhoTelefonico, NavegadorInternet, ReprodutorMusical {

    @Override
    public void atender() {
        System.out.println("Atedendo uma ligação pelo iPhone");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Ouvindo o correio de voz pelo iPhone");
    }

    @Override
    public void ligar(String numero) {
        System.out.println("Realizando uma ligação do numero " + numero + " pelo iPhone");
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Pesquisando pelo iPhone");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando a pagina pelo iPhone");
    }

    @Override
    public void exibirPagina(String url) {
        System.out.println("Exibindo a pagina da url " + url + " pelo iPhone");
    }

    @Override
    public void pausar() {
        System.out.println("Pausando a musica pelo iPhone"); 
    }

    @Override
    public void selecionarMusica(String musica) {
        System.out.println("Selecionando a musica " + musica + " pelo iPhone");
    }

    @Override
    public void tocar() {
        System.out.println("Tocando musica pelo iPhone");
        
    }

}
