package patos;

import java.util.*;

public class Principal {

    public static void main(String[] args) {

        Hierro ironPato = new Hierro();
        Hierro donPato = new Hierro();
        Hierro cyberPato = new Hierro();
        Madera hoodPato = new Madera();
        Madera superPato = new Madera();
        Silvestre donaldPato = new Silvestre();
        Silvestre mrPato = new Silvestre();
        Silvestre pikachuPato = new Silvestre();
        Hule base20Pato = new Hule();
        Hule condePatula = new Hule();
        Hule darkPato = new Hule();

        TheWarnerDuck donal = new TheWarnerDuck();
        ComicDuck lucas = new TheWarnerDuck();

        lucas.doFly();
        lucas.doBoom();

        ArrayList<Pato> allDuck = new ArrayList<>();
        allDuck.add(ironPato);
        allDuck.add(donPato);
        allDuck.add(cyberPato);
        allDuck.add(superPato);
        allDuck.add(hoodPato);
        allDuck.add(donaldPato);
        allDuck.add(mrPato);
        allDuck.add(pikachuPato);
        allDuck.add(base20Pato);
        allDuck.add(condePatula);
        allDuck.add(darkPato);
        allDuck.add(donal);

        for ( Pato pato:allDuck
              ) {
            //System.out.println(pato);
        }

        ArrayList<Swimable> swinDuck = new ArrayList<>();
        swinDuck.add(hoodPato);
        swinDuck.add(superPato);
        swinDuck.add(donaldPato);
        swinDuck.add(mrPato);
        swinDuck.add(pikachuPato);
        swinDuck.add(base20Pato);
        swinDuck.add(condePatula);
        swinDuck.add(darkPato);

        for ( Swimable pato:swinDuck) {
           pato.doSwim();
        }

        ArrayList<Cuackable> cuackables = new ArrayList<>();
        cuackables.add(mrPato);
        cuackables.add(donaldPato);
        cuackables.add(condePatula);
        cuackables.add(darkPato);

        for (Cuackable pato: cuackables
        ) {
            pato.doCuack();
        }

        ArrayList<Flyable> flyables = new ArrayList<>();
        flyables.add(donaldPato);
        flyables.add(mrPato);
        flyables.add(pikachuPato);
        flyables.add(donal);

        for (Flyable pato:flyables
        ) {
            pato.doFly();
        }





    }
}
