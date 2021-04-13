package com.example.heroku.repository;


import com.example.heroku.members.Team;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface TeamRepo extends CrudRepository<Team, Long>{
    List<Team> findAll();
}