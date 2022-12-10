/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.swingapp.data;

import com.mycompany.swingapp.models.PositionEntity;
import com.mycompany.swingapp.data.Connect;
import java.util.ArrayList;

/**
 *
 * @author vadym
 */
public class PositionsRepository {

    private static final String POSITIONS_TABLE = "Positions";
    private static final String ID_COLUMN = "id_position";
    private static final String NAME_COLUMN = "name_position";

    private final Connect query;

    public PositionsRepository(Connect query) {
        this.query = query;
    }

    public ArrayList<PositionEntity> getAllPositions() {
        ArrayList result = query.select(new String[]{ID_COLUMN, NAME_COLUMN}, POSITIONS_TABLE);
        ArrayList<PositionEntity> positions = new ArrayList<PositionEntity>();
        
        for (int i = 0; i < result.size(); i++) {
            String[] row = result.get(i).toString().split("---");
            positions.add(new PositionEntity(row[0], row[1]));
        }
        
        return positions;
    }
}
