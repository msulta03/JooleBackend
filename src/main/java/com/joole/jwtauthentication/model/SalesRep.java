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
@Table(name = "SalesRep")
public class SalesRep {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @OneToMany(mappedBy = "SalesRep" ,cascade = CascadeType.ALL)
    private Long id;

    @NotBlank
    @Size(min=3, max = 50)
    private String name;

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
    private String website;


    @OneToMany(cascade=CascadeType.ALL)
    @JoinColumn(name="salesrep_id")
    private Set<Products> products;

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    };
    public String getWebsite() {
        return this.website;
    }

    public void setWebsite(String web) {
        this.website = web;
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

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }
}