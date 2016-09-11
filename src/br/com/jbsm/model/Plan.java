package br.com.jbsm.model;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
public class Plan {
    @Id
    @SequenceGenerator(name="plan_id_seq", sequenceName="plan_id_seq")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator="plan_id_seq")
    private Integer id;
    @ManyToOne
    @JoinColumn(name = "id_user")
    private User user;
    private String name;
    private String description;
    @Column(name = "target_audience")
    private String targetAudience;
    private String objective;
    private String subject;
    private String estrategy;
    private String resources;
    private String place;
    private String relevance;
    private String instruments;
    @Column(name = "create_date")
    private Date createDate;
    @Column(name = "update_date")
    private Date updateDate;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<Visit> visits;

    public Plan() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getTargetAudience() {
        return targetAudience;
    }

    public void setTargetAudience(String targetAudience) {
        this.targetAudience = targetAudience;
    }

    public String getObjective() {
        return objective;
    }

    public void setObjective(String objective) {
        this.objective = objective;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getEstrategy() {
        return estrategy;
    }

    public void setEstrategy(String estrategy) {
        this.estrategy = estrategy;
    }

    public String getResources() {
        return resources;
    }

    public void setResources(String resources) {
        this.resources = resources;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public String getRelevance() {
        return relevance;
    }

    public void setRelevance(String relevance) {
        this.relevance = relevance;
    }

    public String getInstruments() {
        return instruments;
    }

    public void setInstruments(String instruments) {
        this.instruments = instruments;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Date getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }
}
