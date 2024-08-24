package com.rafid.tournoietequipes.club.controllers;

import com.rafid.tournoietequipes.club.dto.ClubDTO;
import com.rafid.tournoietequipes.club.dto.ResponsablesDTO;
import com.rafid.tournoietequipes.club.services.ClubServices;
import com.rafid.tournoietequipes.club.services.ResponsablesServices;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/v1/api/responsables")
public class ResponsablesController {

    private final ResponsablesServices responsablesServices;
    @PostMapping
    public ResponseEntity<String> post(@RequestBody ResponsablesDTO responsablesDTO){
        responsablesServices.save(responsablesDTO);
        return ResponseEntity.status(HttpStatus.ACCEPTED).body("Responsable created");
    }

    @PutMapping
    public ResponseEntity<String> update(@RequestBody ResponsablesDTO responsablesDTO){
        responsablesServices.update(responsablesDTO);
        return ResponseEntity.status(HttpStatus.ACCEPTED).body("Responsable updated");
    }

    @GetMapping
    public List<ResponsablesDTO> fetchAll(){
        return responsablesServices.fetchAll();
    }

    @DeleteMapping
    public ResponseEntity<String> delete(@RequestBody Long id){
        responsablesServices.delete(id);
        return ResponseEntity.status(HttpStatus.ACCEPTED).body("Responsable deleted");
    }
}
