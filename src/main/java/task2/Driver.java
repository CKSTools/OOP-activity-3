package task2;

import essentials.GenericDriver;

public class Driver extends GenericDriver{

    private String name;
    private int points;

    public Driver(String name, int points)
    {   this.name = name;
        this.points = points;
    }

    public String getName(){return name;}

    public int getPoints(){return points;}

    @Override
    public int compareTo(Driver driver){
        int pointsDiff=driver.getPoints();
        return pointsDiff-this.getPoints();
    }
}
