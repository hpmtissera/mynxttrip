package com.lanka_guide.mynxttrip.model.activity.transport;

import com.lanka_guide.mynxttrip.model.activity.AbstractActivity;

import java.util.ArrayList;
import java.util.List;

public class Transport extends AbstractActivity {
    List<TransportActivity> transportActivities;

    public void addTransportSegment(TransportActivity transport) {
        if (transportActivities == null) {
            transportActivities = new ArrayList<>();
        }
        transportActivities.add(transport);
    }
}