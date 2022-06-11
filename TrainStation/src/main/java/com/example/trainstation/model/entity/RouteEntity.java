package com.example.trainstation.model.entity;

import javax.persistence.*;
import java.sql.Time;

public class RouteEntity {
    @Id
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "train_id", nullable = false)
    private TrainEntity trainEntity;
    @Id
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "station_id", nullable = false)
    private StationEntity id_station_begin;
    @Id
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "station_id", nullable = false)
    private StationEntity id_station_end;
    private Time time_departure;
    private Time time_arrival;
}
