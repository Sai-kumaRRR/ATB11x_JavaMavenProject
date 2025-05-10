package com.thetestingacademy.ex07_payload_management.classmanul_01.Responsepayload;

import com.thetestingacademy.ex07_payload_management.classmanul_01.Requestpayload.booking;

public class Bookingid_Response {

     private Integer bookingid;
     private booking booking;

    public Integer getBookingid() {
        return bookingid;
    }

    public void setBookingid(Integer bookingid) {
        this.bookingid = bookingid;
    }

    public booking getBooking() {
        return booking;
    }

    public void setBooking(booking booking) {
        this.booking = booking;
    }
}
