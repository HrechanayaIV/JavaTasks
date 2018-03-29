package task1.task11.model;

public class CPlane extends CVehicle {
    private double height;
    private long passengersNumber;

    public CPlane(long coordinateX, long coordinateY, double price, double speed, double release, double height, long passengersNumber) {
        super(coordinateX, coordinateY, price, speed, release);
        this.height = height;
        this.passengersNumber = passengersNumber;
    }

    public static class Pilot {
        private String name;
        private int age;
        private int experience;

        @Override
        public String toString() {
            return "Pilot{" +
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

    private class Chassis {
        private int chassisId;
        private int wheelsCount;

        public int getChassisId() {
            return chassisId;
        }

        public void setChassisId(int chassisId) {
            this.chassisId = chassisId;
        }

        public int getWheelsCount() {
            return wheelsCount;
        }

        public void setWheelsCount(int wheelsCount) {
            this.wheelsCount = wheelsCount;
        }

        public void takeoff() {
            System.out.println("Raise the chassis");
        }

        public void landing() {
            System.out.println("Lower the chassis");
        }

    }

    public void fly() {
        Chassis chassis = new Chassis();
        chassis.takeoff();
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public long getPassengersNumber() {
        return passengersNumber;
    }

    public void setPassengersNumber(long passengersNumber) {
        this.passengersNumber = passengersNumber;
    }

    @Override
    public String toString() {
        return "CPlane{" +
                "height=" + height +
                ", passengersNumber=" + passengersNumber +
                ", coordinateX=" + coordinateX +
                ", coordinateY=" + coordinateY +
                ", price=" + price +
                ", speed=" + speed +
                ", release=" + release +
                '}';
    }
}
