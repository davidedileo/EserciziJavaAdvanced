//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        PersonBuilder builder = new PersonBuilder();
        builder.setFirstName("Keanu");
        builder.setLastName("Reeves");

        Person persona1 = builder.build();
        System.out.println("Persona1: " + persona1);

        PersonBuilder builder2 = new PersonBuilder();
        builder2.setFirstName("Russel");
        builder2.setLastName("Crowe");
        builder2.setAddress("Via del tutto eccezionale");
        builder2.setAge(59);

        Person persona2 = builder2.build();
        System.out.println("Persona 2: " + persona2);



    }
}