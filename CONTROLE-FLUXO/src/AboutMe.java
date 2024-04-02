import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class AboutMe {

    // Tratamento de Exceções

    public static void main(String[] args) {

        try {

            Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
            String nome = scanner.next();

            System.out.println("Digite seu sobrenome");
            String sobrenome = scanner.next();

            System.out.println("Digite sua idade");
            int idade = scanner.nextInt();

            System.out.println("Digite sua Altura");
            double altura = scanner.nextDouble();

            System.out.println("Olá, me chamo" + nome.toUpperCase() + " " + sobrenome);
            System.out.println("Tenho" + idade + "anos ");
            System.out.println("Minha altura é : " + altura + "cm ");
            scanner.close();

            // Metodo de tratamento de exceções de erros
        } catch (InputMismatchException e) {
            System.out.println("Os campos idade e altura precisam ser numéricos");
        }
    }

}
