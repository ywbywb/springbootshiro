package com.erp.pojo;
//产品登记实体类
public class AregistrationformYWB {
	private int productID;//产品编号1111
	private String productname;//产品名字
	private String productclassification;//产品分类编号
	private int productlevel;//产品级别编号
	private String manufacturer;//产品制造商111
	private String unitmeasurement;//计量单位
	private int measuredvalue;//计量值
	private String guaranteedate;//保质日期
	private String ddescribe;//产品描述
	private int marketvalue;//市场价
	private int carketvalue;//成本价
	private String productmanager;//产品经理编号
	private String registrant;//登记人
	private String filingtime;//建档时间
	private String toexamine;//'未审核 通过审核
	private String reviewedby;//'核审人',
	public AregistrationformYWB() {
		super();
	}
	public AregistrationformYWB(int productID, String productname, String productclassification, int productlevel,
			String manufacturer, String unitmeasurement, int measuredvalue, String guaranteedate, String ddescribe,
			int marketvalue, int carketvalue, String productmanager, String registrant, String filingtime,
			String toexamine, String reviewedby) {
		super();
		this.productID = productID;
		this.productname = productname;
		this.productclassification = productclassification;
		this.productlevel = productlevel;
		this.manufacturer = manufacturer;
		this.unitmeasurement = unitmeasurement;
		this.measuredvalue = measuredvalue;
		this.guaranteedate = guaranteedate;
		this.ddescribe = ddescribe;
		this.marketvalue = marketvalue;
		this.carketvalue = carketvalue;
		this.productmanager = productmanager;
		this.registrant = registrant;
		this.filingtime = filingtime;
		this.toexamine = toexamine;
		this.reviewedby = reviewedby;
	}
	public int getProductID() {
		return productID;
	}
	public void setProductID(int productID) {
		this.productID = productID;
	}
	public String getProductname() {
		return productname;
	}
	public void setProductname(String productname) {
		this.productname = productname;
	}
	public String getProductclassification() {
		return productclassification;
	}
	public void setProductclassification(String productclassification) {
		this.productclassification = productclassification;
	}
	public int getProductlevel() {
		return productlevel;
	}
	public void setProductlevel(int productlevel) {
		this.productlevel = productlevel;
	}
	public String getManufacturer() {
		return manufacturer;
	}
	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}
	public String getUnitmeasurement() {
		return unitmeasurement;
	}
	public void setUnitmeasurement(String unitmeasurement) {
		this.unitmeasurement = unitmeasurement;
	}
	public int getMeasuredvalue() {
		return measuredvalue;
	}
	public void setMeasuredvalue(int measuredvalue) {
		this.measuredvalue = measuredvalue;
	}
	public String getGuaranteedate() {
		return guaranteedate;
	}
	public void setGuaranteedate(String guaranteedate) {
		this.guaranteedate = guaranteedate;
	}
	public String getDdescribe() {
		return ddescribe;
	}
	public void setDdescribe(String ddescribe) {
		this.ddescribe = ddescribe;
	}
	public int getMarketvalue() {
		return marketvalue;
	}
	public void setMarketvalue(int marketvalue) {
		this.marketvalue = marketvalue;
	}
	public int getCarketvalue() {
		return carketvalue;
	}
	public void setCarketvalue(int carketvalue) {
		this.carketvalue = carketvalue;
	}
	public String getProductmanager() {
		return productmanager;
	}
	public void setProductmanager(String productmanager) {
		this.productmanager = productmanager;
	}
	public String getRegistrant() {
		return registrant;
	}
	public void setRegistrant(String registrant) {
		this.registrant = registrant;
	}
	public String getFilingtime() {
		return filingtime;
	}
	public void setFilingtime(String filingtime) {
		this.filingtime = filingtime;
	}
	public String getToexamine() {
		return toexamine;
	}
	public void setToexamine(String toexamine) {
		this.toexamine = toexamine;
	}
	public String getReviewedby() {
		return reviewedby;
	}
	public void setReviewedby(String reviewedby) {
		this.reviewedby = reviewedby;
	}
	
}
