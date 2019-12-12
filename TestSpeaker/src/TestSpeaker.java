public class TestSpeaker {
    public static void main (String[]args){
        Dog Pug = new Dog("Pug");
        Speaker guest1 =Pug;
        guest1.announce("I am a dog!\n");
        guest1.speak();

        Cat Siamese = new Cat("Siamese");
        Speaker guest2 = Siamese;
        guest2.announce("I am a fabulous kitty\n");
        guest2.speak();

        Philosopher Confucius = new Philosopher("religious symbol");
        Speaker guest3 = Confucius;
        guest3.announce("Confucius says:\n");
        guest3.speak();
    }
}
