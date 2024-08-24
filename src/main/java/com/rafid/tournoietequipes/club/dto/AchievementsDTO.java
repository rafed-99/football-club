package com.rafid.tournoietequipes.club.dto;

import com.rafid.tournoietequipes.club.entities.Achivements;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class AchievementsDTO {
    private Long id;
    private String achievementName;
    private Date dateOfAchievement;
    private Integer numberOfTimeOfAchievement;

}
