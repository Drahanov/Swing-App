/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.swingapp.data;

import com.mycompany.swingapp.models.EmployeeEntity;
import java.util.ArrayList;

/**
 *
 * @author vadym
 */
public class AuthRepository {

    private static final String EMPLOYEES_TABLE = "Employees";
    private static final String NAME_COLUMN = "name_employees";
    private static final String PASSWORD_COLUMN = "password";
    private static final String ID_COLUMN = "id_employees";
    private static final String POSITION_COLUMN = "id_position";

    private final Connect query;

    public AuthRepository(Connect query) {
        this.query = query;
    }

    public LoginResult loginUser(String name, String password) {
        ArrayList loginResult = query.selectWhereAnd(new String[]{NAME_COLUMN},
                EMPLOYEES_TABLE, new String[]{NAME_COLUMN, PASSWORD_COLUMN}, new String[]{name, password});

        if (loginResult.size() > 1) {
            return LoginResult.LOGIN_UNKNOWN_FAILURE;
        }

        if (loginResult.isEmpty()) {
            return LoginResult.LOGIN_INVALID_DATA;
        } else {
            return LoginResult.LOGIN_SUCCESSFUL;
        }
    }

    public void registerUser(EmployeeEntity model) {
        query.insert(EMPLOYEES_TABLE, new String[]{
            NAME_COLUMN, PASSWORD_COLUMN, POSITION_COLUMN}, new String[]{
            model.getEmployeeName(),
            model.getEmployeePassword(),
            Integer.toString(model.getEmployeePosition())
        });
    }

    public EmployeeEntity getUserModel(String name) {
        ArrayList result = query.selectWhere(new String[]{ID_COLUMN, NAME_COLUMN, PASSWORD_COLUMN, POSITION_COLUMN},
                EMPLOYEES_TABLE, NAME_COLUMN, name);
        String[] row = result.get(0).toString().split("---");
        return new EmployeeEntity(Integer.parseInt(row[0]), row[1], row[2], Integer.parseInt(row[3]));
    }

    public ArrayList<EmployeeEntity> getAllSeamstresses() {

        ArrayList result = query.selectWhere(new String[]{ID_COLUMN, NAME_COLUMN, PASSWORD_COLUMN, POSITION_COLUMN},
                EMPLOYEES_TABLE, POSITION_COLUMN, "2");
        ArrayList<EmployeeEntity> parsedResult = new ArrayList();
        for (int i = 0; i < result.size(); i++) {
            String[] row = result.get(i).toString().split("---");
            parsedResult.add(new EmployeeEntity(Integer.parseInt(row[0]), row[1], row[2], Integer.parseInt(row[3])));
        }
        return parsedResult;
    }

    public String getUserNameById(String id) {
        ArrayList result = query.selectWhere(new String[]{NAME_COLUMN}, EMPLOYEES_TABLE, ID_COLUMN, id);
        return result.get(0).toString().split("---")[0];
    }
}
