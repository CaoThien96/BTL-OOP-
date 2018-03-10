/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GiaoDien;

import Model.CauHoi;
import Model.CauHoiTL;
import Model.CauHoiTN;
import Model.DapAnTN;
import ModelMonHoc.MonHoc;
import ThaoTac.LayDuLieu;
import ThaoTac.LuuDanhSachMonHocRaNgoai;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Random;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.application.Platform;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.tools.FileObject;

/**
 *
 * @author CaoThienHUST
 */
public class GiaoDienSoanCauHoi extends javax.swing.JFrame {

    /**
     * Creates new form GiaoDienSoanCauHoi
     */
    //Lấy dữ liệu danh sách các môn học
    private LayDuLieu duLieu;
    
    //Khai báo đánh dấu cho môn học đã chọn ở giao diện chọn môn học
    private int indexMonHoc;
    //Tạo dữ liệu và tiêu đề bảng
    private Vector tableRecords = new Vector();
    private Vector tableTitle = new Vector();
    //Lưu lại số thứ tự đáp án khỏi tạo mặc định 
    private int stt = 3;
    //Lưu lại int của tên đáp án thứ 4 là D
    private int indexChar = 68;
    //Lưu lai kí char(D)câu hỏi vừa thêm

    public GiaoDienSoanCauHoi(int indexMonHoc) {
        this.setLocation(250, 250);
        initComponents();
        this.indexMonHoc = indexMonHoc;
        duLieu = new LayDuLieu();
        //Tạo bảng mặc định ban đầu cho giao diện
        tableTitle.add("STT");
        tableTitle.add("Đáp Án");
        tableTitle.add("Nội dung");
        tableTitle.add("Đúng or Sai");
        Vector v1 = new Vector();
        v1.add(0);
        v1.add("A:");
        v1.add("");
        v1.add(false);
        tableRecords.add(v1);
        Vector v2 = new Vector();
        v2.add(1);
        v2.add("B:");
        v2.add("");
        v2.add(false);
        tableRecords.add(v2);
        Vector v3 = new Vector();
        v3.add(2);
        v3.add("C:");
        v3.add("");
        v3.add(false);
        tableRecords.add(v3);
        Vector v4 = new Vector();
        v4.add(3);
        v4.add("D:");
        v4.add("");
        v4.add(false);
        tableRecords.add(v4);
        //Cập nhật dữ liệu cho table
        jTableDapAn.setModel(new DefaultTableModel(tableRecords, tableTitle));
//      Sét thông tin môn học
        jLabelTenMonHoc.setText("Môn: "+duLieu.getDanhSachMonHoc().get(indexMonHoc).getTenMonHoc());
        jLabelSoCauHoi.setText("Số câu hỏi: "+duLieu.getDanhSachMonHoc().get(indexMonHoc).getArrCauHoi().size());
        //Đổ dữ liệu ds câu hỏi môn học vào jList
        jListCauHoi.setListData(duLieu.toArrayString(indexMonHoc));  
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroupLoaiCauHoi = new javax.swing.ButtonGroup();
        jLabelTenMonHoc = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jListCauHoi = new javax.swing.JList<>();
        jLabel2 = new javax.swing.JLabel();
        jRadioButtonTracNghiem = new javax.swing.JRadioButton();
        jRadioButtonTuLuan = new javax.swing.JRadioButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextAreaDeBai = new javax.swing.JTextArea();
        jLabel3 = new javax.swing.JLabel();
        TenMonHoc = new javax.swing.JLabel();
        jButtonLuu = new javax.swing.JButton();
        jButtonHuy = new javax.swing.JButton();
        jComboBoxDoKho = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jComboBoxChuong = new javax.swing.JComboBox<>();
        jScrollPane7 = new javax.swing.JScrollPane();
        jTextAreaGoiY = new javax.swing.JTextArea();
        jLabel6 = new javax.swing.JLabel();
        jButtonThemDapAn = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTableDapAn = new javax.swing.JTable(){
            @Override
            public boolean isCellEditable(int rowIndex,int columnIndex){
                if(columnIndex<2)
                return false;
                else
                return true;
            }
            @Override
            public Class getColumnClass(int column) {
                switch (column) {
                    case 0:
                    return String.class;
                    case 1:
                    return String.class;
                    case 2:
                    return String.class;
                    case 3:
                    return Boolean.class;
                    default:
                    return String.class;
                }
            }
        };
        btnDaoDapAn = new javax.swing.JButton();
        jLabelSoCauHoi = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabelTenMonHoc.setText("Thông tin");

        jScrollPane1.setViewportView(jListCauHoi);

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel2.setText("Soạn câu hỏi:");

        buttonGroupLoaiCauHoi.add(jRadioButtonTracNghiem);
        jRadioButtonTracNghiem.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jRadioButtonTracNghiem.setText("Trắc Nghiệm");
        jRadioButtonTracNghiem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonTracNghiemActionPerformed(evt);
            }
        });

        buttonGroupLoaiCauHoi.add(jRadioButtonTuLuan);
        jRadioButtonTuLuan.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jRadioButtonTuLuan.setText("Tự Luận");

        jTextAreaDeBai.setColumns(20);
        jTextAreaDeBai.setRows(5);
        jScrollPane2.setViewportView(jTextAreaDeBai);

        jLabel3.setText("Đề bài:");

        jButtonLuu.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButtonLuu.setText("Lưu");
        jButtonLuu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLuuActionPerformed(evt);
            }
        });

        jButtonHuy.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButtonHuy.setText("Hủy");
        jButtonHuy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonHuyActionPerformed(evt);
            }
        });

        jComboBoxDoKho.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jComboBoxDoKho.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Trung Bình", "Khá ", "Giỏi" }));

        jLabel4.setText("Độ khó:");

        jLabel5.setText("Chương:");

        jComboBoxChuong.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jComboBoxChuong.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Chương 1", "Chương 2", "Chương 3", "Chương 4" }));

        jTextAreaGoiY.setColumns(20);
        jTextAreaGoiY.setRows(5);
        jScrollPane7.setViewportView(jTextAreaGoiY);

        jLabel6.setText("Gợi ý:");

        jButtonThemDapAn.setFont(new java.awt.Font("Times New Roman", 1, 10)); // NOI18N
        jButtonThemDapAn.setForeground(new java.awt.Color(204, 0, 0));
        jButtonThemDapAn.setText("Thêm đáp án");
        jButtonThemDapAn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonThemDapAnActionPerformed(evt);
            }
        });

        jTableDapAn.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jTableDapAn.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Title 1", "Title 2"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane4.setViewportView(jTableDapAn);

        btnDaoDapAn.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        btnDaoDapAn.setText("Đảo đáp án");
        btnDaoDapAn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDaoDapAnActionPerformed(evt);
            }
        });

        jLabelSoCauHoi.setText("Số câu hỏi:");

        jLabel1.setText("Chọn kiểu câu hỏi:");

        jButton1.setFont(new java.awt.Font("Times New Roman", 1, 10)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 0, 0));
        jButton1.setText("Xóa đáp án");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabelSoCauHoi)
                        .addGap(157, 157, 157)
                        .addComponent(TenMonHoc, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabelTenMonHoc)
                        .addGap(418, 418, 418)
                        .addComponent(jLabel2)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 432, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jRadioButtonTracNghiem)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioButtonTuLuan)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jButtonLuu)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButtonHuy))
                            .addComponent(jScrollPane2)
                            .addComponent(jScrollPane7)
                            .addComponent(jScrollPane4)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jButtonThemDapAn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnDaoDapAn)
                                .addGap(29, 29, 29)
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jComboBoxChuong, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jComboBoxDoKho, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelTenMonHoc, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelSoCauHoi)
                    .addComponent(TenMonHoc, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jRadioButtonTracNghiem)
                            .addComponent(jRadioButtonTuLuan)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(54, 54, 54)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(1, 1, 1)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButtonThemDapAn, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnDaoDapAn)
                            .addComponent(jComboBoxChuong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5)
                            .addComponent(jComboBoxDoKho, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(41, 41, 41)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButtonLuu)
                            .addComponent(jButtonHuy)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 332, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jRadioButtonTracNghiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonTracNghiemActionPerformed
        // TODO add your handling code here
    }//GEN-LAST:event_jRadioButtonTracNghiemActionPerformed

    private void jButtonLuuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLuuActionPerformed
        // TODO add your handling code here:
        if ((jRadioButtonTracNghiem.isSelected() || jRadioButtonTuLuan.isSelected()) && (!(jTextAreaDeBai.getText().isEmpty()))) {
            if (jRadioButtonTuLuan.isSelected()) {

                if (jTextAreaGoiY.getText().isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Bạn chưa nhập gợi ý đáp án cho câu hỏi tự luận");
                } else {
                    CauHoiTL ch = new CauHoiTL(jTextAreaGoiY.getText(), jTextAreaDeBai.getText(), jComboBoxDoKho.getSelectedIndex() + 1, jComboBoxChuong.getSelectedIndex() + 1);

                    duLieu.getDanhSachMonHoc().get(indexMonHoc).getArrCauHoi().add(ch);
                    jListCauHoi.setListData(toStringlistCauHoi(duLieu.getDanhSachMonHoc().get(indexMonHoc).getArrCauHoi()));
                    LuuDanhSachMonHocRaNgoai t = new LuuDanhSachMonHocRaNgoai(duLieu.getDanhSachMonHoc());
                    JOptionPane.showMessageDialog(null, "Lưu câu hỏi thành công");
                    jLabelSoCauHoi.setText("Số câu hỏi: "+duLieu.getDanhSachMonHoc().get(indexMonHoc).getArrCauHoi().size());
                }
            } else if (jRadioButtonTracNghiem.isSelected()) {
                boolean kiemTraNoiDung=true;
                boolean kiemTraSetDungSai=false;
                int i=1;
                for(Object item:tableRecords){
                    Vector row=(Vector) item;
                    if(row.get(2)==null){
                        kiemTraNoiDung=false;
                    }
                    boolean kt=(boolean) row.get(3);
                    if(kt&&(i==1)){
                        kiemTraSetDungSai=true;
                        i=2;
                    }
                    
                }
                if(!kiemTraNoiDung||!kiemTraSetDungSai){
                    JOptionPane.showMessageDialog(null, "Kiểm tra lại bạn đã điền nội dung đáp án hay chọn đáp án đúng chưa!!");
                }else {
                    ArrayList<DapAnTN> dsDapAn = new ArrayList<>();
                
                for (Object item : tableRecords) {
                    Vector da = (Vector) item;
                    DapAnTN dATN = new DapAnTN(da.get(1).toString() + da.get(2).toString());
                    dATN.setIsTrue((boolean) da.get(3));
                    dsDapAn.add(dATN);
                }
                CauHoiTN ch = new CauHoiTN(dsDapAn, jTextAreaDeBai.getText(), jComboBoxDoKho.getSelectedIndex() + 1, jComboBoxChuong.getSelectedIndex() + 1);

                duLieu.getDanhSachMonHoc().get(indexMonHoc).getArrCauHoi().add(ch);
                jListCauHoi.setListData(toStringlistCauHoi(duLieu.getDanhSachMonHoc().get(indexMonHoc).getArrCauHoi()));
                jLabelSoCauHoi.setText("Số câu hỏi: "+duLieu.getDanhSachMonHoc().get(indexMonHoc).getArrCauHoi().size());
                JOptionPane.showMessageDialog(null, "Lưu câu hỏi thành công");
                LuuDanhSachMonHocRaNgoai t = new LuuDanhSachMonHocRaNgoai(duLieu.getDanhSachMonHoc());
                    
                }
                
            }

        } else {
            if (!(jRadioButtonTracNghiem.isSelected() || jRadioButtonTuLuan.isSelected())) {
                JOptionPane.showMessageDialog(null, "Bạn chưa chọn kiểu câu hỏi");
            }
            if (jTextAreaDeBai.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Bạn chưa nhập đề bài");
            }
        }
//        dsCauHoi.clear();
//        jListCauHoi.setListData(toStringlistCauHoi(dsCauHoi));

    }//GEN-LAST:event_jButtonLuuActionPerformed

    private void jButtonHuyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonHuyActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jButtonHuyActionPerformed

    private void jButtonThemDapAnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonThemDapAnActionPerformed
        // TODO add your handling code here:
        stt++;
        //Tạo vector chưa dữ liệu hàng mới
        Vector data = new Vector();
        //Thêm STT
        data.add(stt);
        indexChar++;
        //Lấy tên đáp án tiếp theo(D thì tiếp theo là E)
        char tenDA = (char) indexChar;
        //Thêm tên đáp án
        data.add(tenDA + ":");
        //Thêm nội dung đáp án là rỗng
        data.add("");
        data.add(false);
        //Thêm dòng vào ds các dòng bảng
        tableRecords.add(data);
        //Cập nhất lại bảng 
        //jTableDapAn.notify();
        jTableDapAn.setModel(new DefaultTableModel(tableRecords, tableTitle));
    }//GEN-LAST:event_jButtonThemDapAnActionPerformed

    private void btnDaoDapAnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDaoDapAnActionPerformed
        // TODO add your handling code here:
        Vector copyTableRecords = new Vector();
        copyTableRecords.addAll(tableRecords);
        String[] noiDungDapAn = new String[tableRecords.size()];
        Boolean[] dapAnDung = new Boolean[tableRecords.size()];
        int n = 0;
        for (Object item : tableRecords) {
            Vector vector_data = (Vector) item;
            dapAnDung[n] = (Boolean) vector_data.get(3);
            noiDungDapAn[n] = vector_data.get(2).toString();
            n++;
        }

        Random rd = new Random();

        Boolean isTrue = true;
        Vector<Integer> vector = new Vector<>();
        for (int i = 0; i < copyTableRecords.size(); i++) {
            while (isTrue) {
                int inew = rd.nextInt(copyTableRecords.size());
                if (!vector.contains(inew)) {
                    vector.add(inew);
                    Vector data = (Vector) tableRecords.get(i);
                    data.setElementAt(dapAnDung[inew], 3);
                    data.setElementAt(noiDungDapAn[inew], 2);
//                    data.add(noiDungDapAn[inew]);
//                    data.add(dapAnDung[inew]);

                    isTrue = false;
                }
            }
            isTrue = true;
        }
        jTableDapAn.setModel(new DefaultTableModel(tableRecords, tableTitle));
    }//GEN-LAST:event_btnDaoDapAnActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        for(Object row:tableRecords){
            Vector data=(Vector) row;
            data.setElementAt(false, 3);
            data.setElementAt("", 2);
        }
        jTableDapAn.setModel(new DefaultTableModel(tableRecords, tableTitle));
    }//GEN-LAST:event_jButton1ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel TenMonHoc;
    private javax.swing.JButton btnDaoDapAn;
    private javax.swing.ButtonGroup buttonGroupLoaiCauHoi;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButtonHuy;
    private javax.swing.JButton jButtonLuu;
    private javax.swing.JButton jButtonThemDapAn;
    private javax.swing.JComboBox<String> jComboBoxChuong;
    private javax.swing.JComboBox<String> jComboBoxDoKho;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabelSoCauHoi;
    private javax.swing.JLabel jLabelTenMonHoc;
    private javax.swing.JList<String> jListCauHoi;
    private javax.swing.JRadioButton jRadioButtonTracNghiem;
    private javax.swing.JRadioButton jRadioButtonTuLuan;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JTable jTableDapAn;
    private javax.swing.JTextArea jTextAreaDeBai;
    private javax.swing.JTextArea jTextAreaGoiY;
    // End of variables declaration//GEN-END:variables
    private String[] toStringlistCauHoi(ArrayList<CauHoi> dsCauHoi1) {
        String[] listCauHoi = new String[dsCauHoi1.size()];
        for (int i = 0; i < dsCauHoi1.size(); i++) {
            listCauHoi[i] = "Cau " + (i + 1) + ":" + dsCauHoi1.get(i).inCauHoi();
        }
        return listCauHoi;
    }
}
