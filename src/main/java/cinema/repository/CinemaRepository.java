package cinema.repository;

import cinema.entity.Cinema;

import org.springframework.data.jpa.repository.JpaRepository;

public interface CinemaRepository extends JpaRepository <Cinema, Integer> {

}
