package com.persistence.model;


/**
 * Created by xiaoyx on 2017/5/16
 * 分页传递参数分页
 */

public class Pager {
	
	   private int currentPage; //当前页码
	   private int totalItems;  //总记录数
	   private int itemsPerPage;  //每页显示记录数
	   private int startPage;
	   private int endPage ;
	   
	   public int getCurrentPage() {
			return currentPage;
	   }
		public void setCurrentPage(int currentPage) {
			this.currentPage = currentPage;
		}
		
		public int getTotalItems() {
			return totalItems;
		}
		public void setTotalItems(int totalItems) {
			this.totalItems = totalItems;
		}
		
		public int getItemsPerPage() {
			return itemsPerPage;
		}
		public void setItemsPerPage(int itemsPerPage) {
			this.itemsPerPage = itemsPerPage;
		}
		public int getStartPage() {
			return (this.currentPage-1) * this.itemsPerPage +1;
		}
		public int getEndPage() {
			return (this.currentPage) * this.itemsPerPage;
		}
		public void setStartPage(int startPage) {
			 this.startPage = startPage;
		}
		public void setEndPage(int endPage) {
			this.endPage = endPage;
		}
	
		
		
}
