package oliver.app.batch.domain;

import java.io.Serializable;
import java.util.Date;

/**
 * proxy
 * 
 * @author lichengwu
 * @version 1.0
 * @created 2012-12-26 PM11:20
 */
public class Proxy implements Serializable {

    private static final long serialVersionUID = -1592101378476981839L;

    /**
     * id
     */
    private Integer id;

    /**
     * 1:ok,2:expired,3:recovered
     */
    private Integer status;

    /**
     * proxy id
     */
    private String ip;

    /**
     * proxy port
     */
    private Integer port;

    /**
     * proxy usename
     */
    private String username;

    /**
     * proxy password
     */
    private String password;

    /**
     * proxy add time
     */
    private Date addTime;

    /**
     * proxy last scan date
     */
    private Date updateTime;

    /**
     * proxy speed
     */
    private Integer speed;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public Integer getPort() {
        return port;
    }

    public void setPort(Integer port) {
        this.port = port;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Date getAddTime() {
        return addTime;
    }

    public void setAddTime(Date addTime) {
        this.addTime = addTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Integer getSpeed() {
        return speed;
    }

    public void setSpeed(Integer speed) {
        this.speed = speed;
    }
}