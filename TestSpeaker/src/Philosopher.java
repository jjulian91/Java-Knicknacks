public class Philosopher implements Speaker{
    protected String Breed;
    public  Philosopher(String type){
        Breed=type;
    }
    public void speak(){
        System.out.println("Man who stands on toilet is high off pot.");
    }
    public void announce(String Str){
        System.out.println(Str);
    }
}


