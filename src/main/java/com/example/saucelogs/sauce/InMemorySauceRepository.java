package com.example.saucelogs.sauce;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InMemorySauceRepository extends CrudRepository<Sauce, Long> {}