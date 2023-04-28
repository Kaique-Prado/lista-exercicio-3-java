import java.util.Scanner;

public class Ex3 {
    
    public static void main(String[] args) {
        
        int idade;
        float salario;
        String sexo, estadoCivil, nome;


        Scanner scanner = new Scanner(System.in);

        System.out.print("Escreva seu nome:");
        nome = scanner.next();
        System.out.println("");

        
        System.out.print("Escreva seu sexo:");
        sexo = scanner.next();
        System.out.println("");


        System.out.print("Escreva seu estado civil:");
        estadoCivil = scanner.next();
        System.out.println("");

        System.out.print("Escreva sua idade:");
        idade = scanner.nextInt();
        System.out.println("");

        System.out.print("Escreva seu salário:");
        salario = scanner.nextFloat();
        System.out.println("");

        if ( nome.length() < 3) {
            System.out.println("Número de caracteres no nome é insuficiente, minimo 3 caracteres");
        } else if (idade < 0 && idade > 150) {
            System.out.println("Idade colocada é inválida");
        } else if (salario <= 0) {
            System.out.println("Salário colocado inválido");
        } else if ( sexo != "m" && sexo != "f") {
            System.out.println("Sexo inválido");
        } else if ( estadoCivil != "s" || estadoCivil != "c" || estadoCivil != "v" || estadoCivil != "d") {
            System.out.println("Estado civil colocado é inválido");
        }


    }
   
}
