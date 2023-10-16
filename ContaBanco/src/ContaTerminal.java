import java.math.BigDecimal;
import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {

        //Scanner scanner = new Scanner(System.in);
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Por favor, digite o número sua conta bancária");
        int numeroContaBancaria = scanner.nextInt();

        System.out.println("Por favor, informe sua agencia. Ex: xxx-x");
        String numeroAgencia = scanner.next();

        System.out.println("Por favor, insira seu primeiro nome");
        String nomeCompleto = scanner.next();

        System.out.println("Por favor, digite o seu saldo bancário");
        BigDecimal saldoBancario = scanner.nextBigDecimal();
        
        System.out.println("Olá " + nomeCompleto + ", obrigado por criar uma conta em nosso banco, sua agência é " + numeroAgencia + ", conta de numero " + numeroContaBancaria + " e seu saldo " + saldoBancario + " já está disponível para saque");

        scanner.close();

    }
}