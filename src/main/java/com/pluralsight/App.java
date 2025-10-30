package com.pluralsight;

import java.util.ArrayList;

public class App {
    public static void main(String[] args) {

        // ArrayList of Asset objects.
        ArrayList <Asset> myAssests = new ArrayList<>();

        // Load it with your Assets.  Include at least 2 houses (you have a vacation home!) and at least two vehicles.
        House WhiteResidence = new House("Main Residence","April 17, 2003",250000,"3828 Piermont Dr. NE, Albuquerque, NM 87111",2,3000,1);
        myAssests.add(WhiteResidence);

        House Mythical = new House("GMM Studio","Jan 01, 2011",1.2,"P.O. Box 6578 Burbank, CA 91510",1,1000000,65);
        myAssests.add(Mythical);

        Vehicle BMWM5Comp = new Vehicle("Personal Car", "Nov 10, 2010",98000,"BMW f10",2013,25000,"Blue");
        myAssests.add(BMWM5Comp);

        Vehicle BMWX5Comp = new Vehicle("Wifey's Car","April 17, 2013",70000,"BMW X5", 2013,23000, "Pink");
        myAssests.add(BMWX5Comp);

        // Now, loop thru the Asset collection displaying the description of each asset, the
        // date you acquired it, how much you paid for it, and its value.
        for (int i = 0; i < myAssests.size(); i++){
            if (myAssests.get(i) instanceof House) {
                House house = (House) myAssests.get(i);
                System.out.println("House: " + house.getDescription());
                System.out.println("Acquired: " + house.getDateAcquired());
                System.out.println("Purchase Price: " + house.getOriginalCost());
                System.out.println("Current Value: " + house.getValue());
                System.out.println("Address: " + house.getAddress());

                } else if (myAssests.get(i) instanceof Vehicle vehicle) {

                System.out.println("Vehicle 1: " + vehicle.getDescription());
                System.out.println("Year: " + vehicle.getYear());
                System.out.println("Make/Model: " + vehicle.getMakeModel());
                System.out.println("Acquired: " + vehicle.getDateAcquired());
                System.out.println("MSRP: " + vehicle.getValue());
                System.out.println("Mileage: " + vehicle.getOdometer());
            }
        }
        double myNetWorth = 0;
        for (Asset myAssest : myAssests) {
            myNetWorth += myAssest.getValue();
        }
        System.out.println("Net Worth: " + myNetWorth);
    }
}
