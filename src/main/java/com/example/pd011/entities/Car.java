package org.itstep.pd011.carleasing.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

// класс Автомобиль
@Entity
@Table(name="cars")
@Getter
@Setter
public class Car {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // цена
    @Column(name = "price")
    private int price;

    // год выпуска
    @Column(name = "year")
    private int year;

    // статус(свободен/занят)
    @Column(name = "status")
    private boolean status;

    // модель
    @ManyToOne
    @JoinColumn(name = "model_id", referencedColumnName = "id")
    private Model model;

    // страна
    @ManyToOne
    @JoinColumn(name = "country_id", referencedColumnName = "id")
    private Country country;

    // цвет
    @ManyToOne
    @JoinColumn(name = "color_id", referencedColumnName = "id")
    private Color color;

}
