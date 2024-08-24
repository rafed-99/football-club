package com.rafid.tournoietequipes.club.controllers;

import com.rafid.tournoietequipes.club.dto.AchievementsDTO;
import com.rafid.tournoietequipes.club.dto.ResponsablesDTO;
import com.rafid.tournoietequipes.club.services.AchievementsServices;
import com.rafid.tournoietequipes.club.services.ResponsablesServices;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/v1/api/achievements")
public class AchievementsController {

    private final AchievementsServices achievementsServices;
    @PostMapping
    public ResponseEntity<String> post(@RequestBody AchievementsDTO achievementsDTO){
        achievementsServices.save(achievementsDTO);
        return ResponseEntity.status(HttpStatus.ACCEPTED).body("achievement created");
    }

    @PutMapping
    public ResponseEntity<String> update(@RequestBody AchievementsDTO achievementsDTO){
        achievementsServices.update(achievementsDTO);
        return ResponseEntity.status(HttpStatus.ACCEPTED).body("achievement updated");
    }

    @GetMapping
    public List<AchievementsDTO> fetchAll(){
        return achievementsServices.fetchAll();
    }

    @DeleteMapping
    public ResponseEntity<String> delete(@RequestBody Long id){
        achievementsServices.delete(id);
        return ResponseEntity.status(HttpStatus.ACCEPTED).body("achievement deleted");
    }
}
