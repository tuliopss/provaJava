import java.util.ArrayList;
import java.util.Scanner;

public class Prova {
    private Aluno candidato;
    Questao q1;
    Questao q2;

    public Aluno getCandidato() {
        return candidato;
    }

    public void setCandidato(Aluno candidato) {
        this.candidato = candidato;
    }

    public Questao getQ1() {
        return q1;
    }

    public void setQ1(Questao q1) {
        this.q1 = q1;
    }

    public Questao getQ2() {
        return q2;
    }

    public void setQ2(Questao q2) {
        this.q2 = q2;
    }

    public Questao getQ3() {
        return q3;
    }

    public void setQ3(Questao q3) {
        this.q3 = q3;
    }

    public Questao getQ4() {
        return q4;
    }

    public void setQ4(Questao q4) {
        this.q4 = q4;
    }

    public Questao getQ5() {
        return q5;
    }

    public void setQ5(Questao q5) {
        this.q5 = q5;
    }

    Questao q3;
    Questao q4;
    Questao q5;
    int resposta01, resposta02, resposta03, resposta04, resposta05;
    int nota;

    public int getNota() {
        return nota;
    }


    public Prova(Aluno candidato, Questao q1, Questao q2, Questao q3, Questao q4, Questao q5) {
        this.candidato = candidato;
        this.q1 = q1;
        this.q2 = q2;
        this.q3 = q3;
        this.q4 = q4;
        this.q5 = q5;
    }

    public void aplicarProva() {
        Scanner resposta = new Scanner(System.in);


        q1.mostrar();
        resposta01 = resposta.nextInt();

        q2.mostrar();
        resposta02 = resposta.nextInt();

        q3.mostrar();
        resposta03 = resposta.nextInt();

        q4.mostrar();
        resposta04 = resposta.nextInt();

        q5.mostrar();
        resposta05 = resposta.nextInt();

    }

    public void corrigirProva() {
        nota = 0;
        if (q1.estaCorreto(resposta01)) {
            nota++;
        }
        if (q2.estaCorreto(resposta02)) {
            nota++;
        }
        if (q3.estaCorreto(resposta03)) {
            nota++;
        }
        if (q4.estaCorreto(resposta04)) {
            nota++;
        }
        if (q5.estaCorreto(resposta05)) {
            nota++;
        }
        nota = nota * 2;

    }
    public void armazenarRespostas() {
        System.out.println("Lista das respostas do aluno: ");
        ArrayList<Integer> respostas = new ArrayList<Integer>();
        respostas.add(resposta01);
        respostas.add(resposta02);
        respostas.add(resposta03);
        respostas.add(resposta04);
        respostas.add(resposta05);
        System.out.println(respostas);
    }

    public void gabaritoProva() {
        System.out.println("Questões corretas da prova: ");
        ArrayList<Integer> gabarito = new ArrayList<Integer>();
        gabarito.add(1);
        gabarito.add(3);
        gabarito.add(2);
        gabarito.add(2);
        gabarito.add(3);
        System.out.println(gabarito);



    }

}