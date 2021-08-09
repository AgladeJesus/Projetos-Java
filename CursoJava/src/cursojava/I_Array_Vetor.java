package cursojava;

public class I_Array_Vetor {
    public static void main(String[] args){
        
        final int tam=5;
     
        int[] num=new int[tam];
        int[] numeros={10,20,30,40,50};
        num[0]=10;
        num[1]=25;
        num[2]=30;
        num[3]=40;
        num[4]=124;
        
        for(int i=0; i<numeros.length; i++){
            System.out.printf("Número na posição: %d%n", numeros[i]);
        }
        for(int j=0; j<num.length; j++){
            System.out.printf("Número na posição: %d%n", num[j]);
        }
        
        System.out.printf("Fim do programa%n");
        
    }
    
}
