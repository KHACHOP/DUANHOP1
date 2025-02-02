/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package VIEW;

import app.dto.HoaDonDTO;
import MODEL.NhanVien;
import SEVIC.HoaDonService;
import SEVIC.NhanVienService;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import org.mindrot.jbcrypt.BCrypt;
import utils.Constant;

/**
 *
 * @author admin
 */
public class NhanVienMainPanel extends javax.swing.JPanel {

    private NhanVienService nvs = new NhanVienService();
    private DefaultTableModel model = new DefaultTableModel();
    private DefaultTableModel modelNhanVien = new DefaultTableModel();
    private HoaDonService hoaDonService = new HoaDonService();

    private int index = -1;

    public NhanVienMainPanel() {
        initComponents();
        cboChucVu.removeAllItems();
        cboChucVu.addItem("Quản lý");
        cboChucVu.addItem("Nhân viên");
        cboTrangThai.addItem("Đang làm việc");
        cboTrangThai.addItem("Đã nghỉ việc");

        this.fillTable(nvs.getAll());
        this.fillTableHoaDonNhanVien(hoaDonService.findAllHoaDon());

    }

    private void fillTable(List<NhanVien> list) {
        model = (DefaultTableModel) tblNhanVien.getModel();
        model.setRowCount(0);
        modelNhanVien = (DefaultTableModel) tblHoaDonNhanVien.getModel();
        modelNhanVien.setRowCount(0);
        System.out.println(list);
        int i = 1;
        for (NhanVien nv : list) {
            model.addRow(new Object[]{
                i++,
                nv.getMaNV(),
                nv.getHoTen(),
                nv.getVaiTro(),
                nv.getNgaySinh(),
                nv.getGioiTinh() == 1 ? "Nam" : "Nữ",
                nv.getSdt(),
                nv.getEmail(),
                nv.getDiaChi(),
                nv.isTrangThaiXoa() == true ? "Đang làm việc" : "Đã nghỉ việc"
            });
        }
    }

    private void fillTableHoaDonNhanVien(List<HoaDonDTO> hoaDonDTOs) {
        modelNhanVien.setRowCount(0);
        for (HoaDonDTO hoaDonDTO : hoaDonDTOs) {
            modelNhanVien.addRow(new Object[]{
                hoaDonDTO.getMaHoaDon(),
                hoaDonDTO.getTrangThaiThanhToan() == 1 ? "Đã Thanh Toán" : "Chưa Thanh Toán",
                hoaDonDTO.getNgayTao(),
                hoaDonDTO.getThanhTien(),
                hoaDonDTO.getSdtKhachHang(),
                hoaDonDTO.getTienSauGiamGia(),
                hoaDonDTO.getMaVoucher() == null ? "None" : hoaDonDTO.getMaVoucher(),
                hoaDonDTO.getTenNhanVien()
            });
        }
    }

    private void showData(int index) {
        txtmaNV.setText(tblNhanVien.getValueAt(index, 1).toString());
        txtTenNV.setText(tblNhanVien.getValueAt(index, 2).toString());
        cboChucVu.setSelectedItem(tblNhanVien.getValueAt(index, 3).toString());
        try {
            Date date1 = new SimpleDateFormat("yyyy-MM-dd").parse(tblNhanVien.getValueAt(index, 4).toString());
            dataNgaySinh.setDate(date1);
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (tblNhanVien.getValueAt(index, 5).equals("Nam")) {
            rdoNam.setSelected(true);
        } else {
            rdoNu.setSelected(true);
        }
        txtSĐT.setText(tblNhanVien.getValueAt(index, 6).toString());
        txtMail.setText(tblNhanVien.getValueAt(index, 7).toString());
        txtDiaChi.setText(tblNhanVien.getValueAt(index, 8).toString());
        String trangThai = tblNhanVien.getValueAt(index, 9).toString();
        cboTrangThai.setSelectedItem(trangThai);

    }

    private void newFrom() {
        txtmaNV.setText("");
        txtTenNV.setText("");
        txtDiaChi.setText("");
        txtMail.setText("");
        dataNgaySinh.setDate(null);
        txtSĐT.setText("");
        rdoNam.setSelected(true);
        cboChucVu.setSelectedItem("Nhân Viên");
        txtMatKhauMoi.setText("");
        txtMatKhauNhapLai.setText("");
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtTenNV = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        btnThem = new javax.swing.JButton();
        btnSua = new javax.swing.JButton();
        btnMoi = new javax.swing.JButton();
        txtSĐT = new javax.swing.JTextField();
        txtMail = new javax.swing.JTextField();
        txtDiaChi = new javax.swing.JTextField();
        dataNgaySinh = new com.toedter.calendar.JDateChooser();
        jPanel5 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        rdoNam = new javax.swing.JRadioButton();
        rdoNu = new javax.swing.JRadioButton();
        cboChucVu = new javax.swing.JComboBox<>();
        cboTrangThai = new javax.swing.JComboBox<>();
        jLabel14 = new javax.swing.JLabel();
        txtmaNV = new javax.swing.JTextField();
        txtMatKhau = new javax.swing.JPasswordField();
        jLabel13 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        txtMatKhauNhapLai = new javax.swing.JPasswordField();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        txtMatKhauMoi = new javax.swing.JPasswordField();
        jLabel19 = new javax.swing.JLabel();
        btnDoiMatKhau = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblNhanVien = new javax.swing.JTable();
        btnTimKiem = new javax.swing.JButton();
        btnLamMoiNhanVien = new javax.swing.JButton();
        jTabbedPane3 = new javax.swing.JTabbedPane();
        jPanel4 = new javax.swing.JPanel();
        btnTimKiemLichSuNhanVien = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblHoaDonNhanVien = new javax.swing.JTable();
        btnLamMoi = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Nhân viên", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.ABOVE_TOP, new java.awt.Font("Segoe UI", 1, 12))); // NOI18N

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Thiết lập thông tin nhân viên", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12))); // NOI18N

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setText("Mã nhân viên: ");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel4.setText("Tên nhân viên: ");

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel9.setText("SDT: ");

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel10.setText("Email: ");

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel11.setText("Ngày sinh:");

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel12.setText("Đại chỉ: ");

        btnThem.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnThem.setText("Thêm ");
        btnThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemActionPerformed(evt);
            }
        });

        btnSua.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnSua.setText("Sửa");
        btnSua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSuaActionPerformed(evt);
            }
        });

        btnMoi.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnMoi.setText("Làm  Mới");
        btnMoi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMoiActionPerformed(evt);
            }
        });

        txtDiaChi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDiaChiActionPerformed(evt);
            }
        });

        dataNgaySinh.setDateFormatString("yyyy-MM-dd");

        jPanel5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel6.setText("Giới tính:");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel8.setText("Chức vụ: ");

        buttonGroup1.add(rdoNam);
        rdoNam.setSelected(true);
        rdoNam.setText("Nam");

        buttonGroup1.add(rdoNu);
        rdoNu.setText("Nữ");

        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel14.setText("Trạng thái :");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(jLabel14))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel8))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel6)))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cboTrangThai, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(rdoNam)
                        .addGap(18, 18, 18)
                        .addComponent(rdoNu))
                    .addComponent(cboChucVu, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(41, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(rdoNam)
                    .addComponent(rdoNu))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(cboChucVu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cboTrangThai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel13.setText("Mật Khẩu");

        jPanel6.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel17.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel17.setText("Mật Khẩu Mới");

        jLabel18.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel18.setText("Đổi mật khẩu cho Nhân Viên ");

        jLabel19.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel19.setText("Mật Khẩu Nhập Lại");

        btnDoiMatKhau.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnDoiMatKhau.setText("Đổi mật khẩu");
        btnDoiMatKhau.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDoiMatKhauActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(41, 41, 41)))
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtMatKhauMoi, javax.swing.GroupLayout.DEFAULT_SIZE, 171, Short.MAX_VALUE)
                    .addComponent(btnDoiMatKhau)
                    .addComponent(txtMatKhauNhapLai))
                .addGap(17, 17, 17))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel18)
                .addGap(23, 23, 23)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(txtMatKhauMoi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtMatKhauNhapLai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel19))
                .addGap(33, 33, 33)
                .addComponent(btnDoiMatKhau)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 8)); // NOI18N
        jLabel1.setText("(YY-MM-DD)");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3))
                .addGap(19, 19, 19)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtTenNV, javax.swing.GroupLayout.DEFAULT_SIZE, 221, Short.MAX_VALUE)
                            .addComponent(txtmaNV))
                        .addGap(108, 108, 108)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10)
                            .addComponent(jLabel9))
                        .addGap(43, 43, 43))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(60, 60, 60)
                                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(58, 58, 58)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel12)
                                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(0, 0, Short.MAX_VALUE)))))
                        .addGap(18, 18, 18)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtSĐT)
                    .addComponent(txtDiaChi)
                    .addComponent(dataNgaySinh, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txtMatKhau, javax.swing.GroupLayout.PREFERRED_SIZE, 305, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(16, 16, 16)
                                .addComponent(btnThem)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnSua)
                                .addGap(37, 37, 37)
                                .addComponent(btnMoi)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(txtMail))
                .addGap(28, 28, 28)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jLabel9)
                            .addComponent(txtSĐT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtmaNV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtTenNV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10)
                            .addComponent(txtMail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(dataNgaySinh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txtDiaChi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel11)
                                        .addGap(3, 3, 3)
                                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel12)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtMatKhau, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel13))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(btnThem)
                                    .addComponent(btnSua)
                                    .addComponent(btnMoi)))
                            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(19, 19, 19))
        );

        jTabbedPane1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jTabbedPane1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        tblNhanVien.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "STT", "Mã NV", "Họ tên", "Chức vụ", "Ngày sinh", "GIới tính", "Điện thoại", "Email", "Địa chỉ", "Trạng Thái"
            }
        ));
        tblNhanVien.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblNhanVienMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblNhanVien);

        btnTimKiem.setText("Tìm kiếm");
        btnTimKiem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTimKiemActionPerformed(evt);
            }
        });

        btnLamMoiNhanVien.setText("Làm mới");
        btnLamMoiNhanVien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLamMoiNhanVienActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1204, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 12, Short.MAX_VALUE))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(btnTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, 463, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48)
                .addComponent(btnLamMoiNhanVien, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnTimKiem)
                    .addComponent(btnLamMoiNhanVien))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(38, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Danh sách nhân viên", jPanel3);

        jTabbedPane3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        btnTimKiemLichSuNhanVien.setText("Tìm kiếm");
        btnTimKiemLichSuNhanVien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTimKiemLichSuNhanVienActionPerformed(evt);
            }
        });

        tblHoaDonNhanVien.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Mã Hóa Đơn", "Trạng thái", "Ngày tạo", "Thành Tiền", "SDT ", "Tien S giảm giá", "Mã Voucher", "Tên Nhân Viên"
            }
        ));
        tblHoaDonNhanVien.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblHoaDonNhanVienMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tblHoaDonNhanVien);

        btnLamMoi.setText("Làm mới");
        btnLamMoi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLamMoiActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(btnTimKiemLichSuNhanVien, javax.swing.GroupLayout.PREFERRED_SIZE, 463, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(59, 59, 59)
                        .addComponent(btnLamMoi, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 537, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnTimKiemLichSuNhanVien)
                    .addComponent(btnLamMoi))
                .addGap(31, 31, 31)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(26, Short.MAX_VALUE))
        );

        jTabbedPane3.addTab("Hóa Đơn Theo Nhân Viên", jPanel4);

        jTabbedPane1.addTab("Lịch sử Hóa Đơn", jTabbedPane3);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(37, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(538, 538, 538))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 384, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(96, 96, 96)
                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 12, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 747, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(718, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private boolean isValidPhoneNumber(String phoneNumber) {
        // Biểu thức chính quy kiểm tra số điện thoại ở Việt Nam
        String regex = "0\\d{9,10}";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(phoneNumber);
        return matcher.matches();
    }

    private void tblNhanVienMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblNhanVienMouseClicked
        // TODO add your handling code here:
        int row = tblNhanVien.getSelectedRow();
        if (row >= 0) {
            showData(row);
        }
    }//GEN-LAST:event_tblNhanVienMouseClicked

    NhanVien readForm() {
        String maNV, hoTen, diaChi, sdt, email, vaiTro;
        int gioiTinh;
        Date ngaySinh;
        maNV = txtmaNV.getText();
        hoTen = txtTenNV.getText();
        diaChi = txtDiaChi.getText();
        sdt = txtSĐT.getText();
        email = txtMail.getText();
        ngaySinh = dataNgaySinh.getDate();
        vaiTro = cboChucVu.getSelectedItem().toString();
        String matKhau = txtMatKhau.getText();

        String trangThai = cboTrangThai.getSelectedItem().toString();
        if (rdoNam.isSelected() == true) {
            gioiTinh = 1;
        } else {
            gioiTinh = 0;
        }

        if (maNV == null || maNV.trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Mã Nhân Viên không được để trống");
            return null;
        }
        if (!Constant.checkDoDaiCuaChuoi(maNV)) {
            JOptionPane.showConfirmDialog(this, "Độ dài ký tự không hợp lệ. Mã Nhân Viên Từ 3-50 ký tự");
            return null;
        }
        if (hoTen == null || hoTen.trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Tên Nhân Viên không được để trống");
            return null;
        }
        if (!Constant.checkDoDaiCuaChuoi(hoTen)) {
            JOptionPane.showConfirmDialog(this, "Độ dài ký tự không hợp lệ. Họ Tên Nhân Viên Từ 3-50 ký tự");
            return null;
        }
        if (sdt == null || sdt.trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Số điện thoại Nhân Viên không được để trống");
            return null;
        }
        if (!isValidPhoneNumber(sdt)) {
            JOptionPane.showMessageDialog(this, "Số điện thoại Nhân Viên không hợp lệ");
            return null;
        }

        if (!Constant.isValidEmail(email)) {
            JOptionPane.showMessageDialog(this, "Email Nhân Viên không hợp lệ");
            return null;
        }

        if (ngaySinh == null) {
            JOptionPane.showMessageDialog(this, "Ngày sinh Nhân Viên không hợp lệ");
            return null;
        }
        if (diaChi == null || diaChi.trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Địa chỉ Nhân Viên không được để trống");
            return null;
        }
        if (!Constant.checkDoDaiCuaChuoi(diaChi)) {
            JOptionPane.showConfirmDialog(this, "Độ dài ký tự không hợp lệ. Địa chỉ Nhân Viên từ 3-50 ký tự");
            return null;
        }
        boolean trangThaiBoolean = false;
        System.out.println("\n" + trangThai);
        if (trangThai.equalsIgnoreCase("Đang làm việc")) {
            trangThaiBoolean = true;
        } else {
            trangThaiBoolean = false;
        }
        System.out.println("\n" + trangThaiBoolean);
        return new NhanVien(maNV, hoTen, ngaySinh, gioiTinh, diaChi, sdt, email, vaiTro, matKhau, trangThaiBoolean);

    }
    private void btnThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemActionPerformed
        // TODO add your handling code here:
      

        int chon = JOptionPane.showConfirmDialog(this, "Bạn chắc chắn");
        if (chon != 0) {
            return;
        }
        NhanVien nhanVien = this.readForm();

        if (nhanVien == null) {
            return;
        }

        if (nvs.timTheoMaNV(nhanVien.getMaNV()) != null) {
            JOptionPane.showMessageDialog(this, "Mã Nhân Viên đã tồn tại");
            return;
        }

        if (nvs.timTheoSdt(nhanVien.getSdt()) != null) {
            JOptionPane.showMessageDialog(this, "Số điện thoại Nhân Viên đã tồn tại");
            return;
        }
        if (nvs.timTheoEmail(nhanVien.getEmail()) != null) {
            JOptionPane.showMessageDialog(this, "Email Nhân Viên đã tồn tại");
            return;
        }

        if (nhanVien.getMatKhau() == null || nhanVien.getMatKhau().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Vui lòng nhập mật khẩu cho nhân viên");
            return;
        }
        String matKhauHash = BCrypt.hashpw(nhanVien.getMatKhau(), BCrypt.gensalt(Constant.saltRoundPassword));

        nhanVien.setMatKhau(matKhauHash);
        System.out.println(nhanVien.getMatKhau());
        if (nvs.insertNV(nhanVien) > 0) {
            JOptionPane.showMessageDialog(this, "Thêm thành công ");
            this.fillTable(nvs.getAll());
        } else {
            JOptionPane.showMessageDialog(this, "Thêm thất bại");
        }

    }//GEN-LAST:event_btnThemActionPerformed

    private void btnSuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuaActionPerformed
        // TODO add your handling code here:

        int index = tblNhanVien.getSelectedRow();
        if (index == -1)
            JOptionPane.showMessageDialog(this, "Bạn chưa chọn dòng sửa");
        else {
            if (Constant.NHAN_VIEN != null && Constant.NHAN_VIEN.getVaiTro().equalsIgnoreCase("Nhân viên")) {
                JOptionPane.showMessageDialog(this, "Chỉ Quản lý mới có quyền thêm voucher");
                return;
            }
            int chon = JOptionPane.showConfirmDialog(this, "Bạn chắc chắn");
            if (chon != 0) {
                return;
            }
            String ma = tblNhanVien.getValueAt(index, 1).toString();

            NhanVien nv = readForm();

            if (nv == null) {
                return;
            }

            if (nv.getMatKhau() != null && !nv.getMatKhau().isEmpty()) {
                JOptionPane.showMessageDialog(this, "Không thể cập nhật mật khẩu cho Nhân Viên ở trường mật khẩu. Vui đổi mật khẩu ở Form đổi mật khẩu");
                return;
            }

            if (nvs.timTheoMaNV(nv.getMaNV()) != null) {
                JOptionPane.showMessageDialog(this, "Mã Nhân Viên đã tồn tại");
                return;
            }
            if (nvs.timTheoSdt(nv.getSdt()) != null) {
                JOptionPane.showMessageDialog(this, "Số điện thoại Nhân Viên đã tồn tại");
                return;
            }
            if (nvs.timTheoEmail(nv.getEmail()) != null) {
                JOptionPane.showMessageDialog(this, "Email Nhân Viên đã tồn tại");
                return;
            }
            if (nvs.updateNhanVien(ma, nv) > 0) {
                JOptionPane.showMessageDialog(this, "Cập nhật thành công ");
                this.fillTable(nvs.getAll());
            } else {
                JOptionPane.showMessageDialog(this, "Cập nhật nhân viên không thành công!");
            }
        }
    }//GEN-LAST:event_btnSuaActionPerformed

    private void btnMoiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMoiActionPerformed
        // TODO add your handling code here:
        newFrom();
        fillTable(nvs.getAll());

    }//GEN-LAST:event_btnMoiActionPerformed

    private void btnTimKiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTimKiemActionPerformed
        // TODO add your handling code here:
        String ten = JOptionPane.showInputDialog("Nhập tên nhân viên: ");
        if (ten.isEmpty()) {
            return;
        }
        if (nvs.timTheoTen(ten).isEmpty()) {
            JOptionPane.showMessageDialog(this, "Không tìm thấy nhân viên");
            return;
        }
        fillTable(nvs.timTheoTen(ten));
    }//GEN-LAST:event_btnTimKiemActionPerformed

    private void txtDiaChiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDiaChiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDiaChiActionPerformed

    private void btnDoiMatKhauActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDoiMatKhauActionPerformed
        int index = tblNhanVien.getSelectedRow();
        if (index == -1) {
            JOptionPane.showMessageDialog(this, "Bạn chưa chọn dòng sửa");
            return;
        }

        String ma = tblNhanVien.getValueAt(index, 1).toString();

        String matKhauMoi = txtMatKhauMoi.getText();
        String matKhaMoiNhapLai = txtMatKhauNhapLai.getText();
        int chon = JOptionPane.showConfirmDialog(this, "Bạn chắc chắn");
        if (chon != 0) {
            return;
        }
        if (matKhauMoi.trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Vui lòng nhập mật khẩu mới");
            return;
        }

        if (matKhaMoiNhapLai.trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Vui lòng nhập mật khẩu nhập lại");
            return;
        }

        if (!matKhauMoi.equals(matKhaMoiNhapLai)) {
            JOptionPane.showMessageDialog(this, "Mật khẩu nhập lại không khớp");
            return;
        }
        String matKhauHash = BCrypt.hashpw(matKhaMoiNhapLai, BCrypt.gensalt(Constant.saltRoundPassword));

        int kq = nvs.doiMatKhauNhanVien(ma, matKhauHash);
        if (kq > 0) {
            JOptionPane.showMessageDialog(this, "Đổi mật khẩu cho " + ma + " thành công");
            txtMatKhauMoi.setText("");
            txtMatKhauNhapLai.setText("");

        } else {
            JOptionPane.showMessageDialog(this, "Đổi mật khẩu thất bại");
        }


    }//GEN-LAST:event_btnDoiMatKhauActionPerformed

    private void btnTimKiemLichSuNhanVienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTimKiemLichSuNhanVienActionPerformed
        String maNhanVien = JOptionPane.showInputDialog("Nhập mã Nhân Viên");
        if (maNhanVien == null) {
            return;
        }
        if (maNhanVien.isEmpty()) {
            return;
        }
        List<HoaDonDTO> hoaDonDTOs = hoaDonService.findHoaDonByMaNhanVien(maNhanVien);
        System.out.println(hoaDonDTOs.size());
        if (hoaDonDTOs.size() > 0) {
            System.out.println(hoaDonDTOs.size());
            fillTableHoaDonNhanVien(hoaDonDTOs);
        } else {
            JOptionPane.showMessageDialog(this, "Không tìm thấy lịch sử hóa đơn nhân viên " + maNhanVien);
            fillTableHoaDonNhanVien(hoaDonService.findAllHoaDon());
        }
    }//GEN-LAST:event_btnTimKiemLichSuNhanVienActionPerformed

    private void tblHoaDonNhanVienMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblHoaDonNhanVienMouseClicked

    }//GEN-LAST:event_tblHoaDonNhanVienMouseClicked

    private void btnLamMoiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLamMoiActionPerformed
        fillTableHoaDonNhanVien(hoaDonService.findAllHoaDon());
    }//GEN-LAST:event_btnLamMoiActionPerformed

    private void btnLamMoiNhanVienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLamMoiNhanVienActionPerformed
        fillTable(nvs.getAll());
    }//GEN-LAST:event_btnLamMoiNhanVienActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDoiMatKhau;
    private javax.swing.JButton btnLamMoi;
    private javax.swing.JButton btnLamMoiNhanVien;
    private javax.swing.JButton btnMoi;
    private javax.swing.JButton btnSua;
    private javax.swing.JButton btnThem;
    private javax.swing.JButton btnTimKiem;
    private javax.swing.JButton btnTimKiemLichSuNhanVien;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> cboChucVu;
    private javax.swing.JComboBox<String> cboTrangThai;
    private com.toedter.calendar.JDateChooser dataNgaySinh;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTabbedPane jTabbedPane3;
    private javax.swing.JRadioButton rdoNam;
    private javax.swing.JRadioButton rdoNu;
    private javax.swing.JTable tblHoaDonNhanVien;
    private javax.swing.JTable tblNhanVien;
    private javax.swing.JTextField txtDiaChi;
    private javax.swing.JTextField txtMail;
    private javax.swing.JPasswordField txtMatKhau;
    private javax.swing.JPasswordField txtMatKhauMoi;
    private javax.swing.JPasswordField txtMatKhauNhapLai;
    private javax.swing.JTextField txtSĐT;
    private javax.swing.JTextField txtTenNV;
    private javax.swing.JTextField txtmaNV;
    // End of variables declaration//GEN-END:variables
}
