//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


        User user1 = User.getInstance();
        System.out.println("Informazioni del primo utente: ");
        user1.printInfo();

        User user2 = User.getInstance();
        user2.setNome("Penelope");
        user2.setEta(36);
        System.out.println();

        System.out.println("Informazioni aggiornate user1 e user2");

        System.out.println("Info aggiornate del primo utente:");
        user1.printInfo();
        System.out.println();

        System.out.println("Informazioni del secondo utente: ");
        user2.printInfo();

    }
}