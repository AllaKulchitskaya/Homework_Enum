import transport.Bus;
import transport.Car;
import transport.Truck;

public class Main {
    public static void main(String[] args) {
        Car kia = new Car("KIA", "Soul", 2);
        System.out.println(kia);
        Car audi = new Car("Audi", "Q8", 3);
        System.out.println(audi);
        Car toyota = new Car("Toyota", "Sienna", 2.5);
        System.out.println(toyota);
        Car corvette = new Car("Chevrolet Corvette", "C6", 6.2);
        System.out.println(corvette);
        Truck valdai = new Truck("Валдай", "Next", 2.8);
        System.out.println(valdai);
        Truck kamaz = new Truck("КамАЗ", "54901", 12);
        System.out.println(kamaz);
        Truck gazel = new Truck("ГАЗель", "NN", 2.7);
        System.out.println(gazel);
        Truck dongFeng = new Truck("DongFeng", "Captain-T", 2.2);
        System.out.println(dongFeng);
        Bus liaz = new Bus("ЛиАЗ", "Курсор-4292", 4.43);
        System.out.println(liaz);
        Bus hyundai = new Bus("Hyundai", "Aero Town", 7.5);
        System.out.println(hyundai);
        Bus volvo = new Bus("Volvo", "8900", 7.7);
        System.out.println(volvo);
        Bus scania = new Bus("Scania", "OmniLink", 9);
        System.out.println(scania);
        corvette.PitStop();
        System.out.println("Время лучшего круга - " + corvette.getBestLapTime());
        System.out.println("Максимальная скорость - " + corvette.getMaxSpeed());
        dongFeng.PitStop();
        System.out.println("Время лучшего круга - " + dongFeng.getBestLapTime());
        System.out.println("Максимальная скорость - " + dongFeng.getMaxSpeed());
        volvo.PitStop();
        System.out.println("Время лучшего круга - " + volvo.getBestLapTime());
        System.out.println("Максимальная скорость - " + volvo.getMaxSpeed());
        System.out.println(Car.BodyworkTypes.SEDAN);
        System.out.println(Car.BodyworkTypes.HATCHBACK);
        System.out.println(Car.BodyworkTypes.COUPE);
        System.out.println(Car.BodyworkTypes.ESTATE);
        System.out.println(Car.BodyworkTypes.OFF_ROAD);
        System.out.println(Car.BodyworkTypes.CROSSOVER);
        System.out.println(Car.BodyworkTypes.PICKUP);
        System.out.println(Car.BodyworkTypes.VAN);
        System.out.println(Car.BodyworkTypes.MINIVAN);
        System.out.println(Truck.CargoCapacity.N1);
        System.out.println(Truck.CargoCapacity.N2);
        System.out.println(Truck.CargoCapacity.N3);
        System.out.println(Bus.Busload.VERY_SMALL);
        System.out.println(Bus.Busload.SMALL);
        System.out.println(Bus.Busload.AVERAGE);
        System.out.println(Bus.Busload.LARGE);
        System.out.println(Bus.Busload.VERY_LARGE);

    }
}