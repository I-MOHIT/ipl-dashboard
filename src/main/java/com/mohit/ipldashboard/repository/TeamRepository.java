package com.mohit.ipldashboard.repository;

import org.springframework.data.repository.CrudRepository;

import com.mohit.ipldashboard.model.Team;

public interface TeamRepository extends CrudRepository<Team, Long>{
    
    Team findByTeamName(String teamName);
}
