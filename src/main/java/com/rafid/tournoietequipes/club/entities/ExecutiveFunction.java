package com.rafid.tournoietequipes.club.entities;

import com.fasterxml.jackson.annotation.JsonProperty;

public enum ExecutiveFunction {

    President,
    @JsonProperty("vice president") vice_president,
    @JsonProperty("director of finances") director_of_finances,
    @JsonProperty("sales manager") sales_manager
}
