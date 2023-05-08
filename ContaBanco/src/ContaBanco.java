import java.util.Scanner;

public class ContaBanco {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe sua agência: ");
        String agencia = scanner.next();

        System.out.println("Informe o número da sua conta: ");
        int numero = scanner.nextInt();

        System.out.println("Informe o seu nome: ");
        String nomeCliente = scanner.next();

        System.out.println("Informe o saldo presente: ");
        double saldo = scanner.nextDouble();

        System.out.println("Bem vindo(a) ao banco, " + nomeCliente + 
        "! Sua agência é " + agencia + ", sua conta é " + numero + 
        " e seu saldo é de " + saldo + " R$.");
    }
}
