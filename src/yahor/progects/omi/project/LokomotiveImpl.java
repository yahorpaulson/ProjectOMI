package yahor.progects.omi.project;

public abstract class LokomotiveImpl extends SchienenfahrzeugImpl implements Lokomotive {
    private int leistung;
    private int zugkraft;
    private int bremskraft;

    public LokomotiveImpl(int id, String beschreibung, int maxGewicht, int leistung, int zugkraft, int bremskraft) {
        super(beschreibung, maxGewicht);
        this.leistung = leistung;
        this.zugkraft = zugkraft;
        this.bremskraft = bremskraft;
    }

    @Override
    public int getLeistung() {
        return leistung;
    }


    @Override
    public int getZugkraft() {
        return zugkraft;
    }


    @Override
    public int getBremskraft() {
        return bremskraft;
    }


    /**
     * Prints info about Lokomotive
     */
    @Override
    public void printInfoLokomotive(){
        System.out.println("******Lokomotive INFO*******");
        super.printInfoSchienenfahrzeug();
        System.out.println("______Special characteristics_____");
        System.out.println(
                "Leistung: " + leistung +
                "\nZugkraft: " + zugkraft +
                "\nBremskraft: " + bremskraft + "\n");
    }
}
