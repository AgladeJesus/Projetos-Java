package cursojava;

public class K_Metodos_Classe_Array {
    public static void main(String[] args) {
        int[] num={10,20,30,40,50};
        
        for(int i=0; i<num.length;i++){
            System.out.printf("%d - ", num[i]);
        }
        
        for(int n:num){
            System.out.printf("%d - ", n);
        }
    }
    
}
