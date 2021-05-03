package yahor.progects.omi.project;

/**
 * Created by Yahor Siarheyeu for OMI (AAU Klagenfurt)
 */

public class Main {
    public static void main(String[] args) {

        /**
         * Lokomotive
         */
        LokomotiveFactory diesel = new LokomotiveFactory(
                1001,
                "DIESEL",
                20000,
                1500,
                7500,
                10000
        );
        /**
         * Waggons
         */
        WaggonFactory waggon1 = new WaggonFactory(
                "ERSTE KLASSE WAGGON",
                10000,
                1,
                10
        );
        WaggonFactory waggon2 = new WaggonFactory(
                "ZWEITE KLASSE WAGGON",
                10000,
                2,
                10
        );

        /**
         * Info
         */
        diesel.printInfoLokomotive();
        waggon2.printInfoWaggon();

        /**
         * Trains
         */
        ZugFactory zug1 = new ZugFactory("Train take 1");
        zug1.addSchienenFahrzeug(diesel);
        zug1.addSchienenFahrzeug(waggon1);
        zug1.addSchienenFahrzeug(waggon2);

        ZugFactory zug2 = new ZugFactory("Train take 2");
        zug2.addSchienenFahrzeug(diesel);
        zug2.addSchienenFahrzeug(waggon1);
        zug2.addSchienenFahrzeug(waggon2);
        zug2.deleteSchienenFahrzeug(waggon1);
        /**
         * Trains info
         */
        zug1.printInfoZug();
        zug2.printInfoZug();




    }
}