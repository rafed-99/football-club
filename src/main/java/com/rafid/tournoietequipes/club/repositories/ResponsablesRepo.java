package com.rafid.tournoietequipes.club.repositories;

import com.rafid.tournoietequipes.club.entities.Responsables;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ResponsablesRepo extends JpaRepository<Responsables, Long> {
}
