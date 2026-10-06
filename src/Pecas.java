public class Pecas {

    String nome;
    double preco;
    int quantidadeEstoque;


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
}
