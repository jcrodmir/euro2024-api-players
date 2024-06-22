package com.euro2024.teams.controller;

import com.euro2024.teams.entity.Team;
import com.euro2024.teams.service.TeamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/team")
public class TeamController {

    @Autowired
    private  final TeamService teamService;

    public TeamController(TeamService teamService) {
        this.teamService = teamService;
    }

    @GetMapping
    public List<Team> teams(){
        return (List<Team>) teamService.find();
    }

    @GetMapping("/champions")
    public List<Team> champions(@RequestParam int champions){
        return (List<Team>) teamService.findChampions(champions);
    }

    @GetMapping("/{name}")
    public Team teamName(@PathVariable("name") String name){
        return teamService.findName(name).orElseThrow();
    }
}
