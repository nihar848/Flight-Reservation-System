package com.company;

public class Ticket {
    public String pnr;
    public String from;
    public String departureDateTime;
    public String arrivalDateTime;
    public String seatNo;
    public float price;
    public  boolean cancelled;

    public Ticket(String pnr, String from, String departureDateTime, String arrivalDateTime, String seatNo, float price, boolean cancelled) {
        this.pnr = pnr;
        this.from = from;
        this.departureDateTime = departureDateTime;
        this.arrivalDateTime = arrivalDateTime;
        this.seatNo = seatNo;
        this.price = price;
        this.cancelled = cancelled;
    }
    public String checkStatus(){
return "true";
    }
    public void cancel(){

    }

}
