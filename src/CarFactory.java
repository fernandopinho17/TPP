
interface CarFactory {
    Car createCar();
}

// Interface para o produto abstrato
interface Car {
    void assemble();
}

// Classes concretas que implementam a interface Car
class Sedan implements Car {
    @Override
    public void assemble() {
        System.out.println("Montando Sedan");
    }
}

class SUV implements Car {
    @Override
    public void assemble() {
        System.out.println("Montando SUV");
    }
}

// Fábrica concreta que implementa a interface CarFactory
class SedanFactory implements CarFactory {
    @Override
    public Car createCar() {
        return new Sedan();
    }
}

// Fábrica concreta que implementa a interface CarFactory
class SUVFactory implements CarFactory {
    @Override
    public Car createCar() {
        return new SUV();
    }
}

