package com.lanka_guide.mynxttrip.model.activity;

import com.lanka_guide.mynxttrip.model.Cost;

import java.time.LocalTime;

public abstract class AbstractActivity {
    LocalTime startTime;
    LocalTime endTime;
    Cost cost;
    int pax;

}
