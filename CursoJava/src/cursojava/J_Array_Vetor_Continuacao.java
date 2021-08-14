package cursojava;

import java.util.Scanner;

public class J_Array_Vetor_Continuacao {
    public static void main(String[] args) {
        
        final int tam=5;
        char[] gabarito={'a','a','c','b','c'};
        char[] respostas=new char[tam];
        int nota=0;
        Scanner scan = new Scanner(System.in);
        
        respostas[0]='a';
        respostas[1]='b';
        respostas[2]='c';
        respostas[3]='b';
        respostas[4]='c';
        
        for(int i=0;i<tam;i++){
            System.out.printf("Informa a resposta: %d: ",i);
            respostas[i]=scan.nextLine().charAt(0);
        }
        
        for(int i=0; i<tam; i++){
            if(respostas[i]==gabarito[i]){
                nota++;
            }
        }
        
        System.out.printf("Nota do Aluno: %d%n%n", nota);
    }
}