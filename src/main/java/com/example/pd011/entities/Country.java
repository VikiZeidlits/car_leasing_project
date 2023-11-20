package org.itstep.pd011.carleasing.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

// класс Страна
@Entity
@Table(name="countries")
@Getter
@Setter
public class Country {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // страна назначения, полное название
    @Column(name="country_name_long")
    private String countryNameLong;

    // страна назначения, краткое название
    @Column(name="country_name_short")
    private String countryNameShort;

    @Override
    public String toString() {
        return "Country{" +
                "id=" + id +
                ", countryNameLong='" + countryNameLong + '\'' +
                ", countryNameShort='" + countryNameShort + '\'' +
                '}';
    }

}

