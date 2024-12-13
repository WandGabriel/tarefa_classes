public class Main {
    public static void main(String[] args) {
        ControleRemoto controle = new ControleRemoto();

        controle.setNome("Televisão");
        controle.setBotao(true);
        controle.setCanalAtual(4);
        controle.setNovoCanal(15);

        controle.aumentarVolume(true);
        controle.baixarVolume(true);

        controle.trocarDeCanal(controle.getNovoCanal());
        controle.exibirInformacoes();
    }
}