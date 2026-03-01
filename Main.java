import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner menuLeitor = new Scanner(System.in);

        System.out.println("--- BEM-VINDO AO SISTEMA DE CARREIRA ---");
        System.out.println("Escolha qual desafio deseja rodar:");
        System.out.println("1 - Verificação de Vaga (Tecnologias)");
        System.out.println("2 - Score de Preparação");
        System.out.println("3 - Validador de Currículo/LinkedIn");
        System.out.print("Digite o número: ");

        int opcao = menuLeitor.nextInt();

        System.out.println("----------------------------------------");

        if (opcao == 1) {
            // Aqui chamamos o Desafio 1
            Desafio1Boolean d1 = new Desafio1Boolean();
            d1.executar();
        }
        else if (opcao == 2) {
            // Aqui chamamos o Desafio 2
            Desafio2Boolean d2 = new Desafio2Boolean();
            d2.executar();
        }
        else if (opcao == 3) {
            // Aqui chamamos o Desafio 3
            Desafio3IfElse d3 = new Desafio3IfElse();
            d3.executar();
        }
        else {
            System.out.println("Opção inválida!");
        }

        menuLeitor.close();
    }
}