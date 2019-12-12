public class Dog implements Speaker{
    protected String Breed;
    public  Dog(String type){
        Breed=type;
    }
    public void speak(){
        System.out.println("Woof, Woof, Woof");
    }
    public void announce(String Str){
        System.out.println(Str);
    }
}
