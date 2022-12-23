import java.util.ArrayList;

public class Questao {
    public String getEnunciado() {
        return enunciado;
    }

    private String enunciado;
    private String alternativa01, alternativa02 , alternativa03 ,alternativa04;
    private int gabarito;

    public Questao(String enunciado, String alternativa01, String alternativa02, String alternativa03, String alternativa04, int gabarito) {
        this.enunciado = enunciado;
        this.alternativa01 = alternativa01;
        this.alternativa02 = alternativa02;
        this.alternativa03 = alternativa03;
        this.alternativa04 = alternativa04;
        this.gabarito = gabarito;
    }


   public void mostrar() {
       System.out.println(enunciado);
       System.out.println("1 - " + alternativa01);
       System.out.println("2 - " + alternativa02);
       System.out.println("3 - " + alternativa03);
       System.out.println("4 - " + alternativa04);

   }

   public boolean estaCorreto(int resposta) {
        if (resposta == gabarito) {
            return true;

        } else {
            return false;
        }
   }



}