package cursojava;

public class M_Entedendo_Metodos {
    public static void main(String[] args) {
        
        int r;
        
        msg("Deus Pai",5);
        System.out.println(soma2(10,5));
        
    }
    
    public static int soma2(int n1, int n2){
        int res=n1+n2;
        return res;
    }
    
    public static void msg(String m, int l) {
        for(int i=0;i<l;i++){
            System.out.println(m);
        }
    }
    
}
