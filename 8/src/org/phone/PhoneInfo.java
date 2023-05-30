package org.phone;

public class PhoneInfo {

	public void phoneName() {
		System.out.println("phonename is iphone 13");
	}
	
	public void phoneImeNum() {
		System.out.println("Imei Number is XJ213KYFTRAK");
	}
	
	public void Camera() {
		System.out.println("camera is 12MP ");
	}
	
	public void Storage() {
		System.out.println("storage is 128GB");
	}
	
	public void OsName() {
		System.out.println("os is IOS");
	}
	
	public static void main(String[] args) {
		PhoneInfo phonedetails = new PhoneInfo();
		phonedetails.Camera();
		phonedetails.phoneImeNum();
		phonedetails.Camera();
		phonedetails.Storage();
		phonedetails.OsName();
	}
}
