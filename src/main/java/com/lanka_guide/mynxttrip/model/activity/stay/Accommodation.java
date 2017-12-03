package com.lanka_guide.mynxttrip.model.activity.stay;

import java.util.ArrayList;
import java.util.List;

public class Accommodation {
    List<Stay> stays;

    public void addStay(Stay stay) {
        if (stays == null) {
            stays = new ArrayList<>();
        }

        stays.add(stay);
    }
}
