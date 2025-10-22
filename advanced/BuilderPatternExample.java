package advanced;

public class BuilderPatternExample {

    public static void main(String[] args) {

        //builder pattern
        // Car c = Car.
        Car c =  new Car.Builder().setName("Honda").setMileage(3000).build();
        System.out.println(c);

    }
}


class Car{

    private String name;
    private int year;
    private String model;
    private int mileage;



    Car(Builder builder){
        this.name = builder.name;
        this.model = builder.model;
        this.year = builder.year;
        this.mileage = builder.mileage;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", year=" + year +
                ", model='" + model + '\'' +
                ", mileage=" + mileage +
                '}';
    }

    public static class Builder{
        private String name;
        private int year;
        private String model;
        private int mileage;

        public Builder setName(String name){
            this.name = name;
            return this;
        }

        public Builder setYear(int year){
            this.year = year;
            return this;
        }

        public Builder setModel(String model){
            this.model = model;
            return this;
        }

        public Builder setMileage(int mileage){
            this.mileage= mileage;
            return this;
        }

        public Car build(){
            return new Car(this);
        }
    }

}
