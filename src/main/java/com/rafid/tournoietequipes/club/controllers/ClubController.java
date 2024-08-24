package com.rafid.tournoietequipes.club.controllers;

import com.rafid.tournoietequipes.club.dto.ClubDTO;
import com.rafid.tournoietequipes.club.services.ClubServices;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/v1/api/club")
public class ClubController {

    private final ClubServices clubServices;
    @PostMapping
    public ResponseEntity<String> post(@RequestBody ClubDTO clubDTO){
        clubServices.save(clubDTO);
        return ResponseEntity.status(HttpStatus.ACCEPTED).body("Club created");
    }

    @PutMapping
    public ResponseEntity<String> update(@RequestBody ClubDTO clubDTO){
        clubServices.update(clubDTO);
        return ResponseEntity.status(HttpStatus.ACCEPTED).body("Club updated");
    }

    @GetMapping
    public List<ClubDTO> fetchAll(){
        return clubServices.fetchAll();
    }

    @DeleteMapping
    public ResponseEntity<String> delete(@RequestBody Long id){
        clubServices.delete(id);
        return ResponseEntity.status(HttpStatus.ACCEPTED).body("Club deleted");
    }
}
