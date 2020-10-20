package br.com.senior.hcm.pontomobile.pojos;

import lombok.Data;

@Data
public class Perimeter {
    private String id;
    private String type;
    private StartPoint startPoint;
    private double radius;
}
