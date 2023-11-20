package org.itstep.pd011.carleasing.entities;

import lombok.Getter;
import lombok.Setter;
import org.dom4j.tree.AbstractEntity;
import org.springframework.security.core.GrantedAuthority;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

// Этот класс реализует интерфейс GrantedAuthority,
// в котором необходимо переопределить только один метод getAuthority()
// (возвращает имя роли).
// класс Клиент
// класс Роль
@Entity
@Table(name="roles")
@Getter
@Setter
public class Role {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true)
    private String name;

    //@ManyToMany(mappedBy = "roles")
    //private List<Client> users = new ArrayList<>();

    @ManyToMany(cascade = CascadeType.ALL, mappedBy = "roles")
    private Collection<Client> users;

    public Role() {
    }

    public Role(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Role{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", users=" + users +
                '}';
    }
}
