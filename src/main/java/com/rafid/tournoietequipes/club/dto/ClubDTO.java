package com.rafid.tournoietequipes.club.dto;

import com.rafid.tournoietequipes.club.entities.Club;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class ClubDTO {
    private Long id;
    private String name;
    private Date foundationDate;

}
