package com.example.saucelogs.sauce;

import org.springframework.data.map.repository.config.EnableMapRepositories;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;

@Service
@EnableMapRepositories
public class SauceService {
    private final CrudRepository<Sauce, Long> repository;

    public SauceService(CrudRepository<Sauce, Long> repository) {
        this.repository = repository;
        this.repository.saveAll(defaultItems());
    }

    private static List<Sauce> defaultItems() {
        return List.of(
        new Sauce(1L, "Easy Green", "Foo", 1),
        new Sauce(2L, "Cayenne Calente", "A medium spicy red sauce", 5),
        new Sauce(3L, "Scary Ghost Pepper", "A red hot red sauce", 9)
        );
    }

    public List<Sauce> findAll() {
        List<Sauce> list = new ArrayList<>();
        Iterable<Sauce> items = repository.findAll();
        items.forEach(list::add);
        return list;
    }

    public Optional<Sauce> find(Long id) {
        return repository.findById(id);
    }

    public Sauce create(Sauce Sauce) {
        // To ensure the Sauce ID remains unique,
        // use the current timestamp.
        Sauce copy = new Sauce(
                new Date().getTime(),
                Sauce.getName(),
                Sauce.getDescription(),
                Sauce.getHeatLevel()
        );
        return repository.save(copy);
    }

    public Optional<Sauce> update( Long id, Sauce newItem) {
        // Only update an Sauce if it can be found first.
        return repository.findById(id)
                .map(oldItem -> {
                Sauce updated = oldItem.updateWith(newItem);
                return repository.save(updated);
                });
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}
