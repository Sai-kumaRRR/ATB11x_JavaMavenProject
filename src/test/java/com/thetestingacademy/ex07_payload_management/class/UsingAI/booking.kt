package com.thetestingacademy.ex07_payload_management.`class`.UsingAI

import com.thetestingacademy.ex07_payload_management.classTools.Bookingdates.BookingDates


class Booking {
    var firstname: String? = null
    var lastname: String? = null
    var totalprice: Int = 0
    var isDepositpaid: Boolean = false
    var bookingdates: BookingDates? = null
    var additionalneeds: String? = null

    override fun toString(): String {
        return "Booking{" +
                "firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", totalprice=" + totalprice +
                ", depositpaid=" + isDepositpaid +
                ", bookingdates=" + bookingdates +
                ", additionalneeds='" + additionalneeds + '\'' +
                '}'
    }
}