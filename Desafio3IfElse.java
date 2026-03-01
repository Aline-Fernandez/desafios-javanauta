import java.util.Scanner;

public class Desafio3IfElse {
    public void executar() {
        Scanner leitor = new Scanner(System.in);


        System.out.println(" já montou um currículo? true ou false");
        boolean curriculo = leitor.nextBoolean();

        System.out.println(" já organizou seu linkedin? true ou false");
        boolean linkedin = leitor.nextBoolean();


        if (curriculo && linkedin) {
            System.out.println("Parabéns!");
        } else {
            System.out.println("Um currículo bem feito pode até compensar pouca experiência, vale apena você organizar seu currículo e seu linkedin");
        }
        leitor.close();
    }
}

