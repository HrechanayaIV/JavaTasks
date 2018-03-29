package task1.task11.model;

public class CShip extends CVehicle {
    private int passengersNumber;
    private String portOfRegistration;

    public CShip(long coordinateX, long coordinateY, double price, double speed, double release, int passengersNumber, String portOfRegistration) {
        super(coordinateX, coordinateY, price, speed, release);
        this.passengersNumber = passengersNumber;
        this.portOfRegistration = portOfRegistration;
    }

    private class Engine {
        private int power;
        private int pistonMass;
        private int crankshaftMass;
        private double fuelConsumption;

        @Override
        public String toString() {
            return "Engine starting{" +
                    "power=" + power +
                    ", pistonMass=" + pistonMass +
                    ", crankshaftMass=" + crankshaftMass +
                    ", fuelConsumption=" + fuelConsumption +
                    '}';
        }

        public int getPower() {
            return power;
        }

        public void setPower(int power) {
            this.power = power;
        }

        public int getPistonMass() {
            return pistonMass;
        }

        public void setPistonMass(int pistonMass) {
            this.pistonMass = pistonMass;
        }

        public int getCrankshaftMass() {
            return crankshaftMass;
        }

        public void setCrankshaftMass(int crankshaftMass) {
            this.crankshaftMass = crankshaftMass;
        }

        public double getFuelConsumption() {
            return fuelConsumption;
        }

        public void setFuelConsumption(double fuelConsumption) {
            this.fuelConsumption = fuelConsumption;
        }
    }

    public static class Captain {
        private String name;
        private int age;
        private int experience;

        @Override
        public String toString() {
            return "Captain{" +
                    "name='" + name + '\'' +
                    ", age=" + age +
                    ", experience=" + experience +
                    '}';
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public int getExperience() {
            return experience;
        }

        public void setExperience(int experience) {
            this.experience = experience;
        }
    }

    public int getPassengersNumber() {
        return passengersNumber;
    }

    public void setPassengersNumber(int passengersNumber) {
        this.passengersNumber = passengersNumber;
    }

    public String getPortOfRegistration() {
        return portOfRegistration;
    }

    public void setPortOfRegistration(String portOfRegistration) {
        this.portOfRegistration = portOfRegistration;
    }

    @Override
    public String toString() {
        return "CShip{" +
                "passengersNumber=" + passengersNumber +
                ", portOfRegistration='" + portOfRegistration + '\'' +
                ", coordinateX=" + coordinateX +
                ", coordinateY=" + coordinateY +
                ", price=" + price +
                ", speed=" + speed +
                ", release=" + release +
                '}';
    }
}
