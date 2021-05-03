package yahor.progects.omi.project;

public abstract class WaggonImpl extends SchienenfahrzeugImpl implements Waggon {

    int sitzKlasse;
    int sitzPlatz;

    public WaggonImpl(
            String beschreibung,
            int maxGewicht,
            int sitzKlasse,
            int sitzPlatz
    ) {
        super(beschreibung, maxGewicht);
        this.sitzKlasse = sitzKlasse;
        this.sitzPlatz = sitzPlatz;
    }
    @Override
    public int getSitzklasse(){
        return sitzKlasse;
    }

    @Override
    public int getSitzplatz() {
        return sitzPlatz;
    }



    @Override
    public void printInfoWaggon() {
        System.out.println("*******WAGGON INFO*******");
        super.printInfoSchienenfahrzeug();
        System.out.println("______Special characteristics_____");
        System.out.println(
                "Sitzklasse: " + getSitzklasse() + "\n" +
                "Sitzplatz Nr: " + getSitzplatz() + "\n"
        );
    }
}
