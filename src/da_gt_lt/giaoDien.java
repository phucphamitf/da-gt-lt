/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package da_gt_lt;

import static da_gt_lt.tim_kiem.phanTu;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author pdkpro
 */
public class giaoDien extends javax.swing.JFrame {

    /**
     *
     * Creates new form giaoDien
     */
    //xu ly viec xoa du lieu
    int rowClick;//tra ve hang ma ta nhan chuot vao
    //co kiem tra save thong tin tr khi thoat chua?
    boolean fexit = true;
    //filede doc data
    ArrayList<hangHoa> fileData;
    //cờ để xóa nếu là true thì đang hiển thị mảng tạm (tim kiếm) còn false thì dang dùng mảng chính
    boolean fgXoa = false;
    //so dem cout de tu dong sap xep khi nhan button sap xep
    int cout = 1;
    addFrame addF;
    docFile df;
    String cot[] = {"MA", "TEN", "DON VI TINH", "NGAY NHAP", "SO LUONG", "GIA", "TIEN"};
    String hang[][];
    tim_kiem find;
    ghi_xoa_tinhTien gh;
    sapXep sx;

    public giaoDien() {
        super("THONGTIN HANG HOA");
        this.fileData = constants.file_data;
        df = new docFile();
        find = new tim_kiem();
        gh = new ghi_xoa_tinhTien();
        docFile();
        gh.tinhTien();
        initComponents();
        thongTinTable();
        sx = new sapXep(this);
        this.thongTinPanel.setBackground(Color.white);
        setVisible(true);
        setLocationRelativeTo(null);
    }

    public void docFile() {
        df.doc_File();
    }

    public void timKiem(String tk, String loai) {
        //tim kiem sau do dua vao mang fileTimKiem roi set mang do cho hien thi tai tthongtintable
        find.fileTimKiem = new ArrayList<hangHoa>();
        find.phanTu = new ArrayList<Integer>();
        switch (loai) {
            case "all":
                find.timKiemAll(tk);
                break;
            case "ma":
                find.find_ma(tk);
                break;
            case "ten":
                find.find_Ten(tk);
                break;
            case "ngayNhap":
                find.find_date(tk);
                break;
            case "soLuong":
                find.find_so_luong(tk);
                break;
            case "gia":
                find.find_gia(tk);
                break;
            case "tien":
                find.findTien(tk);
                break;
            case "donViTinh":
                find.findDonViTinh(tk);
                break;
        }
    }

    public void xoaGroup() {
        if (this.fgXoa) {//neuco xoa la true tuc la dang dung file tim kiem luc do ta xoa ca o file tim kiem lan file constan
            while (this.find.getFileTimKiem().size() > 0) {
                hangHoa hh = this.find.getFileTimKiem().get(this.find.getFileTimKiem().size() - 1);
                for (int i = 0; i < constants.file_data.size(); i++) {
                    hangHoa hh2 = constants.file_data.get(i);
                    if (hh.getMa().equals(hh2.getMa())) {
                        constants.file_data.remove(i);
                        break;
                    }
                }
                for (int i = 0; i < this.fileData.size(); i++) {
                    hangHoa hh2 = this.fileData.get(i);
                    if (hh.getMa().equals(hh2.getMa())) {
                        this.fileData.remove(i);
                        break;
                    }
                }
                this.find.fileTimKiem.remove(this.find.getFileTimKiem().size() - 1);
            }
        }
        //this.find.getFileTimKiem() = this.fileData;
        this.fexit = false;
        thongTinTable();
    }

    public void them(hangHoa hh, int viTri) {
        gh.add_Hh(hh, viTri);
        this.gh.tinhTien();
        this.fileData = constants.file_data;
        thongTinTable();
    }

    private void thongTinTable() {
        hang = new String[this.fileData.size()][7];
        for (int i = 0; i < this.fileData.size(); i++) {
            hangHoa hh = this.fileData.get(i);
            for (int j = 0; j < 7; j++) {
                switch (j) {
                    case 0:
                        this.hang[i][j] = hh.getMa();
                        break;
                    case 1:
                        this.hang[i][j] = hh.getTen();
                        break;
                    case 2:
                        this.hang[i][j] = hh.getdonViTinh();
                        break;
                    case 3:
                        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
                        this.hang[i][j] = format.format(hh.getNgayNhap());
                        break;
                    case 4:
                        this.hang[i][j] = hh.getSo_luong() + "";
                        break;
                    case 5:
                        this.hang[i][j] = hh.getGia() + "";
                        break;
                    case 6:
                        this.hang[i][j] = hh.getTien() + "";
                        break;
                }

            }
        }
        DefaultTableModel tableModel = new DefaultTableModel(this.hang, cot);
        tableThongTin.setModel(tableModel);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem8 = new javax.swing.JMenuItem();
        thongTinPanel = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tableThongTin = new javax.swing.JTable();
        conTrol = new javax.swing.JPanel();
        add = new javax.swing.JButton();
        save = new javax.swing.JButton();
        sapxep = new javax.swing.JButton();
        xoa = new javax.swing.JButton();
        exit = new javax.swing.JButton();
        load = new javax.swing.JButton();
        repairButton = new javax.swing.JButton();
        Seach = new javax.swing.JLabel();
        SeachFind = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        fileMenu = new javax.swing.JMenu();
        openMenu = new javax.swing.JMenuItem();
        saveMenu = new javax.swing.JMenuItem();
        exitMenu = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        addMenu = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        findMaMenu = new javax.swing.JMenuItem();
        findtenMenu = new javax.swing.JMenuItem();
        finDonViTinh = new javax.swing.JMenuItem();
        findNgayNhap = new javax.swing.JMenuItem();
        findSoLuong = new javax.swing.JMenuItem();
        findGiaMenu = new javax.swing.JMenuItem();
        findTienMenu = new javax.swing.JMenuItem();
        arrMenu = new javax.swing.JMenu();
        arrMaMenu = new javax.swing.JMenuItem();
        arrNgayNhapMenu = new javax.swing.JMenuItem();
        arrSoLuongMenu = new javax.swing.JMenuItem();
        arrrGiaMenu = new javax.swing.JMenuItem();
        arrTienMenu = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        deleteGroupMenu = new javax.swing.JMenuItem();
        deleteTenMenu = new javax.swing.JMenuItem();
        deleteDonViTrinhMenu = new javax.swing.JMenuItem();
        deleteNgayNhapMenu = new javax.swing.JMenuItem();
        deleteSoLuongMenu = new javax.swing.JMenuItem();
        deleteGiaMenu = new javax.swing.JMenuItem();
        deleteTienMenu = new javax.swing.JMenuItem();
        deleteAllMenu = new javax.swing.JMenuItem();

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
        jScrollPane1.setViewportView(jTable1);

        jMenuItem1.setText("jMenuItem1");

        jMenuItem2.setText("jMenuItem2");

        jMenuItem8.setText("jMenuItem8");

        setPreferredSize(new java.awt.Dimension(738, 500));

        tableThongTin.setAutoCreateRowSorter(true);
        tableThongTin.setBorder(javax.swing.BorderFactory.createCompoundBorder(null, new javax.swing.border.MatteBorder(null)));
        tableThongTin.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        tableThongTin.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tableThongTin.setSelectionBackground(new java.awt.Color(255, 255, 0));
        tableThongTin.setSelectionForeground(new java.awt.Color(0, 0, 0));
        tableThongTin.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tableThongTin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableThongTinMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tableThongTin);

        javax.swing.GroupLayout thongTinPanelLayout = new javax.swing.GroupLayout(thongTinPanel);
        thongTinPanel.setLayout(thongTinPanelLayout);
        thongTinPanelLayout.setHorizontalGroup(
            thongTinPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 564, Short.MAX_VALUE)
        );
        thongTinPanelLayout.setVerticalGroup(
            thongTinPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 308, Short.MAX_VALUE)
        );

        conTrol.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        conTrol.setEnabled(false);
        conTrol.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N

        add.setText("   add    ");
        add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addActionPerformed(evt);
            }
        });

        save.setText("save");
        save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveActionPerformed(evt);
            }
        });

        sapxep.setText("sap xep");
        sapxep.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sapxepActionPerformed(evt);
            }
        });

        xoa.setText("xoa");
        xoa.setMaximumSize(new java.awt.Dimension(71, 23));
        xoa.setMinimumSize(new java.awt.Dimension(71, 23));
        xoa.setPreferredSize(new java.awt.Dimension(71, 23));
        xoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                xoaActionPerformed(evt);
            }
        });

        exit.setText("exit");
        exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitActionPerformed(evt);
            }
        });

        load.setText("load");
        load.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loadActionPerformed(evt);
            }
        });

        repairButton.setText("repair");
        repairButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                repairButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout conTrolLayout = new javax.swing.GroupLayout(conTrol);
        conTrol.setLayout(conTrolLayout);
        conTrolLayout.setHorizontalGroup(
            conTrolLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(conTrolLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(conTrolLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(xoa, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 83, Short.MAX_VALUE)
                    .addComponent(exit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(sapxep, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(add, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(save, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(load, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(repairButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        conTrolLayout.setVerticalGroup(
            conTrolLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(conTrolLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(add)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(xoa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addComponent(sapxep)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(save, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(load)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(repairButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(exit)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        Seach.setText("Seach:");

        SeachFind.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SeachFindActionPerformed(evt);
            }
        });
        SeachFind.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                SeachFindKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                SeachFindKeyReleased(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Edwardian Script ITC", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 153, 255));
        jLabel1.setText("Commodity Manager System ");

        fileMenu.setText("File");

        openMenu.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_O, java.awt.event.InputEvent.CTRL_MASK));
        openMenu.setText("open");
        fileMenu.add(openMenu);

        saveMenu.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_MASK));
        saveMenu.setText("save");
        saveMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveMenuActionPerformed(evt);
            }
        });
        fileMenu.add(saveMenu);

        exitMenu.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F4, java.awt.event.InputEvent.ALT_MASK));
        exitMenu.setText("exit");
        exitMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitMenuActionPerformed(evt);
            }
        });
        fileMenu.add(exitMenu);

        jMenuBar1.add(fileMenu);

        jMenu2.setText("Edit");

        addMenu.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.CTRL_MASK));
        addMenu.setText("add");
        addMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addMenuActionPerformed(evt);
            }
        });
        jMenu2.add(addMenu);

        jMenu1.setText("findGroup");
        jMenu1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu1ActionPerformed(evt);
            }
        });

        findMaMenu.setText("ma");
        findMaMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                findMaMenuActionPerformed(evt);
            }
        });
        jMenu1.add(findMaMenu);

        findtenMenu.setText("ten");
        findtenMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                findtenMenuActionPerformed(evt);
            }
        });
        jMenu1.add(findtenMenu);

        finDonViTinh.setText("donViTinh");
        finDonViTinh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                finDonViTinhActionPerformed(evt);
            }
        });
        jMenu1.add(finDonViTinh);

        findNgayNhap.setText("ngayNhap");
        findNgayNhap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                findNgayNhapActionPerformed(evt);
            }
        });
        jMenu1.add(findNgayNhap);

        findSoLuong.setText("soLuong");
        findSoLuong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                findSoLuongActionPerformed(evt);
            }
        });
        jMenu1.add(findSoLuong);

        findGiaMenu.setText("gia");
        findGiaMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                findGiaMenuActionPerformed(evt);
            }
        });
        jMenu1.add(findGiaMenu);

        findTienMenu.setText("tien");
        findTienMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                findTienMenuActionPerformed(evt);
            }
        });
        jMenu1.add(findTienMenu);

        jMenu2.add(jMenu1);

        arrMenu.setText("arranges");

        arrMaMenu.setText("ma");
        arrMaMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                arrMaMenuActionPerformed(evt);
            }
        });
        arrMenu.add(arrMaMenu);

        arrNgayNhapMenu.setText("ngayNhap");
        arrNgayNhapMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                arrNgayNhapMenuActionPerformed(evt);
            }
        });
        arrMenu.add(arrNgayNhapMenu);

        arrSoLuongMenu.setText("soLuong");
        arrSoLuongMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                arrSoLuongMenuActionPerformed(evt);
            }
        });
        arrMenu.add(arrSoLuongMenu);

        arrrGiaMenu.setText("gia");
        arrrGiaMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                arrrGiaMenuActionPerformed(evt);
            }
        });
        arrMenu.add(arrrGiaMenu);

        arrTienMenu.setText("tien");
        arrTienMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                arrTienMenuActionPerformed(evt);
            }
        });
        arrMenu.add(arrTienMenu);

        jMenu2.add(arrMenu);

        jMenu3.setText("deleteGroup");

        deleteGroupMenu.setText("Ma");
        deleteGroupMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteGroupMenuActionPerformed(evt);
            }
        });
        jMenu3.add(deleteGroupMenu);

        deleteTenMenu.setText("Ten");
        deleteTenMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteTenMenuActionPerformed(evt);
            }
        });
        jMenu3.add(deleteTenMenu);

        deleteDonViTrinhMenu.setText("DonViTinh");
        deleteDonViTrinhMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteDonViTrinhMenuActionPerformed(evt);
            }
        });
        jMenu3.add(deleteDonViTrinhMenu);

        deleteNgayNhapMenu.setText("NgayNhap");
        deleteNgayNhapMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteNgayNhapMenuActionPerformed(evt);
            }
        });
        jMenu3.add(deleteNgayNhapMenu);

        deleteSoLuongMenu.setText("SoLuong");
        deleteSoLuongMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteSoLuongMenuActionPerformed(evt);
            }
        });
        jMenu3.add(deleteSoLuongMenu);

        deleteGiaMenu.setText("Gia");
        deleteGiaMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteGiaMenuActionPerformed(evt);
            }
        });
        jMenu3.add(deleteGiaMenu);

        deleteTienMenu.setText("Tien");
        deleteTienMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteTienMenuActionPerformed(evt);
            }
        });
        jMenu3.add(deleteTienMenu);

        deleteAllMenu.setText("ALL");
        deleteAllMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteAllMenuActionPerformed(evt);
            }
        });
        jMenu3.add(deleteAllMenu);

        jMenu2.add(jMenu3);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(113, Short.MAX_VALUE)
                        .addComponent(thongTinPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(conTrol, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(120, 120, 120)
                        .addComponent(Seach)
                        .addGap(64, 64, 64)
                        .addComponent(SeachFind, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(151, 151, 151)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 393, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(211, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SeachFind, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Seach))
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(thongTinPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(conTrol, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(67, 67, 67))
        );

        getAccessibleContext().setAccessibleDescription("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveActionPerformed
        this.gh.ghiXunFile();
        //load  lai thong tin
        thongTinTable();
        this.fexit = true;
        //cho co xoa ve false
        this.fgXoa = false;
    }//GEN-LAST:event_saveActionPerformed

    private void addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addActionPerformed
        this.SeachFind.setText("");
        if (this.addF == null) {
            this.addF = new addFrame(this);
        } else {
            addF.show();
        }
        this.addF.checkRepai(false, null);
        this.fexit = false;
        //cho co xoa ve false
        this.fgXoa = false;
    }//GEN-LAST:event_addActionPerformed

    private void xoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_xoaActionPerformed
        if (this.fgXoa) {//neuco xoa la true tuc la dang dung file tim kiem luc do ta xoa ca o file tim kiem lan file constan
            hangHoa hh = this.find.getFileTimKiem().get(this.rowClick);
            find.getFileTimKiem().remove(this.rowClick);
            for (int i = 0; i < constants.file_data.size(); i++) {
                hangHoa hh2 = constants.file_data.get(i);
                if (hh.getMa().equals(hh2.getMa())) {
                    constants.file_data.remove(i);
                }
            }
        } else {
            this.fileData = constants.file_data;
            this.fileData.remove(this.rowClick);
        }
        thongTinTable();//sau khi xoa xong ta update lai thong tin table cho hien thi
        this.fexit = false;
    }//GEN-LAST:event_xoaActionPerformed

    private void tableThongTinMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableThongTinMouseClicked
        this.rowClick = tableThongTin.getSelectedRow();
        this.fexit = false;
    }//GEN-LAST:event_tableThongTinMouseClicked

    private void exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitActionPerformed
        if (this.fexit) {
            int choce = JOptionPane.showConfirmDialog(null, "Bạn có chắc  không ?", "title",
                    JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
            if (choce == 0) {
                System.exit(0);
            }
        } else {
            int choce = JOptionPane.showConfirmDialog(null, "Bạn có muốn lưu thay đổi?", "title",
                    JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE);
            if (choce == 0) {
                this.gh.ghiXunFile();
                System.exit(choce);
            } else if (choce == 1) {
                System.exit(0);
            }
        }
    }//GEN-LAST:event_exitActionPerformed

    private void SeachFindActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SeachFindActionPerformed
        this.fgXoa = true;
    }//GEN-LAST:event_SeachFindActionPerformed

    private void loadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loadActionPerformed
        if (this.fexit) {
            constants.file_data.removeAll(constants.file_data);
            docFile();
        }
        this.fileData = constants.file_data;
        this.gh.tinhTien();
        thongTinTable();
        //cho co xoa ve false
        this.SeachFind.setText("");
        this.fgXoa = false;
    }//GEN-LAST:event_loadActionPerformed

    private void SeachFindKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_SeachFindKeyPressed
        this.fgXoa = true;

    }//GEN-LAST:event_SeachFindKeyPressed

    private void SeachFindKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_SeachFindKeyReleased
        if (this.SeachFind.getText().equals("")) {
            this.fileData = constants.file_data;
            thongTinTable();
        } else {
            this.timKiem(this.SeachFind.getText(), "all");
            //System.out.println("do dai:"+this.SeachFind.getText().length());
            this.fileData = this.find.getFileTimKiem();
        }
        this.fgXoa = true;
        thongTinTable();
    }//GEN-LAST:event_SeachFindKeyReleased

    private void sapxepActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sapxepActionPerformed

        switch (this.cout++) {
            case 1:
                sx.sapXepTheoMa();
                break;
            case 2:
                sx.sapXepTheoNgayNhap();
                break;
            case 3:
                sx.sapXepTheoSoLuong();
                break;
            case 4:
                sx.sapXepTheoGia();
                break;
            case 5:
                sx.sapXepTheoTien();
                break;
        }
        if (this.cout > 5) {
            this.cout = 1;
        }
        this.fexit = false;
        System.out.println("cout:" + cout);
        thongTinTable();
    }//GEN-LAST:event_sapxepActionPerformed

    private void arrrGiaMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_arrrGiaMenuActionPerformed
        this.cout = 4;
        sapxepActionPerformed(evt);
    }//GEN-LAST:event_arrrGiaMenuActionPerformed

    private void addMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addMenuActionPerformed
        addActionPerformed(evt);
    }//GEN-LAST:event_addMenuActionPerformed

    private void exitMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitMenuActionPerformed
        exitActionPerformed(evt);
    }//GEN-LAST:event_exitMenuActionPerformed

    private void arrMaMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_arrMaMenuActionPerformed
        this.cout = 1;
        sapxepActionPerformed(evt);
    }//GEN-LAST:event_arrMaMenuActionPerformed

    private void arrNgayNhapMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_arrNgayNhapMenuActionPerformed
        this.cout = 2;
        sapxepActionPerformed(evt);
    }//GEN-LAST:event_arrNgayNhapMenuActionPerformed

    private void arrSoLuongMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_arrSoLuongMenuActionPerformed
        this.cout = 3;
        sapxepActionPerformed(evt);
    }//GEN-LAST:event_arrSoLuongMenuActionPerformed

    private void arrTienMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_arrTienMenuActionPerformed
        this.cout = 5;
        sapxepActionPerformed(evt);
    }//GEN-LAST:event_arrTienMenuActionPerformed

    private void saveMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveMenuActionPerformed
        saveActionPerformed(evt);
        this.fexit = true;
    }//GEN-LAST:event_saveMenuActionPerformed

    private void findMaMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_findMaMenuActionPerformed
        this.timKiem(this.SeachFind.getText(), "ma");
        this.fgXoa = true;
        this.fileData = this.find.getFileTimKiem();
        thongTinTable();
    }//GEN-LAST:event_findMaMenuActionPerformed

    private void findNgayNhapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_findNgayNhapActionPerformed
        this.timKiem(this.SeachFind.getText(), "ngayNhap");
        this.fgXoa = true;
        this.fileData = this.find.getFileTimKiem();
        thongTinTable();
    }//GEN-LAST:event_findNgayNhapActionPerformed

    private void findGiaMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_findGiaMenuActionPerformed
        this.timKiem(this.SeachFind.getText(), "gia");
        this.fgXoa = true;
        this.fileData = this.find.getFileTimKiem();
        thongTinTable();
    }//GEN-LAST:event_findGiaMenuActionPerformed

    private void jMenu1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenu1ActionPerformed

    private void findtenMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_findtenMenuActionPerformed
        this.timKiem(this.SeachFind.getText(), "ten");
        this.fgXoa = true;
        this.fileData = this.find.getFileTimKiem();
        thongTinTable();
    }//GEN-LAST:event_findtenMenuActionPerformed

    private void finDonViTinhActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_finDonViTinhActionPerformed
        this.timKiem(this.SeachFind.getText(), "donViTinh");
        this.fgXoa = true;
        this.fileData = this.find.getFileTimKiem();
        thongTinTable();
    }//GEN-LAST:event_finDonViTinhActionPerformed

    private void findSoLuongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_findSoLuongActionPerformed
        this.timKiem(this.SeachFind.getText(), "soLuong");
        this.fgXoa = true;
        this.fileData = this.find.getFileTimKiem();
        thongTinTable();
    }//GEN-LAST:event_findSoLuongActionPerformed

    private void findTienMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_findTienMenuActionPerformed
        this.timKiem(this.SeachFind.getText(), "tien");
        this.fgXoa = true;
        this.fileData = this.find.getFileTimKiem();
        thongTinTable();
    }//GEN-LAST:event_findTienMenuActionPerformed

    private void deleteGroupMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteGroupMenuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_deleteGroupMenuActionPerformed

    private void deleteDonViTrinhMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteDonViTrinhMenuActionPerformed
        timKiem(this.SeachFind.getText(), "donViTinh");
        xoaGroup();
    }//GEN-LAST:event_deleteDonViTrinhMenuActionPerformed

    private void deleteTienMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteTienMenuActionPerformed
        timKiem(this.SeachFind.getText(), "tien");
        xoaGroup();
    }//GEN-LAST:event_deleteTienMenuActionPerformed

    private void deleteTenMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteTenMenuActionPerformed
        timKiem(this.SeachFind.getText(), "ten");
        xoaGroup();
    }//GEN-LAST:event_deleteTenMenuActionPerformed

    private void deleteNgayNhapMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteNgayNhapMenuActionPerformed
        timKiem(this.SeachFind.getText(), "ngayNhap");
        xoaGroup();
    }//GEN-LAST:event_deleteNgayNhapMenuActionPerformed

    private void deleteSoLuongMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteSoLuongMenuActionPerformed
        timKiem(this.SeachFind.getText(), "soLuong");
        xoaGroup();
    }//GEN-LAST:event_deleteSoLuongMenuActionPerformed

    private void deleteGiaMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteGiaMenuActionPerformed
        timKiem(this.SeachFind.getText(), "gia");
        xoaGroup();
    }//GEN-LAST:event_deleteGiaMenuActionPerformed

    private void deleteAllMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteAllMenuActionPerformed
        while (this.fileData.size() > 0) {
            hangHoa hh = this.fileData.get(this.fileData.size() - 1);
            for (int i = 0; i < constants.file_data.size(); i++) {
                hangHoa hh2 = constants.file_data.get(i);
                if (hh.getMa().equals(hh2.getMa())) {
                    constants.file_data.remove(i);
                    this.fileData.remove(hh);
                }
            }
        }
        thongTinTable();
        this.fexit = false;
    }//GEN-LAST:event_deleteAllMenuActionPerformed

    private void repairButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_repairButtonActionPerformed

        try {
            int i = this.tableThongTin.getSelectedRow();
            hangHoa hh = this.fileData.get(i);
            for (int j = 0; j < constants.file_data.size(); j++) {
                hangHoa hh2 = constants.file_data.get(i);
                if (hh.getMa().equals(hh2.getMa())) {
                }
            }
            if (this.addF == null) {
                this.addF = new addFrame(this);
            } else {
              //this.addF.fgRepai = true;
                addF.show();
            }
            this.addF.checkRepai(true, hh);
            this.fexit = false;
            //cho co xoa ve false
            this.fgXoa = false;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "chon vi tri");
        }
    }//GEN-LAST:event_repairButtonActionPerformed
    public void repai(ActionEvent evt) {
        String xx = this.SeachFind.getText();
        loadActionPerformed(evt);
        this.timKiem(xx, "all");
        //System.out.println("do dai:"+this.SeachFind.getText().length());
        this.fileData = this.find.getFileTimKiem();
        this.SeachFind.setText(xx);
        thongTinTable();
    }
    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Seach;
    private javax.swing.JTextField SeachFind;
    private javax.swing.JButton add;
    private javax.swing.JMenuItem addMenu;
    private javax.swing.JMenuItem arrMaMenu;
    private javax.swing.JMenu arrMenu;
    private javax.swing.JMenuItem arrNgayNhapMenu;
    private javax.swing.JMenuItem arrSoLuongMenu;
    private javax.swing.JMenuItem arrTienMenu;
    private javax.swing.JMenuItem arrrGiaMenu;
    private javax.swing.JPanel conTrol;
    private javax.swing.JMenuItem deleteAllMenu;
    private javax.swing.JMenuItem deleteDonViTrinhMenu;
    private javax.swing.JMenuItem deleteGiaMenu;
    private javax.swing.JMenuItem deleteGroupMenu;
    private javax.swing.JMenuItem deleteNgayNhapMenu;
    private javax.swing.JMenuItem deleteSoLuongMenu;
    private javax.swing.JMenuItem deleteTenMenu;
    private javax.swing.JMenuItem deleteTienMenu;
    private javax.swing.JButton exit;
    private javax.swing.JMenuItem exitMenu;
    private javax.swing.JMenu fileMenu;
    private javax.swing.JMenuItem finDonViTinh;
    private javax.swing.JMenuItem findGiaMenu;
    private javax.swing.JMenuItem findMaMenu;
    private javax.swing.JMenuItem findNgayNhap;
    private javax.swing.JMenuItem findSoLuong;
    private javax.swing.JMenuItem findTienMenu;
    private javax.swing.JMenuItem findtenMenu;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton load;
    private javax.swing.JMenuItem openMenu;
    private javax.swing.JButton repairButton;
    private javax.swing.JButton sapxep;
    private javax.swing.JButton save;
    private javax.swing.JMenuItem saveMenu;
    private javax.swing.JTable tableThongTin;
    private javax.swing.JPanel thongTinPanel;
    private javax.swing.JButton xoa;
    // End of variables declaration//GEN-END:variables
}
