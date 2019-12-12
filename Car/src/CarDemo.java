class CarDemo
{
    public static void main (String [] args)
    {
        Car honda = new Car (2000, "fit", 0);

        honda.accelerate();
        System.out.println(honda.getSpeed());
        honda.accelerate();
        System.out.println(honda.getSpeed());
        honda.accelerate();
        System.out.println(honda.getSpeed());
        System.out.println(honda.getSpeed()*2);
        System.out.println(honda.getMake());


        honda.brake();
        System.out.println(honda.getSpeed());
        honda.brake();
        System.out.println(honda.getSpeed());
        honda.brake();
        System.out.println(honda.getSpeed());

        Car suv = new Car(2008, "Lexus R350", 43);

        System.out.println(suv);

        suv.setYearModel(2016);
        suv.setMake("Tesla Model X");
        suv.setSpeed(74);

        Car SC = new SportsCar(2008, "Lexus LFA", 15, 150000.00);
        SC.accelerate();
        System.out.println(SC.getSpeed());
        SC.accelerate();
        System.out.println(SC.getSpeed());
        SC.accelerate();
        System.out.println(SC.getSpeed());
        System.out.println(SC.toString());
        System.out.println(suv);

        Car raptor = new Truck(2010, "Ford", 0, 8);
        System.out.println(raptor);

    }
}