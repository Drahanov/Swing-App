/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.swingapp.models;

/**
 *
 * @author Ruzolda
 */
public class InvoicesEntity {
    private String invoiceId;
    private String employeeId;
    private String serviceId;
    private String status;

    public InvoicesEntity(String invoiceId, String employeeId, String serviceId, String status) {
        this.invoiceId = invoiceId;
        this.employeeId = employeeId;
        this.serviceId = serviceId;
        this.status = status;
    }

    public InvoicesEntity(String employeeId, String serviceId, String status) {
        this.invoiceId = "";
        this.employeeId = employeeId;
        this.serviceId = serviceId;
        this.status = status;
    }
    
    public String getInvoiceId() {
        return invoiceId;
    }

    public void setInvoiceId(String invoiceId) {
        this.invoiceId = invoiceId;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public String getServiceId() {
        return serviceId;
    }

    public void setServiceId(String serviceId) {
        this.serviceId = serviceId;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    
    
}
