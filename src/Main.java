import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Conta cc = new ContaCorrente();
        Conta poupanca = new ContaPoupanca();

        System.out.println("********************************");
        System.out.println("Escolha uma opção: ");
        System.out.println("1 - Depósito");
        System.out.println("2 - Saque");
        System.out.println("3 - Transferência");
        System.out.println("4 - Imprimir saldo conta corrente");
        System.out.println("5 - Imprimir saldo conta popança");
        System.out.println("6 - Pressione qualquer tecla para sair: ");
        int opcao = sc.nextInt();


        do {
            if (opcao == 1) {
                System.out.println("Digite o primeiro valor do depósito: ");
                double valorDeposito = sc.nextDouble();
                cc.depositar(valorDeposito);
                System.out.println("Saldo: " + cc.getSaldo());
                System.out.println("Deseja voltar ao menu digite 0 (zero)");
                opcao = sc.nextInt();
                while(opcao != 0){
                    System.out.println("Tente novamente");
                    opcao = sc.nextInt();
                }
                menu();
                opcao = sc.nextInt();
            }
            else if (opcao == 2) {
                System.out.println("Digite o valor para saque: ");
                double valorSaque = sc.nextDouble();
                cc.sacar(valorSaque);
                System.out.println("Saldo: " + cc.getSaldo());
                System.out.println("Deseja voltar ao menu digite 0 (zero)");
                opcao = sc.nextInt();
                while(opcao != 0){
                    System.out.println("Tente novamente");
                    opcao = sc.nextInt();
                }
                menu();
                opcao = sc.nextInt();

            } else if (opcao == 3) {
                System.out.println("Digite o valor para transferência: ");
                double valorTrasnferencia = sc.nextDouble();
                if (valorTrasnferencia > cc.getSaldo()) {
                    System.out.println("Saldo insuficiente!");
                }
                cc.transferir(poupanca, valorTrasnferencia);
                System.out.println("Deseja voltar ao menu digite 0 (zero)");
                opcao = sc.nextInt();
                while(opcao != 0){
                    System.out.println("Tente novamente");
                    opcao = sc.nextInt();
                }
                menu();
                opcao = sc.nextInt();

            } else if (opcao == 4) {
                cc.imprimirExtrato();
                System.out.println("Deseja voltar ao menu digite 0 (zero)");
                opcao = sc.nextInt();
                while(opcao != 0){
                    System.out.println("Tente novamente");
                    opcao = sc.nextInt();
                }
                menu();
                opcao = sc.nextInt();
            } else if (opcao == 5) {
                poupanca.imprimirExtrato();
                System.out.println("Deseja voltar ao menu digite 0 (zero)");
                opcao = sc.nextInt();
                while(opcao != 0){
                    System.out.println("Tente novamente");
                    opcao = sc.nextInt();
                }
                menu();
                opcao = sc.nextInt();
            }
        }while(opcao != 6);


        sc.close();
}

    private static void menu() {

        System.out.println("********************************");
        System.out.println("Escolha uma opção: ");
        System.out.println("1 - Depósito");
        System.out.println("2 - Saque");
        System.out.println("3 - Transferência");
        System.out.println("4 - Imprimir saldo conta corrente");
        System.out.println("5 - Imprimir saldo conta popança");
        System.out.println("6 - Pressione qualquer tecla para sair: ");

    }

}