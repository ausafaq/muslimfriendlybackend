package com.mf.muslimFriendly.services;

import com.mf.muslimFriendly.model.AvgRatingDTO;

import java.util.UUID;

public interface AvgRatingsService {
    AvgRatingDTO getAvgRatingsBySchool(UUID schoolId);
}
