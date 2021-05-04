package com.company;

public class RegularTicket {
    public String pnr;
    public String from;
    public String departureDateTime;
    public String arrivalDateTime;
    public String seatNo;
    public float price;
    public  boolean cancelled;
    public String specialServices;

    public RegularTicket(String pnr, String from, String departureDateTime, String arrivalDateTime, String seatNo, float price, boolean cancelled, String specialServices) {
        this.pnr = pnr;
        this.from = from;
        this.departureDateTime = departureDateTime;
        this.arrivalDateTime = arrivalDateTime;
        this.seatNo = seatNo;
        this.price = price;
        this.cancelled = cancelled;
        this.specialServices = specialServices;
    }

   /* public void updateSpecialServices(String specialServices){

    }*/
    public String checkStatus(){
return "yes";
    }
    public void cancel(){

    }
}
