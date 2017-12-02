package com.lanka_guide.mynxttrip.model;

import com.lanka_guide.mynxttrip.model.activity.AbstractActivity;
import com.lanka_guide.mynxttrip.model.place.Place;

public class Meal extends AbstractActivity {

    Place place;
    Type type;

    enum Type {
        BREAKFAST,
        LUNCH,
        DINNER
    }
}
