package br.com.senior.hcm.pontomobile.pojos;

import java.util.Date;
import java.util.List;

import lombok.Data;

@Data
public class Employee {
    private String id;
    private String externalId;
    private String name;
    private String pis;
    private String mail;
    private Company company;
    private Manager manager;
    private List<Manager> managers;
    private String platformUserName;
    private List<PlatformUser> platformUsers;
    private Date lastUpdate;
    private String nfcCode;
    private List<Fence> fences;
    private boolean enabled;
    private Date dataOrigin;
}
