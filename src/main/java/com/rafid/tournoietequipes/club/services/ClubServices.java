package com.rafid.tournoietequipes.club.services;

import com.rafid.tournoietequipes.club.dto.AchievementsDTO;
import com.rafid.tournoietequipes.club.dto.ClubDTO;
import com.rafid.tournoietequipes.club.entities.Club;
import com.rafid.tournoietequipes.club.repositories.AchievementsRepo;
import com.rafid.tournoietequipes.club.repositories.ClubRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class ClubServices {
    private final ClubRepo clubRepo;

    public void save(ClubDTO clubDTO){
        clubRepo.save(dtoToEntity(clubDTO));
    }

    public void update(ClubDTO clubDTO){
        clubRepo.save(dtoToEntity(clubDTO));
    }

    public List<ClubDTO> fetchAll(){
        return clubRepo.findAll().stream().map(this::entityToDto).collect(Collectors.toList());
    }

    public void delete(Long id){
        clubRepo.deleteById(id);
    }

    public ClubDTO entityToDto(Club club){
        return ClubDTO
                .builder()
                .id(club.getId())
                .name(club.getName())
                .foundationDate(club.getFoundationDate())
                .build();
    }

    public Club dtoToEntity(ClubDTO clubDTO){
        return Club.builder()
                .id(clubDTO.getId())
                .name(clubDTO.getName())
                .foundationDate(clubDTO.getFoundationDate())
                .build();
    }
}
