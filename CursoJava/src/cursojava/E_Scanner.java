package cursojava;

import java.util.Scanner;

public class E_Scanner {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int nota1=0;
        int nota2=0;
        int nota3=0;
        int media=0;
        String aluno="Alexandre de Jesus Miranda";
        
        System.out.print("Qual o nome do aluno: ");
        aluno=scan.nextLine();
        System.out.print("Digite a 1ª nota: ");
        nota1=scan.nextInt();
        System.out.print("Digite a 2ª nota: ");
        nota2=scan.nextInt();
        System.out.print("Digite a 3ª nota: ");
        nota3=scan.nextInt();
        
        media=(nota1+nota2+nota3)/3;
        
        if(media >=70){
            System.out.println("Aprovado");
        } else if(media >= 40) {
               System.out.println("Recuperação");
        } else {
            System.out.println("Reprovado");
        }
        System.out.printf("1ª Nota: %d%n2ª Nota: %d%n3ª Nota: %d%nMédia: %d%n ",nota1,nota2,nota3,media);
    
}
}
