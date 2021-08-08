package cursojava;

import java.util.Scanner;

public class G_Loop_while {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Você quer que repita quantas vezes: ");
        int max = scan.nextInt();
        int cont=1;
        while(cont < max){
            System.out.println(cont + "- CFB Cursos");
            cont++;
        }
        System.out.println("Fim do Programa");
    }
    
}
