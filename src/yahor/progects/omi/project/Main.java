package yahor.progects.omi.project;


public class Main {
    public static void main(String[] args) {



        LokomotiveFactory DIESEL = new LokomotiveFactory(
                1001,
                "DIESEL",
                20000,
                1500,
                7500,
                10000
        );

        WaggonFactory Waggon1 = new WaggonFactory(
                1002,
                "ERSTE KLASSE WAGGON",
                10000,
                1,
                10
        );
        WaggonFactory Waggon2 = new WaggonFactory(
                1003,
                "ZWEITE KLASSE WAGGON",
                10000,
                2,
                10
        );

        System.out.println(DIESEL.getID());
        System.out.println(Waggon2.getID());

        ZugFactory zug1 = new ZugFactory(1, "Zug take 1");
        zug1.addSchienenFahrzeug(DIESEL);
        zug1.addSchienenFahrzeug(Waggon1);
        zug1.printInfoZug();



    }
}