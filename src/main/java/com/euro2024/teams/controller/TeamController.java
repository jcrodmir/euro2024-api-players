package com.euro2024.teams.controller;

import com.euro2024.teams.entity.Team;
import com.euro2024.teams.service.TeamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/team")
public class TeamController {

    @Autowired
    private  final TeamService teamService;

    public TeamController(TeamService teamService) {
        this.teamService = teamService;
    }


    @GetMapping("/{id}")
    public Team teamID(@PathVariable("id") long id){
        return teamService.findID(id).orElseThrow();
    }

    @GetMapping("/{name}")
    public Team teamName(@PathVariable("name") String name){
        return teamService.findName(name).orElseThrow();
    }
}
