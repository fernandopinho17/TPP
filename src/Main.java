// Cliente que utiliza a fábrica abstrata
public class Main {
    public static void main(String[] args) {
        // Criando uma fábrica de sedan
        CarFactory sedanFactory = new SedanFactory();
        // Criando um sedan usando a fábrica de sedan
        Car sedan = sedanFactory.createCar();
        // Montando o sedan
        sedan.assemble();

        // Criando uma fábrica de SUV
        CarFactory suvFactory = new SUVFactory();
        // Criando um SUV usando a fábrica de SUV
        Car suv = suvFactory.createCar();
        // Montando o SUV
        suv.assemble();
    }
}
