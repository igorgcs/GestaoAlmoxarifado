public class Main {

    static void main() {

        Pecas tamborDeFreioTraseiro = new Pecas("Tambor de Freio Tração", 1300.00, 6);
        tamborDeFreioTraseiro.exibirInformacoes();
        System.out.println("O valor de estoque é: R$ " + tamborDeFreioTraseiro.valorEstoque());

        Pecas foleDeAr = new Pecas("Fole de Ar", 250.00, 70);
        foleDeAr.exibirInformacoes();
        System.out.println("O valor de estoque é: R$ " + foleDeAr.valorEstoque());

    }
}
