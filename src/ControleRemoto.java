public class ControleRemoto {

    private String nome;
    private boolean botao;
    private int canalAtual;
    private int novoCanal;

    public int getCanalAtual() {
        return canalAtual;
    }

    public void setCanalAtual(int canalAtual) {
        this.canalAtual = canalAtual;
    }

    public int getNovoCanal() {
        return novoCanal;
    }

    public void setNovoCanal(int novoCanal) {
        this.novoCanal = novoCanal;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public boolean isBotao() {
        return botao;
    }

    public void setBotao(boolean botao) {
        this.botao = botao;
    }

    public void aumentarVolume(boolean botao) {
        this.botao = botao;
        if (botao) {
            System.out.println("Você aumentou o volume!");
        }
    }

    // Diminui o volume
    public void baixarVolume(boolean botao) {
        this.botao = botao;
        if (botao) {
            System.out.println("Você baixou o volume!");
        }
    }

    /*Método que verifica troca de canal utilizando o controle.*/
    public int trocarDeCanal(int novoCanal) {
        canalAtual = verificaNovoCanal(canalAtual, novoCanal);
        return canalAtual;
    }

    private int verificaNovoCanal(int getcanalAtual, int novoCanal) {
        if (novoCanal != canalAtual) {
            System.out.println("Você mudou para o canal: " + novoCanal );
        } else {
            System.out.println("Você já está no canal desejado!");
        }
        return novoCanal;
    }

    public void exibirInformacoes() {
        System.out.println("-------------------------");
        System.out.println("Tipo do controle: " + getNome());
        System.out.println("Canal Atual: " + getCanalAtual());
        System.out.println("-------------------------");
    }
}
