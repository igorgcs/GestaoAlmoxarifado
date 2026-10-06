public class Main {

    static void main() {

        Pecas tamborDeFreioTraseiro = new Pecas();
        tamborDeFreioTraseiro.nome = "Tambor de Freio Tração";
        tamborDeFreioTraseiro.preco = 1300.00;
        tamborDeFreioTraseiro.quantidadeEstoque = 6;

        tamborDeFreioTraseiro.exibirInformacoes();
        System.out.println("0 valor de estoque é: R$ " + tamborDeFreioTraseiro.valorEstoque());
    }
}
