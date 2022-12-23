package task2;

import java.util.ArrayList;

public class ScoreBoard {
    private ArrayList<Driver> drivers = new ArrayList<>();


    public void addDriver(Driver driver)
    {
        drivers.add(driver);
    }

    public ArrayList<Driver> drivers()
    {
        return drivers;
    }
}
