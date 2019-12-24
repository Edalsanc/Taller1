package patos;

public class Silvestre extends Pato implements Cuackable, Swimable, Flyable {
    @Override
    public void doCuack() {
        System.out.println("Cuack desde un pato Silvestre");
    }

    @Override
    public void doFly() {

        System.out.println("Volando desde un pato Silvestre");
    }

    @Override
    public void doSwim() {

        System.out.println("Nadando desde un pato Silvestre");
    }


}
