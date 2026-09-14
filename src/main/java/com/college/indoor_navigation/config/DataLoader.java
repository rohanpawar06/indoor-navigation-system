package com.college.indoor_navigation.config;

import com.college.indoor_navigation.model.LocationNode;
import com.college.indoor_navigation.repository.LocationRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.boot.CommandLineRunner;

import java.util.Map;

@Configuration
public class DataLoader {

    @Bean
    CommandLineRunner loadData(LocationRepository repo) {
        return args -> {

            // Clear old data
            repo.deleteAll();

            // Insert fresh indoor map with weights
            repo.save(new LocationNode(
                    "entrance",
                    "Main Entrance",
                    Map.of("corridor", 5, "stairs", 6)
            ));

            repo.save(new LocationNode(
                    "corridor",
                    "Main Corridor",
                    Map.of("entrance", 5, "library", 3, "office", 4, "admin", 2)
            ));

            repo.save(new LocationNode(
                    "library",
                    "Library",
                    Map.of("corridor", 3)
            ));

            repo.save(new LocationNode(
                    "office",
                    "Office",
                    Map.of("corridor", 4)
            ));

            repo.save(new LocationNode(
                    "stairs",
                    "Stairs",
                    Map.of("entrance", 6, "lab", 2)
            ));

            repo.save(new LocationNode(
                    "lab",
                    "Laboratory",
                    Map.of("stairs", 2)
            ));

            repo.save(new LocationNode(
                    "admin",
                    "Admin Block",
                    Map.of("corridor", 2)
            ));
        };
    }
}
