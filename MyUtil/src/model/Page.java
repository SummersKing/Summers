package model;

import java.util.List;



/**  

* <p>Title: Page</p>  

* <p>Description: </p>  

* @author Summer·King  

* <p> @date 2018年10月23日</p>   

*/ 
public class Page<T> {
private String tablename;
 /** 当前数据表数据所显示在网页上的位置*/ 
private Integer  currentPage;
 /** 根据每页数据显示量和总数据量所展示的所有页面*/ 
private Integer totalPages;
 /**当前数据表的所有数据条数 */ 
private Integer dataCount;
 /** 页面所显示的数据数目*/ 
private Integer dataNum;
 /** 查询所返回的数据*/ 
private List<T>data;
/**开始的索引*/ 
private Integer startIndex;
/** 结束时的索引*/ 
private Integer endIndex;
/**  

* <p>Title: </p>  

* <p>Description: 用于初始化page值，必须要有当前页位置以及每页线束数目</p>  

* @param tablename
* @param currentPage
* @param dataNum  

*/ 
public Page(String tablename,Integer currentPage ,Integer dataNum){
	this.tablename=tablename;
	this.currentPage=currentPage;
	this.dataNum=dataNum;
	this.startIndex=dataNum*(currentPage-1);
}

/**  

* <p>Title: </p>  

* <p>Description: 默认的第一页位置</p>  
  

*/ 
public Page(String tablename){
	this.tablename=tablename;
	this.currentPage=1;
	this.dataNum=20;
	this.startIndex=0;
}
@Override
public String toString() {
	return "页面信息 {\r\n  数据来源于 " + tablename + ";\r\n  当前页: " + currentPage + "  总页数: " + totalPages
			+ "  数据总条数: " + dataCount + "  每页显示: " + dataNum + "\r\n  当前页开始于索引: " + startIndex
			+ "  结束于索引: " + endIndex +"}";
}

public String getTablename() {
	return tablename;
}
public void setTablename(String tablename) {
	this.tablename = tablename;
}
public Integer getCurrentPage() {
	return currentPage;
}
public void setCurrentPage(Integer currentPage) {
	this.currentPage = currentPage;
}
public Integer getTotalPages() {
	return totalPages;
}
public void setTotalPages(Integer totalPages) {
	this.totalPages = totalPages;
}
public Integer getDataCount() {
	return dataCount;
}
public void setDataCount(Integer dataCount) {
	this.dataCount = dataCount;
}
public Integer getDataNum() {
	return dataNum;
}
public void setDataNum(Integer dataNum) {
	this.dataNum = dataNum;
}
public List<T> getData() {
	return data;
}
public void setData(List<T> data) {
	this.data = data;
}
public Integer getStartIndex() {
	return startIndex;
}
public void setStartIndex(Integer startIndex) {
	this.startIndex = startIndex;
}
public Integer getEndIndex() {
	return endIndex;
}
public void setEndIndex(Integer endIndex) {
	this.endIndex = endIndex;
}



}
