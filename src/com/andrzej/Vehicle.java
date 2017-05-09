package com.andrzej;

import java.sql.Driver;

/**
 * Created by andrzej on 08.05.17.
 */
public class Vehicle {

	//use setter for mileage and driver in order not to extend the size of constructor in the Vehicle class
	private Integer weightOfTheVehicle;
	private Integer mileageOfTheVehicle;
	private String typeOfTheVehicle; 
	private String brandOfTheVehicle;
	private String registrationNumber;
	private GpsTracker gpsPosition; //call the GpsTracker class to create field gpsposition
	private Driver driver; //call the Driver class to create field driver

	//don't know if the access modifier should be public ????

	//constructor for the Vehicle class
	public Vehicle(Integer weightOfTheVehicle, String typeOfTheVehicle, Integer mileageOfTheVehicle,
				   String brandOfTheVehicle, String registrationNumber) {
		this.weightOfTheVehicle = weightOfTheVehicle;
		this.mileageOfTheVehicle = mileageOfTheVehicle;
		this.brandOfTheVehicle = brandOfTheVehicle;
		this.registrationNumber = registrationNumber;

	}

	public Integer getWeightOfTheVehicle() {
		return weightOfTheVehicle;
	}

	public String getTypeOfTheVehicle() {
		return typeOfTheVehicle;
	}

	public Integer getMileageOfTheVehicle() {
		return mileageOfTheVehicle;
	}

	public String getBrandOfTheVehicle() {
		return brandOfTheVehicle;
	}

	public String getRegistrationNumber() {
		return registrationNumber;
	}
}
