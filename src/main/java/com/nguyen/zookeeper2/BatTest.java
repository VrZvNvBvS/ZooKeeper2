package com.nguyen.zookeeper2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BatTest {

    public static void main(String[] args) {

        SpringApplication.run(BatTest.class, args);

        Bat bat = new Bat();

        bat.attackTown();
        bat.attackTown();
        bat.attackTown();

        bat.eatHumans();
        bat.eatHumans();

        bat.fly();
        bat.fly();
    }
}

// changes
