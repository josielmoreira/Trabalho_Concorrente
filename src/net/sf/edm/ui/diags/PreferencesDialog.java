/*
 * PreferencesDialog.java
 *
 * Created on September 16, 2008, 7:47 AM
 */
package net.sf.edm.ui.diags;

import net.sf.edm.ui.*;
import java.awt.Toolkit;
import java.util.Vector;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.UIManager;

/**
 *
 * @author  usien
 */
public class PreferencesDialog extends javax.swing.JDialog {

    /** Creates new form PreferencesDialog */
    public PreferencesDialog(java.awt.Frame parent) {
        super(parent, true);
        laf = PreferencesManager.getLaf();
        saveTo = PreferencesManager.getDownloadDirectory();
        rtrs = PreferencesManager.getRetries();
        initComponents();
        fillPreferences();
    }

    private void fillPreferences() {
        /*LookAndFeelInfo[] infos = UIManager..getInstalledLookAndFeels();
        
        for (int idx = 0; idx < infos.length; idx++) {
        lafs.put(infos[idx].getName(), infos[idx]);
        }
        
        lafFld.setModel(new DefaultComboBoxModel(new Vector(lafs.keySet())));
        
        for (LookAndFeelInfo info : infos) {
        if (info.getClassName().equals(PreferencesManager.getLaf())) {
        lafFld.setSelectedItem(lafs.get(info.getName()));
        }
        }*/

        lafFld.setModel(new DefaultComboBoxModel(new Vector(PreferencesManager.lafMap.keySet())));
        lafFld.setSelectedItem(UIManager.getLookAndFeel().getName());
        locFld.setText(saveTo);
        rtrsFld.setValue(Integer.parseInt(rtrs));
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lafFld = new javax.swing.JComboBox();
        jLabel3 = new javax.swing.JLabel();
        locFld = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        rtrsFld = new javax.swing.JSpinner();
        jButton1 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Preferences");
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/net/sf/edm/ui/icons/configure1.png")));

        jPanel1.setLayout(new java.awt.GridBagLayout());

        jLabel1.setFont(jLabel1.getFont().deriveFont(jLabel1.getFont().getStyle() | java.awt.Font.BOLD));
        jLabel1.setText("Appearance");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 5, 10);
        jPanel1.add(jLabel1, gridBagConstraints);

        jLabel2.setFont(jLabel2.getFont().deriveFont(jLabel2.getFont().getStyle() & ~java.awt.Font.BOLD));
        jLabel2.setText("Look and Feel:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 10, 5, 5);
        jPanel1.add(jLabel2, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = java.awt.GridBagConstraints.REMAINDER;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 10);
        jPanel1.add(lafFld, gridBagConstraints);

        jLabel3.setFont(jLabel3.getFont().deriveFont(jLabel3.getFont().getStyle() & ~java.awt.Font.BOLD));
        jLabel3.setText("Default Download Location:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 10, 5, 5);
        jPanel1.add(jLabel3, gridBagConstraints);

        locFld.setEditable(false);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        jPanel1.add(locFld, gridBagConstraints);

        jLabel5.setFont(jLabel5.getFont().deriveFont(jLabel5.getFont().getStyle() | java.awt.Font.BOLD));
        jLabel5.setText("Download Options");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(15, 10, 5, 10);
        jPanel1.add(jLabel5, gridBagConstraints);

        jLabel6.setFont(jLabel6.getFont().deriveFont(jLabel6.getFont().getStyle() & ~java.awt.Font.BOLD));
        jLabel6.setText("Retries(in case of error):");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(7, 10, 5, 5);
        jPanel1.add(jLabel6, gridBagConstraints);

        rtrsFld.setModel(new javax.swing.SpinnerNumberModel(0, 0, 20, 1));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(7, 5, 5, 5);
        jPanel1.add(rtrsFld, gridBagConstraints);

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/net/sf/edm/ui/icons/fileopen.png"))); // NOI18N
        jButton1.setToolTipText("Browse");
        jButton1.setMargin(new java.awt.Insets(2, 4, 2, 4));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.insets = new java.awt.Insets(0, 5, 0, 10);
        jPanel1.add(jButton1, gridBagConstraints);

        getContentPane().add(jPanel1, java.awt.BorderLayout.NORTH);

        jButton2.setText("Apply");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton2);

        jButton3.setText("Cancel");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton3);

        getContentPane().add(jPanel2, java.awt.BorderLayout.SOUTH);

        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width-539)/2, (screenSize.height-284)/2, 539, 284);
    }// </editor-fold>//GEN-END:initComponents

private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
    dispose();
}//GEN-LAST:event_jButton3ActionPerformed

private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
    JFileChooser chsr = new JFileChooser(locFld.getText());
    chsr.setAcceptAllFileFilterUsed(false);
    chsr.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
    chsr.setFileFilter(PreferencesManager.dirFltr);
    int rc = chsr.showOpenDialog(this);

    if (rc == JFileChooser.APPROVE_OPTION) {
        locFld.setText(chsr.getSelectedFile().getPath());
    }
}//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        boolean save = false;

        if (!laf.equals(lafFld.getSelectedItem())) {
            PreferencesManager.setLaf((String) lafFld.getSelectedItem());
            save = true;
            JOptionPane.showMessageDialog(this, "You need to restart EDM for Look And Feel changes to take place.");

        }

        if (!saveTo.equals(locFld.getText())) {
            PreferencesManager.setDownloadDirectory(locFld.getText());
            save = true;
        }

        if (!rtrs.equals(String.valueOf(rtrsFld.getValue()))) {
            PreferencesManager.setRetries(String.valueOf(rtrsFld.getValue()));
            save = true;
        }

        if (save) {
            PreferencesManager.savePreferences();
        }

        dispose();
    }//GEN-LAST:event_jButton2ActionPerformed
    private String laf;
    private String saveTo;
    private String rtrs;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JComboBox lafFld;
    private javax.swing.JTextField locFld;
    private javax.swing.JSpinner rtrsFld;
    // End of variables declaration//GEN-END:variables
}