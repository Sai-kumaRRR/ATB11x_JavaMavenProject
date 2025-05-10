package com.thetestingacademy.ex07_payload_management.`class`.UsingAI

class BookingDates {
    var checkin: String? = null
    var checkout: String? = null

    override fun toString(): String {
        return "BookingDates{" +
                "checkin='" + checkin + '\'' +
                ", checkout='" + checkout + '\'' +
                '}'
    }
}