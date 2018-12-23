package org.mounting.studentrent.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class RentPlaces {

    private Integer id;
    private Long lat;
    private Long lon;
    private Offerer offerer;
    private RentPlaceStatus rentPlaceStatus;
    private RentPlacePreferences rentPlacePreferences;
}
