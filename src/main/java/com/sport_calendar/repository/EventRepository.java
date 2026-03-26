package com.sport_calendar.repository;

import com.sport_calendar.entity.Event;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EventRepository extends JpaRepository<Event, Long> {

    @Query("SELECT e FROM Event e LEFT JOIN FETCH e.homeTeam LEFT JOIN FETCH e.awayTeam LEFT JOIN FETCH e.sport")
    List<Event> findAllWithDetails();
}
