import model.Scooter;
import model_v2.ScooterV2;
import model_v2.impl.ScooterImplV2;

public class PrototypeExample {
    public static void main(String[] args) {
        Scooter scooter1 = new Scooter();
        scooter1.setBrand("TITANIC");
        scooter1.setWheels(69);
        Scooter scooter2 = scooter1.clone();
        System.out.println(scooter1 + "\n" +
                scooter2);

        ScooterImplV2 scooter3 = new ScooterImplV2("TEST_V2", 96);
        ScooterImplV2 scooter4 = (ScooterImplV2) scooter3.copy();
        System.out.println(scooter3 + "\n" +
                scooter4);


    }
}
