public class Pecas {

    private String nome;
    private double preco;
    private int quantidadeEstoque;


    Pecas(String nome, double preco, int quantidadeEstoque) {
        this.nome = nome;
        this.preco = preco;
        this.quantidadeEstoque = quantidadeEstoque;
    }

    void exibirInformacoes() {

        System.out.println(nome);
        System.out.println(preco);
        System.out.println(quantidadeEstoque);
    }

    double valorEstoque() {
        return preco * quantidadeEstoque;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public int getQuantidadeEstoque() {
        return quantidadeEstoque;
    }
    public void setQuantidadeEstoque(int quantidadeEstoque) {
        if(quantidadeEstoque < 0){
            return;
        }
        this.quantidadeEstoque = quantidadeEstoque;
    }
}
