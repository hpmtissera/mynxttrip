package com.lanka_guide.mynxttrip.model.activity.stay;

import com.lanka_guide.mynxttrip.model.place.Hotel;

import java.time.LocalDate;

public class HotelStay extends Stay {
    public HotelStay(Hotel hotel, LocalDate checkin, LocalDate checkout) {
        super(hotel, checkin, checkout);
    }
}
