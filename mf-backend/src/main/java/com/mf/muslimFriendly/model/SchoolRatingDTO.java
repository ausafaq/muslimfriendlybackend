package com.mf.muslimFriendly.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

@Getter
@Setter
public class SchoolRatingDTO {

    @JsonProperty("school-id")
    private UUID schoolId;

    @JsonProperty("school-name")
    private String name;

    @JsonProperty("school-description")
    private String description;

    @JsonProperty("has-halal-options")
    private boolean halal;

    @JsonProperty("has-prayer-space")
    private boolean prayerSpace;

    @JsonProperty("has-wudu-area")
    private boolean wuduArea;

    @JsonProperty("average-ratings")
    private AvgRatingDTO avgRatings;

}
