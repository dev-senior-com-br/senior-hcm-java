package br.com.senior.hcm.pontomobile.pojos;

import java.util.List;

import lombok.Data;

@Data
public class Manager {
    private String id;
    private String mail;
    private String platformUserName;
    private List<PlatformUser> platformUsers;
    private List<Employee> employees;
}
