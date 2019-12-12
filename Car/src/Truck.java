public class Truck extends Car {
    int bedLength;
    public Truck() {

}

    public Truck(int yearModelFirst, String makeFirst, int speedFirst, int bedLength) {
        super(yearModelFirst, makeFirst, speedFirst);
        this.bedLength=bedLength;
    }

    @Override
    public String toString() {
        return super.toString()+" and the " +
                "bedLength is " + bedLength;
    }
}
