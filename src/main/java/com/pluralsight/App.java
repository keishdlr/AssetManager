package com.pluralsight;

import java.util.ArrayList;

public class App {
    public static void main(String[] args) {

        // ArrayList of Asset objects.
        ArrayList<> assests = new ArrayList<>();

        // Load it with your Assets.  Include at least 2 houses (you have a vacation home!)
        // and at least two vehicles.
        House MainResidence = new House();
        assests.add(MainResidence);

        House VacationHome = new House();
        assests.add(VacationHome);

        Vehicle BlueBMWM5Comp = new Vehicle();
        assests.add(BlueBMWM5Comp);

        Vehicle PinkBMWX5Comp = new Vehicle();
        assests.add(PinkBMWX5Comp);


//        Now, loop thru the Asset collection displaying the description of each asset, the
//        date you acquired it, how much you paid for it, and its value.
//        When that works, go back and include in the display either the address of the
//        house or the year and make/model of the vehicle.  You will need to use
//        instanceof when you loop through the assets to detect the type of asset it is.
//        Once you know it is a House or Vehicle, you will need to downcast it so that you
//        can call the methods of the specific type.
    }
}
//}String message = "";
//if (myAssets.get(i) instanceof House) {
//House house = (House) myAssets.get(i);
//message = "House at " + house.getAddress();
//}
//        else if (myAssets.get(i) instanceof Vehicle) {
//Vehicle vehcile = (Vehicle) myAssets.get(i);
//message = "Vehicle: " +
//        vehicle.getYear() + " " + vehicle.getMakeModel();
//}

/// / Assume House and Jewelry extend the Asset class
//Asset[] myAssets = new Asset[3];
//myAssets[0] = new House("Ranch House", "402 Stevens",
//2000, 43560, 2020, 125.00);
//myAssets[1] = new House("Rental", "3329 Duchess",
//1600, 5445, 1995, 53000);
//myAssets[2] = new Jewelry("Ring", "Diamond", 1.5, 1979, 1200);
/// / Loop thru the assets and get the value of each
//double myNetWorth = 0;
//for(int i = 0; i < myAssets.length; i++) {
//myNetWorth += myAssets[i].getValue();
//}
