package com.rafid.tournoietequipes.club.dto;


import com.rafid.tournoietequipes.club.entities.ContractDuration;
import com.rafid.tournoietequipes.club.entities.ExecutiveFunction;
import com.rafid.tournoietequipes.club.entities.Nationality;
import com.rafid.tournoietequipes.club.entities.Responsables;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class ResponsablesDTO {
    private Long id;
    private String firstname;
    private String lastname;
    private Nationality nationality;
    private ExecutiveFunction executiveFunction;
    private ContractDuration contractDuration;


}
