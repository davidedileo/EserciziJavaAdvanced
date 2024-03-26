import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Student studente1 = new Student("Mario",18);
        Student studente2 = new Student("Luca",22);
        Student studente3 = new Student("Anna",23);
        Student studente4 = new Student("Paolo",25);
        Student studente5 = new Student("Marco",19);
        Student studente6 = new Student("Claudia",26);
        Student studente7 = new Student("Davide",29);

        List<Student> lista = new ArrayList<>();
        lista.add(studente1);
        lista.add(studente2);
        lista.add(studente3);

        System.out.println("lista = " + lista);

        lista.add(studente4);
        lista.add(studente5);
        lista.add(studente6);
        lista.add(studente7);

        System.out.println("Lista aggiornata = " + lista);








    }
}