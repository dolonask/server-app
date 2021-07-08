package kg.easy.serverapp.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

public interface BaseCrudController<S, T> {

    @PostMapping("/save")
    S save(@RequestBody S s);

    @PutMapping("/update")
    S update(@RequestBody S s);

    @GetMapping("/{id}")
    S findById(T id);

    @GetMapping("/all")
    List<S> findAll();


}
