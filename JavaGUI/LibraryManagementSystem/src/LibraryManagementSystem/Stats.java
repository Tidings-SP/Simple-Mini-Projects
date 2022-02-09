package LibraryManagementSystem;


import java.sql.*;
import DataBase.ConnectionProvider;
import net.proteanit.sql.DbUtils;


/**
 *
 * @author surya
 */
public class Stats extends javax.swing.JPanel {

    /**
     * Creates new form Stats
     */
    public Stats() {
        initComponents();
    }

 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        InfoBar = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();

        setBackground(new java.awt.Color(0, 102, 204));
        setForeground(new java.awt.Color(0, 102, 204));
        setPreferredSize(new java.awt.Dimension(720, 410));
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });

        InfoBar.setBackground(new java.awt.Color(0, 153, 255));
        InfoBar.setForeground(new java.awt.Color(0, 153, 255));
        InfoBar.setPreferredSize(new java.awt.Dimension(0, 80));

        jLabel5.setBackground(new java.awt.Color(0, 153, 255));
        jLabel5.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 36)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Stats");

        javax.swing.GroupLayout InfoBarLayout = new javax.swing.GroupLayout(InfoBar);
        InfoBar.setLayout(InfoBarLayout);
        InfoBarLayout.setHorizontalGroup(
            InfoBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(InfoBarLayout.createSequentialGroup()
                .addGap(320, 320, 320)
                .addComponent(jLabel5)
                .addContainerGap(321, Short.MAX_VALUE))
        );
        InfoBarLayout.setVerticalGroup(
            InfoBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, InfoBarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 40, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTable1.setBackground(new java.awt.Color(234, 246, 255));
        jTable1.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        jTable1.setForeground(new java.awt.Color(0, 153, 255));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTable1.setGridColor(new java.awt.Color(0, 153, 255));
        jTable1.setSelectionForeground(new java.awt.Color(234, 246, 255));
        jTable1.setShowGrid(true);
        jScrollPane1.setViewportView(jTable1);

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Issue Details");

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Return Details");

        jTable2.setBackground(new java.awt.Color(234, 246, 255));
        jTable2.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        jTable2.setForeground(new java.awt.Color(0, 153, 255));
        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTable2.setGridColor(new java.awt.Color(0, 153, 255));
        jTable2.setSelectionForeground(new java.awt.Color(234, 246, 255));
        jTable2.setShowGrid(false);
        jTable2.setShowHorizontalLines(true);
        jTable2.setShowVerticalLines(true);
        jTable2.setSurrendersFocusOnKeystroke(true);
        jScrollPane2.setViewportView(jTable2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(InfoBar, javax.swing.GroupLayout.DEFAULT_SIZE, 720, Short.MAX_VALUE)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(288, 288, 288))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(284, 284, 284))))
            .addComponent(jScrollPane2)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(InfoBar, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addGap(26, 26, 26)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(40, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        try {
            
            Connection con = ConnectionProvider.getCon();
            Statement st = con.createStatement();
            
            ResultSet rs = st.executeQuery("select issue.membershipID, student.name, issue.bookID, book.name, issue.issueDate, issue.dueDate from student inner join book inner join issue where book.bookID = issue.bookID and student.membershipID = issue.membershipID and issue.returnBook = 'NO'");
            jTable1.setModel(DbUtils.resultSetToTableModel(rs));
            
            ResultSet rs1 = st.executeQuery("select issue.membershipID, student.name, issue.bookID, book.name, issue.issueDate, issue.dueDate from student inner join book inner join issue where book.bookID = issue.bookID and student.membershipID = issue.membershipID and issue.returnBook = 'YES'");
            jTable2.setModel(DbUtils.resultSetToTableModel(rs1));
            
        } catch(Exception e) {
            
            
        }
    }//GEN-LAST:event_formComponentShown

   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel InfoBar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    // End of variables declaration//GEN-END:variables
}
