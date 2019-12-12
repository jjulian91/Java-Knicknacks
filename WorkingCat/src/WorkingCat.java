public class WorkingCat extends Cat implements Worker{
    int hoursOfTraining;
    @Override
    public void work() {

        System.out.println("I am a cat that works");;

    }

    public int getHoursOfTraining() {
        return hoursOfTraining;
    }


    public void setHoursOfTraining(int hoursOfTraining) {
        this.hoursOfTraining = hoursOfTraining;
    }
}
