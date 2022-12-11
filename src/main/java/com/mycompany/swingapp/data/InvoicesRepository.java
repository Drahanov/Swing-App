package com.mycompany.swingapp.data;

import java.util.ArrayList;
import com.mycompany.swingapp.models.InvoicesEntity;

/**
 *
 * @author Ruzolda
 */
public class InvoicesRepository {

    private static final String INVOICES_TABLE = "Invoices";
    private static final String ID_COLUMN = "id_invoice";
    private static final String ID_EMP_COLUMN = "id_employees";
    private static final String ID_SERVICE_COLUMN = "id_service";
    private static final String STATUS_COLUMN = "statys";

    private final Connect query;

    public InvoicesRepository(Connect query) {
        this.query = query;
    }

    public ArrayList<InvoicesEntity> getAllInvoices() {
        ArrayList result = query.select(new String[]{ID_COLUMN, ID_EMP_COLUMN, ID_SERVICE_COLUMN, STATUS_COLUMN}, INVOICES_TABLE);
        ArrayList<InvoicesEntity> invoices = new ArrayList<InvoicesEntity>();

        for (int i = 0; i < result.size(); i++) {
            String[] row = result.get(i).toString().split("---");
            invoices.add(new InvoicesEntity(row[0], row[1], row[2], row[3]));
        }

        return invoices;
    }

    public ArrayList<InvoicesEntity> getInvoicesById(String userId) {
        ArrayList result = query.selectWhere(new String[]{ID_COLUMN, ID_EMP_COLUMN,
            ID_SERVICE_COLUMN, STATUS_COLUMN}, INVOICES_TABLE,
                ID_EMP_COLUMN, userId);
        ArrayList<InvoicesEntity> invoices = new ArrayList<InvoicesEntity>();

        for (int i = 0; i < result.size(); i++) {
            String[] row = result.get(i).toString().split("---");
            invoices.add(new InvoicesEntity(row[0], row[1], row[2], row[3]));
        }

        return invoices;
    }

    public void updateInvoice(String invoiceId) {
        query.update(INVOICES_TABLE, new String[]{STATUS_COLUMN}, new String[]{"Изпълнено"}, ID_COLUMN, invoiceId);
    }

    public void addNewInvoice(InvoicesEntity invoice) {
        query.insert(INVOICES_TABLE, new String[]{ID_EMP_COLUMN,
            ID_SERVICE_COLUMN, STATUS_COLUMN}, new String[]{ invoice.getEmployeeId(),
            invoice.getServiceId(), invoice.getStatus()});
    }
}
