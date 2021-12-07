package cinema.entity;

import javax.persistence.*;

@Entity
@Table(name="room")
public class Room {

    @Id
    @GeneratedValue
    private Integer id;

    private String name;

    @ManyToOne
    @JoinColumn(name="filial_id", nullable = false)
    private Filial filial;

    private Integer row;
    private Integer place;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getRow() {
        return row;
    }

    public void setRow(Integer row) {
        this.row = row;
    }

    public Integer getPlace() {
        return place;
    }

    public void setPlace(Integer place) {
        this.place = place;
    }

    public Integer getFilial() {
        return filial.getId();
    }

    public void setFilial(Filial filial) {
        this.filial = filial;
    }
}
