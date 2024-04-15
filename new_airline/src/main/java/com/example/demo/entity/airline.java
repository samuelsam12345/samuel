package com.example.demo.entity;



import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class airline {
	@Id
	 private int  ticketid;
	private String typeofairline;
	private String ArrivalDestination;
	private String DepatureDestination;
	private int totalamount;
	private String ArrivalDate;
	private String Departuredate;
	public int getProductid() {
		return ticketid;

}
	public int getTicketid() {
		return ticketid;
	}
	public void setTicketid(int ticketid) {
		this.ticketid = ticketid;
	}
	public String getTypeofairline() {
		return typeofairline;
	}
	public void setTypeofairline(String typeofairline) {
		this.typeofairline = typeofairline;
	}
	public String getArrivalDestination() {
		return ArrivalDestination;
	}
	public void setArrivalDestination(String arrivalDestination) {
		ArrivalDestination = arrivalDestination;
	}
	public String getDepatureDestination() {
		return DepatureDestination;
	}
	public void setDepatureDestination(String depatureDestination) {
		DepatureDestination = depatureDestination;
	}
	public int getTotalamount() {
		return totalamount;
	}
	public void setTotalamount(int totalamount) {
		this.totalamount = totalamount;
	}
	public String getArrivalDate() {
		return ArrivalDate;
	}
	public void setArrivalDate(String arrivalDate) {
		ArrivalDate = arrivalDate;
	}
	public String getDeparturedate() {
		return Departuredate;
	}
	public void setDeparturedate(String departuredate) {
		Departuredate = departuredate;
	}
	public airline(int ticketid, String typeofairline, String arrivalDestination, String depatureDestination,
			int totalamount, String arrivalDate, String departuredate) {
		super();
		this.ticketid = ticketid;
		this.typeofairline = typeofairline;
		ArrivalDestination = arrivalDestination;
		DepatureDestination = depatureDestination;
		this.totalamount = totalamount;
		ArrivalDate = arrivalDate;
		Departuredate = departuredate;
	}
	public airline() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}