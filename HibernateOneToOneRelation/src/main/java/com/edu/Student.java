package com.edu;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity

	@Table(name="hibstudent")

public class Student {
	@Id
	private int Sid;
	private String Sname;
	@OneToOne
	Laptop lp;
	
		public Laptop getLp() {
		return lp;
	}
	public void setLp(Laptop lp) {
		this.lp = lp;
	}
		public int getSid() {
			return Sid;
		}
		public void setSid(int sid) {
			Sid = sid;
		}
		public String getSname() {
			return Sname;
		}
		public void setSname(String sname) {
			Sname = sname;
		}
		@Override
		public String toString() {
			return "Student [Sid=" + Sid + ", Sname=" + Sname + ", lp=" + lp + "]";
		}
		
		
}
