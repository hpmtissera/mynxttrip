package com.lanka_guide.mynxttrip.model.activity.transport.flight;

import com.lanka_guide.mynxttrip.model.activity.transport.TransportActivity;
import com.lanka_guide.mynxttrip.model.activity.transport.TransportSegment;
import com.lanka_guide.mynxttrip.model.place.Airport;

import java.time.LocalTime;

public class Flight extends TransportSegment implements TransportActivity {
    Airport start;
    Airport end;
    LocalTime checkInOpen;
    LocalTime boarding;
    LocalTime departure;
    LocalTime arrive;
    boolean checkIn;
    boolean security;
    boolean customs;
    boolean immigration;
    String airline;
    String flightNumber;
    String depatureTerminal;
    String arriveTerminal;

    public Flight(Airport start, Airport end, String flightNumber) {
        super(start, end);
        this.flightNumber = flightNumber;
    }
}
