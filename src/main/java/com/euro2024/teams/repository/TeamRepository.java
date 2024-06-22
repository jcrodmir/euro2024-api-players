package com.euro2024.teams.repository;
import org.springframework.data.repository.CrudRepository;
import com.euro2024.teams.entity.Team;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface TeamRepository extends CrudRepository<Team, Long>{

    Optional<Team> findByName(String name);
    List<Team> findByChampionships(int championships);
}
