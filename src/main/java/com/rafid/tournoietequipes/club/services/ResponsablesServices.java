package com.rafid.tournoietequipes.club.services;

import com.rafid.tournoietequipes.club.dto.ResponsablesDTO;
import com.rafid.tournoietequipes.club.entities.Responsables;
import com.rafid.tournoietequipes.club.repositories.ResponsablesRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class ResponsablesServices {

    private final ResponsablesRepo responsablesRepo;

    public void save(ResponsablesDTO responsablesDTO){
        responsablesRepo.save(dtoToEntity(responsablesDTO));
    }

    public void update(ResponsablesDTO responsablesDTO){
        responsablesRepo.save(dtoToEntity(responsablesDTO));
    }

    public List<ResponsablesDTO> fetchAll(){
        return responsablesRepo.findAll().stream().map(this::entityToDto).collect(Collectors.toList());
    }

    public void delete(Long id){
        responsablesRepo.deleteById(id);
    }

    public ResponsablesDTO entityToDto(Responsables responsables){
        return ResponsablesDTO
                .builder()
                .id(responsables.getId())
                .firstname(responsables.getFirstname())
                .lastname(responsables.getLastname())
                .nationality(responsables.getNationality())
                .contractDuration(responsables.getContractDuration())
                .executiveFunction(responsables.getExecutiveFunction())
                .build();
    }

    public Responsables dtoToEntity(ResponsablesDTO responsablesDTO){
        return Responsables.builder()
                .id(responsablesDTO.getId())
                .firstname(responsablesDTO.getFirstname())
                .lastname(responsablesDTO.getLastname())
                .nationality(responsablesDTO.getNationality())
                .contractDuration(responsablesDTO.getContractDuration())
                .executiveFunction(responsablesDTO.getExecutiveFunction())
                .build();
    }

}
