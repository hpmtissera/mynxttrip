package com.lanka_guide.mynxttrip.model.activity.transport;

import com.lanka_guide.mynxttrip.model.activity.AbstractActivity;
import com.lanka_guide.mynxttrip.model.place.Place;

public class TransportSegment extends AbstractActivity implements TransportActivity {

    Place start;
    Place end;

    public TransportSegment(Place start, Place end) {
        this.start = start;
        this.end = end;
    }

    public TransportSegment() {

    }
}
