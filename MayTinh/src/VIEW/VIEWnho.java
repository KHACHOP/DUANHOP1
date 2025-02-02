
package VIEW;

import MODEL.NhanVien;
import java.awt.Color;
import java.net.URL;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import com.formdev.flatlaf.FlatLightLaf;
import java.awt.Dialog;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import myclass.ClockThread;

/**
 *
 * @author Admin
 */
public class VIEWnho extends javax.swing.JFrame {

    /**
     * Creates new form MainApplication
     */

    private BanHangMainPanelfix banHangMainPanel; 

    private HoaDonMainPanel hoaDonMainPanel; 

    private KhachHangMainPanel khachHangMainPanel; 

    private KhuyenMaiMainPanel khuyenMaiMainPanel; 

    private NhanVienMainPanel nhanVienMainPanel; 

    private SanPhamMainPanel sanPhamMainPanel; 

   
    
    private DoiMatKhauMainPanel doiMatKhauMainPanel; 

    private static NhanVien nhanVienDangNhap;

    public VIEWnho(NhanVien nhanVien) {
        initComponents();

        nhanVienDangNhap = nhanVien;

        try {
            UIManager.setLookAndFeel(new FlatLightLaf());
        } catch (UnsupportedLookAndFeelException e) {
            e.printStackTrace();
        }


        hoaDonMainPanel = new HoaDonMainPanel();

        khachHangMainPanel = new KhachHangMainPanel();

        khuyenMaiMainPanel = new KhuyenMaiMainPanel();

        nhanVienMainPanel = new NhanVienMainPanel();

        sanPhamMainPanel = new SanPhamMainPanel();

        banHangMainPanel = new BanHangMainPanelfix();
        
        doiMatKhauMainPanel = new DoiMatKhauMainPanel();

        labelShowName.setText("Tên :" + nhanVien.getHoTen());
        labelShowOffice.setText("Chức vụ : " + nhanVien.getVaiTro());

        showPanel(banHangMainPanel);

    }

//    private static ImageIcon loadImageIcon(String path) {
//        URL imgURL = VIEWnho.class.getResource(path);
//        if (imgURL != null) {
//            return new ImageIcon(imgURL);
//        } else {
//            System.err.println("Couldn't find file: " + path);
//            return null;
//        }
//    }

 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        changePasswordDialog = new javax.swing.JDialog();
        changePassContainer = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        panelControl = new javax.swing.JPanel();
        banHangPanel = new javax.swing.JPanel();
        banHangLabel = new javax.swing.JLabel();
        sanPhamPanel = new javax.swing.JPanel();
        sanPhamLabel = new javax.swing.JLabel();
        nhanVienPanel = new javax.swing.JPanel();
        nhanVienLabel = new javax.swing.JLabel();
        hoaDonPanel = new javax.swing.JPanel();
        hoaDonLabel = new javax.swing.JLabel();
        khuyenMaiPanel = new javax.swing.JPanel();
        khuyenMaiLabel = new javax.swing.JLabel();
        khachHangPanel = new javax.swing.JPanel();
        khachHangLabel = new javax.swing.JLabel();
        labelShowOffice = new javax.swing.JLabel();
        labelShowName = new javax.swing.JLabel();
        exitPanel = new javax.swing.JPanel();
        exitStatusLb = new javax.swing.JPanel();
        exitLb = new javax.swing.JLabel();
        doiMatKhauPanel = new javax.swing.JPanel();
        doiMatKhau = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        lblNgay = new javax.swing.JLabel();
        lblGio = new javax.swing.JLabel();
        mainPanel = new javax.swing.JPanel();

        changePassContainer.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("Đổi Mật Khẩu");

        jLabel2.setText("Mật Khẩu Cũ");

        jLabel3.setText("Mật Khẩu Mới");

        jLabel4.setText("Xác Nhận Mật Khẩu Mới");

        javax.swing.GroupLayout changePassContainerLayout = new javax.swing.GroupLayout(changePassContainer);
        changePassContainer.setLayout(changePassContainerLayout);
        changePassContainerLayout.setHorizontalGroup(
            changePassContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, changePassContainerLayout.createSequentialGroup()
                .addContainerGap(107, Short.MAX_VALUE)
                .addGroup(changePassContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(changePassContainerLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(159, 159, 159))
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        changePassContainerLayout.setVerticalGroup(
            changePassContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(changePassContainerLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout changePasswordDialogLayout = new javax.swing.GroupLayout(changePasswordDialog.getContentPane());
        changePasswordDialog.getContentPane().setLayout(changePasswordDialogLayout);
        changePasswordDialogLayout.setHorizontalGroup(
            changePasswordDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(changePassContainer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        changePasswordDialogLayout.setVerticalGroup(
            changePasswordDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(changePassContainer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("The Hans Shop");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        panelControl.setBackground(new java.awt.Color(51, 153, 255));
        panelControl.setPreferredSize(new java.awt.Dimension(175, 744));

        banHangPanel.setBackground(new java.awt.Color(51, 0, 51));
        banHangPanel.setPreferredSize(new java.awt.Dimension(163, 36));

        banHangLabel.setBackground(new java.awt.Color(255, 204, 204));
        banHangLabel.setFont(new java.awt.Font("Source Sans Pro Black", 0, 14)); // NOI18N
        banHangLabel.setForeground(new java.awt.Color(255, 255, 255));
        banHangLabel.setText("BÁN HÀNG");
        banHangLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        banHangLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                banHangLabelMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout banHangPanelLayout = new javax.swing.GroupLayout(banHangPanel);
        banHangPanel.setLayout(banHangPanelLayout);
        banHangPanelLayout.setHorizontalGroup(
            banHangPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, banHangPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(banHangLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        banHangPanelLayout.setVerticalGroup(
            banHangPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(banHangLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
        );

        sanPhamPanel.setBackground(new java.awt.Color(51, 0, 51));
        sanPhamPanel.setPreferredSize(new java.awt.Dimension(163, 36));

        sanPhamLabel.setBackground(new java.awt.Color(153, 255, 153));
        sanPhamLabel.setFont(new java.awt.Font("Source Sans Pro Black", 0, 14)); // NOI18N
        sanPhamLabel.setForeground(new java.awt.Color(255, 255, 255));
        sanPhamLabel.setText("SẢN PHẨM");
        sanPhamLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        sanPhamLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                sanPhamLabelMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout sanPhamPanelLayout = new javax.swing.GroupLayout(sanPhamPanel);
        sanPhamPanel.setLayout(sanPhamPanelLayout);
        sanPhamPanelLayout.setHorizontalGroup(
            sanPhamPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, sanPhamPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(sanPhamLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        sanPhamPanelLayout.setVerticalGroup(
            sanPhamPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(sanPhamLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
        );

        nhanVienPanel.setBackground(new java.awt.Color(51, 0, 51));
        nhanVienPanel.setPreferredSize(new java.awt.Dimension(163, 36));

        nhanVienLabel.setFont(new java.awt.Font("Source Sans Pro Black", 0, 14)); // NOI18N
        nhanVienLabel.setForeground(new java.awt.Color(255, 255, 255));
        nhanVienLabel.setText("NHÂN VIÊN");
        nhanVienLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                nhanVienLabelMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout nhanVienPanelLayout = new javax.swing.GroupLayout(nhanVienPanel);
        nhanVienPanel.setLayout(nhanVienPanelLayout);
        nhanVienPanelLayout.setHorizontalGroup(
            nhanVienPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, nhanVienPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(nhanVienLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        nhanVienPanelLayout.setVerticalGroup(
            nhanVienPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(nhanVienLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
        );

        hoaDonPanel.setBackground(new java.awt.Color(51, 0, 51));
        hoaDonPanel.setPreferredSize(new java.awt.Dimension(163, 36));

        hoaDonLabel.setFont(new java.awt.Font("Source Sans Pro Black", 0, 14)); // NOI18N
        hoaDonLabel.setForeground(new java.awt.Color(255, 255, 255));
        hoaDonLabel.setText("HÓA ĐƠN");
        hoaDonLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                hoaDonLabelMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout hoaDonPanelLayout = new javax.swing.GroupLayout(hoaDonPanel);
        hoaDonPanel.setLayout(hoaDonPanelLayout);
        hoaDonPanelLayout.setHorizontalGroup(
            hoaDonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, hoaDonPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(hoaDonLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        hoaDonPanelLayout.setVerticalGroup(
            hoaDonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(hoaDonLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
        );

        khuyenMaiPanel.setBackground(new java.awt.Color(51, 0, 51));
        khuyenMaiPanel.setPreferredSize(new java.awt.Dimension(163, 36));

        khuyenMaiLabel.setFont(new java.awt.Font("Source Sans Pro Black", 0, 14)); // NOI18N
        khuyenMaiLabel.setForeground(new java.awt.Color(255, 255, 255));
        khuyenMaiLabel.setText("KHUYẾN MÃI");
        khuyenMaiLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                khuyenMaiLabelMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout khuyenMaiPanelLayout = new javax.swing.GroupLayout(khuyenMaiPanel);
        khuyenMaiPanel.setLayout(khuyenMaiPanelLayout);
        khuyenMaiPanelLayout.setHorizontalGroup(
            khuyenMaiPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, khuyenMaiPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(khuyenMaiLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        khuyenMaiPanelLayout.setVerticalGroup(
            khuyenMaiPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(khuyenMaiLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
        );

        khachHangPanel.setBackground(new java.awt.Color(51, 0, 51));
        khachHangPanel.setPreferredSize(new java.awt.Dimension(163, 36));

        khachHangLabel.setFont(new java.awt.Font("Source Sans Pro Black", 0, 14)); // NOI18N
        khachHangLabel.setForeground(new java.awt.Color(255, 255, 255));
        khachHangLabel.setText("KHÁCH HÀNG");
        khachHangLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                khachHangLabelMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout khachHangPanelLayout = new javax.swing.GroupLayout(khachHangPanel);
        khachHangPanel.setLayout(khachHangPanelLayout);
        khachHangPanelLayout.setHorizontalGroup(
            khachHangPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(khachHangPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(khachHangLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        khachHangPanelLayout.setVerticalGroup(
            khachHangPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(khachHangLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
        );

        labelShowOffice.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        labelShowOffice.setForeground(new java.awt.Color(255, 255, 255));
        labelShowOffice.setText("Chức Vụ");

        labelShowName.setBackground(new java.awt.Color(204, 255, 204));
        labelShowName.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        labelShowName.setForeground(new java.awt.Color(255, 255, 255));
        labelShowName.setText("Tên");

        exitPanel.setBackground(new java.awt.Color(0, 0, 0));
        exitPanel.setPreferredSize(new java.awt.Dimension(163, 36));

        exitStatusLb.setBackground(new java.awt.Color(255, 255, 255));
        exitStatusLb.setOpaque(false);
        exitStatusLb.setPreferredSize(new java.awt.Dimension(7, 0));

        javax.swing.GroupLayout exitStatusLbLayout = new javax.swing.GroupLayout(exitStatusLb);
        exitStatusLb.setLayout(exitStatusLbLayout);
        exitStatusLbLayout.setHorizontalGroup(
            exitStatusLbLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 7, Short.MAX_VALUE)
        );
        exitStatusLbLayout.setVerticalGroup(
            exitStatusLbLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 36, Short.MAX_VALUE)
        );

        exitLb.setFont(new java.awt.Font("Source Sans Pro Black", 0, 14)); // NOI18N
        exitLb.setForeground(new java.awt.Color(255, 255, 255));
        exitLb.setText("THOÁT");
        exitLb.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exitLbMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout exitPanelLayout = new javax.swing.GroupLayout(exitPanel);
        exitPanel.setLayout(exitPanelLayout);
        exitPanelLayout.setHorizontalGroup(
            exitPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, exitPanelLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(exitStatusLb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(exitLb, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        exitPanelLayout.setVerticalGroup(
            exitPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(exitStatusLb, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
            .addComponent(exitLb, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        doiMatKhauPanel.setBackground(new java.awt.Color(51, 0, 51));
        doiMatKhauPanel.setPreferredSize(new java.awt.Dimension(163, 36));

        doiMatKhau.setFont(new java.awt.Font("Source Sans Pro Black", 1, 14)); // NOI18N
        doiMatKhau.setForeground(new java.awt.Color(255, 255, 255));
        doiMatKhau.setText("ĐỔI MẬT KHẨU");
        doiMatKhau.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                doiMatKhauMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout doiMatKhauPanelLayout = new javax.swing.GroupLayout(doiMatKhauPanel);
        doiMatKhauPanel.setLayout(doiMatKhauPanelLayout);
        doiMatKhauPanelLayout.setHorizontalGroup(
            doiMatKhauPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(doiMatKhauPanelLayout.createSequentialGroup()
                .addComponent(doiMatKhau, javax.swing.GroupLayout.DEFAULT_SIZE, 169, Short.MAX_VALUE)
                .addContainerGap())
        );
        doiMatKhauPanelLayout.setVerticalGroup(
            doiMatKhauPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(doiMatKhau, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
        );

        lblNgay.setText("ngay");

        lblGio.setText("gio");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblNgay, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblGio, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 8, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(lblNgay, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblGio, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(60, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout panelControlLayout = new javax.swing.GroupLayout(panelControl);
        panelControl.setLayout(panelControlLayout);
        panelControlLayout.setHorizontalGroup(
            panelControlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(banHangPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 175, Short.MAX_VALUE)
            .addComponent(sanPhamPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 175, Short.MAX_VALUE)
            .addComponent(nhanVienPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 175, Short.MAX_VALUE)
            .addComponent(hoaDonPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 175, Short.MAX_VALUE)
            .addComponent(khuyenMaiPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 175, Short.MAX_VALUE)
            .addComponent(khachHangPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 175, Short.MAX_VALUE)
            .addGroup(panelControlLayout.createSequentialGroup()
                .addGroup(panelControlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(doiMatKhauPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(exitPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(panelControlLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(panelControlLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelControlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelShowName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(labelShowOffice, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        panelControlLayout.setVerticalGroup(
            panelControlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelControlLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelShowName, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelShowOffice, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(82, 82, 82)
                .addComponent(banHangPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(sanPhamPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(nhanVienPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(hoaDonPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(khuyenMaiPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(khachHangPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addComponent(doiMatKhauPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(exitPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        mainPanel.setAutoscrolls(true);
        mainPanel.setPreferredSize(new java.awt.Dimension(1300, 790));
        mainPanel.setLayout(new java.awt.CardLayout());

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelControl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(mainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 1308, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelControl, javax.swing.GroupLayout.DEFAULT_SIZE, 790, Short.MAX_VALUE)
            .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void banHangLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_banHangLabelMouseClicked
        onClicked(banHangPanel);
        unClicked(sanPhamPanel);
        unClicked(khachHangPanel);
        unClicked(khuyenMaiPanel);
        unClicked(hoaDonPanel);
        unClicked(nhanVienPanel);
        unClicked(doiMatKhauPanel);
        showPanel(banHangMainPanel);
    }//GEN-LAST:event_banHangLabelMouseClicked

    private void sanPhamLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sanPhamLabelMouseClicked
        onClicked(sanPhamPanel);
        unClicked(banHangPanel);
        unClicked(khachHangPanel);
        unClicked(khuyenMaiPanel);
        unClicked(hoaDonPanel);
        unClicked(nhanVienPanel);
        unClicked(doiMatKhauPanel);
        showPanel(sanPhamMainPanel);
    }//GEN-LAST:event_sanPhamLabelMouseClicked

    private void nhanVienLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nhanVienLabelMouseClicked
        if (!nhanVienDangNhap.getVaiTro().equalsIgnoreCase("ADMIN")) {
            JOptionPane.showMessageDialog(this, "Chỉ Admin mới có quyền truy cập");
            return;
        }
        onClicked(nhanVienPanel);
        unClicked(sanPhamPanel);
        unClicked(banHangPanel);
        unClicked(khachHangPanel);
        unClicked(khuyenMaiPanel);
        unClicked(hoaDonPanel);
        unClicked(doiMatKhauPanel);
        showPanel(nhanVienMainPanel);

    }//GEN-LAST:event_nhanVienLabelMouseClicked

    private void hoaDonLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_hoaDonLabelMouseClicked
        onClicked(hoaDonPanel);
        unClicked(nhanVienPanel);
        unClicked(sanPhamPanel);
        unClicked(banHangPanel);
        unClicked(khachHangPanel);
        unClicked(khuyenMaiPanel);
        unClicked(doiMatKhauPanel);
        showPanel(hoaDonMainPanel);

    }//GEN-LAST:event_hoaDonLabelMouseClicked

    private void khachHangLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_khachHangLabelMouseClicked
        onClicked(khachHangPanel);
        unClicked(hoaDonPanel);
        unClicked(nhanVienPanel);
        unClicked(sanPhamPanel);
        unClicked(banHangPanel);
        unClicked(khuyenMaiPanel);
        unClicked(doiMatKhauPanel);
        showPanel(khachHangMainPanel);
    }//GEN-LAST:event_khachHangLabelMouseClicked

    private void exitLbMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitLbMouseClicked
        System.exit(0);
    }//GEN-LAST:event_exitLbMouseClicked

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        changePasswordDialog.dispose();
    }//GEN-LAST:event_btnCancelActionPerformed

    private void btnConfirmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfirmActionPerformed

    }//GEN-LAST:event_btnConfirmActionPerformed

    private void khuyenMaiLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_khuyenMaiLabelMouseClicked
        onClicked(khuyenMaiPanel);
        unClicked(khachHangPanel);
        unClicked(hoaDonPanel);
        unClicked(nhanVienPanel);
        unClicked(sanPhamPanel);
        unClicked(banHangPanel);
        unClicked(doiMatKhauPanel);
        showPanel(khuyenMaiMainPanel);
    }//GEN-LAST:event_khuyenMaiLabelMouseClicked

    private void doiMatKhauMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_doiMatKhauMouseClicked
        onClicked(doiMatKhauPanel);
        unClicked(khuyenMaiPanel);
        unClicked(khachHangPanel);
        unClicked(hoaDonPanel);
        unClicked(nhanVienPanel);
        unClicked(sanPhamPanel);
        unClicked(banHangPanel);
        showPanel(doiMatKhauMainPanel);
       

    }//GEN-LAST:event_doiMatKhauMouseClicked

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        ClockThread clockThread = new ClockThread(lblNgay,lblGio);
        Thread t1 = new Thread(clockThread);
        t1.start();
    }//GEN-LAST:event_formWindowOpened

    private void onClicked(JPanel panelBackGroud) {
        panelBackGroud.setBackground(new Color(200, 22, 51));
    }

    private void unClicked(JPanel panelBackGroud) {
        panelBackGroud.setBackground(new Color(51, 0, 51));
    }

    private void showPanel(JPanel panel) {
        mainPanel.removeAll();
        mainPanel.add(panel);
        mainPanel.repaint();
        mainPanel.revalidate();
    }

    public final static NhanVien getNhanVienDangNhap() {
        return nhanVienDangNhap;
    }

//   
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
            java.util.logging.Logger.getLogger(VIEWnho.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VIEWnho.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VIEWnho.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VIEWnho.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {

                new VIEWnho(nhanVienDangNhap).setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel banHangLabel;
    private javax.swing.JPanel banHangPanel;
    private javax.swing.JPanel changePassContainer;
    private javax.swing.JDialog changePasswordDialog;
    private javax.swing.JLabel doiMatKhau;
    private javax.swing.JPanel doiMatKhauPanel;
    private javax.swing.JLabel exitLb;
    private javax.swing.JPanel exitPanel;
    private javax.swing.JPanel exitStatusLb;
    private javax.swing.JLabel hoaDonLabel;
    private javax.swing.JPanel hoaDonPanel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel khachHangLabel;
    private javax.swing.JPanel khachHangPanel;
    private javax.swing.JLabel khuyenMaiLabel;
    private javax.swing.JPanel khuyenMaiPanel;
    private javax.swing.JLabel labelShowName;
    private javax.swing.JLabel labelShowOffice;
    private javax.swing.JLabel lblGio;
    private javax.swing.JLabel lblNgay;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JLabel nhanVienLabel;
    private javax.swing.JPanel nhanVienPanel;
    private javax.swing.JPanel panelControl;
    private javax.swing.JLabel sanPhamLabel;
    private javax.swing.JPanel sanPhamPanel;
    // End of variables declaration//GEN-END:variables

}
