package com.edu;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
	@Table(name="hiblaptop")
	public class Laptop {
	
	@Id
	private int lid;
	private String lname;
	private int lprice;
	
	

		public int getLid() {
			return lid;
		}
		public void setLid(int lid) {
			this.lid = lid;
		}
		@Override
		public String toString() {
			return "Laptop [lid=" + lid + ", lname=" + lname + ", lprice=" + lprice + "]";
		}
		public String getLname() {
			return lname;
		}
		public void setLname(String lname) {
			this.lname = lname;
		}
		public int getLprice() {
			return lprice;
		}
		public void setLprice(int lprice) {
			this.lprice = lprice;
		}
		
}
