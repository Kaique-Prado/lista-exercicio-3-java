import java.util.Scanner;

public class Ex1 {
    
    public static void main(String[] args) {
        
        int nota = 0;

        Scanner scanner = new Scanner (System.in);

        
        System.out.print("Escreva uma nota entre zero e dez: ");
        nota = scanner.nextInt();

        while ( nota < 0 || nota> 10) {
            System.out.println("Nota inválida");
            System.out.print("Digite novamente: ");
            nota = scanner.nextInt();
        }
    }
}