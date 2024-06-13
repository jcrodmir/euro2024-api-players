package com.euro2024.teams.service;

import com.euro2024.teams.entity.Team;
import com.euro2024.teams.repository.TeamRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class TeamService {

    private final TeamRepository teamRepository;

    public TeamService(TeamRepository teamRepository){
        this.teamRepository = teamRepository;
    }

    public Optional<Team> findID(long id){
        return teamRepository.findById(id);
    }

    public Optional<Team> findName(String name){
        return teamRepository.findByName(name);
    }
}
