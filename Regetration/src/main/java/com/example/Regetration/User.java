package com.example.Regetration;

import jakarta.persistence.Entity;
//import jakarta.persistence.GeneratedValue;
//import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="userregister")
public class User {
	
	private String Name;
	@Id
	private String Adhar;
	private String Address;
	private String Model;
	private String FualType;
	private int RegistrationYear;
	private int Pincode;
	
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getAdhar() {
		return Adhar;
	}
	public void setAdhar(String adhar) {
		Adhar = adhar;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	
	public String getModel() {
		return Model;
	}
	public void setModel(String model) {
		Model = model;
	}
	public String getFualType() {
		return FualType;
	}
	public void setFualType(String fualType) {
		FualType = fualType;
	}
	public int getRegistrationYear() {
		return RegistrationYear;
	}
	public void setRegistrationYear(int registrationYear) {
		RegistrationYear = registrationYear;
	}
	public int getPincode() {
		return Pincode;
	}
	public void setPincode(int pincode) {
		Pincode = pincode;
	}
	

}
