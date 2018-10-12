package com.company;

/**
 * Created by dpennebacker on 10/9/16.
 */
public class Automobile {

    public int miles = 0;
    public int gallons = 0;
    public int mpg = 0;

    public Automobile (int milesPerGallon)
    {
        mpg = milesPerGallon;
    }

    public void takeTrip (int mileage)
    {
        this.miles = miles;
        gallons = mileage - mpg;
    }

    public void fillUp (int gas)
    {
        gas = gas + gallons;
    }

    public double reportFuel ()
    {
        return gallons;
    }
}
