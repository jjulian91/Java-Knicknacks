public abstract class Animal
{
    private String name;
    public abstract void talk();
    public String getName()
    {
        return name;
    }
    public void setName (String animalName)
    {
        name = animalName;
    }
}