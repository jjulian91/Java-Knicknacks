public  class Cat implements Speaker{
    protected String Breed;
    public  Cat(String type){
        Breed=type;
    }
    public void speak(){
        System.out.println("Meow");
    }
    public void announce(String Str){
        System.out.println(Str);
    }

}
