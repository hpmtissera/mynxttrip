package com.lanka_guide.mynxttrip.model.activity.transport.drive;

import com.lanka_guide.mynxttrip.model.activity.transport.TransportSegment;
import com.lanka_guide.mynxttrip.model.place.Place;

import java.util.ArrayList;
import java.util.List;

public abstract class Drive extends TransportSegment {
    double distance;
    List<Place> stops;

    public Drive(Place start, Place end) {
        super(start, end);
    }

    public void addStop(Place place) {
        if (stops == null) {
            stops = new ArrayList<>();
        }
        stops.add(place);
    }
}
