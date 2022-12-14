package transport;

public class Truck extends Transport implements Competitive {
    public Truck(String brand, String model, double engineVolume) {
        super(brand, model, engineVolume);
    }

    public enum CargoCapacity {
        N1(0f, 3.5f),
        N2(3.5f, 12f),
        N3(12f, null);
        private final Float minLimit;
        private final Float maxLimit;

        CargoCapacity(Float minLimit, Float maxLimit) {
            this.minLimit = minLimit;
            this.maxLimit = maxLimit;
        }

        public Float getMinLimit() {
            return minLimit;
        }

        public Float getMaxLimit() {
            return maxLimit;
        }

        @Override
        public String toString() {
            if (maxLimit == null) {
                return "Грузоподъемность: от " + minLimit + " тонн";
            }
            return "Грузоподъемность: от " + minLimit + " тонн до " + maxLimit + " тонн";
        }
    }

    @Override
    public void startMoving() {
        System.out.println("Грузовик начинает движение");
    }

    @Override
    public void stopMoving() {
        System.out.println("Грузовик заканчивает движение");
    }

    @Override
    public String toString() {
        return "Грузовик " + super.toString();
    }

    @Override
    public void PitStop() {
        System.out.println("Грузовику нужен пит-стоп");
    }

    @Override
    public double getBestLapTime() {
        return (Math.random() * 10);
    }

    @Override
    public int getMaxSpeed() {
        return (int) (Math.random() * 150);
    }
}
