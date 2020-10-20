package br.com.senior.hcm.pontomobile.pojos;

import java.util.Date;

import lombok.Data;

@Data
public class StartPoint {
    private String id;
    private double latitude;
    private double longitude;
    private Date dateAndTime;
    private Perimeter perimeter;
}
