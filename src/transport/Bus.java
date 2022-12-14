package transport;

public class Bus extends Transport implements Competitive {

    private final Busload busload;
    public Bus(String brand, String model, double engineVolume, Busload busload) {
        super(brand, model, engineVolume);
        this.busload = busload;
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
            return "вместимость: " + minNumber + "-" + maxNumber + " мест";
        }
    }

    public Busload getBusload() {
        return busload;
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
        return "Автобус " + super.toString() + ", " + busload.toString();
    }

    @Override
    public void printType() {
        if (busload == null) {
            System.out.println("Данных по транспортному средству недостаточно");
        } else {
            System.out.println(busload);
        }
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
