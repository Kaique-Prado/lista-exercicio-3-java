import java.util.Scanner;

import javax.print.attribute.standard.Media;

public class Ex4 {
    public static void main(String[] args) {
        
        int numero1, numero2, numero3, numero4, numero5;

        java.util.Scanner scanner = new Scanner(System.in);

        System.out.println("Escreva o primeiro número");
        numero1 = scanner.nextInt();
        
        System.out.println("Escreva o segundo número");
        numero2 = scanner.nextInt();
        
        System.out.println("Escreva o terceiro número");
        numero3 = scanner.nextInt();
        
        System.out.println("Escreva o quarto número");
        numero4 = scanner.nextInt();
        
        System.out.println("Escreva o quinto número");
        numero5 = scanner.nextInt();

        int soma = numero1 + numero2 + numero3 + numero4 + numero5;
        int media = numero1 + numero2 + numero3 + numero4 + numero5 / 5;

        System.out.println("A soma é: " + soma + "A média é: " + media);
    }
}
