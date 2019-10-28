package com.joole.jwtauthentication.model;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import org.hibernate.annotations.NaturalId;

@Entity
@Table(name = "Manufacturer")
public class Manufacturer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Size(min=3, max = 50)
    private String department; 

    @NotBlank
    @Size(min=3, max = 50)
    private String phone;

    @NaturalId
    @NotBlank
    @Size(max = 50)
    @Email
    private String email;

    @NotBlank
    @Size(min=3, max = 50)
    private String web;

    @NotBlank
    @Size(min=3, max = 50)
    private String name;

    @OneToMany(cascade=CascadeType.ALL)
    @JoinColumn(name="manufacturer_id")
    private Set<Products> products;


    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    };
    public String getWeb() {
        return this.web;
    }

    public void setWeb(String web) {
        this.web = web;
    };

    public Object getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    };

    public Object getPhone() {
        return this.phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    };

    public Object getDepartment() {
        return this.department;
    }

    public void setDepartment(String department) {
        this.department = department;
    };

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }
}