package edu.haut.css.analysis.spider.pojo;

import java.util.List;


public interface StoreDao {
	
	/**
	 * 增加商家用户
	 */
	public void insertStore(Store store);

	
	
	/**
	 * 查询地址及经纬度
	 */

	public List<StoreLocation> queryAll();
	
	/**
	 * 增加小区
	 */
	
	public void insertCommunity(Community community);
	
	/**
	 * 查询小区的地址及经纬度
	 */
	
	public List<CommunityLocation> queryAllCom();
	
	/**
	 * 增加大学
	 */
	public void insertUniversity(University university);
	
	
	/**
	 * 查询大学的地址及经纬度
	 */
	
	//public List<CommunityLocation> queryAllCom();
}
