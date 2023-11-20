package org.itstep.pd011.carleasing.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

// класс Бренд
@Entity
@Table(name="brands")
@Getter
@Setter
public class Brand {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // название бренда
    @Column(name="brand_name")
    private String brandName;


    @Override
    public String toString() {
        return "Brand{" +
                "id=" + id +
                ", brandName='" + brandName + '\'' +
                '}';
    }
}
