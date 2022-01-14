package tdd.taxi;

public class Taxi {

    public static final int BASIC_DISTANCE = 8;
    private static final double UNIT_PRICE_OF_DISTANCE = 0.8;
    public static final double UNIT_PRICE_OF_WAITING = 0.25;

    public double calculate(int distance, int time) {
        double distancePrice = UNIT_PRICE_OF_DISTANCE * distance;
        if (distance > 8) {
            distancePrice += (distance - BASIC_DISTANCE) * (UNIT_PRICE_OF_DISTANCE / 2);
        }
        double waitingPrice = time * UNIT_PRICE_OF_WAITING;
        return distancePrice + waitingPrice;
    }
}
