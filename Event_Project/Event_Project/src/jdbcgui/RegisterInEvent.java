package jdbcgui;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import java.util.Date;
import java.text.SimpleDateFormat;
import javax.swing.JLabel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author wissam
 */
public class RegisterInEvent extends javax.swing.JFrame {

    /**
     * Creates new form RegisterInEvent
     */
    myDBCon dbCon;
    ResultSet rs;
    LoginUser luser;

    public RegisterInEvent(LoginUser user) {
        initComponents();
        this.setLocationRelativeTo(null); // center form in screen 
        // set all error labels to invisible
        lblStudIDError.setVisible(false);
        lblEventIDError.setVisible(false);
        lblDateError.setVisible(false);
        dbCon = new myDBCon();

        luser = user;
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
        jLabel4 = new javax.swing.JLabel();
        txtStudID = new javax.swing.JTextField();
        txtEventID = new javax.swing.JTextField();
        btnAddNewEmp = new javax.swing.JButton();
        lblStudIDError = new javax.swing.JLabel();
        lblDateError = new javax.swing.JLabel();
        lblEventIDError = new javax.swing.JLabel();
        txtDate = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Register in Event");
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setText("Register in Event");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("STUDID:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setText("EVENTID:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setText("REG. DATE:");

        txtStudID.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        txtEventID.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        btnAddNewEmp.setFont(new java.awt.Font("Forte", 0, 24)); // NOI18N
        btnAddNewEmp.setText("Add New");
        btnAddNewEmp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddNewEmpActionPerformed(evt);
            }
        });

        lblStudIDError.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N
        lblStudIDError.setForeground(new java.awt.Color(255, 0, 0));
        lblStudIDError.setText("error label");

        lblDateError.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N
        lblDateError.setForeground(new java.awt.Color(255, 0, 0));
        lblDateError.setText("error label");

        lblEventIDError.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N
        lblEventIDError.setForeground(new java.awt.Color(255, 0, 0));
        lblEventIDError.setText("error label");

        txtDate.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(83, 83, 83)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtStudID)
                            .addComponent(txtEventID, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtDate, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnAddNewEmp, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(lblEventIDError, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 169, Short.MAX_VALUE)
                            .addComponent(lblStudIDError, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblDateError, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jLabel1)))
                .addContainerGap(30, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(38, 38, 38)
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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(lblDateError)
                    .addComponent(txtDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnAddNewEmp)
                .addGap(0, 10, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // verify valid entry of integer values
    public boolean isInteger(String s) {
        try {
            Integer.parseInt(s);
            return true;
        } catch (NumberFormatException ex) {
            return false;
        }
    }

    void clearErrorLabels() { // clear all labels used to display error messages 
        lblStudIDError.setText("");
        lblStudIDError.setVisible(false);
        lblEventIDError.setText("");
        lblEventIDError.setVisible(false);
        lblDateError.setText("");
        lblDateError.setVisible(false);
    }

    private void setErrorMessage(JLabel label, String text) {
        label.setText(text);
        label.setVisible(true);
    }

    
    boolean isValidData() {
        clearErrorLabels();
        boolean result = true; // assume all details are true, set to false if otherwise 
        // you need to check format deails and make sure they are consistent with DB 

        try {
            if (txtStudID.getText().trim().isEmpty()) {
                setErrorMessage(lblStudIDError, "Required.");
                result = false;
            } else if (!isInteger(txtStudID.getText().trim())) {
                setErrorMessage(lblStudIDError, "Must be integer.");
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
                setErrorMessage(lblDateError, "Required.");
                result = false;
            } else if (!txtDate.getText().trim().equals(format.format(date))) {
                throw new Exception();
            }

        } catch (Exception e) {
            setErrorMessage(lblDateError, "Format is dd-Mmm-yy.");
            result = false;
        }

        return result;
    }

    void clearInputBoxes() { // clear for every new entry 
        txtStudID.setText("");
        txtEventID.setText("");
        txtDate.setText("");
    }
    
    boolean isValidEventID() throws SQLException {
        String stmtSQL = "SELECT eventID FROM event WHERE eventID = " + txtEventID.getText().trim();
        rs = dbCon.executeStatement(stmtSQL);
        return rs.isBeforeFirst();
    }

    boolean isStudent() throws SQLException {
        String stmtSQL = "SELECT studID FROM student WHERE studID = " + txtStudID.getText().trim();
        rs = dbCon.executeStatement(stmtSQL);
        return rs.isBeforeFirst();
    }

    boolean isDuplicate(String studID, String eventID) throws SQLException {
        String stmtSQL = "SELECT studID, eventID FROM REGISTER WHERE studID = " + studID + " AND eventID = " + eventID;
        rs = dbCon.executeStatement(stmtSQL);
        return rs.isBeforeFirst();
    }

    void updateLogs(String action
    ) {
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

    int getStudentRegistrationCount(String studID) throws SQLException {
        int count = 0;
        String stmtSQL = "SELECT COUNT(*) FROM \"REGISTER\" WHERE studid = ?";
        PreparedStatement preparedStatement = dbCon.prepareStatement(stmtSQL);
        preparedStatement.setInt(1, Integer.parseInt(studID));
        rs = preparedStatement.executeQuery();
        if (rs.next()) {
            count = rs.getInt(1); // Get the count from the result set
        }
        rs.close();
        return count;
    }
    
    private void btnAddNewEmpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddNewEmpActionPerformed
        
        try {
            int studentRegistrationCount = getStudentRegistrationCount(txtStudID.getText().trim());
            System.out.print(studentRegistrationCount);
            if (isValidData() && !isDuplicate(txtStudID.getText().trim(), txtEventID.getText().trim()) && studentRegistrationCount < 5) {
                // if new employee details are valid, then add new employee to DB

                String prepSQL = "INSERT INTO \"REGISTER\" (studID, eventID, registrationDate) VALUES (?, ?, ?)";
                PreparedStatement preparedStatement = dbCon.prepareStatement(prepSQL);
                preparedStatement.setInt(1, Integer.parseInt(txtStudID.getText().trim()));
                preparedStatement.setInt(2, Integer.parseInt(txtEventID.getText().trim()));
                preparedStatement.setString(3, txtDate.getText().trim());

                int result = preparedStatement.executeUpdate();
                
                if (result > 0) {
                    javax.swing.JLabel label = new javax.swing.JLabel("Successfully registered in event.");
                    label.setFont(new java.awt.Font("Arial", java.awt.Font.BOLD, 18));
                    JOptionPane.showMessageDialog(null, label, "SUCCESS", JOptionPane.INFORMATION_MESSAGE);

                    String action = "Student " + txtStudID.getText().trim() + " registered in event " + txtEventID.getText().trim();
                    updateLogs(action);

                    clearInputBoxes();
                }

                rs.close();
            } else if (!isValidData()) {
                javax.swing.JLabel label = new javax.swing.JLabel("Please fix validation errors...");
                label.setFont(new java.awt.Font("Arial", java.awt.Font.BOLD, 18));
                JOptionPane.showMessageDialog(null, label, "ERROR", JOptionPane.ERROR_MESSAGE);
            } else if (studentRegistrationCount == 5){
                javax.swing.JLabel label = new javax.swing.JLabel("Student is registered to 5 events which is the maximum per term.");
                label.setFont(new java.awt.Font("Arial", java.awt.Font.BOLD, 18));
                JOptionPane.showMessageDialog(null, label, "ERROR", JOptionPane.INFORMATION_MESSAGE);
            } else {
                javax.swing.JLabel label = new javax.swing.JLabel("Student already registered in the event.");
                label.setFont(new java.awt.Font("Arial", java.awt.Font.BOLD, 18));
                JOptionPane.showMessageDialog(null, label, "ERROR", JOptionPane.INFORMATION_MESSAGE);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error registering student in event.");
        }
    }//GEN-LAST:event_btnAddNewEmpActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddNewEmp;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel lblDateError;
    private javax.swing.JLabel lblEventIDError;
    private javax.swing.JLabel lblStudIDError;
    private javax.swing.JTextField txtDate;
    private javax.swing.JTextField txtEventID;
    private javax.swing.JTextField txtStudID;
    // End of variables declaration//GEN-END:variables
}
