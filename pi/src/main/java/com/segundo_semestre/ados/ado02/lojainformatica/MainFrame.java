/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pi.ado02.lojainformatica;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author kcalixto
 */
public class MainFrame extends javax.swing.JFrame {

    private ComputerDAO conn = new ComputerDAO();

    /**
     * Creates new form MainFrame
     */
    public MainFrame() {
        initComponents();
        onLoad();
    }

    public void onLoad() {
        System.out.println("starting...");

        System.out.println("finding computers");
        ArrayList<Computer> arr = new ArrayList<>();
        arr = conn.findAll();
        System.out.println(arr.size() + " computers found.");

        loadTable(arr);

        ArrayList<String> comboBoxArray = new ArrayList<>();
        comboBoxArray = conn.findAllProcessors();
        filterComboBox.addItem("todos");
        loadComboBox(comboBoxArray);

        System.out.println("config done.");
    }

    public void loadTable(ArrayList<Computer> arr) {
        System.out.println("filling table");
        DefaultTableModel model = (DefaultTableModel) table.getModel();
        model.getDataVector().removeAllElements();

        for (Computer c : arr) {
            model.addRow(new Object[] { c.getId(), Computer.getMarca(), c.getProcessador(), c.getHd() });
        }
        System.out.println("filled table successfully");
    }

    public void loadComboBox(ArrayList<String> arr) {
        System.out.println("filling combobox");
        for (int i = filterComboBox.getItemCount() - 1; i >= 1; i--) {
            filterComboBox.removeItemAt(i);
        }

        for (String s : arr) {
            filterComboBox.addItem(s);
        }
        System.out.println("filled combobox successfully");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated
    // Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tabbedPane = new javax.swing.JTabbedPane();
        seeComputerPanel = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        hdEditInput = new javax.swing.JTextField();
        processorEditInput = new javax.swing.JTextField();
        processorLabel = new javax.swing.JLabel();
        hdLabel = new javax.swing.JLabel();
        saveEditButton = new javax.swing.JButton();
        errorLabelSee = new javax.swing.JLabel();
        processorLabel2 = new javax.swing.JLabel();
        idLabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        deleteButton = new javax.swing.JButton();
        editButton = new javax.swing.JButton();
        filterLabel = new javax.swing.JLabel();
        filterComboBox = new javax.swing.JComboBox<>();
        insertComputerPanel = new javax.swing.JPanel();
        processorLabel1 = new javax.swing.JLabel();
        processorInput = new javax.swing.JTextField();
        hdLabel1 = new javax.swing.JLabel();
        hdInput = new javax.swing.JTextField();
        saveButton = new javax.swing.JButton();
        errorLabelInsert = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        processorLabel.setText("processador:");

        hdLabel.setText("hd:");

        saveEditButton.setText("salvar edição");
        saveEditButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveEditButtonActionPerformed(evt);
            }
        });

        processorLabel2.setText("id: ");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
                jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(17, 17, 17)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel3Layout
                                                .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(errorLabelSee, javax.swing.GroupLayout.DEFAULT_SIZE,
                                                        javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(hdLabel)
                                                .addComponent(processorLabel)
                                                .addComponent(processorEditInput, javax.swing.GroupLayout.DEFAULT_SIZE,
                                                        138, Short.MAX_VALUE)
                                                .addComponent(hdEditInput)
                                                .addGroup(jPanel3Layout.createSequentialGroup()
                                                        .addGap(12, 12, 12)
                                                        .addComponent(saveEditButton)))
                                        .addGroup(jPanel3Layout.createSequentialGroup()
                                                .addComponent(processorLabel2)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(idLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 47,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap(17, Short.MAX_VALUE)));
        jPanel3Layout.setVerticalGroup(
                jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(processorLabel2)
                                        .addComponent(idLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 16,
                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addComponent(processorLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(processorEditInput, javax.swing.GroupLayout.PREFERRED_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(hdLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(hdEditInput, javax.swing.GroupLayout.PREFERRED_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(34, 34, 34)
                                .addComponent(saveEditButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(errorLabelSee, javax.swing.GroupLayout.PREFERRED_SIZE, 67,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap()));

        table.setModel(new javax.swing.table.DefaultTableModel(
                new Object[][] {

                },
                new String[] {
                        "id", "marca", "processador", "hd"
                }) {
            Class[] types = new Class[] {
                    java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean[] {
                    false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types[columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit[columnIndex];
            }
        });
        jScrollPane1.setViewportView(table);

        deleteButton.setFont(new java.awt.Font("Lucida Grande", 0, 8)); // NOI18N
        deleteButton.setText("deletar");
        deleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteButtonActionPerformed(evt);
            }
        });

        editButton.setFont(new java.awt.Font("Lucida Grande", 0, 8)); // NOI18N
        editButton.setText("editar");
        editButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editButtonActionPerformed(evt);
            }
        });

        filterLabel.setText("filtrar por processador:");

        filterComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                filterComboBoxActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout seeComputerPanelLayout = new javax.swing.GroupLayout(seeComputerPanel);
        seeComputerPanel.setLayout(seeComputerPanelLayout);
        seeComputerPanelLayout.setHorizontalGroup(
                seeComputerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(seeComputerPanelLayout.createSequentialGroup()
                                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(seeComputerPanelLayout
                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(seeComputerPanelLayout.createSequentialGroup()
                                                .addComponent(editButton)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED,
                                                        javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(deleteButton))
                                        .addComponent(jScrollPane1)
                                        .addGroup(seeComputerPanelLayout.createSequentialGroup()
                                                .addComponent(filterLabel)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED,
                                                        javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(filterComboBox, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                        191, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(10, 10, 10)))
                                .addContainerGap()));
        seeComputerPanelLayout.setVerticalGroup(
                seeComputerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(seeComputerPanelLayout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(seeComputerPanelLayout
                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(seeComputerPanelLayout.createSequentialGroup()
                                                .addGroup(seeComputerPanelLayout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(filterLabel)
                                                        .addComponent(filterComboBox,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED,
                                                        javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 235,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(seeComputerPanelLayout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(deleteButton,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE, 24,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(editButton,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE, 24,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(18, 18, 18))
                                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))));

        tabbedPane.addTab("See Computer", seeComputerPanel);

        processorLabel1.setText("processador:");

        hdLabel1.setText("hd:");

        saveButton.setText("salvar");
        saveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout insertComputerPanelLayout = new javax.swing.GroupLayout(insertComputerPanel);
        insertComputerPanel.setLayout(insertComputerPanelLayout);
        insertComputerPanelLayout.setHorizontalGroup(
                insertComputerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(insertComputerPanelLayout.createSequentialGroup()
                                .addGap(143, 143, 143)
                                .addComponent(errorLabelInsert, javax.swing.GroupLayout.DEFAULT_SIZE, 339,
                                        Short.MAX_VALUE)
                                .addGap(156, 156, 156))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
                                insertComputerPanelLayout.createSequentialGroup()
                                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(insertComputerPanelLayout
                                                .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(hdLabel1)
                                                .addComponent(processorLabel1)
                                                .addComponent(processorInput, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                        138, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(hdInput, javax.swing.GroupLayout.PREFERRED_SIZE, 138,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGroup(insertComputerPanelLayout.createSequentialGroup()
                                                        .addGap(30, 30, 30)
                                                        .addComponent(saveButton)))
                                        .addGap(242, 242, 242)));
        insertComputerPanelLayout.setVerticalGroup(
                insertComputerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, insertComputerPanelLayout
                                .createSequentialGroup()
                                .addGap(59, 59, 59)
                                .addComponent(processorLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(processorInput, javax.swing.GroupLayout.PREFERRED_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38,
                                        Short.MAX_VALUE)
                                .addComponent(hdLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(hdInput, javax.swing.GroupLayout.PREFERRED_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(saveButton)
                                .addGap(18, 18, 18)
                                .addComponent(errorLabelInsert, javax.swing.GroupLayout.PREFERRED_SIZE, 58,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap()));

        tabbedPane.addTab("Insert Computer", insertComputerPanel);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(tabbedPane, javax.swing.GroupLayout.Alignment.TRAILING));
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(tabbedPane));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public Computer getSelectedComputer() {
        int index = table.getSelectedRow();
        DefaultTableModel md = (DefaultTableModel) table.getModel();

        Computer c = new Computer();
        if (index != -1) {
            c.setId((int) md.getValueAt(index, 0));
            c.setMarca((String) md.getValueAt(index, 1));
            c.setProcessador((String) md.getValueAt(index, 2));
            c.setHd((String) md.getValueAt(index, 3));
        } else {
            c.setId(-1);
            errorLabelSee.setText("Selecione um item parar editar.");
        }
        return c;
    }

    private void deleteButtonActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_deleteButtonActionPerformed
        Computer c = getSelectedComputer();
        if (c.getId() == -1) {
            return;
        }

        executeComputer(c, ComputerDAO.DELETE);
    }// GEN-LAST:event_deleteButtonActionPerformed

    private void saveEditButtonActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_saveEditButtonActionPerformed
        Computer c = getSelectedComputer();
        if (c.getId() == -1) {
            return;
        }

        c.setProcessador(processorEditInput.getText().toString());
        c.setHd(hdEditInput.getText().toString());

        executeComputer(c, ComputerDAO.UPDATE);

        hdEditInput.setText("");
        processorEditInput.setText("");
        idLabel.setText("");
    }// GEN-LAST:event_saveEditButtonActionPerformed

    private void saveButtonActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_saveButtonActionPerformed
        Computer c = new Computer(hdInput.getText().toString(), processorInput.getText().toString());
        executeComputer(c, ComputerDAO.INSERT);
    }// GEN-LAST:event_saveButtonActionPerformed

    private void editButtonActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_editButtonActionPerformed
        Computer c = getSelectedComputer();
        hdEditInput.setText(c.getHd());
        processorEditInput.setText(c.getProcessador());
        idLabel.setText(String.valueOf(c.getId()));
    }// GEN-LAST:event_editButtonActionPerformed

    private void filterComboBoxActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_filterComboBoxActionPerformed
        System.out.println("\n" + new Date().toString());
        String selectedProcessor = filterComboBox.getItemAt(filterComboBox.getSelectedIndex());
        if (selectedProcessor.equals("todos")) {
            loadTable(conn.findAll());
        } else {
            loadTable(conn.findByProcessor(selectedProcessor));
        }
    }// GEN-LAST:event_filterComboBoxActionPerformed

    public void executeComputer(Computer c, byte operation) {
        System.out.println("\n" + new Date().toString());
        HashMap<Byte, String> parseOp = new HashMap<Byte, String>();
        parseOp.put(ComputerDAO.DELETE, "Deletado");
        parseOp.put(ComputerDAO.UPDATE, "Atualizado");
        parseOp.put(ComputerDAO.INSERT, "Inserido");

        System.out.println(parseOp.get(operation) + " computador: [" + c.getId() + ", " + c.getProcessador() + ", "
                + c.getHd() + "]");

        if (operation == ComputerDAO.INSERT) {
            errorLabelInsert.setText(parseOp.get(operation) + " com sucesso!");
        } else {
            errorLabelSee.setText(parseOp.get(operation) + " com sucesso!");
        }

        conn.execute(c, operation);

        ArrayList<Computer> arr = conn.findAll();
        loadTable(arr);
        ArrayList<String> comboBoxArr = conn.findAllProcessors();
        loadComboBox(comboBoxArr);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        // <editor-fold defaultstate="collapsed" desc=" Look and feel setting code
        // (optional) ">
        /*
         * If Nimbus (introduced in Java SE 6) is not available, stay with the default
         * look and feel.
         * For details see
         * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        // </editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton deleteButton;
    private javax.swing.JButton editButton;
    private javax.swing.JLabel errorLabelInsert;
    private javax.swing.JLabel errorLabelSee;
    private javax.swing.JComboBox<String> filterComboBox;
    private javax.swing.JLabel filterLabel;
    private javax.swing.JTextField hdEditInput;
    private javax.swing.JTextField hdInput;
    private javax.swing.JLabel hdLabel;
    private javax.swing.JLabel hdLabel1;
    private javax.swing.JLabel idLabel;
    private javax.swing.JPanel insertComputerPanel;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField processorEditInput;
    private javax.swing.JTextField processorInput;
    private javax.swing.JLabel processorLabel;
    private javax.swing.JLabel processorLabel1;
    private javax.swing.JLabel processorLabel2;
    private javax.swing.JButton saveButton;
    private javax.swing.JButton saveEditButton;
    private javax.swing.JPanel seeComputerPanel;
    private javax.swing.JTabbedPane tabbedPane;
    private javax.swing.JTable table;
    // End of variables declaration//GEN-END:variables
}
