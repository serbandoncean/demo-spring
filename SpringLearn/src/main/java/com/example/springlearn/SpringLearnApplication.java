package com.example.springlearn;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
        import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.web.bind.annotation.GetMapping;
        import org.springframework.web.bind.annotation.RequestParam;
        import org.springframework.web.bind.annotation.RestController;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
@RestController
public class SpringLearnApplication  {
    @Autowired
    private JdbcTemplate jdbcTemplate;
    public static void main(String[] args) {
        SpringApplication.run(SpringLearnApplication.class, args);
    }

    @GetMapping("/orase")
    public List<String> sayOrase() {
            String sql="SELECT * FROM CITY";
        List<String> lista=new ArrayList<>();

        lista.add(jdbcTemplate.query(
                sql,
                new BeanPropertyRowMapper(City.class)).toString());
            return lista;

    }


}