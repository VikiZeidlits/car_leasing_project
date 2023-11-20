package org.itstep.pd011.carleasing.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

// класс Расчёт лизинга/Заявка
@Entity
@Table(name="calculations")
@Getter
@Setter
public class Calculation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // срок лизинга
    @Column(name = "term")
    private int term;

    // аванс
    @Column(name = "advance_payment")
    private int advancePayment;

    // общая сумма
    @Column(name = "total_summa")
    private double totalSumma(){

        double percentAdvance = car.getPrice() * (double) advancePayment / 100;
        double percent = car.getPrice() - percentAdvance;
        double percentLeasing = percent * 0.248;
        return percent + percentLeasing;
    }

    // ежемесячный платёж
    @Column(name = "monthly_payment")
    private double monthlyPayment(){

        return totalSumma() / term;
    }

    // авто
    @ManyToOne
    @JoinColumn(name = "car_id", referencedColumnName = "id")
    private Car car;

    @Override
    public String toString() {
        return "Calculation{" +
                "id=" + id +
                ", term=" + term +
                ", advancePayment=" + advancePayment +
                ", car=" + car +
                '}';
    }


    public int ofMonths(int noOfMonths) {
        return noOfMonths;
    }

    public int ofYears(int noOfYears) {
        return noOfYears * 12;
    }



}
