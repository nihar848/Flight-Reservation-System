package com.company;

public class TouristTicket {
    public String pnr;
    public String from;
    public String departureDateTime;
    public String arrivalDateTime;
    public String seatNo;
    public float price;
    public  boolean cancelled;
    public  String hotelAddress;
    public String[] selectedTouristLocation;

    public TouristTicket(String pnr, String from, String departureDateTime, String arrivalDateTime, String seatNo, float price, boolean cancelled, String hotelAddress) {
        this.pnr = pnr;
        this.from = from;
        this.departureDateTime = departureDateTime;
        this.arrivalDateTime = arrivalDateTime;
        this.seatNo = seatNo;
        this.price = price;
        this.cancelled = cancelled;
        this.hotelAddress = hotelAddress;
       // this.selectedTouristLocation = selectedTouristLocation;
    }

   /* public void removeTouristLocation(){

    }
    public void addTouristLocation(){

    }
    public String checkStatus(){

    }
    public void cancel(){

    }*/
}
