package com.araksha.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "emp_details")
public class Employee {

	 private String empId;
	 private String empName;
	 private Integer mobileNumber;
	 private String parkType;
	 private Boolean isActive;
	 private String dateRegistered;
	 
	
	public String getEmpId() {
		return empId;
	}
	public void setEmpId(String empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public Integer getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(Integer mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	
	public String getParkType() {
		return parkType;
	}
	public void setParkType(String parkType) {
		this.parkType = parkType;
	}
	public Boolean getIsActive() {
		return isActive;
	}
	public void setIsActive(Boolean isActive) {
		this.isActive = isActive;
	}
	public String getDateRegistered() {
		return dateRegistered;
	}
	public void setDateRegistered(String dateRegistered) {
		this.dateRegistered = dateRegistered;
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Employee [");
		builder.append(" empId=");
		builder.append(empId);
		builder.append(", empName=");
		builder.append(empName);
		builder.append(", mobileNumber=");
		builder.append(mobileNumber);
		builder.append(", parkType=");
		builder.append(parkType);
		builder.append(", isActive=");
		builder.append(isActive);
		builder.append(", dateRegistered=");
		builder.append(dateRegistered);
		builder.append("]");
		return builder.toString();
	}
	 
	 
	 
}
