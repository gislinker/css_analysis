package edu.haut.css.analysis.spider.pojo;

public class CommunityLocation {
	
	private Long id;
	private String comName;
	private String address;
	private String lat;
	private String lng;
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getComName() {
		return comName;
	}

	public void setComName(String comName) {
		this.comName = comName;
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
		return "[" + lng + "," + lat + "," + comName + ", " + address + "]";
	}
	
	
}
