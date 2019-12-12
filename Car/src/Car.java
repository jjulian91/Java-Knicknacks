class Car
{

    //instance variables
    private int yearModel,
            speed;
    private String make;
    //default constructor
    public Car()
    {
        yearModel = 0;
        speed = 0;
        make = "0";
    }

    public Car(int yearModel, int speed) {
        this.yearModel = yearModel;
        this.speed = speed;
    }

    //overloaded constructor
    public Car(int yearModelFirst, String makeFirst, int speedFirst)
    {
        yearModel = yearModelFirst;
        speed = speedFirst;
        make = makeFirst;
    }
    //accessor methods
    public int getYearModel ()
    {
        return yearModel;
    }

    public int getSpeed ()
    {
        return speed;
    }

    public String getMake ()
    {
        return make;
    }
    //mutator methods
    public void setYearModel (int newYearModel)
    {
        yearModel = newYearModel;
    }

    public void setSpeed (int newSpeed)
    {
        speed = newSpeed;
    }

    public void setMake (String newMake)
    {
        make = newMake;
    }

    //add 5 to speed
    public void accelerate ()
    {
        speed = speed + 5;
    }
    //subtract 5 from speed
    public void brake ()
    {
        speed = speed - 5;
    }

    //display car data
    public String toString()
    {
        String info = "The " + yearModel + " " + make + " is going at a speed of " + speed;
        return info;
    }


}
