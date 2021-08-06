package cursojava;

public class D_Condicao__Switch {
    public static void main(String[] args) {
        int post=6;
        
        switch(post){
            case 1:
                System.out.println("Primeiro lugar");
                break;
            case 2:
                System.out.println("Segundo lugar");
                break;
            case 3:
                System.out.println("Terceiro lugar");
                break;
            default:
                System.out.println("Não subiu no podium");
                break;
        }
    }
    
}
