import java.util.*;

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
        Student studente8 = new Student("Matteo",24);
        Student studente9 = new Student("Laura",30);
        Student studente10 = new Student("Clara",27);
        Student studente11 = new Student("Tommaso",20);
        Student studente12 = new Student("Mauro",31);

        List<Student> lista = Arrays.asList(studente1,studente2,studente3,studente4,studente5,studente6,studente7,
                studente8,studente9,studente10,studente11,studente12);
        System.out.println("Lista: " + lista);

        lista.sort(Comparator.comparing(Student::getName));
        System.out.println("lista ordinata: " + lista);

    }
}