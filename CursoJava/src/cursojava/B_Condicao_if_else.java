package cursojava;

public class B_Condicao_if_else {
    public static void main(String[] args) {
      int nota=100;
      int faltas=4;
      int maxFaltas=5;
      int media=60;
      int res;
      
      if((nota >= media) && (faltas <= maxFaltas)){
          System.out.println("Aprovado");
      }else if (nota >=40){
          System.out.println("Recuperação");
      }else{
          System.out.println("Reprovado");
      }
           
      System.out.println("Fim do programa");
    }
    
}
