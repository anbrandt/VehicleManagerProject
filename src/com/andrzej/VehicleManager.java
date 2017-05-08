package com.andrzej;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by andrzej on 08.05.17.
 */
public class VehicleManager {

	//create new list
	List<Vehicle> allVehiclesList = new ArrayList<>();
	List<Vehicle> allVehiclesOnTheRoad = new ArrayList<>();

	//methods that returns the size of the list allVehiclesList
	public int getTotalVehiclesCount() {
		return allVehiclesList.size();
	}

	public int getTotalVehiclesOnTheRoadCount() {
		return allVehiclesOnTheRoad.size();
	}

	public void removeVehiclefromTheList(Vehicle vehicle) {
		allVehiclesList.remove(Vehicle);
	}




	// create a list of vehicles that are in garage and list of vehicles that are on road
	//add a vehicle, remove a wehicle from the list
	//extract information about vehicle in the base and on the road, and total number of vehicles
	//send a vehicle to somewhere
	//search vehicle by regnumber, driver, brand, typeofcar

	//use extends

	//make sure you have a good methods names

//a method that itirates over the mileage and prints an information if>50000 needs to be withdrawn, if >40000 needs to be checked




	//after making all the methods used to operate on the fleet, write some methods that will test the methods
	//on problematic inputs (mistake in drivers name, or cars name)
}
