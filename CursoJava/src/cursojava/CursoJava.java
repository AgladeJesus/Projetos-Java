package cursojava;

public class CursoJava {

    public static void main(String[] args) {
      int nota=85;
      int faltas=10;
      int maxFaltas=5;
      int media=60;
      int res;
      
      //CONDIÇÃO TERNÁRIA
      /*res1=(nota >= media ? "Aprovado" : "Reprovado");
      System.out.println("Resultado: " + res1);
      */
      
      res=(nota >= media ? 1 : 0);
      System.out.println("Resultado: " + (res==1?"Aprovado":"Reprovado"));
      
      /*
      if((nota >= media) && (faltas <= maxFaltas)){
          System.out.println("Aprovado");
      }else if (nota >=40){
          System.out.println("Recuperação");
      }else{
          System.out.println("Reprovado");
      }
    */
      System.out.println("Fim do programa");
    }
}
