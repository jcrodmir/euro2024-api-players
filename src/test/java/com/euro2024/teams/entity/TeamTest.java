package com.euro2024.teams.entity;
import com.euro2024.teams.repository.TeamRepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(SpringExtension.class)
@DataJpaTest
class TeamTest {

    @Autowired
    private TeamRepository teamRepository;

    @Test
    void getId() {
        Team team = new Team();

        team.setName("España");

        teamRepository.save(team);

        Team teamFind = teamRepository.findById(team.getId()).orElse(null);

        assertNotNull(teamFind);
        assertEquals(2, teamFind.getId());

    }

    @Test
    void getName() {

        Team team = new Team();
        team.setName("España");

        teamRepository.save(team);

        Team teamFind = teamRepository.findByName(team.getName()).orElse(null);

        assertNotNull(teamFind);
        assertEquals("España", teamFind.getName());
    }


}