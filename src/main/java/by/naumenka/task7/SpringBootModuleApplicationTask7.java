package by.naumenka.task7;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Profile;

@Profile("task7")
@SpringBootApplication
public class SpringBootModuleApplicationTask7 {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootModuleApplicationTask7.class, args);
    }

}