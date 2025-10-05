import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class estruturacondicional {
    public static void main(String[] args) {

 Scanner sc = new Scanner(System.in);

        System.out.println("Digite seu nome");
        String nome = sc.nextLine();


        System.out.println("Digite um numero inteiro");
        while (!sc.hasNextInt()) {
            System.out.println("Entra invalida por favor digite um numero inteiro.");
            sc.next();

        }
        int numero = sc.nextInt();




        for  (int i = 1; i <= numero; i++) {
            System.out.println(i + "\n\n");
        }

        for (int i = 1; i >= numero; i++) {
            System.out.println(i + "\n\n");
        }


        if (nome.length() >= 6) {
            for (int i = 0; i < numero; i++) {
                System.out.println(nome + "\n\n");
            }
        } else{
                System.out.println(nome);
            }




    }
}