package com.scaler.userservicemain.models;

import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;

import java.util.Date;

public class Token extends BaseModel{
    private String value;

    @ManyToOne
    private User user;

    private Date date;

}
