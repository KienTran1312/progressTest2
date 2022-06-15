/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author Tkien
 */
public class Dept {
    private int did;
    private String dname;
    private ArrayList<Emp> empList = new ArrayList<>();

    public Dept(int did, String dname) {
        this.did = did;
        this.dname = dname;
    }

    public Dept() {
    }

    public int getDid() {
        return did;
    }

    public void setDid(int did) {
        this.did = did;
    }

    public String getDname() {
        return dname;
    }

    public void setDname(String dname) {
        this.dname = dname;
    }

    public ArrayList<Emp> getEmpList() {
        return empList;
    }

    public void setEmpList(ArrayList<Emp> empList) {
        this.empList = empList;
    }
    
    
}
