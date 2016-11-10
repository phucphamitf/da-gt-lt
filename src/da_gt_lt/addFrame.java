/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package da_gt_lt;

import java.awt.Color;
import java.awt.Font;
import java.text.SimpleDateFormat;
import java.awt.font.*;
import javax.swing.JOptionPane;

/**
 *
 * @author pdkpro
 */
public class addFrame extends javax.swing.JFrame {

    hangHoa hh;
    String loi = "";
    giaoDien gd;
    boolean fgRepai = false;

    public addFrame(giaoDien gd) {
        this.gd = gd;
        initComponents();
        this.viTri.setText(constants.file_data.size() + "");
        setVisible(true);
        setLocationRelativeTo(null);
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        saveButton = new javax.swing.JButton();
        exitButton = new javax.swing.JButton();
        ma = new javax.swing.JTextField();
        ten = new javax.swing.JTextField();
        donViTinh = new javax.swing.JTextField();
        ngayNhap = new javax.swing.JTextField();
        soLuong = new javax.swing.JTextField();
        donGia = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        baoLoi = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        viTri = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Edwardian Script ITC", 1, 30)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 102, 255));
        jLabel1.setText("Commodity Edit");

        saveButton.setText("SAVE");
        saveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveButtonActionPerformed(evt);
            }
        });

        exitButton.setText("EXIT");
        exitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitButtonActionPerformed(evt);
            }
        });

        ma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                maActionPerformed(evt);
            }
        });

        ten.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tenActionPerformed(evt);
            }
        });

        donViTinh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                donViTinhActionPerformed(evt);
            }
        });

        ngayNhap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ngayNhapActionPerformed(evt);
            }
        });

        soLuong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                soLuongActionPerformed(evt);
            }
        });

        donGia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                donGiaActionPerformed(evt);
            }
        });

        jLabel2.setText("MÃ");

        jLabel3.setText("TÊN");

        jLabel4.setText("ĐƠN  VI TÍNH");

        jLabel5.setText("NGÀY NHẬP");

        jLabel6.setText("SỐ LƯỢNG");

        jLabel8.setText("ĐƠN GIÁ");

        jLabel7.setText("Vị Trí:");

        viTri.setText("0");
        viTri.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viTriActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(ma, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ten, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(donViTinh, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ngayNhap, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(soLuong, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(39, 39, 39)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel3)
                                .addGap(60, 60, 60)
                                .addComponent(jLabel4)
                                .addGap(30, 30, 30)
                                .addComponent(jLabel5)
                                .addGap(39, 39, 39)
                                .addComponent(jLabel6)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(donGia, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE)
                                .addGap(54, 54, 54)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(exitButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(saveButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(87, 87, 87)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(56, 56, 56)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(viTri, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(baoLoi)
                        .addGap(39, 39, 39)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(baoLoi)
                    .addComponent(jLabel7)
                    .addComponent(viTri, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(jLabel6))
                        .addGap(17, 17, 17))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(9, 9, 9)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(1, 1, 1)
                            .addComponent(donGia, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE))
                        .addComponent(donViTinh, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE)
                        .addComponent(soLuong, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE)
                        .addComponent(ngayNhap, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ten, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ma, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(42, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(saveButton, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(exitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void checkRepai(boolean fg, hangHoa hh) {
        try {
            this.fgRepai = fg;
            int viTri = constants.file_data.size();
            this.viTri.setEnabled(true);
            if (hh != null) {
                for (int i = 0; i < constants.file_data.size(); i++) {
                    hangHoa hh2 = constants.file_data.get(i);
                    if (hh2.getMa().equals(hh.getMa())) {
                        viTri = i;
                        break;
                    }
                }
            }
            this.viTri.setText(viTri + "");
            if (fg) {
                this.ma.setText(hh.getMa());
                this.ten.setText(hh.getTen());
                this.donViTinh.setText(hh.getdonViTinh());
                SimpleDateFormat fm = new SimpleDateFormat("dd/MM/yyyy");
                this.ngayNhap.setText(fm.format(hh.ngayNhap));
                this.soLuong.setText(hh.getSo_luong() + "");
                this.donGia.setText(hh.getGia() + "");
                this.viTri.setEnabled(!fg);
            }
        } catch (Exception e) {
        }
    }
    private void maActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_maActionPerformed
        String ma;
        boolean fg = true;
        try {
            if (this.ma.getText().equals("")) {
                this.loi = "erro ma";
                fg = false;
            } else {
                if (!this.ma.getText().subSequence(0, 2).equals("mh")) {
                    this.loi = "erro loi ma ==> (mhxy)-> xy la so";
                    fg = false;
                }

                ma = this.ma.getText().substring(2);
                for (int i = 0; i < ma.length(); i++) {
                    if (Character.isLetter(ma.charAt(i))) {
                        this.loi = "loi ma ==>(mhxy) -> xy la so";
                        break;
                    }
                }
            }
            if (fg) {
                this.hh.setMa(this.ma.getText());
            }
        } catch (Exception e) {
        }
    }//GEN-LAST:event_maActionPerformed

    private void tenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tenActionPerformed
        try {
            if (this.ten.getText().equals("")) {
                this.loi = "erro ten";
            } else {
                //this.loi = "ok";
                this.hh.setTen(this.ten.getText());
            }
        } catch (Exception e) {
        }

    }//GEN-LAST:event_tenActionPerformed

    private void donViTinhActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_donViTinhActionPerformed
        try {
            if (this.donViTinh.getText().equals("")) {
                this.loi = "erro don vi tinh";
            } else {
                //this.loi = "ok";
                this.hh.setdonViTinh(this.donViTinh.getText());
            }
        } catch (Exception e) {
        }
    }//GEN-LAST:event_donViTinhActionPerformed

    private void ngayNhapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ngayNhapActionPerformed
        String ngayNhap = this.ngayNhap.getText();
        String data[] = ngayNhap.split("/");
        int ngay = 0, thang = 0, nam = 0;
        try {
            for (String s : data) {
                ngay = Integer.parseInt(data[0]);
                thang = Integer.parseInt(data[1]);
                nam = Integer.parseInt(data[2]);
            }
            if ((ngay > 31) && ngay < 1) {
                this.loi = "erro ngay";
                //this.baoLoi.setText("erro ngay");
            }
            if (thang > 12 || thang < 1) {
                //this.baoLoi.setText("erro  thang");
                this.loi = "erro  thang";
            }
            if (nam > 2015) {
                this.loi = "erro nam";
                //this.baoLoi.setText("erro nam");
            } else {
                //this.baoLoi.setText("ok");
                // this.loi = "ok";
                SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
                hh.setNgayNhap(format.parse(ngayNhap));
            }
        } catch (Exception e) {
            this.loi = "erro dinh dang ngay thang nam (dd/mm/yy)!!!";
            //this.baoLoi.setText("erro dinh dang ngay thang nam (dd/mm/yy)!!!");
        }
    }//GEN-LAST:event_ngayNhapActionPerformed

    private void soLuongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_soLuongActionPerformed
        String data = this.soLuong.getText();
        boolean fg = true;
        try {
            for (int i = 0; i < data.length(); i++) {
                if (Character.isLetter(data.charAt(i))) {
                    this.loi = "erro at soluong !!!";
                    fg = false;
                    break;
                }
            }
            if (fg) {
                this.hh.setSo_luong(Integer.parseInt(this.soLuong.getText()));
            }
        } catch (Exception e) {
            this.loi = "erro so luong !!!";
        }
    }//GEN-LAST:event_soLuongActionPerformed

    private void donGiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_donGiaActionPerformed
        String data = this.donGia.getText();
        boolean fg = true;
        try {
            for (int i = 0; i < data.length(); i++) {
                if (Character.isLetter(data.charAt(i))) {
                    this.loi = "erro gia !!!";
                    //this.baoLoi.setText("erro at soluong !!!");
                    fg = false;
                    break;
                }
            }
            if (fg) {
                this.hh.setGia(Integer.parseInt(this.donGia.getText()));
                //this.baoLoi.setText("ok");
                //this.loi = "ok";
            }
        } catch (Exception e) {
            this.loi = "erro  gia !!!";
        }
    }//GEN-LAST:event_donGiaActionPerformed

    private void saveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveButtonActionPerformed
        this.hh = new hangHoa();
        maActionPerformed(evt);
        tenActionPerformed(evt);
        donViTinhActionPerformed(evt);
        ngayNhapActionPerformed(evt);
        soLuongActionPerformed(evt);
        donGiaActionPerformed(evt);
        viTriActionPerformed(evt);
        this.baoLoi.setForeground(Color.RED);
        this.baoLoi.setFont(new Font("arial", Font.BOLD, 14));
        if (this.loi.equals("")) {
            this.loi = "ok";
            this.baoLoi.setText("ok");
            if (this.fgRepai) {
                constants.file_data.set(Integer.parseInt(this.viTri.getText()), hh);
                gd.repai(evt);
                this.dispose();
            } else {
                this.baoLoi.setText("ok");
                this.gd.them(this.hh, Integer.parseInt(this.viTri.getText()));
                //sau kihi them thi set tat ca cac  gitri ve null
                this.show();
            }
            setTextNull();
        } else {
            this.baoLoi.setText((this.loi));//sau khi thong bao loi thi cho this.loi lai = "" de tiep tuc tim loi
            this.loi = "";
        }
    }//GEN-LAST:event_saveButtonActionPerformed
    public void setTextNull() {
        this.ma.setText("");
        this.ten.setText("");
        this.donViTinh.setText("");
        this.soLuong.setText("");
        this.ngayNhap.setText("");
        this.donGia.setText("");
        this.viTri.setText(""+constants.file_data.size());
        this.loi = "";
        this.baoLoi.setText("");
    }
    private void exitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitButtonActionPerformed

        int choce = JOptionPane.showConfirmDialog(null, "Bạn có chắc không?", "exit",
                JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        if (choce == 0) {
            setTextNull();
            this.dispose();
        }
    }//GEN-LAST:event_exitButtonActionPerformed

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed

    }//GEN-LAST:event_formWindowClosed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        int choce = JOptionPane.showConfirmDialog(null, "Bạn có chắc không?", "exit",
                JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        if (choce == 0) {
            setTextNull();
            this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        } else {
            setTextNull();
            this.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
        }
    }//GEN-LAST:event_formWindowClosing

    private void viTriActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viTriActionPerformed
        try {
            int i = Integer.parseInt(this.viTri.getText());
            if (i > constants.file_data.size() + 1 || i < 0) {
                this.loi = "sai vị trí";
            }
        } catch (Exception e) {
            this.loi = "sai vị trí";
        }
    }//GEN-LAST:event_viTriActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel baoLoi;
    private javax.swing.JTextField donGia;
    private javax.swing.JTextField donViTinh;
    private javax.swing.JButton exitButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JTextField ma;
    private javax.swing.JTextField ngayNhap;
    private javax.swing.JButton saveButton;
    private javax.swing.JTextField soLuong;
    private javax.swing.JTextField ten;
    private javax.swing.JTextField viTri;
    // End of variables declaration//GEN-END:variables
}
