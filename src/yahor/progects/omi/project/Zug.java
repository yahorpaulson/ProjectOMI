package yahor.progects.omi.project;

import java.util.ArrayList;

public abstract class Zug <T> {
    private int trainID;
    String trainName;
    private static int nextTrainID = 1;

    ArrayList<T> zugs;

    public Zug(String name){
        this.trainID = nextTrainID++;
        this.trainName = name;
        zugs = new ArrayList<>();
    }


    /**
     * Method adds a new Scheinenfahrzeug in a list that is presented as a train. At the head of the train stands always a Lokomotive:)
     * @param typeOfSchienenFahrzeug shows is it Lokomotive or Waggon
     */
    public void addSchienenFahrzeug(T typeOfSchienenFahrzeug){
        if (zugs.isEmpty()) {
            if (typeOfSchienenFahrzeug instanceof WaggonFactory) {
                throw new IllegalArgumentException("Lokomotive goes first here");
            } else
                zugs.add(typeOfSchienenFahrzeug);
        } else
            zugs.add(typeOfSchienenFahrzeug);
    }

    /**
     * Method deletes SchienenFahrzeug with it's type
     * @param  typeOfSchienenFahrzeug you know what it means:)
     */

    public void deleteSchienenFahrzeug(T typeOfSchienenFahrzeug){
        if(zugs.contains(typeOfSchienenFahrzeug)){
            zugs.remove(typeOfSchienenFahrzeug);
        } else
            throw new IllegalArgumentException("The Schienenfahrzeug doesn't exist!");
    }


    public int getTrainID() {
        return trainID;
    }

    /**
     * Method returns weight of the whole train
     */

    public int getTrainWeight(){
        int trainWeight = 0;
        for (T zug : zugs) {
            trainWeight += ((Schienenfahrzeug) zug).getMaxGewicht();
        }
        return trainWeight;
    }

    public void printInfoZug(){

        System.out.println(
                "--- Zug ---" + "\n" +
                "Zug ID: " + trainID + "\n" +
                "Zug Name: " + trainName + "\n" +
                "Anzahl der Fahrzeuge: " + zugs.size() + "\n" +
                "Höchste Zugsgewicht: " + getTrainWeight()
        );
    }
}
