package org.itstep.pd011.carleasing.entities;

import lombok.Getter;
import lombok.Setter;
import org.dom4j.tree.AbstractEntity;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import javax.persistence.*;
import javax.validation.constraints.Pattern;
import java.util.Collection;
import java.util.HashSet;
import java.util.Optional;
import java.util.Set;


@Entity
@Table(name="clients")
@Getter
@Setter
public class Client {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // фамилия
    @Column(name = "surname")
    private String surname;

    // имя
    @Column(name = "name")
    private String name;

    // отчество
    @Column(name = "patronymic")
    private String patronymic;

    // паспорт
    @Column(name = "passport", length = 15)
    private String passport;

    // электронная почта
    @Pattern(regexp = "^[a-zA-Z0-9_!#$%&'*+/=?`{|}~^.-]+@[a-zA-Z0-9.-]+$")
    @Column(name = "email", unique = true)
    private String email;

    // телефонный номер
    @Pattern(regexp = "(^$|[0-9]{10})")
    @Column(name = "telephone")
    private String telephone;

    // логин
    @Column(name = "username")
    private String username;

    // пароль
    @Column(name = "password")
    private String password;

    // признак аутентификации
    @Column(name = "enabled")
    private boolean enabled;

    //@ManyToMany(cascade = CascadeType.MERGE, fetch = FetchType.EAGER)
    //@JoinTable(name = "users_roles")
    //private Set<Role> roles = new HashSet<>();

    @ManyToMany(cascade = CascadeType.PERSIST)
    @JoinTable(name = "users_roles", joinColumns = @JoinColumn(name = "client_id"), inverseJoinColumns = @JoinColumn(name = "role_id"))
    private Collection<Role> roles;


    public boolean hasRole(int roleId) {
        if (null == roles|| 0 == roles.size()) {
            return false;
        }
        Optional<Role> findRole = roles.stream().filter(role -> roleId == role.getId()).findFirst();
        return findRole.isPresent();
    }



    @Override
    public String toString() {
        return "Client{" +
                "id=" + id +
                ", surname='" + surname + '\'' +
                ", name='" + name + '\'' +
                ", patronymic='" + patronymic + '\'' +
                ", passport='" + passport + '\'' +
                ", email='" + email + '\'' +
                ", telephone='" + telephone + '\'' +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", enabled=" + enabled +
                ", roles=" + roles +
                '}';
    }
}
