/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.Date;

/**
 *
 * @author Tkien
 */
public class Emp {
    private int eid;
    private String ename;
    private boolean gender;
    private Date dob;
    private Dept dept;

    public Emp(int eid, String ename, boolean gender, Date dob, Dept dept) {
        this.eid = eid;
        this.ename = ename;
        this.gender = gender;
        this.dob = dob;
        this.dept = dept;
    }

    public Emp() {
    }
    
    

    public int getEid() {
        return eid;
    }

    public void setEid(int eid) {
        this.eid = eid;
    }

    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    public boolean isGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    public Dept getDept() {
        return dept;
    }

    public void setDept(Dept dept) {
        this.dept = dept;
    }
    
    
}
