package br.com.jbsm.model;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Workshop {
    @Id
    @SequenceGenerator(name="workshop_id_seq", sequenceName="workshop_id_seq")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator="workshop_id_seq")
    private Integer id;
    @ManyToOne
    @JoinColumn(name = "id_user")
    private User user;
    @ManyToOne
    @JoinColumn(name = "id_user_monitor")
    private User userMonitor;
    @ManyToOne
    @JoinColumn(name = "id_user_leader")
    private User userLeader;
    private String name;
    private String description;
    private String material;
    private String anexo;
    @Column(name = "create_date")
    private Date createDate;
    @Column(name = "update_date")
    private Date updateDate;

    public Workshop() {
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

    public User getUserLeader() {
        return userLeader;
    }

    public void setUserLeader(User userLeader) {
        this.userLeader = userLeader;
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

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getAnexo() {
        return anexo;
    }

    public void setAnexo(String anexo) {
        this.anexo = anexo;
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
