package com.company;

public class Main {

    public static void main(String[] args) {
        Address address=new Address("15th","bangalore","karnataka");
        System.out.println(address.city);
        System.out.println(address.state);
        System.out.println(address.street);
        Contact contact=new Contact("nihar","nihar@gmail.com","1234567890");
        System.out.println(contact.email);
        System.out.println(contact.name);
        System.out.println(contact.phone);
        Flight flight=new Flight("a123","indigo",100,70);
        System.out.println(flight.flightNumber);
        System.out.println(flight.airline);
        System.out.println(flight.capacity);
        System.out.println(flight.checkAvailability());
        Passenger passenger=new Passenger(1);
        System.out.println(passenger.id);
        RegularTicket regularTicket=new RegularTicket("123456","bengaluru","7:30 AM 5 oct","10:30 AM 5 oct","2",6666,true,"yes");
        System.out.println(regularTicket.pnr);
        System.out.println(regularTicket.from);
        System.out.println(regularTicket.departureDateTime);
        System.out.println(regularTicket.arrivalDateTime);
        System.out.println(regularTicket.seatNo);
        System.out.println(regularTicket.price);
        System.out.println(regularTicket.cancelled);
        System.out.println(regularTicket.specialServices);
        TouristTicket touristTicket=new TouristTicket("123456","bengaluru","7:30 AM 5 oct","10:30 AM 5 oct","2",6666,true,"avn grand");
        System.out.println(touristTicket.pnr);
        System.out.println(touristTicket.from);
        System.out.println(touristTicket.departureDateTime);
        System.out.println(touristTicket.arrivalDateTime);
        System.out.println(touristTicket.seatNo);
        System.out.println(touristTicket.price);
        System.out.println(touristTicket.cancelled);
        System.out.println(touristTicket.hotelAddress);
        System.out.println(touristTicket.selectedTouristLocation);


    }
}
