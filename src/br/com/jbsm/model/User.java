package br.com.jbsm.model;

import javax.persistence.*;

@Entity
public class User {
    @Id
    @SequenceGenerator(name="user_id_seq", sequenceName="user_id_seq")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator="user_id_seq")
    private Integer id;
    private String login;
    private String email;
    private String password;
    @Column(name = "is_monitor")
    private Boolean isMonitor;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_person")
    private Person person;
    private Integer tries;
    private Integer status;

    public User() {
    }

    public Integer getId() {

        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String passowrd) {
        this.password = passowrd;
    }

    public Boolean getIsMonitor() {
        return isMonitor;
    }

    public void setIsMonitor(Boolean isMonitor) {
        this.isMonitor = isMonitor;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public Integer getTries() {
        return tries;
    }

    public void setTries(Integer tries) {
        this.tries = tries;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }
}