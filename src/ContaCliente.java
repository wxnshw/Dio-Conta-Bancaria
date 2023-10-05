import java.util.Locale;
import java.util.Scanner;

public class ContaCliente {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite o número  da agência: ");
        int numero = scanner.nextInt();
        System.out.println("Digite qual é a agência: ");
        String agencia = scanner.next();
        scanner.nextLine();
        System.out.println("Digite o seu nome: ");
        String nomeCliente = scanner.nextLine();
        System.out.println("Por favor, digite o saldo da conta: ");
        double saldo = scanner.nextDouble();

        System.out.println("Olá "+ nomeCliente +", obrigado por criar uma conta em nosso banco, sua agência é "+ agencia +", conta "+ numero +" e seu saldo "+ saldo +" já está disponível para saque");
    }
}
