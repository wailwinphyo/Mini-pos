/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.turingtraining.pos.ui;

import com.turingtraining.pos.model.Item;
import com.turingtraining.pos.model.User;
import com.turingtraining.pos.service.ItemService;
import com.turingtraining.pos.service.ItemServiceImpl;
import com.turingtraining.pos.util.SystemUtil;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author wailwinphyo
 */
public class StockReport extends javax.swing.JFrame {

    /**
     * Creates new form StockReport
     */
    ItemService itemService = new ItemServiceImpl();
    
    public StockReport() {
        initComponents();
        loadData();
    }
    
    private void loadData() {
        DefaultTableModel model = (DefaultTableModel) this.jtStock.getModel();
        List<Item> itemList = itemService.getRemainingItemQty();
        itemList.forEach(c -> {
            Object obj[] = {c.getCode(), c.getName(), c.getQuantity()};
            model.addRow(obj);
        });
        this.jtStock.setModel(model);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpStockList = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtStock = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jmiAddNewCashier = new javax.swing.JMenuItem();
        jmiExit = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jmiAddStock = new javax.swing.JMenuItem();
        jmiProduct = new javax.swing.JMenuItem();
        jmiCategory = new javax.swing.JMenuItem();
        jmiStockReport = new javax.swing.JMenu();
        jMenuItem4 = new javax.swing.JMenuItem();
        jmiSaleReport = new javax.swing.JMenuItem();
        jMenuItem7 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Mini POS");

        jtStock.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Product Code", "Product Name", "Quantity"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jtStock);

        jLabel1.setFont(new java.awt.Font("Noto Sans", 1, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Stock Report");

        jButton1.setText("Back to home");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jpStockListLayout = new javax.swing.GroupLayout(jpStockList);
        jpStockList.setLayout(jpStockListLayout);
        jpStockListLayout.setHorizontalGroup(
            jpStockListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 788, Short.MAX_VALUE)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jpStockListLayout.createSequentialGroup()
                .addComponent(jButton1)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jpStockListLayout.setVerticalGroup(
            jpStockListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpStockListLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 307, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addContainerGap())
        );

        jMenu1.setText("File");
        jMenu1.setMargin(new java.awt.Insets(3, 6, 3, 3));

        jmiAddNewCashier.setText("Add User");
        jmiAddNewCashier.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiAddNewCashierActionPerformed(evt);
            }
        });
        jMenu1.add(jmiAddNewCashier);

        jmiExit.setText("Exit");
        jmiExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiExitActionPerformed(evt);
            }
        });
        jMenu1.add(jmiExit);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("System Config");
        jMenu2.setMargin(new java.awt.Insets(3, 6, 3, 3));

        jmiAddStock.setText("Add Stock");
        jmiAddStock.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiAddStockActionPerformed(evt);
            }
        });
        jMenu2.add(jmiAddStock);

        jmiProduct.setText("Product");
        jmiProduct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiProductActionPerformed(evt);
            }
        });
        jMenu2.add(jmiProduct);

        jmiCategory.setText("Category");
        jmiCategory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiCategoryActionPerformed(evt);
            }
        });
        jMenu2.add(jmiCategory);

        jMenuBar1.add(jMenu2);

        jmiStockReport.setText("Reports");

        jMenuItem4.setText("Stock Report");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jmiStockReport.add(jMenuItem4);

        jmiSaleReport.setText("Monthly Report");
        jmiSaleReport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiSaleReportActionPerformed(evt);
            }
        });
        jmiStockReport.add(jmiSaleReport);

        jMenuItem7.setText("Sale Report");
        jMenuItem7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem7ActionPerformed(evt);
            }
        });
        jmiStockReport.add(jMenuItem7);

        jMenuBar1.add(jmiStockReport);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jpStockList, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jpStockList, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        PageSwitcher.returnHome(this);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jmiAddNewCashierActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiAddNewCashierActionPerformed
        User u = SystemUtil.getCurrentUser();
        if ("ROLE_ADMIN".equals(u.getUserType())) {
            PageSwitcher.registerNewCashier(this);
        } else {
            JOptionPane.showMessageDialog(null, "Only admin can add cashier", "UnAuthorized", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jmiAddNewCashierActionPerformed

    private void jmiExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiExitActionPerformed
        this.dispose();
    }//GEN-LAST:event_jmiExitActionPerformed

    private void jmiAddStockActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiAddStockActionPerformed
        new StockPage().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jmiAddStockActionPerformed

    private void jmiProductActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiProductActionPerformed
        PageSwitcher.ItemPage(this);
    }//GEN-LAST:event_jmiProductActionPerformed

    private void jmiCategoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiCategoryActionPerformed
        PageSwitcher.CategoryPage(this);
    }//GEN-LAST:event_jmiCategoryActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        PageSwitcher.showRemainingStock(this);
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jmiSaleReportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiSaleReportActionPerformed
        PageSwitcher.showMonthlySaleReport(this);
    }//GEN-LAST:event_jmiSaleReportActionPerformed

    private void jMenuItem7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem7ActionPerformed
        PageSwitcher.showSaleReport(this);
    }//GEN-LAST:event_jMenuItem7ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(StockReport.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StockReport.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StockReport.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StockReport.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StockReport().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JMenuItem jmiAddNewCashier;
    private javax.swing.JMenuItem jmiAddStock;
    private javax.swing.JMenuItem jmiCategory;
    private javax.swing.JMenuItem jmiExit;
    private javax.swing.JMenuItem jmiProduct;
    private javax.swing.JMenuItem jmiSaleReport;
    private javax.swing.JMenu jmiStockReport;
    private javax.swing.JPanel jpStockList;
    private javax.swing.JTable jtStock;
    // End of variables declaration//GEN-END:variables
}
