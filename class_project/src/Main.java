import Aircraft.aircraftModel;

public class Main {
    public static void main(String[] args)
    {
        System.out.println("Hello world!");
        aircraftModel jetEasy = new aircraftModel(2, 3, 4, 78, 56.5, 89.0);
        System.out.println(jetEasy.getCruiseSpeed());
        System.out.println(jetEasy.getAircraftVersion());

    }

}