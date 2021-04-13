package com.example.heroku.controller;

import com.example.heroku.members.Team;
import com.example.heroku.members.TeamUI;
import com.example.heroku.repository.TeamRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
public class TeamController {
    @Autowired
    TeamRepo repository;

    @GetMapping("/bulkcreate")
    public String bulkcreate(){
        // save a list of Teams
        repository.saveAll(Arrays.asList(new Team("Akshita", "Samant")
                , new Team("Krutika", "Khandelwal")
                , new Team("Ketki", "Hatwar")));

        return "Teams are created";
    }
    
    @GetMapping("/findall")
    public List<TeamUI> findAll(){

        List<Team> Teams = repository.findAll();
        List<TeamUI> TeamUI = new ArrayList<>();

        for (Team Team : Teams) {
            TeamUI.add(new TeamUI(Team.getFirstName(),Team.getLastName()));
        }
        System.out.println(TeamUI);
        return TeamUI;
    }
}