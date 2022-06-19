package com.mohit.ipldashboard.controller;

import com.mohit.ipldashboard.repository.MatchRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.mohit.ipldashboard.model.Team;
import com.mohit.ipldashboard.repository.TeamRepository;

@RestController
public class TeamControlller {

    private TeamRepository teamRepository;
    private MatchRepository matchRepository;
    
    

    public TeamControlller(TeamRepository teamRepository, MatchRepository matchRepository) {
        this.teamRepository = teamRepository;
        this.matchRepository = matchRepository;
    }



    @GetMapping("/team/{teamName}")
    public Team getTeam(@PathVariable String teamName) {
        Team team = this.teamRepository.findByTeamName(teamName);
        team.setMatches(this.matchRepository.findLatestMatchesByTeam(teamName, 4));

        return team;
    }
}
