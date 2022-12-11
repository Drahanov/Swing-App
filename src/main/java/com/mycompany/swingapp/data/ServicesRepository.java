/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.swingapp.data;

import com.mycompany.swingapp.models.ServiceEntity;
import java.util.ArrayList;

/**
 *
 * @author vadym
 */
public class ServicesRepository {

    private static final String SERVICE_TABLE = "Services";
    private static final String PRICE_COLUMN = "price";
    private static final String ID_COLUMN = "id_service";
    private static final String NAME_COLUMN = "name_service";

    private final Connect connect;

    public ServicesRepository(Connect connect) {
        this.connect = connect;
    }

    public ArrayList<ServiceEntity> getAllServices() {
        ArrayList result = connect.select(new String[]{ID_COLUMN, NAME_COLUMN, PRICE_COLUMN}, SERVICE_TABLE);
        ArrayList<ServiceEntity> positions = new ArrayList<ServiceEntity>();

        for (int i = 0; i < result.size(); i++) {
            String[] row = result.get(i).toString().split("---");
            positions.add(new ServiceEntity(row[0], row[1], row[2]));
        }

        return positions;
    }

    public String getServiceNameById(String id) {
        ArrayList result = connect.selectWhere(new String[]{NAME_COLUMN}, SERVICE_TABLE, ID_COLUMN, id);
        return result.get(0).toString().split("---")[0];
    }
}
