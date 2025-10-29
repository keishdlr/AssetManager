package com.pluralsight;

import java.util.ArrayList;

public class App {
    public static void main(String[] args) {

        // ArrayList of Asset objects.
        ArrayList<> myAssests = new ArrayList<>();

        // Load it with your Assets.  Include at least 2 houses (you have a vacation home!)
        // and at least two vehicles.
        House WhiteResidence = new House("Main Residence","April 17, 2003",250000,"3828 Piermont Dr. NE, Albuquerque, NM 87111",2,3000,1);
        myAssests.add(WhiteResidence);

        House Mythical = new House("GMM Studio","Jan 01, 2011",1.2,"P.O. Box 6578 Burbank, CA 91510",1,1000000,65);
        myAssests.add(Mythical);

        Vehicle BMWM5Comp = new Vehicle("Personal Car", "Nov 10, 2010",98000,"BMW f10",2013,25000,"Blue");
        myAssests.add(BMWM5Comp);

        Vehicle BMWX5Comp = new Vehicle("Wifey's Car","April 17, 2013",70000,"BMW X5", 2013,23000, "Pink");
        myAssests.add(BMWX5Comp);

        //Now, loop thru the Asset collection displaying the description of each asset, the
       // date you acquired it, how much you paid for it, and its value.
        for (int i = 0; i < myAssests.size(); i++){
            if (myAssets.get(i) instanceof House) {
                House house = (house) myAssets.get(i);
                System.out.println("House at " + house.getAddress());

                } else if (myAssets.get(i) instanceof Vehicle) {
                Vehicle vehicle = (vehicle) myAssets.get(i);

                System.out.println("Vehicle 1: " + vehicle.getDescription());
                System.out.println("Year: " + vehicle.getYear());
                System.out.println("Make/Model: " + vehicle.getMakeModel());
                System.out.println("Acquired: " + vehicle.getDateAcquired());
                System.out.println("MSRP: " + vehicle.getValue());
                System.out.println("Mileage: " + vehicle.getOdometer());
            }
        }
        double myNetWorth = 0;
        for(int i = 0; i < myAssets.length; i++) {
            myNetWorth += myAssets[i].getValue();
        }
            System.out.println("Net Worth: " + myNetWorth);
       // When that works, go back and include in the display either the address of the
       // house or the year and make/model of the vehicle.  You will need to use
       // instanceof when you loop through the assets to detect the type of asset it is.
       // Once you know it is a House or Vehicle, you will need to downcast it so that you
       // can call the methods of the specific type.
    }
}
/// / Assume House and Jewelry extend the Asset class
//Asset[] myAssets = new Asset[3];
//myAssets[0] = new House("Ranch House", "402 Stevens",
//2000, 43560, 2020, 125.00);
//myAssets[1] = new House("Rental", "3329 Duchess",
//1600, 5445, 1995, 53000);
//myAssets[2] = new Jewelry("Ring", "Diamond", 1.5, 1979, 1200);
