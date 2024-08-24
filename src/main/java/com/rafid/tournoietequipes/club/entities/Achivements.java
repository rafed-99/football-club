package com.rafid.tournoietequipes.club.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;

@Entity
@Table(name="achievements")
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class Achivements {
    @Id
    @GeneratedValue
    private Long id;
    private String achievementName;
    private Date dateOfAchievement;
    private Integer numberOfTimeOfAchievement;
    @OneToMany(mappedBy = "achievements")
    private List<Club> clubs;
}
