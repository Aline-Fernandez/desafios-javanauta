public class Desafio1Boolean {
    public void executar() {
        boolean bancoDeDados = true;
        boolean spring = true;
        boolean apiRest = true;
        boolean microsservicos = true;

        if (bancoDeDados && spring && apiRest && microsservicos) {
            System.out.println("Consegue vaga");
        } else {
            System.out.println("Ainda não consegue.");
        }
    }
}
