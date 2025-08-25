import java.util.Scanner;



//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        System.out.println("Seja bem vindo(a)");

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite seu nome completo: ");
        String nome = scanner.nextLine();

        System.out.print("Digite sua idade: ");
        int idade = scanner.nextInt();

        System.out.print("Digite seu peso: ");
        double peso = scanner.nextDouble();

        System.out.print("Digite sua altura: ");
        double altura = scanner.nextDouble();

        System.out.print("Digite seu cpf: ");
        String cpf = scanner.next();

        System.out.print("Diga seu estado civil: ");
        String estadoCivil = scanner.next();

        scanner.close();

        System.out.println("Seu nome é:" + nome + " e sua idade é: " + idade + " seu peso é: " + peso + " sua altura é: " + altura + " seu cpf é: " + cpf + " e seu estado civil é: " + estadoCivil);

    }
    }

