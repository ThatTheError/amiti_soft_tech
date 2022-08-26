package com.gopal.barbershop.entities;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "RegisteredUsers")
public class UserEntity 
{
    @Id
    @GeneratedValue
    private int uId;
    @Column(name = "User_Email",unique = true)
    private String uEmail;
    @Column(name = "User_Password")
    private String uPassword;
    @Column(name = "Conf_Password")
    private String uConfPassword;

    
    public int getuId() {
        return uId;
    }
    public void setuId(int uId) {
        this.uId = uId;
    }
    public String getuEmail() {
        return uEmail;
    }
    public void setuEmail(String uEmail) {
        this.uEmail = uEmail;
    }
    public String getuPassword() {
        return uPassword;
    }
    public void setuPassword(String uPassword) {
        this.uPassword = uPassword;
    }
    public String getuConfPassword() {
        return uConfPassword;
    }
    public void setuConfPassword(String uConfPassword) {
        this.uConfPassword = uConfPassword;
    }
    public UserEntity(int uId, String uEmail, String uPassword, String uConfPassword) {
        this.uId = uId;
        this.uEmail = uEmail;
        this.uPassword = uPassword;
        this.uConfPassword = uConfPassword;
    }
    public UserEntity() {
    }
    @Override
    public String toString() {
        return "UserEntity [uConfPassword=" + uConfPassword + ", uEmail=" + uEmail + ", uId=" + uId + ", uPassword="
                + uPassword + "]";
    }
           
}
