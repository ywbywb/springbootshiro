package com.erp.pojo;
//产品登记实体类
public class AregistrationformYWB {
	private int ProductID;//产品编号1111
	private String Productname;//产品名字
	private String Productclassification;//产品分类编号
	private int Productlevel;//产品级别编号
	private String manufacturer;//产品制造商111
	private int Unitmeasurement;//计量单位
	private int Measuredvalue;//计量值
	private String guaranteedate;//保质日期
	private int ddescribe;//产品描述
	private int marketvalue;//市场价
	private int carketvalue;//成本价
	private String productmanager;//产品经理编号
	private String Registrant;//登记人
	private String Filingtime;//建档时间
	private int Toexamine;//'未审核 通过审核
	private String Reviewedby;//'核审人',
	public int getProductID() {
		return ProductID;
	}
	public void setProductID(int productID) {
		ProductID = productID;
	}
	public String getProductname() {
		return Productname;
	}
	public void setProductname(String productname) {
		Productname = productname;
	}
	public String getProductclassification() {
		return Productclassification;
	}
	public void setProductclassification(String productclassification) {
		Productclassification = productclassification;
	}
	public int getProductlevel() {
		return Productlevel;
	}
	public void setProductlevel(int productlevel) {
		Productlevel = productlevel;
	}
	public String getManufacturer() {
		return manufacturer;
	}
	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}
	public int getUnitmeasurement() {
		return Unitmeasurement;
	}
	public void setUnitmeasurement(int unitmeasurement) {
		Unitmeasurement = unitmeasurement;
	}
	public int getMeasuredvalue() {
		return Measuredvalue;
	}
	public void setMeasuredvalue(int measuredvalue) {
		Measuredvalue = measuredvalue;
	}
	public String getGuaranteedate() {
		return guaranteedate;
	}
	public void setGuaranteedate(String guaranteedate) {
		this.guaranteedate = guaranteedate;
	}
	public int getDdescribe() {
		return ddescribe;
	}
	public void setDdescribe(int ddescribe) {
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
		return Registrant;
	}
	public void setRegistrant(String registrant) {
		Registrant = registrant;
	}
	public String getFilingtime() {
		return Filingtime;
	}
	public void setFilingtime(String filingtime) {
		Filingtime = filingtime;
	}
	public int getToexamine() {
		return Toexamine;
	}
	public void setToexamine(int toexamine) {
		Toexamine = toexamine;
	}
	public String getReviewedby() {
		return Reviewedby;
	}
	public void setReviewedby(String reviewedby) {
		Reviewedby = reviewedby;
	}
	@Override
	public String toString() {
		return "AregistrationformYWB [ProductID=" + ProductID + ", Productname=" + Productname
				+ ", Productclassification=" + Productclassification + ", Productlevel=" + Productlevel
				+ ", manufacturer=" + manufacturer + ", Unitmeasurement=" + Unitmeasurement + ", Measuredvalue="
				+ Measuredvalue + ", guaranteedate=" + guaranteedate + ", ddescribe=" + ddescribe + ", marketvalue="
				+ marketvalue + ", carketvalue=" + carketvalue + ", productmanager=" + productmanager + ", Registrant="
				+ Registrant + ", Filingtime=" + Filingtime + ", Toexamine=" + Toexamine + ", Reviewedby=" + Reviewedby
				+ "]";
	}
	public AregistrationformYWB(int productID, String productname, String productclassification, int productlevel,
			String manufacturer, int unitmeasurement, int measuredvalue, String guaranteedate, int ddescribe,
			int marketvalue, int carketvalue, String productmanager, String registrant, String filingtime,
			int toexamine, String reviewedby) {
		super();
		ProductID = productID;
		Productname = productname;
		Productclassification = productclassification;
		Productlevel = productlevel;
		this.manufacturer = manufacturer;
		Unitmeasurement = unitmeasurement;
		Measuredvalue = measuredvalue;
		this.guaranteedate = guaranteedate;
		this.ddescribe = ddescribe;
		this.marketvalue = marketvalue;
		this.carketvalue = carketvalue;
		this.productmanager = productmanager;
		Registrant = registrant;
		Filingtime = filingtime;
		Toexamine = toexamine;
		Reviewedby = reviewedby;
	}
	public AregistrationformYWB() {
		super();
	}
	
	
	
}
