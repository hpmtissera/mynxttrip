package com.lanka_guide.mynxttrip.model.activity.transport.flight;

import com.lanka_guide.mynxttrip.model.activity.AbstractActivity;
import com.lanka_guide.mynxttrip.model.activity.transport.TransportActivity;
import com.lanka_guide.mynxttrip.model.place.Airport;

public class Transit extends AbstractActivity implements FlightSubActivity, TransportActivity {
    Airport airport;

    public Transit(Airport airport) {
        this.airport = airport;
    }
}
