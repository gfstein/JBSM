package br.com.jbsm.model;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Visit {
    @Id
    @SequenceGenerator(name="visit_id_seq", sequenceName="visit_id_seq")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator="visit_id_seq")
    private Integer id;
    @ManyToOne
    @JoinColumn(name = "id_user")
    private User user;
    @ManyToOne
    @JoinColumn(name = "id_user_monitor")
    private User userMonitor;
    @ManyToOne
    @JoinColumn(name = "id_workshop")
    private Workshop workshop;
    @ManyToOne
    @JoinColumn(name = "id_plan")
    private Plan plan;
    @Column(name = "insituition_name")
    private String instituitionName;
    @Column(name = "insituition_type")
    private Integer instituitionType;
    @Column(name = "insituition_city")
    private String instituitionCity;
    @Column(name = "insituition_matter")
    private String instituitionMatter;
    @Column(name = "number_visitors")
    private Integer numberVisitors;
    private String fone;
    @Column(name = "visitors_age")
    private Integer visitorsAge;
    private String objective;
    private Boolean assitance;
    @Column(name = "start_date")
    private Date startDate;
    @Column(name = "end_date")
    private Date endDate;
    private Integer status;
    @Column(name = "is_active")
    private Boolean isActive;
    @Column(name = "create_date")
    private Date createDate;
    @Column(name = "update_date")
    private Date updateDate;

    public Visit() {
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

    public User getUserMonitor() {
        return userMonitor;
    }

    public void setUserMonitor(User userMonitor) {
        this.userMonitor = userMonitor;
    }

    public Workshop getWorkshop() {
        return workshop;
    }

    public void setWorkshop(Workshop workshop) {
        this.workshop = workshop;
    }

    public Plan getPlan() {
        return plan;
    }

    public void setPlan(Plan plan) {
        this.plan = plan;
    }

    public String getInstituitionName() {
        return instituitionName;
    }

    public void setInstituitionName(String instituitionName) {
        this.instituitionName = instituitionName;
    }

    public Integer getInstituitionType() {
        return instituitionType;
    }

    public void setInstituitionType(Integer instituitionType) {
        this.instituitionType = instituitionType;
    }

    public String getInstituitionCity() {
        return instituitionCity;
    }

    public void setInstituitionCity(String instituitionCity) {
        this.instituitionCity = instituitionCity;
    }

    public String getInstituitionMatter() {
        return instituitionMatter;
    }

    public void setInstituitionMatter(String instituitionMatter) {
        this.instituitionMatter = instituitionMatter;
    }

    public Integer getNumberVisitors() {
        return numberVisitors;
    }

    public void setNumberVisitors(Integer numberVisitors) {
        this.numberVisitors = numberVisitors;
    }

    public String getFone() {
        return fone;
    }

    public void setFone(String fone) {
        this.fone = fone;
    }

    public Integer getVisitorsAge() {
        return visitorsAge;
    }

    public void setVisitorsAge(Integer visitorsAge) {
        this.visitorsAge = visitorsAge;
    }

    public String getObjective() {
        return objective;
    }

    public void setObjective(String objective) {
        this.objective = objective;
    }

    public Boolean getAssitance() {
        return assitance;
    }

    public void setAssitance(Boolean assitance) {
        this.assitance = assitance;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Boolean getActive() {
        return isActive;
    }

    public void setActive(Boolean active) {
        isActive = active;
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
