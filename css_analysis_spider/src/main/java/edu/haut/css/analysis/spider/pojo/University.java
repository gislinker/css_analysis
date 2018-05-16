package edu.haut.css.analysis.spider.pojo;

public class University {
	
	private Long id;
	private String name;//大学名称
	private String address;//大学地址
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "[" + name + "," + address + "]";
	}
	
	
	
}
