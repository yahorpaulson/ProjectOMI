package yahor.progects.omi.project;

public abstract class SchienenfahrzeugImpl implements Schienenfahrzeug{
    private int schienenID;
    private String beschreibung; // temporary
    private int maxGewicht;
    private static int nextID = 0;

    public SchienenfahrzeugImpl(String beschreibung, int maxGewicht){
        this.schienenID = nextID++;
        this.beschreibung = beschreibung;
        this.maxGewicht = maxGewicht;

    }


    @Override
    public int getID() {
        return schienenID;
    }


    @Override
    public int getMaxGewicht() {
        return maxGewicht;
    }

    /**
     * Prints basic info about created Schienenfahrzeug
     */
    @Override
    public void printInfoSchienenfahrzeug() {
        System.out.println(
                "ID: " + getID() +
                "\nMaximales Gewicht: " + getMaxGewicht() + " Kg");
    }
}