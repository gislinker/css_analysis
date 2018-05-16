package edu.haut.css.analysis.spider.pojo;

public class Store {
	
	private Long id;
	private String address; //��ַ
	private String avgScore;  //����
	private String avgPrice;  //����
	private String poiId;     //��� 
	private String title;    //����
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getAvgScore() {
		return avgScore;
	}
	public void setAvgScore(String avgScore) {
		this.avgScore = avgScore;
	}
	public String getAvgPrice() {
		return avgPrice;
	}
	public void setAvgPrice(String avgPrice) {
		this.avgPrice = avgPrice;
	}
	public String getPoiId() {
		return poiId;
	}
	public void setPoiId(String poiId) {
		this.poiId = poiId;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	@Override
	public String toString() {
		return " [address=" + address + ", avgScore=" + avgScore + ", avgPrice=" + avgPrice + ", poiId=" + poiId
				+ ", title=" + title + "]";
	}
	
	
	
}
