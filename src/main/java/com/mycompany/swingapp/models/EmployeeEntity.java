/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.swingapp.models;

/**
 *
 * @author vadym
 */
public class EmployeeEntity {
    
    private int employeeId;
    private String employeeName;
    private String employeePassword;
    private int employeePosition;

    public EmployeeEntity(int employeeId, String employeeName, String employeePassword, int employeePosition) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.employeePassword = employeePassword;
        this.employeePosition = employeePosition;
    }

    public int getEmployeeId() {
        return employeeId;
    }
    
    public void setEmployeeId(int EmployeeId) {
        this.employeeId = EmployeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String EmployeeName) {
        this.employeeName = EmployeeName;
    }

    public String getEmployeePassword() {
        return employeePassword;
    }

    public void setEmployeePassword(String EmployeePassword) {
        this.employeePassword = EmployeePassword;
    }

    public int getEmployeePosition() {
        return employeePosition;
    }

    public void setEmployeePosition(int EmployeePosition) {
        this.employeePosition = EmployeePosition;
    }
    
}