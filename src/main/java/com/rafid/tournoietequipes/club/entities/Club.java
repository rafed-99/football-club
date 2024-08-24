package com.rafid.tournoietequipes.club.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Entity
@Table(name="equipe")
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class Club {

    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private Date foundationDate;
    @ManyToOne
    private Achivements achievements;
    @ManyToOne
    private Responsables responsabless;
}
