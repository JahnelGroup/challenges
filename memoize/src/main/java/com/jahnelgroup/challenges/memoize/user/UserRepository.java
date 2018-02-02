package com.jahnelgroup.challenges.memoize.user;

import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Interacts with the H2 database to retrieve users.
 */
@Repository
@RequiredArgsConstructor
public class UserRepository {

    @NonNull JdbcTemplate jdbcTemplate;

    public User findById(Long id) {
        simulateWork();
        return jdbcTemplate.queryForObject("select * from user where id = ?",
                new Object[]{id}, new UserRowMapper());
    }

    public User findByName(String name) {
        simulateWork();
        return jdbcTemplate.queryForObject("select * from user where name = ?",
                new Object[]{name}, new UserRowMapper());
    }

    private void simulateWork(){
        try {
            System.out.print("Simulating work...");
            Thread.sleep(2000);
            System.out.println("done.");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    class UserRowMapper implements RowMapper<User> {
        @Override
        public User mapRow(ResultSet rs, int rowNum) throws SQLException {
            return new User(rs.getLong("id"), rs.getString("name"));
        }
    }
}
