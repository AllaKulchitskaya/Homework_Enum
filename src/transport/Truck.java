package transport;

public class Truck extends Transport implements Competitive {
    private final CargoCapacity cargoCapacity;
    public Truck(String brand, String model, double engineVolume, CargoCapacity cargoCapacity) {
        super(brand, model, engineVolume);
        this.cargoCapacity = cargoCapacity;
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
                return "грузоподъемность: от " + minLimit + " тонн";
            }
            return "грузоподъемность: от " + minLimit + " тонн до " + maxLimit + " тонн";
        }
    }

    public CargoCapacity getCargoCapacity() {
        return cargoCapacity;
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
        return "Грузовик " + super.toString() + ", " + cargoCapacity.toString();
    }

    @Override
    public void printType() {
        if (cargoCapacity == null) {
            System.out.println("Данных по транспортному средству недостаточно");
        } else {
            System.out.println(cargoCapacity);
        }
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
