package com.college.indoor_navigation.repository;

import com.college.indoor_navigation.model.LocationNode;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface LocationRepository extends MongoRepository<LocationNode, String> {
}
