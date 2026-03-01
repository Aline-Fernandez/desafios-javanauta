public class Desafio2Boolean {
    public void executar() {
        boolean estudaBem = true;
        boolean linkedinAtualizado = true;
        boolean curriculoPronto = true;

        int score = 0;

        if (estudaBem) {
            score += 50;
        }
        if (linkedinAtualizado) {
            score += 50;
        }
        if (curriculoPronto == true) {
            score += 25;
        }
        if (score >= 70) {
            System.out.println("o aluno está bem encaminhado para conseguir vaga");
        } else {
            System.out.println("Seu indice de preparação para o mercado é: " + score + "%");
        }
    }
}

