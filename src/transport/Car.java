package transport;

public class Car extends Transport implements Competitive {
    public Car(String brand, String model, double engineVolume) {
        super(brand, model, engineVolume);
    }

    public enum BodyworkTypes {
        SEDAN("седан"),
        HATCHBACK("хэтчбэк"),
        COUPE("купе"),
        ESTATE("универсал"),
        OFF_ROAD("внедорожник"),
        CROSSOVER("кроссовер"),
        PICKUP("пикап"),
        VAN("фургон"),
        MINIVAN("минивэн");

        private final String name;

        BodyworkTypes(String name) {
            if (StringUtils.isValid(name)) {
                name = "Тип кузова не указан";
            }
            this.name = name;
        }

        public String getName() {
            return name;
        }

        @Override
        public String toString() {
            return "Тип кузова: " + name;
        }
    }


    @Override
    public void startMoving() {
        System.out.println("Автомобиль начинает движение");
    }

    @Override
    public void stopMoving() {
        System.out.println("Автомобиль заканчивает движение");


    }

    @Override
    public String toString() {
        return "Автомобиль " + super.toString();
    }


    @Override
    public void PitStop() {
        System.out.println("Автомобилю нужен пит-стоп");
    }

    @Override
    public double getBestLapTime() {
        return (Math.random() * 5);
    }

    @Override
    public int getMaxSpeed() {
        return (int) (Math.random() * 180);
    }
}
