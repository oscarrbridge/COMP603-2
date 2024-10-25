
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

public class dialogViewLog extends javax.swing.JDialog {

    int id;

    public dialogViewLog(int id) {
        initComponents();

        this.id = id;

        FillTable();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblLog = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        tblLog.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null}
            },
            new String [] {
                "Log"
            }
        ));
        jScrollPane1.setViewportView(tblLog);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 388, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 288, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblLog;
    // End of variables declaration//GEN-END:variables

    private void FillTable() {
        Databases data = new Databases();

        String query = "SELECT LOG FROM LOGS WHERE USER_ID = " + id;

        try {
            ResultSet result = data.GenPull(query);

            tblLog.setModel(buildTableModel(result, "LOG"));
        } catch (Exception ex) {
            System.out.println("Error creating table");
        }

    }

    public static TableModel buildTableModel(ResultSet rs, String columnName) throws SQLException {
        // Vector to hold the column name (just one column)
        Vector<String> columnNames = new Vector<>();
        columnNames.add(columnName);

        // Vector to hold row data
        Vector<Vector<Object>> data = new Vector<>();
        while (rs.next()) {
            Vector<Object> row = new Vector<>();
            row.add(rs.getObject(1));  // Since there is only one column, we always access the first item
            data.add(row);
        }

        // Create and return the TableModel with one column
        return new DefaultTableModel(data, columnNames);
    }
}
