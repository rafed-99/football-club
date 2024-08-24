package com.rafid.tournoietequipes.club.services;

import com.rafid.tournoietequipes.club.dto.AchievementsDTO;
import com.rafid.tournoietequipes.club.entities.Achivements;
import com.rafid.tournoietequipes.club.repositories.AchievementsRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class AchievementsServices {

    private final AchievementsRepo achievementsRepo;

    public void save(AchievementsDTO achievementsDTO){
        achievementsRepo.save(dtoToEntity(achievementsDTO));
    }

    public void update(AchievementsDTO achievementsDTO){
        achievementsRepo.save(dtoToEntity(achievementsDTO));
    }

    public List<AchievementsDTO> fetchAll(){
        return achievementsRepo.findAll().stream().map(this::entityToDto).collect(Collectors.toList());
    }

    public void delete(Long id){
        achievementsRepo.deleteById(id);
    }


    public AchievementsDTO entityToDto(Achivements achivements){
        return AchievementsDTO
                .builder()
                .id(achivements.getId())
                .achievementName(achivements.getAchievementName())
                .dateOfAchievement(achivements.getDateOfAchievement())
                .numberOfTimeOfAchievement(achivements.getNumberOfTimeOfAchievement())
                .build();
    }

    public Achivements dtoToEntity(AchievementsDTO achievementsDTO){
        return Achivements.builder()
                .id(achievementsDTO.getId())
                .achievementName(achievementsDTO.getAchievementName())
                .dateOfAchievement(achievementsDTO.getDateOfAchievement())
                .numberOfTimeOfAchievement(achievementsDTO.getNumberOfTimeOfAchievement())
                .build();
    }
}
