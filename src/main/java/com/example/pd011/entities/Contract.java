package org.itstep.pd011.carleasing.entities;

import lombok.Getter;
import lombok.Setter;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.util.Date;

// класс Расчёт лизинга/Заявка
@Entity
@Table(name="contracts")
@Getter
@Setter
public class Contract {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    // описание договора
    @Column(name = "discription")
    private String discription;

    // дата начала договора
    @Temporal(TemporalType.DATE)
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @Column(name = "date_start")
    private Date dateStart;

    // дата окончания договора
    @Temporal(TemporalType.DATE)
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @Column(name = "date_finish")
    private Date dateFinish;


    // клиент
    @ManyToOne
    @JoinColumn(name = "client_id", referencedColumnName = "id")
    private Client client;

    // расчёт лизинга
    @OneToOne
    @JoinColumn(name = "calculation_id", referencedColumnName = "id")
    private Calculation calculation;


    @Override
    public String toString() {
        return "Contract{" +
                "id=" + id +
                ", discription='" + discription + '\'' +
                ", dateStart=" + dateStart +
                ", dateFinish=" + dateFinish +
                ", client=" + client +
                ", calculation=" + calculation +
                '}';
    }

}
