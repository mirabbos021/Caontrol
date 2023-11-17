package org.example.entity;

import jakarta.persistence.*;
import org.example.utils.Departament;

import static org.example.utils.Constants.SCHEMA;
import static org.example.utils.Constants.TABLE_USER;

@Entity
@Table(schema = SCHEMA,name = TABLE_USER)
public class UserEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;
    private  String full_name;
    @Column(unique = true)
    private String phone;
    @Enumerated
    private Departament departament;

    private Long chat_id;
    private String user_name;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFull_name() {
        return full_name;
    }

    public void setFull_name(String full_name) {
        this.full_name = full_name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Departament getDepartament() {
        return departament;
    }

    public void setDepartament(Departament departament) {
        this.departament = departament;
    }

    public Long getChat_id() {
        return chat_id;
    }

    public void setChat_id(Long chat_id) {
        this.chat_id = chat_id;
    }

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    @Override
    public String toString() {
        return "UserEntity{" +
                "id=" + id +
                ", full_name='" + full_name + '\'' +
                ", phone='" + phone + '\'' +
                ", departament=" + departament +
                ", chat_id=" + chat_id +
                ", user_name='" + user_name + '\'' +
                '}';
    }
}
