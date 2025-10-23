import java.sql.SQLOutput;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
    Scanner  sc = new Scanner(System.in);

        int opcao;

        do {
            System.out.println("Digite um numero");
            int numero = sc.nextInt();


            System.out.println("tabuada do" + numero + ":");
            for (int i = 0; i <= 10; i++) {
                System.out.println(numero + " x " + i + " = " + (numero * i));
            }


            System.out.println("Digite 1 para sair 2 para continuar \n");
            opcao = sc.nextInt();

            if (opcao == 2) {
                System.out.println("Para continuar digite uma palavra ou frase");
                String frase = sc.next();
                System.out.println("Voce digitou :" + frase);
            } else if (opcao == 1) {
                System.out.println("Obrigada por utilizar o programa");
                System.exit(0);
            } else {
                System.out.println("Opcao invalida tente novamente!");
            }






        } while (opcao != 1);

        sc.close();


    }
}


