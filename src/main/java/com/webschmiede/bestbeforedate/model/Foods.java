package com.webschmiede.bestbeforedate.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;


import javax.persistence.Id;
import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
public class Foods {

    @Id
    private int id;
    private String name;
    private String qr;
    private Date bestbeforedate;

}
