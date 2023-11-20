package org.itstep.pd011.carleasing.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

// класс Цвет авто
@Entity
@Table(name="colors")
@Getter
@Setter
public class Color {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // название цвета
    @Column(name="color_name")
    private String colorName;

    @Override
    public String toString() {
        return "Color{" +
                "id=" + id +
                ", colorName='" + colorName + '\'' +
                '}';
    }

}
