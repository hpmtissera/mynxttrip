package com.lanka_guide.mynxttrip.model;

import com.lanka_guide.mynxttrip.model.activity.Activity;
import com.lanka_guide.mynxttrip.model.activity.stay.Accommodation;
import com.lanka_guide.mynxttrip.model.activity.transport.Transport;

import java.util.ArrayList;
import java.util.List;

public class Itinerary {
    Accommodation accommodation;
    Transport transport;
    List<Activity> activities = new ArrayList<>();

    public void addActivity(Activity activity) {
        activities.add(activity);
    }

    public void addAccommodation(Accommodation accommodation) {
        this.accommodation = accommodation;
    }

    public void addTransport(Transport transport) {
        this.transport = transport;
    }
}
