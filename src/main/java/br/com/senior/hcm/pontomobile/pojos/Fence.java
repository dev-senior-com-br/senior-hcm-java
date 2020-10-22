package br.com.senior.hcm.pontomobile.pojos;

import java.util.List;

import lombok.Data;

@Data
public class Fence {
    private String id;
    private String name;
    private List<Perimeter> perimeters;
    private List<Employee> employees;
}
