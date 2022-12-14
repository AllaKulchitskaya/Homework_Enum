import transport.Bus;
import transport.Car;
import transport.Truck;

public class Main {
    public static void main(String[] args) {
        Car kia = new Car("KIA", "Soul", 2, Car.BodyworkTypes.HATCHBACK);
        System.out.println(kia);
        Car audi = new Car("Audi", "Q8", 3, Car.BodyworkTypes.OFF_ROAD);
        System.out.println(audi);
        Car toyota = new Car("Toyota", "Sienna", 2.5, Car.BodyworkTypes.MINIVAN);
        System.out.println(toyota);
        Car corvette = new Car("Chevrolet Corvette", "C6", 6.2, Car.BodyworkTypes.COUPE);
        System.out.println(corvette);
        Truck valdai = new Truck("Валдай", "Next", 2.8, Truck.CargoCapacity.N1);
        System.out.println(valdai);
        Truck kamaz = new Truck("КамАЗ", "54901", 12, Truck.CargoCapacity.N3);
        System.out.println(kamaz);
        Truck gazel = new Truck("ГАЗель", "NN", 2.7, Truck.CargoCapacity.N2);
        System.out.println(gazel);
        Truck dongFeng = new Truck("DongFeng", "Captain-T", 2.2, Truck.CargoCapacity.N1);
        System.out.println(dongFeng);
        Bus liaz = new Bus("ЛиАЗ", "Курсор-4292", 4.43, Bus.Busload.SMALL);
        System.out.println(liaz);
        Bus hyundai = new Bus("Hyundai", "Aero Town", 7.5, Bus.Busload.AVERAGE);
        System.out.println(hyundai);
        Bus volvo = new Bus("Volvo", "8900", 7.7, Bus.Busload.LARGE);
        System.out.println(volvo);
        Bus scania = new Bus("Scania", "OmniLink", 9, Bus.Busload.VERY_LARGE);
        System.out.println(scania);
        corvette.printType();
        gazel.printType();
        volvo.printType();
    }
}