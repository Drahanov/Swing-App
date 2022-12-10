/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package com.mycompany.swingapp.models;

import java.util.ArrayList;
/**
 *
 * @author vadym
 */
public class PositionEntity {
    private String positionId;
    private String positionName;

    public static final int POSITION_ADMIN = 1;
    public static final int POSITION_SEAMSTRESS = 0;
    
    public PositionEntity(String positionId, String positionName) {
        this.positionId = positionId;
        this.positionName = positionName;
    }

    public String getPositionId() {
        return positionId;
    }

    public void setPositionId(String positionId) {
        this.positionId = positionId;
    }

    public String getPositionName() {
        return positionName;
    }

    public void setPositionName(String positionName) {
        this.positionName = positionName;
    }
    
    public static PositionEntity findIdByName(String name, ArrayList<PositionEntity> positions) {
        for(PositionEntity position : positions) {
           if(position.getPositionName().equals(name)) {
               return position;
           } 
        }
        return null;
    }
    
}
