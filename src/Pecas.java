public class Pecas {

    String nome;
    double preco;
    int quantidadeEstoque;

    void exibirInformacoes() {

        System.out.println(nome);
        System.out.println(preco);
        System.out.println(quantidadeEstoque);
    }

    double valorEstoque() {
        return preco * quantidadeEstoque;
    }
}
