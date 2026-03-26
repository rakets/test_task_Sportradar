package com.sport_calendar.entity;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.time.LocalTime;

@Entity
public class Event {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private LocalDate date;
    private LocalTime time;
    private String status;
    private Integer season;

    @ManyToOne
    @JoinColumn(name = "_sport_id")
    private Sport sport;

    @ManyToOne
    @JoinColumn(name = "_home_team_id")
    private Team homeTeam;

    @ManyToOne
    @JoinColumn(name = "_away_team_id")
    private Team awayTeam;

    @ManyToOne
    @JoinColumn(name = "_competition_id")
    private Competition competition;

    private Integer homeGoals;
    private Integer awayGoals;

    public Event() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public LocalTime getTime() {
        return time;
    }

    public void setTime(LocalTime time) {
        this.time = time;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Integer getSeason() {
        return season;
    }

    public void setSeason(Integer season) {
        this.season = season;
    }

    public Sport getSport() {
        return sport;
    }

    public void setSport(Sport sport) {
        this.sport = sport;
    }

    public Team getHomeTeam() {
        return homeTeam;
    }

    public void setHomeTeam(Team homeTeam) {
        this.homeTeam = homeTeam;
    }

    public Team getAwayTeam() {
        return awayTeam;
    }

    public void setAwayTeam(Team awayTeam) {
        this.awayTeam = awayTeam;
    }

    public Competition getCompetition() {
        return competition;
    }

    public void setCompetition(Competition competition) {
        this.competition = competition;
    }

    public Integer getHomeGoals() {
        return homeGoals;
    }

    public void setHomeGoals(Integer homeGoals) {
        this.homeGoals = homeGoals;
    }

    public Integer getAwayGoals() {
        return awayGoals;
    }

    public void setAwayGoals(Integer awayGoals) {
        this.awayGoals = awayGoals;
    }

    @Override
    public String toString() {
        return "Event{" +
                "id=" + id +
                ", date=" + date +
                ", time=" + time +
                ", status='" + status + '\'' +
                ", season=" + season +
                ", sport=" + sport +
                ", homeTeam=" + homeTeam +
                ", awayTeam=" + awayTeam +
                ", competition=" + competition +
                ", homeGoals=" + homeGoals +
                ", awayGoals=" + awayGoals +
                '}';
    }
}
