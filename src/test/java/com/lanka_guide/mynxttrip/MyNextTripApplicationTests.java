package com.lanka_guide.mynxttrip;

import com.lanka_guide.mynxttrip.model.Itinerary;
import com.lanka_guide.mynxttrip.model.activity.Activity;
import com.lanka_guide.mynxttrip.model.activity.stay.Accommodation;
import com.lanka_guide.mynxttrip.model.activity.stay.HotelStay;
import com.lanka_guide.mynxttrip.model.activity.stay.Stay;
import com.lanka_guide.mynxttrip.model.activity.transport.Transport;
import com.lanka_guide.mynxttrip.model.activity.transport.drive.Car;
import com.lanka_guide.mynxttrip.model.activity.transport.drive.Drive;
import com.lanka_guide.mynxttrip.model.activity.transport.flight.Flight;
import com.lanka_guide.mynxttrip.model.activity.transport.flight.Transit;
import com.lanka_guide.mynxttrip.model.place.Airport;
import com.lanka_guide.mynxttrip.model.place.Hotel;
import com.lanka_guide.mynxttrip.model.place.Place;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.time.LocalDate;
import java.time.ZoneId;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MyNextTripApplicationTests {

    @Test
    public void testModel() {
        Itinerary itinerary = new Itinerary();
        Accommodation accommodation = new Accommodation();
        Transport transport = new Transport();

        Airport cts = new Airport("CTS");
        Airport hnd = new Airport("HND");
        Airport cgk = new Airport("CGK");
        Airport yog = new Airport("YOG");
        Airport sub = new Airport("SUB");

        Flight ctsToHnd = new Flight(cts, hnd, "NH85");
        Transit hndTransit = new Transit(hnd);
        Flight hndToCgk = new Flight(hnd, cgk, "NH872");
        Transit cgkTransit = new Transit(cgk);
        Flight cgkToYog = new Flight(cgk, yog, "GA838");

        transport.addTransportSegment(ctsToHnd);
        transport.addTransportSegment(hndTransit);
        transport.addTransportSegment(hndToCgk);
        transport.addTransportSegment(cgkTransit);
        transport.addTransportSegment(cgkToYog);

        Hotel royalHotel = new Hotel("Royal Ambarrukmo");
        Stay royalHotelStay = new HotelStay(royalHotel,
                LocalDate.of(2017, 8, 6), LocalDate.of(2017, 8, 9));

        Hotel jiwaHotel = new Hotel("Jiwa Jawa Resort");
        Stay jiwaHotelStay = new HotelStay(jiwaHotel,
                LocalDate.of(2017, 8, 9), LocalDate.of(2017, 8, 11));

        Hotel airportHotel = new Hotel("Jakarta Airport Hotel");
        Stay airportHotelStay = new HotelStay(airportHotel,
                LocalDate.of(2017, 8, 11), LocalDate.of(2017, 8, 12));

        accommodation.addStay(royalHotelStay);
        accommodation.addStay(jiwaHotelStay);
        accommodation.addStay(airportHotelStay);

        Place diengPlateau = new Place("Dieng Plateau", ZoneId.of("Asia/Jakarta"));
        Place borobudur = new Place("Borobudur", ZoneId.of("Asia/Jakarta"));
        Place prambanan = new Place("Prambanan", ZoneId.of("Asia/Jakarta"));

        Drive yogyaDay1Trip = new Car(royalHotel, royalHotel);
        yogyaDay1Trip.addStop(borobudur);
        yogyaDay1Trip.addStop(prambanan);

        Drive yogyaDay2Trip = new Car(royalHotel, royalHotel);
        yogyaDay2Trip.addStop(diengPlateau);

        transport.addTransportSegment(yogyaDay1Trip);
        transport.addTransportSegment(yogyaDay2Trip);

        Flight cgkToSub = new Flight(cgk, sub, "GA873");

        Place mtBromo = new Place("Mount Bromo");
        Drive subToJiwa = new Car(sub, jiwaHotel);

        Activity visitBromo = new Activity(LocalDate.of(2017, 8, 10), mtBromo, "Mount Bromo Jeep tour");
        itinerary.addActivity(visitBromo);

        Drive jiwaToSub = new Car(jiwaHotel, sub);

        transport.addTransportSegment(subToJiwa);
        transport.addTransportSegment(jiwaToSub);


        Flight subToCgk = new Flight(sub, cgk, "GA875");
        Flight cgkToHnd = new Flight(cgk, hnd, "NH873");
        Transit hndTransit2 = new Transit(hnd);
        Flight hndToCts = new Flight(cts, hnd, "NH88");

        transport.addTransportSegment(subToCgk);
        transport.addTransportSegment(cgkToHnd);
        transport.addTransportSegment(hndTransit2);
        transport.addTransportSegment(hndToCts);

        itinerary.addAccommodation(accommodation);
        itinerary.addTransport(transport);
    }

}
