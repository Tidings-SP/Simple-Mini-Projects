
package LibraryManagementSystem;

import java.awt.*;
import javax.swing.*;

/**
 *
 * @author surya
 */
public class Home extends javax.swing.JFrame {

    /**
     * Creates new form Home
     */
    public Home() {
        initComponents();
        closeTab(new JPanel[]{AddBook, Stats, IssueBook, ReturnBook});
    }

   
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        TopBar = new javax.swing.JPanel();
        SidePanel = new javax.swing.JPanel();
        btnNewID = new javax.swing.JPanel();
        indicatorNewID = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        btnAddBook = new javax.swing.JPanel();
        indicatorAddBook = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnStats = new javax.swing.JPanel();
        indicatorStats = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        btnIssueBook = new javax.swing.JPanel();
        indicatorIssueBook = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        btnReturnBook = new javax.swing.JPanel();
        indicatorReturnBook = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLayeredPane1 = new javax.swing.JLayeredPane();
        NewID = new LibraryManagementSystem.NewID();
        AddBook = new LibraryManagementSystem.AddBook();
        IssueBook = new LibraryManagementSystem.IssueBook();
        ReturnBook = new LibraryManagementSystem.ReturnBook();
        Stats = new LibraryManagementSystem.Stats();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        TopBar.setBackground(new java.awt.Color(0, 102, 204));
        TopBar.setForeground(new java.awt.Color(0, 102, 204));

        javax.swing.GroupLayout TopBarLayout = new javax.swing.GroupLayout(TopBar);
        TopBar.setLayout(TopBarLayout);
        TopBarLayout.setHorizontalGroup(
            TopBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 720, Short.MAX_VALUE)
        );
        TopBarLayout.setVerticalGroup(
            TopBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        getContentPane().add(TopBar, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 0, 720, 50));

        SidePanel.setBackground(new java.awt.Color(0, 0, 40));
        SidePanel.setForeground(new java.awt.Color(0, 0, 40));
        SidePanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnNewID.setBackground(new java.awt.Color(27, 27, 79));
        btnNewID.setForeground(new java.awt.Color(27, 27, 79));
        btnNewID.setPreferredSize(new java.awt.Dimension(78, 50));
        btnNewID.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btnNewIDMouseReleased(evt);
            }
        });

        indicatorNewID.setPreferredSize(new java.awt.Dimension(8, 40));

        javax.swing.GroupLayout indicatorNewIDLayout = new javax.swing.GroupLayout(indicatorNewID);
        indicatorNewID.setLayout(indicatorNewIDLayout);
        indicatorNewIDLayout.setHorizontalGroup(
            indicatorNewIDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 8, Short.MAX_VALUE)
        );
        indicatorNewIDLayout.setVerticalGroup(
            indicatorNewIDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jLabel2.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("NewID");

        javax.swing.GroupLayout btnNewIDLayout = new javax.swing.GroupLayout(btnNewID);
        btnNewID.setLayout(btnNewIDLayout);
        btnNewIDLayout.setHorizontalGroup(
            btnNewIDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnNewIDLayout.createSequentialGroup()
                .addComponent(indicatorNewID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addGap(0, 57, Short.MAX_VALUE))
        );
        btnNewIDLayout.setVerticalGroup(
            btnNewIDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(indicatorNewID, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
            .addGroup(btnNewIDLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                .addContainerGap())
        );

        SidePanel.add(btnNewID, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 110, 140, -1));

        btnAddBook.setBackground(new java.awt.Color(0, 0, 40));
        btnAddBook.setForeground(new java.awt.Color(0, 0, 40));
        btnAddBook.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btnAddBookMouseReleased(evt);
            }
        });

        indicatorAddBook.setOpaque(false);
        indicatorAddBook.setPreferredSize(new java.awt.Dimension(8, 40));

        javax.swing.GroupLayout indicatorAddBookLayout = new javax.swing.GroupLayout(indicatorAddBook);
        indicatorAddBook.setLayout(indicatorAddBookLayout);
        indicatorAddBookLayout.setHorizontalGroup(
            indicatorAddBookLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 8, Short.MAX_VALUE)
        );
        indicatorAddBookLayout.setVerticalGroup(
            indicatorAddBookLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jLabel1.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Add Book");

        javax.swing.GroupLayout btnAddBookLayout = new javax.swing.GroupLayout(btnAddBook);
        btnAddBook.setLayout(btnAddBookLayout);
        btnAddBookLayout.setHorizontalGroup(
            btnAddBookLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnAddBookLayout.createSequentialGroup()
                .addComponent(indicatorAddBook, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addGap(0, 32, Short.MAX_VALUE))
        );
        btnAddBookLayout.setVerticalGroup(
            btnAddBookLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(indicatorAddBook, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
            .addGroup(btnAddBookLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                .addContainerGap())
        );

        SidePanel.add(btnAddBook, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 160, 140, 50));

        btnStats.setBackground(new java.awt.Color(0, 0, 40));
        btnStats.setForeground(new java.awt.Color(0, 0, 51));
        btnStats.setPreferredSize(new java.awt.Dimension(78, 50));
        btnStats.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btnStatsMouseReleased(evt);
            }
        });

        indicatorStats.setOpaque(false);
        indicatorStats.setPreferredSize(new java.awt.Dimension(8, 40));

        javax.swing.GroupLayout indicatorStatsLayout = new javax.swing.GroupLayout(indicatorStats);
        indicatorStats.setLayout(indicatorStatsLayout);
        indicatorStatsLayout.setHorizontalGroup(
            indicatorStatsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 8, Short.MAX_VALUE)
        );
        indicatorStatsLayout.setVerticalGroup(
            indicatorStatsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jLabel3.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Stats");

        javax.swing.GroupLayout btnStatsLayout = new javax.swing.GroupLayout(btnStats);
        btnStats.setLayout(btnStatsLayout);
        btnStatsLayout.setHorizontalGroup(
            btnStatsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnStatsLayout.createSequentialGroup()
                .addComponent(indicatorStats, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addGap(0, 73, Short.MAX_VALUE))
        );
        btnStatsLayout.setVerticalGroup(
            btnStatsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(indicatorStats, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
            .addGroup(btnStatsLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                .addContainerGap())
        );

        SidePanel.add(btnStats, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 210, 140, -1));

        btnIssueBook.setBackground(new java.awt.Color(0, 0, 40));
        btnIssueBook.setForeground(new java.awt.Color(0, 0, 51));
        btnIssueBook.setPreferredSize(new java.awt.Dimension(78, 50));
        btnIssueBook.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btnIssueBookMouseReleased(evt);
            }
        });

        indicatorIssueBook.setOpaque(false);
        indicatorIssueBook.setPreferredSize(new java.awt.Dimension(8, 40));

        javax.swing.GroupLayout indicatorIssueBookLayout = new javax.swing.GroupLayout(indicatorIssueBook);
        indicatorIssueBook.setLayout(indicatorIssueBookLayout);
        indicatorIssueBookLayout.setHorizontalGroup(
            indicatorIssueBookLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 8, Short.MAX_VALUE)
        );
        indicatorIssueBookLayout.setVerticalGroup(
            indicatorIssueBookLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jLabel4.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Issue Book");

        javax.swing.GroupLayout btnIssueBookLayout = new javax.swing.GroupLayout(btnIssueBook);
        btnIssueBook.setLayout(btnIssueBookLayout);
        btnIssueBookLayout.setHorizontalGroup(
            btnIssueBookLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnIssueBookLayout.createSequentialGroup()
                .addComponent(indicatorIssueBook, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addGap(0, 24, Short.MAX_VALUE))
        );
        btnIssueBookLayout.setVerticalGroup(
            btnIssueBookLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(indicatorIssueBook, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
            .addGroup(btnIssueBookLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                .addContainerGap())
        );

        SidePanel.add(btnIssueBook, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 260, 140, 50));

        btnReturnBook.setBackground(new java.awt.Color(0, 0, 40));
        btnReturnBook.setForeground(new java.awt.Color(0, 0, 51));
        btnReturnBook.setPreferredSize(new java.awt.Dimension(78, 50));
        btnReturnBook.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btnReturnBookMouseReleased(evt);
            }
        });

        indicatorReturnBook.setOpaque(false);
        indicatorReturnBook.setPreferredSize(new java.awt.Dimension(8, 40));

        javax.swing.GroupLayout indicatorReturnBookLayout = new javax.swing.GroupLayout(indicatorReturnBook);
        indicatorReturnBook.setLayout(indicatorReturnBookLayout);
        indicatorReturnBookLayout.setHorizontalGroup(
            indicatorReturnBookLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 8, Short.MAX_VALUE)
        );
        indicatorReturnBookLayout.setVerticalGroup(
            indicatorReturnBookLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jLabel5.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Return Book");

        javax.swing.GroupLayout btnReturnBookLayout = new javax.swing.GroupLayout(btnReturnBook);
        btnReturnBook.setLayout(btnReturnBookLayout);
        btnReturnBookLayout.setHorizontalGroup(
            btnReturnBookLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnReturnBookLayout.createSequentialGroup()
                .addComponent(indicatorReturnBook, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel5)
                .addGap(0, 11, Short.MAX_VALUE))
        );
        btnReturnBookLayout.setVerticalGroup(
            btnReturnBookLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(indicatorReturnBook, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
            .addGroup(btnReturnBookLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                .addContainerGap())
        );

        SidePanel.add(btnReturnBook, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 310, 140, -1));

        getContentPane().add(SidePanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 140, 460));

        jLayeredPane1.setBackground(new java.awt.Color(255, 255, 255));
        jLayeredPane1.setForeground(new java.awt.Color(255, 255, 255));
        jLayeredPane1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jLayeredPane1.add(NewID, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));
        jLayeredPane1.add(AddBook, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));
        jLayeredPane1.add(IssueBook, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 410));
        jLayeredPane1.add(ReturnBook, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));
        jLayeredPane1.add(Stats, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        getContentPane().add(jLayeredPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 50, 720, 410));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddBookMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAddBookMouseReleased
        setColour(btnAddBook,indicatorAddBook);
        resetColour(new JPanel[]{btnNewID, btnStats, btnIssueBook, btnReturnBook}, new JPanel[]{indicatorNewID, indicatorStats, indicatorIssueBook, indicatorReturnBook});
        
        openTab(AddBook);
        closeTab(new JPanel[]{NewID, Stats, IssueBook, ReturnBook});
    }//GEN-LAST:event_btnAddBookMouseReleased

    private void btnNewIDMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnNewIDMouseReleased
        setColour(btnNewID, indicatorNewID);
        resetColour(new JPanel[]{btnAddBook, btnStats, btnIssueBook, btnReturnBook}, new JPanel[]{indicatorAddBook, indicatorStats, indicatorIssueBook, indicatorReturnBook});
        
        openTab(NewID);
        closeTab(new JPanel[]{AddBook, Stats, IssueBook, ReturnBook});
    }//GEN-LAST:event_btnNewIDMouseReleased

    private void btnStatsMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnStatsMouseReleased
        setColour(btnStats, indicatorStats);
        resetColour(new JPanel[]{btnNewID, btnAddBook, btnIssueBook, btnReturnBook}, new JPanel[]{indicatorNewID, indicatorAddBook, indicatorIssueBook, indicatorReturnBook});
        
        openTab(Stats);
        closeTab(new JPanel[]{NewID, AddBook, IssueBook, ReturnBook});
    }//GEN-LAST:event_btnStatsMouseReleased

    private void btnIssueBookMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnIssueBookMouseReleased
        setColour(btnIssueBook, indicatorIssueBook);
        resetColour(new JPanel[]{btnNewID, btnAddBook, btnStats, btnReturnBook}, new JPanel[]{indicatorNewID, indicatorAddBook, indicatorStats, indicatorReturnBook});
        
        openTab(IssueBook);
        closeTab(new JPanel[]{NewID, AddBook, Stats, ReturnBook});
    }//GEN-LAST:event_btnIssueBookMouseReleased

    private void btnReturnBookMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnReturnBookMouseReleased
        setColour(btnReturnBook, indicatorReturnBook);
        resetColour(new JPanel[]{btnNewID, btnAddBook, btnStats, btnIssueBook}, new JPanel[]{indicatorNewID, indicatorAddBook, indicatorStats, indicatorIssueBook});
        
        openTab(ReturnBook);
        closeTab(new JPanel[]{NewID, AddBook, Stats, IssueBook });
    }//GEN-LAST:event_btnReturnBookMouseReleased

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
                if ("Window".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* CreatebtnAddBooksplay the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Home().setVisible(true);
            }
        });
    }
    
    private void setColour(JPanel panel, JPanel indicator)
    {
        panel.setBackground(new Color(27,27,79));
        indicator.setOpaque(true);
    }

    private void resetColour(JPanel[] panes, JPanel[] indicators)
    {
        for (JPanel panel : panes) {
            panel.setBackground(new Color(0,0,40));
        }
        
        for (JPanel indicator : indicators) {
            indicator.setOpaque(false);
        }
    }
    
    private void openTab(JPanel tab) {
        
        tab.setVisible(true);
        
    }
    
    private void closeTab(JPanel[] tabs) {
        
        for (JPanel tab : tabs) {
            tab.setVisible(false);
        }
    }
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private LibraryManagementSystem.AddBook AddBook;
    private LibraryManagementSystem.IssueBook IssueBook;
    private LibraryManagementSystem.NewID NewID;
    private LibraryManagementSystem.ReturnBook ReturnBook;
    private javax.swing.JPanel SidePanel;
    private LibraryManagementSystem.Stats Stats;
    private javax.swing.JPanel TopBar;
    private javax.swing.JPanel btnAddBook;
    private javax.swing.JPanel btnIssueBook;
    private javax.swing.JPanel btnNewID;
    private javax.swing.JPanel btnReturnBook;
    private javax.swing.JPanel btnStats;
    private javax.swing.JPanel indicatorAddBook;
    private javax.swing.JPanel indicatorIssueBook;
    private javax.swing.JPanel indicatorNewID;
    private javax.swing.JPanel indicatorReturnBook;
    private javax.swing.JPanel indicatorStats;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLayeredPane jLayeredPane1;
    // End of variables declaration//GEN-END:variables
}
