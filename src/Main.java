import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String nome = "Daniel dos Santos", tipoConta = "Corrente";
        double saldo = 2500, valor = 0.0;
        int opc = 0;
        Scanner sc = new Scanner(System.in);

        System.out.println("**************************************************");
        System.out.println("Dados iniciais do cliente:\n");
        System.out.println("Nome:            " + nome);
        System.out.println("Tipo Conta:      " + tipoConta);
        System.out.println(String.format("Saldo inicial:   R$ %.2f", saldo));
        System.out.println("**************************************************\n\n\n");

        do {
            System.out.println("Operações\n");

            System.out.println("1- Consultar saldos");
            System.out.println("2- Receber valor");
            System.out.println("3- Transferir valor");
            System.out.println("4- Sair\n");

            System.out.println("Digite a opção desejada:");
            opc = sc.nextInt();
            switch (opc) {
                case 1:
                    System.out.println(String.format("O saldo atual é R$ %.2f\n", saldo));
                    break;
                case 2:
                    System.out.println("Informe o valor a receber:");
                    valor = sc.nextDouble();
                    saldo += valor;
                    System.out.println(String.format("Saldo atualizado R$ %.2f\n", saldo));
                    break;
                case 3:
                    System.out.println("Informe o valor a transferir:");
                    valor = sc.nextDouble();
                    if (valor <= saldo) {
                        saldo -= valor;
                        System.out.println(String.format("Saldo atualizado R$ %.2f\n", saldo));
                    } else {
                        System.out.println("Não há saldo suficiente para transferir!");
                    }
                    break;
                default:
                    System.out.println("Opção inválida\n");
            }
        } while (opc != 4);
    }
}