package com.rafid.tournoietequipes.club.entities;

import com.fasterxml.jackson.annotation.JsonProperty;

public enum ContractDuration {

    @JsonProperty("1 year") One_year,
    @JsonProperty("2 years") Two_years,
    @JsonProperty("3 years") Three_years,
    @JsonProperty("4 years") four_years,
    @JsonProperty("5 years") five_years
}
