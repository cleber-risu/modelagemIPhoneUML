package edu.cleber.challenge.domain.model;

import edu.cleber.challenge.domain.interfaces.AparelhoTelefonico;
import edu.cleber.challenge.domain.interfaces.NavegadorInternet;
import edu.cleber.challenge.domain.interfaces.ReprodutorMusical;

public class IPhone implements AparelhoTelefonico, NavegadorInternet, ReprodutorMusical {

    @Override
    public void ligar(String numero) {
        System.out.println("Ligando para o número: " + numero);
    }

    @Override
    public void atender() {
        System.out.println("Atendendo uma ligação.");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Iniciando um correio de voz.");
    }

    @Override
    public void exibirPagina(String url) {
        System.out.println("Exibindo a página da internet da url: " + url);
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Adicionando nova aba.");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando a página.");
    }

    @Override
    public void tocar() {
        System.out.println("Tocando a música.");
    }

    @Override
    public void pausar() {
        System.out.println("Pausando a música");
    }

    @Override
    public void selecionarMusica(String music) {
        System.out.println("Selecionando a música: " + music);
    }
}
