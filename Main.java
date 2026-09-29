import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("Sistema inicializado com sucesso!");

        Scanner scanner = new Scanner(System.in);

        int opcao = 0;
        double saldo = 1000.00;

        while (opcao != 4) {

            System.out.println("===== BANCO =====");
            System.out.println("1 - Consultar saldo");
            System.out.println("2 - Depositar");
            System.out.println("3 - Sacar");
            System.out.println("4 - Sair");
            System.out.println("Escolha uma opção:");

            opcao = scanner.nextInt();

            switch (opcao) {

                case 1:
                    System.out.println("O seu saldo atual é R$ " + saldo);
                    break;

                case 2:
                    System.out.println("Digite o valor do depósito:");

                    int deposito = scanner.nextInt();
                    saldo = saldo + deposito;

                    System.out.println("Efetuando o depósito...");
                    System.out.println("O seu saldo atual é R$ " + saldo);
                    break;

                case 3:
                    System.out.println("Digite o valor do saque:");

                    int saque = scanner.nextInt();
                    saldo = saldo - saque;

                    System.out.println("Efetuando o seu saque...");
                    System.out.println("O seu saldo atual é R$ " + saldo);
                    break;

                case 4:
                    System.out.println("Saindo...");
                    System.out.println("Você saiu com sucesso!");
                    break;

                default:
                    System.out.println("Opção inválida");
            }
        }

        scanner.close();
    }
}