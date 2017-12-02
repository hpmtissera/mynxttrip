package com.lanka_guide.mynxttrip.model.activity.transport;

import com.lanka_guide.mynxttrip.model.place.Airport;

import java.time.LocalTime;

public class FlightLeg extends Transport {
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

}
