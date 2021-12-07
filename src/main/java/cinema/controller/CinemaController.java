package cinema.controller;

import cinema.entity.Cinema;
import cinema.repository.CinemaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CinemaController {

    @Autowired
    CinemaRepository cinemaRepo;

    @GetMapping ("/cinema")
    public List<Cinema> getAll() {
        return cinemaRepo.findAll();
    }

    @PostMapping ("/cinema")
    public Cinema addCinema(@RequestBody Cinema cinema) {
        cinemaRepo.save(cinema);
        return cinema;
        //        return cinemaRepo.save(cinema);
    }
}
