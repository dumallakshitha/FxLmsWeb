package com.dls.model;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author gim
 */
@Entity
@Table(name = "fxlms_lecturer")

public class Lecturer implements Serializable {
    
    @Id
    @Column(name = "lecturer_id")
    private int lecturerId;
    @Column(name = "email")
    private String email;
    @Column(name = "f_name")
    private String fName;
    @Column(name = "l_name")
    private String lName;
    @Column(name = "address1")
    private String address1;
    @Column(name = "address2")
    private String address2;
    @Column(name = "state")
    private String state;
    @Column(name = "zipcode")
    private int zipcode;
    @Column(name = "tp1")
    private int tp1;
    @Column(name = "tp2")
    private int tp2;
    @Column(name = "mobile")
    private int mobile;
    @Column(name = "country")
    private String country;
    @Column(name = "title")
    private String title;
    @Column(name = "status")
    private String status;

    public Lecturer() {
    }

    public Lecturer(Integer lecturerId) {
        this.lecturerId = lecturerId;
    }

    public Integer getLecturerId() {
        return lecturerId;
    }

    public void setLecturerId(Integer lecturerId) {
        this.lecturerId = lecturerId;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFName() {
        return fName;
    }

    public void setFName(String fName) {
        this.fName = fName;
    }

    public String getLName() {
        return lName;
    }

    public void setLName(String lName) {
        this.lName = lName;
    }

    public String getAddress1() {
        return address1;
    }

    public void setAddress1(String address1) {
        this.address1 = address1;
    }

    public String getAddress2() {
        return address2;
    }

    public void setAddress2(String address2) {
        this.address2 = address2;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public Integer getZipcode() {
        return zipcode;
    }

    public void setZipcode(Integer zipcode) {
        this.zipcode = zipcode;
    }

    public Integer getTp1() {
        return tp1;
    }

    public void setTp1(Integer tp1) {
        this.tp1 = tp1;
    }

    public Integer getTp2() {
        return tp2;
    }

    public void setTp2(Integer tp2) {
        this.tp2 = tp2;
    }

    public Integer getMobile() {
        return mobile;
    }

    public void setMobile(Integer mobile) {
        this.mobile = mobile;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

   
   

    @Override
    public String toString() {
        return "Entity.FxlmsLecturer[ lecturerId=" + lecturerId + " ]";
    }
    
}
