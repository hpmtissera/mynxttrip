package com.lanka_guide.mynxttrip.model.activity;

import com.lanka_guide.mynxttrip.model.Cost;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public abstract class AbstractActivity {
    ZonedDateTime startTime;
    ZonedDateTime endTime;
    Cost cost;
    int pax;

    public AbstractActivity() {
    }

    public AbstractActivity(LocalDate date, ZoneId zoneId) {
        this.startTime = ZonedDateTime.of(LocalDateTime.from(date), zoneId);
        this.endTime = ZonedDateTime.of(LocalDateTime.from(date), zoneId);
    }

    public AbstractActivity(LocalDate startDate, LocalDate endDate, ZoneId zoneId) {
        this.startTime = ZonedDateTime.of(LocalDateTime.from(startDate), zoneId);
        this.endTime = ZonedDateTime.of(LocalDateTime.from(endDate), zoneId);
    }

    public AbstractActivity(ZonedDateTime startTime, ZonedDateTime endTime) {
        this.startTime = startTime;
        this.endTime = endTime;
    }
}
