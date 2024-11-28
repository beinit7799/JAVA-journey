package com.model;

public class Customer {
	
	private String Cname;
	private int membership_no;
	private String address;
	private String contact;
	
	public String getCname() {
		return Cname;
	}
	public void setCname(String cname) {
		Cname = cname;
	}
	public int getMembership_no() {
		return membership_no;
	}
	public void setMembership_no(int membership_no) {
		this.membership_no = membership_no;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getContact() {
		return contact;
	}
	public void setContact(String contact) {
		this.contact = contact;
	}
	@Override
	public String toString() {
		return "Customer [Cname=" + Cname + ", membership_no=" + membership_no + ", address=" + address + ", contact="
				+ contact + "]";
	}
	
	
	

}
