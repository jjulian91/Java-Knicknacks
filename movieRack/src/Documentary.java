public class Documentary extends Movie {
    private String topic;
    public Documentary(String name, int year, String Topic){
        super(name, year);
        topic=Topic;
    }
    public Documentary(String name, int year){
        super(name, year);
        topic = "N/A";
    }

    public String getTopic (){
        return topic;
    }
    public void setTopic(String newTopic){
        topic = newTopic;
    }
    public void setName(String newName){
        super.setName(newName);
    }
    public void setYear(int newYear){
        super.setYear(newYear);
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public int getYear() {
        return super.getYear();
    }

    public String toString (){
        String information = super.getName()+" ("+Integer.toString(super.getYear())+") Category is: "+getTopic()+".";
        return information;
    }
}
