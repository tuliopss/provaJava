import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Questao questao1 = new Questao("Fórmula da água", "H2O", "CO2", "O2", "N3OH", 1);

        Questao questao2 = new Questao("Quem descobriu o Brasil?", "Colombo", "Bonaparte", "Pedro Alvares Cabral", "Alexandre O Grande", 3);

        Questao questao3 = new Questao("Qual a linguagem estudada em POO na UNIFOR?", "JavaScript", "Java", "Python", "Kotlin", 2);

        Questao questao4 = new Questao("Quem venceu a Copa em 2002?", "Alemanha", "Brasil", "França", "Inglaterra", 2);

        Questao questao5 = new Questao("Quando foi o último campeão da Copa do Mundo?", "Alemanha", "Brasil", "França", "Inglaterra", 3);


        Aluno aluno = new Aluno("Joao", "23232", 18);
        Prova prova = new Prova(aluno, questao1, questao2, questao3, questao4, questao5);
        prova.aplicarProva();
        prova.corrigirProva();
        System.out.println(aluno.getNome() + " tirou " + prova.getNota()) ;

        System.out.println("-----------------------------");
        prova.armazenarRespostas(); //Método que exibe a lista das respostas dadas pelo aluno.
        prova.gabaritoProva(); //Método que exibe a Lista das questões corretas da prova.

        //Lista dos enunciados das questões
        System.out.println("Questões da prova:");
        ArrayList<String> questoes = new ArrayList<String>();
        questoes.add(questao1.getEnunciado());
        questoes.add(questao2.getEnunciado());
        questoes.add(questao3.getEnunciado());
        questoes.add(questao4.getEnunciado());
        questoes.add(questao5.getEnunciado());
        System.out.println(questoes);





    }
}