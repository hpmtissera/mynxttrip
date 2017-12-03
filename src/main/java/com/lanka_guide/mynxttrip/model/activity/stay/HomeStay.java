package com.lanka_guide.mynxttrip.model.activity.stay;

import com.lanka_guide.mynxttrip.model.place.Place;

import java.time.LocalDate;

public class HomeStay extends Stay {
    public HomeStay(Place place, LocalDate checkin, LocalDate checkout) {
        super(place, checkin, checkout);
    }
}
