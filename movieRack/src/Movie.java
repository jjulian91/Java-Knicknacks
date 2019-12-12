import java.time.Year;

public class Movie implements Comparable<Movie>{
    private String Title;
    private int year;

    public Movie (String name, int release){
        Title = name;

        if(release >= 1888 && release <= Year.now().getValue())
            year = release;
        else year = 0000;
    }
    public Movie (String name){
        Title = name;
        year = 2017;
    }

    public void setName (String newName){
        Title = newName;
    }
    public void setYear (int newRelease){
        if(year >= 1888 && year <= Year.now().getValue())
        year = newRelease;
    }
    public int getYear (){
        return year;
    }
    public String getName(){
        return Title;
    }
    public String toString (){
        String information = Title+" ("+Integer.toString(year)+").";
        return information;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Movie){
            Movie checkMovie = (Movie)obj;
            if(this.getYear()!=checkMovie.getYear()||!Title.equalsIgnoreCase(checkMovie.getName()))

            return false;
        }
        else
            return false;

        return true;
    }

    @Override
    public int compareTo(Movie other) {
        int yearcheck;
        if(Title.compareToIgnoreCase(other.getName())==0)
            return Integer.compare(year, other.getYear());
        else {
            return Title.compareToIgnoreCase(other.getName());
        }
    }
}
