package jdbcgui;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JLabel;

public class ManageRegistration extends javax.swing.JFrame {

    myDBCon dbCon;
    ResultSet rs;
    ResultSet rs2;
    LoginUser luser;

    /**
     * Creates new form ManageRegistration
     */
    public ManageRegistration(LoginUser user) {
        initComponents();

        // center form in screen 
        this.setLocationRelativeTo(null);

        // set all error labels to invisible
        lblStudIDError.setVisible(false);
        lblEventIDError.setVisible(false);
        lblDateError.setVisible(false);
        dbCon = new myDBCon();
        getNewData();

        luser = user;
    }

    private void getNewData() {

        try {

            rs = dbCon.executeStatement("SELECT studID, eventID, registrationDate FROM register");

            // check if there is nothing in the result set to disable the buttons
            if (!rs.isBeforeFirst()) {
                btnNext.setEnabled(false);
                btnPrevious.setEnabled(false);
                btnDelete.setEnabled(false);
                btnUpdate.setEnabled(false);
                txtStudID.setText("");
                txtEventID.setText("");
                txtDate.setText("");
                return;
            }

            // populate rest of fields
            rs.first();

            populateFields();
        } catch (SQLException e) {
            javax.swing.JLabel label = new javax.swing.JLabel("SQL Error - Display selected registrations.");
            label.setFont(new java.awt.Font("Arial", java.awt.Font.BOLD, 18));
            JOptionPane.showMessageDialog(null, label, "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtEventID = new javax.swing.JTextField();
        btnUpdate = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        txtStudID = new javax.swing.JTextField();
        btnNext = new javax.swing.JButton();
        btnPrevious = new javax.swing.JButton();
        lblStudIDError = new javax.swing.JLabel();
        lblEventIDError = new javax.swing.JLabel();
        lblDateError = new javax.swing.JLabel();
        txtDate = new javax.swing.JTextField();
        jLblNoOfStudents = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Update/Delete Registration");
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setText("Update/Delete Registration");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("STUDID:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setText("EVENTID:");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setText("REGISTRATIONDATE:");

        txtEventID.setFont(new java.awt.Font("Eras Demi ITC", 0, 18)); // NOI18N

        btnUpdate.setFont(new java.awt.Font("Forte", 0, 24)); // NOI18N
        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        btnDelete.setFont(new java.awt.Font("Forte", 0, 24)); // NOI18N
        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        txtStudID.setEditable(false);
        txtStudID.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        btnNext.setFont(new java.awt.Font("Forte", 0, 24)); // NOI18N
        btnNext.setText("Next >>");
        btnNext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNextActionPerformed(evt);
            }
        });

        btnPrevious.setFont(new java.awt.Font("Forte", 0, 24)); // NOI18N
        btnPrevious.setText("<< Previous");
        btnPrevious.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPreviousActionPerformed(evt);
            }
        });

        lblStudIDError.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N
        lblStudIDError.setForeground(new java.awt.Color(255, 0, 0));
        lblStudIDError.setText("error label");

        lblEventIDError.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N
        lblEventIDError.setForeground(new java.awt.Color(255, 0, 0));
        lblEventIDError.setText("error label");

        lblDateError.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N
        lblDateError.setForeground(new java.awt.Color(255, 0, 0));
        lblDateError.setText("error label");

        txtDate.setFont(new java.awt.Font("Eras Demi ITC", 0, 18)); // NOI18N

        jLblNoOfStudents.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        jLblNoOfStudents.setText("No students are registered in this event");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(110, 110, 110)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(jLabel6)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnPrevious)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnUpdate)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnDelete)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnNext))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txtStudID, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtEventID, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                            .addComponent(txtDate, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblStudIDError, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                            .addComponent(lblEventIDError, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblDateError, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(62, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(132, 132, 132))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLblNoOfStudents)
                        .addGap(198, 198, 198))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtStudID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblStudIDError))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtEventID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblEventIDError))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblDateError)
                        .addComponent(jLabel6))
                    .addComponent(txtDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLblNoOfStudents)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnPrevious)
                    .addComponent(btnUpdate)
                    .addComponent(btnDelete)
                    .addComponent(btnNext))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void populateFields() {
        try {
            txtStudID.setText(rs.getString("studID"));
            txtEventID.setText(rs.getString("eventID"));

            SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MMM-yy");
            txtDate.setText(dateFormat.format(rs.getDate("registrationDate")));

            rs2 = dbCon.executeStatement("SELECT count(*) FROM register WHERE eventID = " + rs.getString("eventID"));

            if (rs2.next()) {
                int count = rs2.getInt("count(*)");
                if (count == 1) {
                    jLblNoOfStudents.setText(Integer.toString(count) + " student is registered in this event");
                } else {
                    jLblNoOfStudents.setText(Integer.toString(count) + " students are registered in this event");
                }
            }

            EnableDisableButtons();
        } catch (SQLException ex) {
            Logger.getLogger(ManageRegistration.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void MoveNext() {
        try {
            
            if (!rs.isLast()) {
                rs.next();
                populateFields();
            }
        } catch (SQLException ex) {
            Logger.getLogger(ManageRegistration.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void btnNextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNextActionPerformed
        MoveNext();
    }//GEN-LAST:event_btnNextActionPerformed

    private void MovePrevious() {
        try {
            
            if (!rs.isFirst()) {
                rs.previous();
                populateFields();
            }
        } catch (SQLException ex) {
            Logger.getLogger(ManageRegistration.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void EnableDisableButtons() {
        try {
            if (rs.isFirst()) {
                btnPrevious.setEnabled(false);
            } else {
                btnPrevious.setEnabled(true);
            }
            if (rs.isLast()) {
                btnNext.setEnabled(false);
            } else {
                btnNext.setEnabled(true);
            }
        } catch (SQLException ex) {
            Logger.getLogger(ManageRegistration.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    private void btnPreviousActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPreviousActionPerformed
        MovePrevious();
    }//GEN-LAST:event_btnPreviousActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        
        try {
            // make the result set scrolable forward/backward updatable
            String prepSQL = "DELETE register WHERE studID = " + rs.getString("studID") + " AND eventID = " + rs.getString("eventID");

            String action = "Deleted: Register table, row studID(" + rs.getString("studID") + "), eventID(" + rs.getString("eventID") + ")";

            if (JOptionPane.showConfirmDialog(null, "Are you sure you want to delete?", "CONFIRM",
                    JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION) {
                int result = dbCon.executePrepared(prepSQL);

                if (result > 0) {
                    javax.swing.JLabel label = new javax.swing.JLabel("Registration deleted successfully.");
                    label.setFont(new java.awt.Font("Arial", java.awt.Font.BOLD, 18));
                    JOptionPane.showMessageDialog(null, label, "SUCCESS", JOptionPane.INFORMATION_MESSAGE);

                    updateLogs(action);

                    getNewData();
                }
            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error adding new employee.");
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    void updateLogs(String action) {
        try {
            String prepSQL = "INSERT INTO log VALUES (?,?,?,SYSTIMESTAMP)";
            PreparedStatement preparedStatement = dbCon.prepareStatement(prepSQL);
            preparedStatement.setInt(1, luser.userid);
            preparedStatement.setString(2, luser.username);
            preparedStatement.setString(3, action);
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error inserting the logs.");
        }
    }

    void clearErrorLabels() {
        lblStudIDError.setText("");
        lblStudIDError.setVisible(false);
        lblEventIDError.setText("");
        lblEventIDError.setVisible(false);
        lblDateError.setText("");
        lblDateError.setVisible(false);
    }

    public boolean isInteger(String s) {
        try {
            Integer.parseInt(s);
            return true;
        } catch (NumberFormatException ex) {
            return false;
        }
    }

    private void setErrorMessage(JLabel label, String text) {
        label.setText(text);
        label.setVisible(true);
    }

    
    boolean isValidEventID() throws SQLException {
        String stmtSQL = "SELECT eventID FROM event WHERE eventID = " + txtEventID.getText().trim();
        ResultSet rs3 = dbCon.executeStatement(stmtSQL);
        return rs3.isBeforeFirst();
    }

    boolean isStudent() throws SQLException {
        String stmtSQL = "SELECT studID FROM student WHERE studID = " + txtStudID.getText().trim();
        ResultSet rs3 = dbCon.executeStatement(stmtSQL);
        return rs3.isBeforeFirst();
    }
    
    boolean isValidData() {
        clearErrorLabels();
        boolean result = true; // assume all details are true, set to false if otherwise 
        // you need to check format deails and make sure they are consistent with DB 

        try {
            if (txtStudID.getText().trim().isEmpty()) {
                setErrorMessage(lblStudIDError, "Invalid. Cannot be empty.");
                result = false;
            } else if (!isInteger(txtStudID.getText().trim())) {
                setErrorMessage(lblStudIDError, "Invalid. Must be integer.");
                result = false;
            } else if (!isStudent()) {
                throw new Exception();
            }
        } catch (Exception e) {
            setErrorMessage(lblStudIDError, "Invalid student ID.");
            result = false;
        }

        try {
            if (txtEventID.getText().trim().isEmpty()) {
                setErrorMessage(lblEventIDError, "Required.");
                result = false;
            } else if (!isInteger(txtEventID.getText().trim())) {
                setErrorMessage(lblEventIDError, "Must be integer.");
                result = false;
            } else if (!isValidEventID()) {
                throw new Exception();
            }
        } catch (Exception e) {
            setErrorMessage(lblEventIDError, "Invalid event ID.");
            result = false;
        }

        try {
            SimpleDateFormat format = new SimpleDateFormat("dd-MMM-yy");
            Date date = format.parse(txtDate.getText().trim());
            if (txtDate.getText().trim().isEmpty()) {
                setErrorMessage(lblDateError, "Invalid. Cannot be empty.");
                result = false;
            } else if (!txtDate.getText().trim().equals(format.format(date))) {
                throw new Exception();
            }

        } catch (Exception e) {
            setErrorMessage(lblDateError, "Invalid. Format is dd-MMM-yy.");
            result = false;
        }

        return result;
    }


    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
       
        try {

            if (isValidData()) {

                if (JOptionPane.showConfirmDialog(null, "Are you sure you want to update?", "CONFIRM",
                        JOptionPane.YES_NO_OPTION) != JOptionPane.YES_NO_OPTION) {
                    return;
                }

                String prepSQL = "UPDATE register set eventID = ?, registrationDate = ? WHERE studID = ? AND eventID = ?";

                PreparedStatement preparedStatement = dbCon.prepareStatement(prepSQL);
//                preparedStatement.setInt(1, Integer.parseInt(txtStudID.getText().trim()));
                preparedStatement.setInt(1, Integer.parseInt(txtEventID.getText().trim()));
                preparedStatement.setString(2, txtDate.getText());
                preparedStatement.setInt(3, Integer.parseInt(rs.getString("studID")));
                preparedStatement.setInt(4, Integer.parseInt(rs.getString("eventID")));

                String action = "Updated: Register Table, ";
                if (!rs.getString("studID").equals(txtStudID.getText().trim())) {
                    action += "studID(" + rs.getString("studID") + "->" + txtStudID.getText().trim() + ") ";
                }
                if (!rs.getString("eventID").equals(txtEventID.getText().trim())) {
                    action += "eventID(" + rs.getString("eventID") + "->" + txtEventID.getText().trim() + ") ";
                }

                if (!rs.getString("registrationdate").equals(txtDate.getText().trim())) {
                    action += "date(" + rs.getString("registrationdate") + "->" + txtDate.getText().trim() + ") ";
                }

                int result = preparedStatement.executeUpdate();

                if (result > 0) {
                    javax.swing.JLabel label = new javax.swing.JLabel("Registration updated successfully.");
                    label.setFont(new java.awt.Font("Arial", java.awt.Font.BOLD, 18));
                    JOptionPane.showMessageDialog(null, label, "SUCCESS", JOptionPane.INFORMATION_MESSAGE);

                    updateLogs(action);

                    getNewData();
                }

            } else {
                javax.swing.JLabel label = new javax.swing.JLabel("Please fix validation errors...");
                label.setFont(new java.awt.Font("Arial", java.awt.Font.BOLD, 18));
                JOptionPane.showMessageDialog(null, label, "ERROR", JOptionPane.ERROR_MESSAGE);
            }

        } catch (SQLException e) {

            JOptionPane.showMessageDialog(null, "Error updating registration." + e.getMessage());

        }
    }//GEN-LAST:event_btnUpdateActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnNext;
    private javax.swing.JButton btnPrevious;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLblNoOfStudents;
    private javax.swing.JLabel lblDateError;
    private javax.swing.JLabel lblEventIDError;
    private javax.swing.JLabel lblStudIDError;
    private javax.swing.JTextField txtDate;
    private javax.swing.JTextField txtEventID;
    private javax.swing.JTextField txtStudID;
    // End of variables declaration//GEN-END:variables
}
