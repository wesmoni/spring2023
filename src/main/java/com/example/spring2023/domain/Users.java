package com.example.spring2023.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

import java.util.Objects;

/**
 * Класс Users является суперклассом, наследуемым классами Customers и Sellers
 * */
@Entity
@Table(name = "USERS_TABLE")
class Users {

    @Id
    @Getter
    @Setter
    private Long id;

    @Getter
    @Setter
    private String email;

    @Getter
    @Setter
    private String firstName;

    @Getter
    @Setter
    private String lastName;

    @Getter
    @Setter
    private String login;

    @Setter
    @Getter
    private String password;

    /**
     * Конструктор класса (класс пытаеся заставить создать пустой конструтор и я пока что не поняла как это убрать)
     * */
    public Users(Long id, String email, String firstName, String lastName, String login, String password) {
        this.id = id;
        this.email = email;
        this.firstName = firstName;
        this.lastName = lastName;
        this.login = login;
        this.password = password;
    }

    /**
     * Метод проверяет ссылку на переданный объект и затем сравнивает текущий объект с переданным объектом
     * */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Users user)) return false;
        return Objects.equals(getId(), user.getId());
    }

    /**
     * Метод возвращает хэш-код объекта, основываясь на его идентификаторе
     * */
    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }

}
