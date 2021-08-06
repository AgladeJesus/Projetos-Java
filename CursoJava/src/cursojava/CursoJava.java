package cursojava;

public class CursoJava {

    public static void main(String[] args) {
      /*
        int num=0;
        int num1=10;
        int num2=20;
        int num3=30;
        int res = num + num1 + num2 + num3;
        String nome="Alexandre de Jesus";
        
        num=100;
        num=150;
        num= num + 20;
        
        System.out.print("CFBCursos\n");
        System.out.println("CFBCursos");
        System.out.printf("Canal:%s%nAno:%d\n", "CFB Cursos", 2021);
        System.out.printf("Canal:%s\nAno:%d\n", "CFB Cursos", 2021);
        System.out.printf("Valor da variavel res:%d\nNome:%s%n%n",res, nome);
        */
      
      int nota=85;
      int faltas=10;
      int maxFaltas=5;
      int media=60;
      int res;
      
      //CONDIÇÃO TERNÁRIA
      /*res=(nota >= media ? "Aprovado" : "Reprovado");
      System.out.println("Resultado: " + res);
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
      System.out.println("Fim do programa");
      */
    }
}
