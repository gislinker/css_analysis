package edu.haut.css.analysis.spider.pojo;

public class UniversityLocation {
	
	private Long id;
	private String uniName;
	private String address;
	private String lat;
	private String lng;
	public String getUniName() {
		return uniName;
	}
	public void setUniName(String uniName) {
		this.uniName = uniName;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getLat() {
		return lat;
	}
	public void setLat(String lat) {
		this.lat = lat;
	}
	public String getLng() {
		return lng;
	}
	public void setLng(String lng) {
		this.lng = lng;
	}
	@Override
	public String toString() {
		return "UniversityLocation [uniName=" + uniName + ", address=" + address + ", lat=" + lat + ", lng=" + lng
				+ "]";
	}
	
	
	
}
