package hiber.model;

import javax.persistence.*;

@Entity
@Table(name = "Car")
public class Car {
    public Car() {

    }
    public Car(int series, String model) {
        this.series = series;
        this.model = model;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long carId;

    @Column
    private String model;

    @Column
    private int series;
}
