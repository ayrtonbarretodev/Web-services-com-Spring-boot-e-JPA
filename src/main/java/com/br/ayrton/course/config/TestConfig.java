package com.br.ayrton.course.config;

import com.br.ayrton.course.entities.User;
import com.br.ayrton.course.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.util.Arrays;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {

    @Autowired //Permite que o objeto não necessite ser instanciado ( = new ) para que seja utilizado
    private UserRepository userRepository;


    @Override
    public void run(String... args) throws Exception {
        User u1 = new User(null,"Maria Brown","maria@gmail.com","988888888","123456");
        User u2 = new User(null,"Alex Green","alex@gmail.com","977777777","123456");

        userRepository.saveAll(Arrays.asList(u1,u2));
    }
}