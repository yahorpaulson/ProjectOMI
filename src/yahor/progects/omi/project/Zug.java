package yahor.progects.omi.project;

import java.util.ArrayList;

public abstract class Zug <T> {
    int trainID;
    String trainName;

    ArrayList<T> zugs;

    public Zug(int ID, String name){
        this.trainID = ID;
        this.trainName = name;
        zugs = new ArrayList<>();
    }


    /**
     * Method adds a new Scheinenfahrzeug in a list that is presented as a train. At the head of the train stands always a Lokomotive:)
     * @param typeOfSchienenFahrzeug
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
     * Method deletes SchienenFahrzeug with it's index
     * @param index number of a Schenenfahrzeug
     * @param zugs bestimmte Zug
     */

    public void deleteSchienenFahrzeug(int index, ArrayList<T> zugs){
        if(zugs.get(index) != null){
            zugs.remove(index);
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
        for (int i = 0; i < zugs.size(); i++){
            trainWeight += ((Schienenfahrzeug) zugs.get(i)).getMaxGewicht();
        }
        return trainWeight;
    }

    public void printInfoZug(){

        System.out.println(
                "--- Zug ---" + "\n" +
                "Zug ID: " + trainID + "\n" +
                "Zug Name: " + trainName + "\n" +
                "Anzahl der Fahrzeuge: " + zugs.size()
        );
    }
}
