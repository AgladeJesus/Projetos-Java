package cursojava;

import java.util.Arrays;

public class L_Metodos_Classe_Array1 {
    public static void main(String[] args) {
        
        final int tam=10;
        int[] num={9,2,7,1,8,5,3,4,0,6};
        int[] numeros=new int[tam];
        
        //Arrays.sort(num);
        //Arrays.fill(numeros, 10);
        System.arraycopy(num, 0, numeros, 0, tam);
        
        
        System.out.printf("Arrays são iquais: %s",Arrays.equals(num, numeros) ? "Sim":"Não");
        
        /*
        for(int n:num){
            System.out.printf("%d - ", n);
        }
        
        for(int n:numeros){
            System.out.printf("%d - ", n);
        }
        */
    }
    
}
