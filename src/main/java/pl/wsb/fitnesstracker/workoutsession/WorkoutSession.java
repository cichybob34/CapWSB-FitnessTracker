package pl.wsb.fitnesstracker.workoutsession;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;

@Entity
@Table(name = "Workout_Session")
@Getter
public class WorkoutSession {

    @Id
    private Long id;

    private Long training_id;
    private String timestamp;
    private double startLatitude;
    private double startLongitude;
    private double endLatitude;
    private double endLongitude;
    private double altitude;
}
