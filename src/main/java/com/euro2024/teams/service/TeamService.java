package com.euro2024.teams.service;

import com.euro2024.teams.entity.Team;
import com.euro2024.teams.repository.TeamRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TeamService {
    @Autowired
    private final TeamRepository teamRepository;

    public TeamService(TeamRepository teamRepository){
        this.teamRepository = teamRepository;
    }


    public Optional<Team> findName(String name){
        return teamRepository.findByName(name);
    }

    public List<Team> find(){
        return (List<Team>) teamRepository.findAll();
    }
    public List<Team> findChampions(int champions){
        return teamRepository.findByChampionships(champions);
    }
}
