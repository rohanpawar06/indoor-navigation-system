package com.college.indoor_navigation.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import java.util.Map;

@Document(collection = "locations")
public class LocationNode {

    @Id
    private String id; // unique room key

    private String name;
    private Map<String, Integer> connections; // key: neighbor id, value: weight

    // Constructors
    public LocationNode() {}

    public LocationNode(String id, String name, Map<String, Integer> connections) {
        this.id = id;
        this.name = name;
        this.connections = connections;
    }

    // Getters & Setters
    public String getId() { return id; }
    public void setId(String id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public Map<String, Integer> getConnections() { return connections; }
    public void setConnections(Map<String, Integer> connections) { this.connections = connections; }
}
