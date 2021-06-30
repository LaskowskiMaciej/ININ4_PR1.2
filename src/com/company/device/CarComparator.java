package com.company.device;
import java.util.Comparator;
public class CarComparator implements Comparator<Car> {
    @Override
    public int compare(Car otherCar, Car otherCar2) {
        if (otherCar.productionYear == null)
            return 1;
        else if (otherCar2 == null)
            return -1;
        else if (otherCar.productionYear < otherCar2.productionYear)
            return 1;
        else if (otherCar.productionYear > otherCar2.productionYear)
            return -1;
        else
            return 0;
    }

}