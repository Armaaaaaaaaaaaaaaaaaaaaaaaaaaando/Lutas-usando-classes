// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Lutador[] lutadores = new Lutador[4];

        lutadores[0] = new Lutador("Carlos", "Brasileiro",
                23,4,3);

        lutadores[1] = new Lutador("Joao", "Brasileiro",
                23,2,1);

        lutadores[2] = new Lutador("Armando", "Mexico",
                25,2,0);

        lutadores[3] = new Lutador("Pedro", "Brasileiro",
                25,4,3);

        /*
        Luta l1 = new Luta();
        l1.aprovar(lutadores[0],lutadores[1]);
        l1.Lutar(lutadores[0],lutadores[1]);*/

        Luta l2 = new Luta();
        l2.aprovar(lutadores[3], lutadores[2]);
        l2.Lutar(lutadores[3],lutadores[2]);

        lutadores[3].apresentar();
        lutadores[2].apresentar();


    }
}