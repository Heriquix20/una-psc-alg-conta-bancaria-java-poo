import java.util.Scanner;

public class ProgramaUm {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ContaBanco conta = new ContaBanco();

        int opcao;
        double deposito, saque;

        System.out.println("\nPara criarmos sua conta bancária precisamos de três informações.");

        System.out.println("\nPor favor, Informe seu nome:");
        conta.setNome(scanner.nextLine());

        System.out.println("\nPor favor, Informe o número da conta:");
        conta.setNumeroConta(scanner.nextInt());

        System.out.println("\nPor favor, Informe o saldo inicial:");
        conta.setSaldoInicial(scanner.nextDouble());

        System.out.println("\nParabéns " + conta.getNome() + " sua Conta Bancária foi criada com sucesso.");

        System.out.println("\n O que você deseja realizar?");
        System.out.println("[1]Depositar valor");
        System.out.println("[2]Sacar valor");
        System.out.println("[3]Obter saldo disponível");
        opcao = scanner.nextInt();

        switch(opcao) {
            case 1:
            System.out.println("\nDigite o valor que você deseja depositar");
            deposito = scanner.nextDouble();
            System.out.println("\nDepósito de " + deposito + " reais realizado com sucesso");
            double saldoTotalDeposito = conta.depositar(deposito);
            System.out.println("Valor total da conta: " + saldoTotalDeposito + " reais");
            break;

            case 2:
            System.out.println("Digite o valor que você deseja sacar");
            saque = scanner.nextDouble();
            double saqueSaldo = conta.sacar(saque);
            break;

            case 3:
            System.out.println("\nO Saldo disponível em sua conta é de: " + conta.getSaldoInicial());
        }
        scanner.close();
    }
}