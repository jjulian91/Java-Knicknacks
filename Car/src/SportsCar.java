class SportsCar extends Car{
    private double Price;

    SportsCar(){
        super();
        Price = 0;
    }
    SportsCar(int yearModelFirst, String makeFirst, int speedFirst, double cost){
        super(yearModelFirst,makeFirst,speedFirst);
        Price = cost;
    }
    //add 5 to speed
    @Override
    public void accelerate ()
    {
        int speed = getSpeed();
        speed = speed*10;
        setSpeed(speed);
    }
    public String toString()
    {
        String info = "The " + getYearModel() + " " + getMake() + " is going at a speed of " + getSpeed()+" and it costs $"+Price;
        return info;
    }

}
