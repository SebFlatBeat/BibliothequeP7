package com.BibliothequeP7.user.entities;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;
import java.util.ArrayList;
import java.util.List;

@Entity
public class UserBook {
    @Id
    @GeneratedValue
    private Long id;
    @Size(max=50)
    @NotBlank
    @NotEmpty( message = "Merci de rentrer un pseudo" )
    private String userName;
    @Size(max=100)
    @NotBlank
    @Email( message = "Merci de rentrer une adresse mail valide." )
    @NotEmpty( message = "Merci de rentrer une adresse email" )
    private String email;
    @Size(max=100)
    @NotBlank
    private String password;

    @Enumerated(EnumType.STRING)
    @ElementCollection(fetch = FetchType.EAGER)
    private List<UserRole> userRoleList;

    public UserBook() {
    }

    public UserBook(Long id,
                    @Size(max=50)
                    @NotBlank
                    @NotEmpty( message = "Merci de rentrer un pseudo" )String userName,
                    @Size(max=100)
                    @NotBlank
                    @Email( message = "Merci de rentrer une adresse mail valide." )
                    @NotEmpty( message = "Merci de rentrer une adresse email" )String email,
                    @Size(max=100)
                    @NotBlank
                    String password){

        this.id = id;
        this.userName = userName;
        this.email = email;
        this.password = password;

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void grantAuthority(UserRole authority) {
        if ( userRoleList == null ) userRoleList = new ArrayList<>();
        userRoleList.add(authority);
    }
    @Override
    public String toString(){
        return "UserBook{"+
                "id=" + id +
                ", userName=" + userName +
                ", email=" + email +
                ", password" + password +"}";
    }
}