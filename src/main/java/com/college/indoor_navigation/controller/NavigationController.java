package com.college.indoor_navigation.controller;

import com.college.indoor_navigation.service.NavigationService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
public class NavigationController {

    private final NavigationService navigationService;

    public NavigationController(NavigationService navigationService) {
        this.navigationService = navigationService;
    }

    @GetMapping("/api/navigate")
    public Map<String, Object> getPath(
            @RequestParam String source,
            @RequestParam String destination) {

        List<String> path = navigationService.findShortestPath(source, destination);
        if (path.size() == 1 && path.get(0).equals("No path found")) {
            return Map.of("error", "Invalid destination");
        }

        // Generate step-by-step instructions
        List<String> instructions = generateInstructions(path);

        return Map.of(
            "path", path,
            "instructions", instructions
        );
    }

    private List<String> generateInstructions(List<String> path) {
        List<String> instructions = new java.util.ArrayList<>();
        if (path.size() < 2) return instructions;

        instructions.add("Start at " + path.get(0));

        for (int i = 1; i < path.size(); i++) {
            instructions.add("Go to " + path.get(i));
        }

        instructions.add("You have arrived at " + path.get(path.size() - 1));
        return instructions;
    }
}
