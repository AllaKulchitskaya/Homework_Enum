package transport;

public class Bus extends Transport implements Competitive {
    public Bus(String brand, String model, double engineVolume) {
        super(brand, model, engineVolume);
    }

    public enum Busload {
        VERY_SMALL(0, 10),
        SMALL(10, 25),
        AVERAGE(40, 50),
        LARGE(60, 80),
        VERY_LARGE(100, 120);

        private final int minNumber;
        private final int maxNumber;

        Busload(int minNumber, int maxNumber) {
            this.minNumber = minNumber;
            this.maxNumber = maxNumber;
        }

        public int getMinNumber() {
            return minNumber;
        }

        public int getMaxNumber() {
            return maxNumber;
        }

        @Override
        public String toString() {
            return "Вместимость: " + minNumber + "-" + maxNumber + " мест";
        }
    }

    @Override
    public void startMoving() {
        System.out.println("Автобус начинает движение");
    }

    @Override
    public void stopMoving() {
        System.out.println("Автобус заканчивает движение");
    }

    @Override
    public String toString() {
        return "Автобус " + super.toString();
    }

    @Override
    public void PitStop() {
        System.out.println("Автобусу нужен пит-стоп");
    }

    @Override
    public double getBestLapTime() {
        return (Math.random() * 13);
    }

    @Override
    public int getMaxSpeed() {
        return (int) (Math.random() * 100);
    }
}
