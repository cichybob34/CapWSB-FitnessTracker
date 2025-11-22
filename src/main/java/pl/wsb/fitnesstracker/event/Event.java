package pl.wsb.fitnesstracker.event;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.time.LocalDateTime;

@Entity
@Table(name = "Event")
@Getter
@NoArgsConstructor
@ToString
public class Event {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String description;

    @Column(name = "startTime")
    private LocalDateTime start;

    @Column(name = "endTime")
    private LocalDateTime end;

    private String country;
    private String city;

    public Event(String name, String description, LocalDateTime start, LocalDateTime end, String country, String city) {
        this.name = name;
        this.description = description;
        this.start = start;
        this.end = end;
        this.country = country;
        this.city = city;
    }
}
