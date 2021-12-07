package cinema.entity;

import com.fasterxml.jackson.annotation.JsonFormat;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Seance {
    @Id
    @GeneratedValue
    private Integer id;

    @ManyToOne
    @JoinColumn(name="cinema_id", nullable = false)
    private Cinema cinema;

    @ManyToOne
    @JoinColumn(name="room_id", nullable = false)
    private Room room;

    @JsonFormat(shape= JsonFormat.Shape.STRING, pattern="dd.MM.yyyy")
    private Date date;
    private Integer price;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Cinema getCinema() {
        return cinema;
    }

    public void setCinema(Cinema cinema) {
        this.cinema = cinema;
    }

    public Room getRoom() {
        return room;
    }

    public void setRoom(Room room) {
        this.room = room;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }
}
