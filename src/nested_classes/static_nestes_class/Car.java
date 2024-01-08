package nested_classes.static_nestes_class;

import codeMu.Helper;

public class Car {
    String color;
    int doorCount;
    Engine engine;
    static int a;

    public Car(String color, int doorCount, Engine engine) {
        this.color = color;
        this.doorCount = doorCount;
        this.engine = engine;
    }

    @Override
    public String toString() {
        return "My car: {" +
                "color='" + color + '\'' +
                ", doorCount=" + doorCount +
                ", engine=" + engine +
                '}';
    }

    void methed() {
        Helper.show(Engine.countOfObjects);
    }

    public static class Engine{
        int horsePower;
        static int countOfObjects;

        public Engine(int horsePower) {
            Helper.show(a);
            this.horsePower = horsePower;
            countOfObjects++;
        }



        @Override
        public String toString() {
            return "My engine: {" +
                    "horsePower=" + horsePower +
                    '}';
        }
    }
}

class Test {
    public static void main(String[] args) {
        Car.Engine engine = new Car.Engine(300);
        Helper.show(engine);

        Car car = new Car("red", 2, engine);
        Helper.show(car);
    }
}

class Z extends Car.Engine{
    public Z(int horsePower) {
        super(horsePower);
    }
}