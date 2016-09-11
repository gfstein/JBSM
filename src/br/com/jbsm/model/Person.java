package br.com.jbsm.model;

import javax.persistence.*;

@Entity
public class Person {
    @Id
    @SequenceGenerator(name="person_id_seq", sequenceName="person_id_seq")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator="person_id_seq")
    private Integer id;
    private String name;
    private String fone;
    private String cell;
    private String address;
    private String cpf;
    private String rg;
    @Column(name = "rg_orgao")
    private String rgOrgao;
    private String area;
    private String subarea;

    @OneToOne(mappedBy = "person", cascade = CascadeType.ALL)
    private User user;

    public Person() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFone() {
        return fone;
    }

    public void setFone(String fone) {
        this.fone = fone;
    }

    public String getCell() {
        return cell;
    }

    public void setCell(String cell) {
        this.cell = cell;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getRgOrgao() {
        return rgOrgao;
    }

    public void setRgOrgao(String rgOrgao) {
        this.rgOrgao = rgOrgao;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getSubarea() {
        return subarea;
    }

    public void setSubarea(String subarea) {
        this.subarea = subarea;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}