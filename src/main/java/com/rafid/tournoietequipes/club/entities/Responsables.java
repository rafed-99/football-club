package com.rafid.tournoietequipes.club.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Table(name="responsables")
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class Responsables {

    @Id
    @GeneratedValue
    private Long id;
    private String firstname;
    private String lastname;
    private Nationality nationality;
    private ExecutiveFunction executiveFunction;
    private ContractDuration contractDuration;
    @OneToMany(mappedBy = "responsabless")
    private List<Club> club;
}
