package com.college.indoor_navigation.service;

import com.college.indoor_navigation.model.LocationNode;
import com.college.indoor_navigation.repository.LocationRepository;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class NavigationService {

    private final LocationRepository repository;

    public NavigationService(LocationRepository repository) {
        this.repository = repository;
    }

    public List<String> findShortestPath(String source, String destination) {

        Map<String, Map<String, Integer>> graph = new HashMap<>();
        Map<String, String> idToName = new HashMap<>();

        // Load graph from MongoDB
        for (LocationNode node : repository.findAll()) {
            graph.put(node.getId(), node.getConnections());
            idToName.put(node.getId(), node.getName());
        }

        // Dijkstra's algorithm
        Map<String, Integer> distances = new HashMap<>();
        Map<String, String> previous = new HashMap<>();
        PriorityQueue<String> queue = new PriorityQueue<>(Comparator.comparingInt(distances::get));

        for (String node : graph.keySet()) {
            distances.put(node, node.equals(source) ? 0 : Integer.MAX_VALUE);
            queue.add(node);
        }

        while (!queue.isEmpty()) {
            String current = queue.poll();

            if (current.equals(destination)) break;

            if (distances.get(current) == Integer.MAX_VALUE) continue;

            for (Map.Entry<String, Integer> neighbor : graph.get(current).entrySet()) {
                int alt = distances.get(current) + neighbor.getValue();
                if (alt < distances.get(neighbor.getKey())) {
                    distances.put(neighbor.getKey(), alt);
                    previous.put(neighbor.getKey(), current);
                    // Re-heapify the queue
                    queue.remove(neighbor.getKey());
                    queue.add(neighbor.getKey());
                }
            }
        }

        // Reconstruct path
        List<String> path = new ArrayList<>();
        String current = destination;
        while (current != null) {
            path.add(0, current);
            current = previous.get(current);
        }

        if (!path.get(0).equals(source)) {
            return List.of("No path found");
        }

        // Convert ids to names
        return path.stream().map(id -> idToName.getOrDefault(id, id)).toList();
    }
}
