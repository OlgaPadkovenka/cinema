package controller;

import entity.Seance;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class SeanceController {
    @GetMapping("/seances")
    public List<Seance> getAll() {
        return null;
    }

    @PostMapping("/seances")
    public Seance addSeance() {
        return null;
    }
}
