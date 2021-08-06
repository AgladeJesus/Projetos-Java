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
        System.out.println(media);
       // System.out.printf("A média da 1ª nota: d%, 2ª nota: d% e 3ª nota: d% é: d% ",nota1,nota2,nota3 media);
        
        
    }
    
}
