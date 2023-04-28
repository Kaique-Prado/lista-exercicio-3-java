import java.util.Scanner;

public class Ex2 {
    
    public static void main(String[] args) {
        
        String nome, senha;

        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Escreva seu nome: ");
        nome = scanner.nextLine();
        System.out.println("");
        
        
        System.out.print("Escreva sua senha: ");
        senha = scanner.nextLine();

        while (nome.equals(senha)) {
            System.out.println("Nome e senha não podem ser iguais, escreva novamente");

            System.out.print("Escreva seu nome: ");
            nome = scanner.nextLine();
            System.out.println("");

            System.out.print("Escreva sua senha: ");
            senha = scanner.nextLine();
        }

            System.out.println("Você fez logon com sucesso!");
    }

}
