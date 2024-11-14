public class Car {
    private String carBrand;
    private int speed;
    private double weight;

    public Car(String carBrand, int speed, double weight) {
        this.carBrand = carBrand;
        this.speed = speed;
        this.weight = weight;
    }

    class Engine {
        private boolean isRunning;

        public boolean isRunning() {
            return isRunning;
        }

        public void start() {
            isRunning = true;
            System.out.println("Двигатель запущен.");
        }

        public void stop() {
            isRunning = false;
            System.out.println("Двигатель остановлен.");
        }

        class Piston {
            public void convertEnergy() {
                if (isRunning) {
                    System.out.println("Поршень преобразует энергию горения топлива в механическую энергию.");
                } else {
                    System.out.println("Двигатель не запущен, поршень не работает.");
                }
            }
        }

        class Wheels {

            public void RotateWheels() {
                if (isRunning) {
                    System.out.println("Колеса вращаются.");
                } else {
                    System.out.println("Двигатель не запущен, колеса не вращаются.");
                }
            }
        }

    }



    public static void main(String[] args) {
        Car myCar = new Car("Subaru", 70, 1500);

        Car.Engine myEngine = myCar.new Engine();
        myEngine.start();

        Car.Engine.Piston myPiston = myEngine.new Piston();
        Car.Engine.Wheels myFuelInjector = myEngine.new Wheels();

        myFuelInjector.RotateWheels();
        myPiston.convertEnergy();

        myEngine.stop();
    }
    }



