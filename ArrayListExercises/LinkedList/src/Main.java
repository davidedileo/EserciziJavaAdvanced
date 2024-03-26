import java.util.LinkedList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Fruit frutto1 = new Fruit("Fragola");
        Fruit frutto2= new Fruit("Mango");
        Fruit frutto3= new Fruit("Papaya");
        Fruit frutto4= new Fruit("Banana");
        Fruit frutto5= new Fruit("Cocco");
        Fruit frutto6= new Fruit("Anguria");
        Fruit frutto7= new Fruit("Pompelmo");


        LinkedList<Fruit> listafrutti = new LinkedList<Fruit>();
        listafrutti.add(frutto1);
        listafrutti.add(frutto2);
        listafrutti.add(frutto3);
        listafrutti.add(frutto4);
        listafrutti.add(frutto5);

        System.out.println("lista frutti: " + listafrutti);

        listafrutti.addFirst(frutto6);
        listafrutti.addLast(frutto7);
        System.out.println("lista frutti aggiornata: " + listafrutti);


    }
}