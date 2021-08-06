
package cursojava;

public class C_CondicaoTernaria {

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
      
      System.out.println("Fim do programa");
    }
}
