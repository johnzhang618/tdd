package tdd.taxi;

public class Taxi {

    private static final double UNIT_PRICE = 0.8;
    public static final int BASIC_DISTANCE = 8;

    public double calculate(int distance) {
        double distancePrice = UNIT_PRICE * distance;
        if (distance > 8) {
            distancePrice += (distance - BASIC_DISTANCE) * (UNIT_PRICE / 2);
        }
        return distancePrice;
    }
}
