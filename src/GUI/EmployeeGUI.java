/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import BLL.EmployeeBLL;
import DAL.Employee;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

/**
 *
 * @author NAT
 */
public class EmployeeGUI extends javax.swing.JFrame {

    EmployeeBLL employeeBLL = new EmployeeBLL();
    Employee employeeModel;

    /**
     * Creates new form Employee
     */
    public EmployeeGUI() {
        initComponents();
        setInfoDialog();
        LoadPhai();
        LoadNoiSinh();
        LoadBangCap();
        LoadBoPhan();
        LoadChucDanh();
        LoadChucVu();
        LoadNoiCapCMND();
        LoadDanToc();
        LoadDiaDiemLamViec();
        LoadDonVi();
        LoadLoaiNV();
        LoadNganHang();
        LoadPhongBan();
        LoadTonGiao();
        LoadTrinhDo();
        LoadTTHN();
        LoadQuocTich();
    }

    public void setInfoDialog() {
        Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
        int x = (int) ((dimension.getWidth() - getWidth()) / 2);
        int y = (int) ((dimension.getHeight() - getHeight()) / 2);
        setLocation(x, y);
        setResizable(false);
    }

    public Employee getEmployee() {
        return employeeModel;
    }

    private void LoadPhai() {
        DefaultComboBoxModel model = new DefaultComboBoxModel();
        ArrayList<Employee> employeeListModel = employeeBLL.ReadCBPhaiBll();
        Employee employeeModel = new Employee();
        for (int i = 0; i < employeeListModel.size(); i++) {
            employeeModel = employeeListModel.get(i);
            model.addElement(employeeModel.getPhai());
        }
        //System.out.println("ID GUI" + employeeModel);     
        cb_phai.setModel(model);
        employeeListModel.clear();
    }

    private void LoadNoiSinh() {
        DefaultComboBoxModel model1 = new DefaultComboBoxModel();
        ArrayList<Employee> employeeListModel = employeeBLL.ReadCBNoiSinhBll();
        Employee employeeModel = new Employee();
        for (int i = 0; i < employeeListModel.size(); i++) {
            employeeModel = employeeListModel.get(i);
            model1.addElement(employeeModel.getNoiSinh());
        }
        //System.out.println("ID GUI" + employeeModel);     
        cb_noisinh.setModel(model1);
        employeeListModel.clear();
    }

    private void LoadBangCap() {
        DefaultComboBoxModel model2 = new DefaultComboBoxModel();
        ArrayList<Employee> employeeListModel = employeeBLL.ReadCBBangCapBll();
        Employee employeeModel = new Employee();
        for (int i = 0; i < employeeListModel.size(); i++) {
            employeeModel = employeeListModel.get(i);
            model2.addElement(employeeModel.getBangCap());
        }
        //System.out.println("ID GUI" + employeeModel);     
        cb_bangcap.setModel(model2);
        employeeListModel.clear();
    }

    private void LoadBoPhan() {
        DefaultComboBoxModel model4 = new DefaultComboBoxModel();
        ArrayList<Employee> employeeListModel = employeeBLL.ReadCBBoPhanBll();
        Employee employeeModel = new Employee();
        for (int i = 0; i < employeeListModel.size(); i++) {
            employeeModel = employeeListModel.get(i);
            model4.addElement(employeeModel.getBoPhan());
        }
        //System.out.println("ID GUI" + employeeModel);     
        cb_bophan.setModel(model4);
        employeeListModel.clear();
    }

    private void LoadChucDanh() {
        DefaultComboBoxModel model5 = new DefaultComboBoxModel();
        ArrayList<Employee> employeeListModel = employeeBLL.ReadCBChucDanhBll();
        Employee employeeModel = new Employee();
        for (int i = 0; i < employeeListModel.size(); i++) {
            employeeModel = employeeListModel.get(i);
            model5.addElement(employeeModel.getChucDanh());
        }
        //System.out.println("ID GUI" + employeeModel);     
        cb_chucdanh.setModel(model5);
        employeeListModel.clear();
    }

    private void LoadChucVu() {
        DefaultComboBoxModel model6 = new DefaultComboBoxModel();
        ArrayList<Employee> employeeListModel = employeeBLL.ReadCBChucVuBll();
        Employee employeeModel = new Employee();
        for (int i = 0; i < employeeListModel.size(); i++) {
            employeeModel = employeeListModel.get(i);
            model6.addElement(employeeModel.getChucVu());
        }
        //System.out.println("ID GUI" + employeeModel);     
        cb_chucvu.setModel(model6);
        employeeListModel.clear();
    }

    private void LoadNoiCapCMND() {
        DefaultComboBoxModel model7 = new DefaultComboBoxModel();
        ArrayList<Employee> employeeListModel = employeeBLL.ReadCBCMNDBll();
        Employee employeeModel = new Employee();
        for (int i = 0; i < employeeListModel.size(); i++) {
            employeeModel = employeeListModel.get(i);
            model7.addElement(employeeModel.getNoiCapCMND());
        }
        //System.out.println("ID GUI" + employeeModel);     
        cb_noicapcmnd.setModel(model7);
        employeeListModel.clear();
    }

    private void LoadDanToc() {
        DefaultComboBoxModel model8 = new DefaultComboBoxModel();
        ArrayList<Employee> employeeListModel = employeeBLL.ReadCBDanTocBll();
        Employee employeeModel = new Employee();
        for (int i = 0; i < employeeListModel.size(); i++) {
            employeeModel = employeeListModel.get(i);
            model8.addElement(employeeModel.getDanToc());
        }
        //System.out.println("ID GUI" + employeeModel);     
        cb_dantoc.setModel(model8);
        employeeListModel.clear();
    }

    private void LoadDiaDiemLamViec() {
        DefaultComboBoxModel model9 = new DefaultComboBoxModel();
        ArrayList<Employee> employeeListModel = employeeBLL.ReadCBDiaDiemLamViecBll();
        Employee employeeModel = new Employee();
        for (int i = 0; i < employeeListModel.size(); i++) {
            employeeModel = employeeListModel.get(i);
            model9.addElement(employeeModel.getDiaDiemLamViec());
        }
        //System.out.println("ID GUI" + employeeModel);     
        cb_diadiemlamviec.setModel(model9);
        employeeListModel.clear();
    }

    private void LoadDonVi() {
        DefaultComboBoxModel model10 = new DefaultComboBoxModel();
        ArrayList<Employee> employeeListModel = employeeBLL.ReadCBDonViBll();
        Employee employeeModel = new Employee();
        for (int i = 0; i < employeeListModel.size(); i++) {
            employeeModel = employeeListModel.get(i);
            model10.addElement(employeeModel.getDonVi());
        }
        //System.out.println("ID GUI" + employeeModel);     
        cb_donvi.setModel(model10);
        employeeListModel.clear();
    }

    private void LoadLoaiNV() {
        DefaultComboBoxModel model11 = new DefaultComboBoxModel();
        ArrayList<Employee> employeeListModel = employeeBLL.ReadCBLoaiNVBll();
        Employee employeeModel = new Employee();
        for (int i = 0; i < employeeListModel.size(); i++) {
            employeeModel = employeeListModel.get(i);
            model11.addElement(employeeModel.getLoaiNhanVien());
        }
        //System.out.println("ID GUI" + employeeModel);     
        cb_loainv.setModel(model11);
        employeeListModel.clear();
    }

    private void LoadNganHang() {
        DefaultComboBoxModel model12 = new DefaultComboBoxModel();
        ArrayList<Employee> employeeListModel = employeeBLL.ReadCBNganHangBll();
        Employee employeeModel = new Employee();
        for (int i = 0; i < employeeListModel.size(); i++) {
            employeeModel = employeeListModel.get(i);
            model12.addElement(employeeModel.getNganHang());
        }
        //System.out.println("ID GUI" + employeeModel);     
        cb_nganhang.setModel(model12);
        employeeListModel.clear();
    }

    private void LoadPhongBan() {
        DefaultComboBoxModel model13 = new DefaultComboBoxModel();
        ArrayList<Employee> employeeListModel = employeeBLL.ReadCBPhongBanBll();
        Employee employeeModel = new Employee();
        for (int i = 0; i < employeeListModel.size(); i++) {
            employeeModel = employeeListModel.get(i);
            model13.addElement(employeeModel.getPhongBan());
        }
        //System.out.println("ID GUI" + employeeModel);     
        cb_phongban.setModel(model13);
        employeeListModel.clear();
    }

    private void LoadTonGiao() {
        DefaultComboBoxModel model14 = new DefaultComboBoxModel();
        ArrayList<Employee> employeeListModel = employeeBLL.ReadCBTonGiaoBll();
        Employee employeeModel = new Employee();
        for (int i = 0; i < employeeListModel.size(); i++) {
            employeeModel = employeeListModel.get(i);
            model14.addElement(employeeModel.getTonGiao());
        }
        //System.out.println("ID GUI" + employeeModel);     
        cb_tongiao.setModel(model14);
        employeeListModel.clear();
    }

    private void LoadTrinhDo() {
        DefaultComboBoxModel model15 = new DefaultComboBoxModel();
        ArrayList<Employee> employeeListModel = employeeBLL.ReadCBTrinhDoBll();
        Employee employeeModel = new Employee();
        for (int i = 0; i < employeeListModel.size(); i++) {
            employeeModel = employeeListModel.get(i);
            model15.addElement(employeeModel.getTrinhDo());
        }
        //System.out.println("ID GUI" + employeeModel);     
        cb_trinhdo.setModel(model15);
        employeeListModel.clear();
    }

    private void LoadTTHN() {
        DefaultComboBoxModel model16 = new DefaultComboBoxModel();
        ArrayList<Employee> employeeListModel = employeeBLL.ReadCBTTHNBll();
        Employee employeeModel = new Employee();
        for (int i = 0; i < employeeListModel.size(); i++) {
            employeeModel = employeeListModel.get(i);
            model16.addElement(employeeModel.getTinhTrangHonNhan());
        }
        //System.out.println("ID GUI" + employeeModel);     
        cb_tthn.setModel(model16);
        employeeListModel.clear();
    }

    private void LoadQuocTich() {
        DefaultComboBoxModel model17 = new DefaultComboBoxModel();
        ArrayList<Employee> employeeListModel = employeeBLL.ReadCBQuocTichBll();
        Employee employeeModel = new Employee();
        for (int i = 0; i < employeeListModel.size(); i++) {
            employeeModel = employeeListModel.get(i);
            model17.addElement(employeeModel.getQuocTich());
        }
        //System.out.println("ID GUI" + employeeModel);     
        cb_quoctich.setModel(model17);
        employeeListModel.clear();
    }
    public void stateButton(boolean value) {
//        
//        btNew.setVisible(value);
//        btEdit.setVisible(value);
//        btDelete.setVisible(value);
//        btPrint.setVisible(value);
//        btClose.setVisible(value);
        btn_luu.setVisible(!value);
        btn_cancel.setVisible(!value);
//        
    }

    protected boolean validateInput() {
        int MaNV = Integer.parseInt(txt_manv.getText());
        String cbPhai = cb_phai.getSelectedItem().toString();
        int CMND = Integer.parseInt(txt_cmnd.getText());
        String NgayCapCM = ns.format(date_ngaycapCMND.getDate());
        String cbNoiCapCM = cb_noicapcmnd.getSelectedItem().toString();
        String Sothe = txt_sothe.getText();
        String HoTen = txt_hoten.getText();
        String NamSinh = ns.format(date_namsinh.getDate());
        String cbNS = cb_noisinh.getSelectedItem().toString();
        String DiaChiThuongTru = txt_diachithuongtru.getText();
        String DiaChiTamTru = txt_diachitamtru.getText();
        int DienThoaiThuongChu = Integer.parseInt(txt_dienthoaithuongtru.getText());
        int DiDong = Integer.parseInt(txt_dienthoaididong.getText());
        String Email = txt_email.getText();
        String NgayVaoDoan = ns.format(date_tongiao.getDate());
        String NgayVaoDang = ns.format(date_ngayvaodang.getDate());
        String cbDt = cb_dantoc.getSelectedItem().toString();
        String cbTG = cb_tongiao.getSelectedItem().toString();
        String cbQuocTich = cb_quoctich.getSelectedItem().toString();
        int Passport = Integer.parseInt(txt_pasport.getText());
        String NgayCapPassport = ns.format(date_ngaycappassport.getDate());
        String NoiCapPassport = txt_noicappassport.getText();
        String cbTTHN = cb_tthn.getSelectedItem().toString();
        int MaSoThue = Integer.parseInt(txt_masothue.getText());
        String NgayCapMST = ns.format(date_ngaycapmst.getDate());
        int SoTaiKhoan = Integer.parseInt(txt_sotaikhoan.getText());
        String MaTaiKhoan = txt_mataikhoan.getText();
        String cbNH = cb_nganhang.getSelectedItem().toString();
        String cbTD = cb_trinhdo.getSelectedItem().toString();
        String cbBC = cb_bangcap.getSelectedItem().toString();
        String HocHam = txt_hocham.getText();
        String ChuyenMon = txt_chuyenmon.getText();
        String KNLVChuyenMon = txt_knchuyenmon_nam.getText();
        String cbLNV = cb_loainv.getSelectedItem().toString();
        String cbDV = cb_donvi.getSelectedItem().toString();
        String cbPB = cb_phongban.getSelectedItem().toString();
        String cbBP = cb_bophan.getSelectedItem().toString();
        String cbCD = cb_chucdanh.getSelectedItem().toString();
        String cbCV = cb_chucvu.getSelectedItem().toString();
        String cbDDLV = cb_diadiemlamviec.getSelectedItem().toString();
        String LuongTV = txt_luongthuviec.getText();
        String LuongCB = txt_luongcoban.getText();
        String LuongKD = txt_luongkinhdoanh.getText();
        String NgayVaoCty = ns.format(date_ngayvaocty.getDate());
        String NgayHetHanTV = ns.format(date_ngayhethan.getDate());
        String NgayVaoChinhThuc = ns.format(date_ngayvaochinhthuc.getDate());
        if (employeeModel == null) {
            employeeModel = new Employee();
        }
        employeeModel.setMaNV(MaNV);
        employeeModel.setPhai(cbPhai);
        employeeModel.setCMND(CMND);
        employeeModel.setNgayCapCMND(NgayCapCM);
        employeeModel.setNoiCapCMND(cbNoiCapCM);
        employeeModel.setSothe(Sothe);
        employeeModel.setHoTen(HoTen);
        employeeModel.setNamSinh(NamSinh);
        employeeModel.setNoiSinh(cbNS);
        employeeModel.setDiaChiThuongTru(DiaChiThuongTru);
        employeeModel.setDiaChiTamTru(DiaChiTamTru);
        employeeModel.setDienThoaiThuongTru(DienThoaiThuongChu);
        employeeModel.setDiDong(DiDong);
        employeeModel.setEmail(Email);
        employeeModel.setNgayVaoDoan(NgayVaoDoan);
        employeeModel.setNgayVaoDang(NgayVaoDang);
        employeeModel.setDanToc(cbDt);
        employeeModel.setTonGiao(cbTG);
        employeeModel.setQuocTich(cbQuocTich);
        employeeModel.setPassport(Passport);
        employeeModel.setNgayCapPassport(NgayCapPassport);
        employeeModel.setNoiCapPassport(NoiCapPassport);
        employeeModel.setTinhTrangHonNhan(cbTTHN);
        employeeModel.setMaSoThue(MaSoThue);
        employeeModel.setNgayCapMST(NgayCapMST);
        employeeModel.setSoTaiKhoan(SoTaiKhoan);
        employeeModel.setMaTaiKhoan(MaTaiKhoan);
        employeeModel.setNganHang(cbNH);
        employeeModel.setTrinhDo(cbTD);
        employeeModel.setBangCap(cbBC);
        employeeModel.setHocHam(HocHam);
        employeeModel.setChuyenMon(ChuyenMon);
        employeeModel.setKNLVChuyenMon(KNLVChuyenMon);
        employeeModel.setLoaiNhanVien(cbLNV);
        employeeModel.setDonVi(cbDV);
        employeeModel.setPhongBan(cbPB);
        employeeModel.setBoPhan(cbBP);
        employeeModel.setChucDanh(cbCD);
        employeeModel.setChucVu(cbCV);
        employeeModel.setDiaDiemLamViec(cbDDLV);
        employeeModel.setLuongThuViec(LuongTV);
        employeeModel.setLuongCB(LuongCB);
        employeeModel.setLuongKD(LuongKD);
        employeeModel.setNgayVaoCty(NgayVaoCty);
        employeeModel.setNgayVaoChinhThuc(NgayVaoChinhThuc);
        employeeModel.setNgayHetHanTV(NgayHetHanTV);
        
        employeeBLL.AddNewEmployeeDAL(employeeModel);
        return true;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txt_manv = new javax.swing.JTextField();
        cb_phai = new javax.swing.JComboBox<>();
        txt_cmnd = new javax.swing.JTextField();
        txt_diachithuongtru = new javax.swing.JTextField();
        txt_diachitamtru = new javax.swing.JTextField();
        txt_email = new javax.swing.JTextField();
        cb_dantoc = new javax.swing.JComboBox<>();
        txt_pasport = new javax.swing.JTextField();
        cb_tthn = new javax.swing.JComboBox<>();
        txt_sotaikhoan = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txt_sothe = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        cb_tongiao = new javax.swing.JComboBox<>();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        txt_masothue = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        txt_mataikhoan = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        txt_hoten = new javax.swing.JTextField();
        cb_noisinh = new javax.swing.JComboBox<>();
        cb_noicapcmnd = new javax.swing.JComboBox<>();
        txt_dienthoaithuongtru = new javax.swing.JTextField();
        txt_dienthoaididong = new javax.swing.JTextField();
        cb_quoctich = new javax.swing.JComboBox<>();
        txt_noicappassport = new javax.swing.JTextField();
        cb_nganhang = new javax.swing.JComboBox<>();
        jPanel3 = new javax.swing.JPanel();
        btn_chonhinh = new javax.swing.JButton();
        date_namsinh = new com.toedter.calendar.JDateChooser();
        date_ngaycapCMND = new com.toedter.calendar.JDateChooser();
        date_tongiao = new com.toedter.calendar.JDateChooser();
        date_ngayvaodang = new com.toedter.calendar.JDateChooser();
        date_ngaycappassport = new com.toedter.calendar.JDateChooser();
        date_ngaycapmst = new com.toedter.calendar.JDateChooser();
        jPanel4 = new javax.swing.JPanel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        cb_trinhdo = new javax.swing.JComboBox<>();
        jLabel31 = new javax.swing.JLabel();
        cb_bangcap = new javax.swing.JComboBox<>();
        txt_chuyenmon = new javax.swing.JTextField();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        txt_hocham = new javax.swing.JTextField();
        txt_knchuyenmon_nam = new javax.swing.JTextField();
        jLabel34 = new javax.swing.JLabel();
        txt_knchuyenmon_thang = new javax.swing.JTextField();
        jLabel35 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        cb_loainv = new javax.swing.JComboBox<>();
        date_ngayvaochinhthuc = new com.toedter.calendar.JDateChooser();
        jLabel38 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        date_ngayvaocty = new com.toedter.calendar.JDateChooser();
        date_ngayhethan = new com.toedter.calendar.JDateChooser();
        jPanel6 = new javax.swing.JPanel();
        jLabel40 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        cb_donvi = new javax.swing.JComboBox<>();
        cb_chucdanh = new javax.swing.JComboBox<>();
        jLabel42 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        cb_phongban = new javax.swing.JComboBox<>();
        cb_chucvu = new javax.swing.JComboBox<>();
        jLabel44 = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        cb_bophan = new javax.swing.JComboBox<>();
        cb_diadiemlamviec = new javax.swing.JComboBox<>();
        jPanel7 = new javax.swing.JPanel();
        jLabel46 = new javax.swing.JLabel();
        txt_luongthuviec = new javax.swing.JTextField();
        jLabel47 = new javax.swing.JLabel();
        txt_luongcoban = new javax.swing.JTextField();
        jLabel48 = new javax.swing.JLabel();
        txt_luongkinhdoanh = new javax.swing.JTextField();
        btn_cancel = new javax.swing.JButton();
        btn_luu = new javax.swing.JButton();
        btn_sua = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Thông tin nhân viên");
        setResizable(false);

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Thông tin cá nhân", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(0, 204, 51))); // NOI18N
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Mã NV*");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 14, 100, -1));

        jLabel2.setText("Phái*");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 45, 100, -1));

        jLabel3.setText("CMND*");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 76, 100, -1));

        jLabel4.setText("Địa chỉ thường trú");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 109, 100, -1));

        jLabel5.setText("Địa chỉ tạm trú");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, 100, -1));

        jLabel6.setText("Email");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 166, 100, -1));

        jLabel7.setText("Dân tộc");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 192, 100, -1));

        jLabel8.setText("Passport");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 218, 100, -1));

        jLabel9.setText("Tình trạng hôn nhân");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 249, 100, -1));

        jLabel10.setText("Số tài khoản");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 280, 100, -1));
        jPanel2.add(txt_manv, new org.netbeans.lib.awtextra.AbsoluteConstraints(114, 11, 171, -1));

        cb_phai.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel2.add(cb_phai, new org.netbeans.lib.awtextra.AbsoluteConstraints(114, 42, 171, -1));
        jPanel2.add(txt_cmnd, new org.netbeans.lib.awtextra.AbsoluteConstraints(114, 73, 171, -1));
        jPanel2.add(txt_diachithuongtru, new org.netbeans.lib.awtextra.AbsoluteConstraints(114, 106, 456, -1));
        jPanel2.add(txt_diachitamtru, new org.netbeans.lib.awtextra.AbsoluteConstraints(114, 137, 456, -1));
        jPanel2.add(txt_email, new org.netbeans.lib.awtextra.AbsoluteConstraints(114, 163, 167, -1));

        cb_dantoc.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel2.add(cb_dantoc, new org.netbeans.lib.awtextra.AbsoluteConstraints(114, 189, 167, -1));
        jPanel2.add(txt_pasport, new org.netbeans.lib.awtextra.AbsoluteConstraints(114, 215, 167, -1));

        cb_tthn.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel2.add(cb_tthn, new org.netbeans.lib.awtextra.AbsoluteConstraints(114, 246, 167, -1));
        jPanel2.add(txt_sotaikhoan, new org.netbeans.lib.awtextra.AbsoluteConstraints(114, 277, 167, -1));

        jLabel11.setText("Số thẻ");
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(289, 14, 100, -1));
        jPanel2.add(txt_sothe, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 11, 180, -1));

        jLabel12.setText("Năm sinh");
        jPanel2.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(289, 45, 100, -1));

        jLabel13.setText("Ngày cấp CMND");
        jPanel2.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(289, 76, 100, -1));

        jLabel14.setText("Ngày vào đoàn");
        jPanel2.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(285, 166, 100, -1));

        jLabel15.setText("Tôn giáo");
        jPanel2.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(285, 192, 100, -1));

        cb_tongiao.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel2.add(cb_tongiao, new org.netbeans.lib.awtextra.AbsoluteConstraints(395, 189, 175, -1));

        jLabel16.setText("Ngày cấp passport");
        jPanel2.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(285, 218, 100, -1));

        jLabel17.setText("Mã số thuế");
        jPanel2.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(285, 249, 100, -1));
        jPanel2.add(txt_masothue, new org.netbeans.lib.awtextra.AbsoluteConstraints(395, 246, 175, -1));

        jLabel18.setText("Mã tài khoản");
        jPanel2.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(285, 280, 100, -1));
        jPanel2.add(txt_mataikhoan, new org.netbeans.lib.awtextra.AbsoluteConstraints(395, 277, 175, -1));

        jLabel19.setText("Họ tên");
        jPanel2.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(574, 14, 100, -1));

        jLabel20.setText("Nơi sinh");
        jPanel2.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(574, 45, 100, -1));

        jLabel21.setText("Nơi cấp CMND");
        jPanel2.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(574, 76, -1, -1));

        jLabel22.setText("Điên thoại thường trú");
        jPanel2.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(574, 109, 100, -1));

        jLabel23.setText("Di động");
        jPanel2.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(574, 140, 100, -1));

        jLabel24.setText("Ngày vào đảng");
        jPanel2.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(574, 166, 100, -1));

        jLabel25.setText("Quốc tịch");
        jPanel2.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(574, 192, 100, -1));

        jLabel26.setText("Nơi cấp passport");
        jPanel2.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(574, 218, 100, -1));

        jLabel27.setText("Ngày cấp MST");
        jPanel2.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(574, 249, -1, -1));

        jLabel28.setText("Ngân hàng");
        jPanel2.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(574, 280, 100, -1));
        jPanel2.add(txt_hoten, new org.netbeans.lib.awtextra.AbsoluteConstraints(678, 11, 203, -1));

        cb_noisinh.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel2.add(cb_noisinh, new org.netbeans.lib.awtextra.AbsoluteConstraints(678, 42, 203, -1));

        cb_noicapcmnd.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel2.add(cb_noicapcmnd, new org.netbeans.lib.awtextra.AbsoluteConstraints(678, 73, 203, -1));
        jPanel2.add(txt_dienthoaithuongtru, new org.netbeans.lib.awtextra.AbsoluteConstraints(678, 106, 203, -1));
        jPanel2.add(txt_dienthoaididong, new org.netbeans.lib.awtextra.AbsoluteConstraints(678, 137, 203, -1));

        cb_quoctich.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel2.add(cb_quoctich, new org.netbeans.lib.awtextra.AbsoluteConstraints(678, 189, 203, -1));
        jPanel2.add(txt_noicappassport, new org.netbeans.lib.awtextra.AbsoluteConstraints(678, 215, 203, -1));

        cb_nganhang.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel2.add(cb_nganhang, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 270, 200, -1));

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Ảnh Thẻ", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14), new java.awt.Color(0, 153, 0))); // NOI18N

        btn_chonhinh.setText("Chọn ảnh");
        btn_chonhinh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_chonhinhActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(78, Short.MAX_VALUE)
                .addComponent(btn_chonhinh, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(73, 73, 73))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_chonhinh)
                .addContainerGap())
        );

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(887, 6, 260, 260));
        jPanel2.add(date_namsinh, new org.netbeans.lib.awtextra.AbsoluteConstraints(391, 40, 180, -1));
        jPanel2.add(date_ngaycapCMND, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 70, 180, -1));
        jPanel2.add(date_tongiao, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 160, 180, -1));
        jPanel2.add(date_ngayvaodang, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 160, 200, -1));
        jPanel2.add(date_ngaycappassport, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 220, 180, -1));
        jPanel2.add(date_ngaycapmst, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 240, 200, -1));

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Bằng cấp kinh nghiệm", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(0, 204, 51))); // NOI18N
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel29.setText("Trình độ");
        jPanel4.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 30, 100, -1));

        jLabel30.setText("Chuyên môn");
        jPanel4.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 86, 100, -1));

        cb_trinhdo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel4.add(cb_trinhdo, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 27, 167, -1));

        jLabel31.setText("Bằng cấp");
        jPanel4.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(287, 30, 100, -1));

        cb_bangcap.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel4.add(cb_bangcap, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 30, 175, -1));
        jPanel4.add(txt_chuyenmon, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 83, 460, -1));

        jLabel32.setText("Học hàm");
        jPanel4.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(574, 30, 100, -1));

        jLabel33.setText("KNLV chuyên môn");
        jPanel4.add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(574, 86, 100, -1));
        jPanel4.add(txt_hocham, new org.netbeans.lib.awtextra.AbsoluteConstraints(678, 27, 202, -1));
        jPanel4.add(txt_knchuyenmon_nam, new org.netbeans.lib.awtextra.AbsoluteConstraints(678, 83, 35, -1));

        jLabel34.setText("năm");
        jPanel4.add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(717, 86, 50, -1));
        jPanel4.add(txt_knchuyenmon_thang, new org.netbeans.lib.awtextra.AbsoluteConstraints(771, 83, 35, -1));

        jLabel35.setText("tháng");
        jPanel4.add(jLabel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 86, 50, -1));

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Ngày vào làm", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(0, 204, 51))); // NOI18N
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel36.setText("Loại nhân viên");
        jPanel5.add(jLabel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 30, 100, -1));

        jLabel37.setText("Ngày vào chính thức");
        jPanel5.add(jLabel37, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 73, 100, -1));

        cb_loainv.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel5.add(cb_loainv, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 27, 170, -1));
        jPanel5.add(date_ngayvaochinhthuc, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 67, 170, -1));

        jLabel38.setText("Ngày vào công ty");
        jPanel5.add(jLabel38, new org.netbeans.lib.awtextra.AbsoluteConstraints(284, 30, 100, -1));

        jLabel39.setText("Ngày hết hạn TV");
        jPanel5.add(jLabel39, new org.netbeans.lib.awtextra.AbsoluteConstraints(573, 27, 100, 20));
        jPanel5.add(date_ngayvaocty, new org.netbeans.lib.awtextra.AbsoluteConstraints(394, 27, 175, -1));
        jPanel5.add(date_ngayhethan, new org.netbeans.lib.awtextra.AbsoluteConstraints(677, 27, 202, -1));

        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Nơi làm việc", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(0, 204, 51))); // NOI18N
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel40.setText("Đơn vị ");
        jPanel6.add(jLabel40, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 30, 100, -1));

        jLabel41.setText("Chức danh");
        jPanel6.add(jLabel41, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 73, 100, -1));

        cb_donvi.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel6.add(cb_donvi, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 27, 170, -1));

        cb_chucdanh.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel6.add(cb_chucdanh, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 70, 170, -1));

        jLabel42.setText("Phòng ban ");
        jPanel6.add(jLabel42, new org.netbeans.lib.awtextra.AbsoluteConstraints(371, 27, 100, 20));

        jLabel43.setText("Chức vụ");
        jPanel6.add(jLabel43, new org.netbeans.lib.awtextra.AbsoluteConstraints(371, 70, 100, 20));

        cb_phongban.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel6.add(cb_phongban, new org.netbeans.lib.awtextra.AbsoluteConstraints(481, 27, 175, -1));

        cb_chucvu.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel6.add(cb_chucvu, new org.netbeans.lib.awtextra.AbsoluteConstraints(481, 70, 175, -1));

        jLabel44.setText("Bộ phận");
        jPanel6.add(jLabel44, new org.netbeans.lib.awtextra.AbsoluteConstraints(747, 30, 100, -1));

        jLabel45.setText("Địa điểm làm việc");
        jPanel6.add(jLabel45, new org.netbeans.lib.awtextra.AbsoluteConstraints(747, 73, 100, -1));

        cb_bophan.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel6.add(cb_bophan, new org.netbeans.lib.awtextra.AbsoluteConstraints(938, 27, 202, -1));

        cb_diadiemlamviec.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel6.add(cb_diadiemlamviec, new org.netbeans.lib.awtextra.AbsoluteConstraints(938, 70, 202, -1));

        jPanel7.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Thông tin lương nhân viên", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(0, 204, 51))); // NOI18N
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel46.setText("Lương thử việc");
        jLabel46.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel7.add(jLabel46, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 48, 100, -1));
        jPanel7.add(txt_luongthuviec, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 45, 250, -1));

        jLabel47.setText("Lương CB");
        jPanel7.add(jLabel47, new org.netbeans.lib.awtextra.AbsoluteConstraints(399, 48, 100, -1));
        jPanel7.add(txt_luongcoban, new org.netbeans.lib.awtextra.AbsoluteConstraints(503, 45, 250, -1));

        jLabel48.setText("Lương KD");
        jPanel7.add(jLabel48, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 48, 100, -1));
        jPanel7.add(txt_luongkinhdoanh, new org.netbeans.lib.awtextra.AbsoluteConstraints(904, 45, 250, -1));

        btn_cancel.setText("Hủy");
        btn_cancel.setPreferredSize(new java.awt.Dimension(75, 23));
        btn_cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cancelActionPerformed(evt);
            }
        });

        btn_luu.setText("Ghi");
        btn_luu.setPreferredSize(new java.awt.Dimension(75, 23));
        btn_luu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_luuActionPerformed(evt);
            }
        });

        btn_sua.setText("Sửa");
        btn_sua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_suaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_luu, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(104, 104, 104)
                .addComponent(btn_sua, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(123, 123, 123)
                .addComponent(btn_cancel, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 309, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_cancel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(25, 25, 25))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn_luu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_sua))
                        .addContainerGap(18, Short.MAX_VALUE))))
        );

        jScrollPane1.setViewportView(jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1176, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 641, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    public SimpleDateFormat ns = new SimpleDateFormat("dd-mm-yyyy");
    private void btn_luuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_luuActionPerformed
        if (validateInput()) {
            dispose();
        }
    }//GEN-LAST:event_btn_luuActionPerformed

    private void btn_cancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cancelActionPerformed
        this.dispose();
    }//GEN-LAST:event_btn_cancelActionPerformed

    private void btn_suaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_suaActionPerformed
        // TODO add your handling code here:
        int MaNV = Integer.parseInt(txt_manv.getText());
        String cbPhai = cb_phai.getSelectedItem().toString();
        int CMND = Integer.parseInt(txt_cmnd.getText());
        SimpleDateFormat ns = new SimpleDateFormat("dd-MM-yyyy");
        String NgayCapCM = ns.format(date_ngaycapCMND.getDate());
        String cbNoiCapCM = cb_noicapcmnd.getSelectedItem().toString();
        String Sothe = txt_sothe.getText();
        String HoTen = txt_hoten.getText();
        String NamSinh = ns.format(date_namsinh.getDate());
        String cbNS = cb_noisinh.getSelectedItem().toString();
        String DiaChiThuongTru = txt_diachithuongtru.getText();
        String DiaChiTamTru = txt_diachitamtru.getText();
        int DienThoaiThuongChu = Integer.parseInt(txt_dienthoaithuongtru.getText());
        int DiDong = Integer.parseInt(txt_dienthoaididong.getText());
        String Email = txt_email.getText();
        String NgayVaoDoan = ns.format(date_tongiao.getDate());
        String NgayVaoDang = ns.format(date_ngayvaodang.getDate());
        String cbDt = cb_dantoc.getSelectedItem().toString();
        String cbTG = cb_tongiao.getSelectedItem().toString();
        String cbQuocTich = cb_quoctich.getSelectedItem().toString();
        int Passport = Integer.parseInt(txt_pasport.getText());
        String NgayCapPassport = ns.format(date_ngaycappassport.getDate());
        String NoiCapPassport = txt_noicappassport.getText();
        String cbTTHN = cb_tthn.getSelectedItem().toString();
        int MaSoThue = Integer.parseInt(txt_masothue.getText());
        String NgayCapMST = ns.format(date_ngaycapmst.getDate());
        int SoTaiKhoan = Integer.parseInt(txt_sotaikhoan.getText());
        String MaTaiKhoan = txt_mataikhoan.getText();
        String cbNH = cb_nganhang.getSelectedItem().toString();
        String cbTD = cb_trinhdo.getSelectedItem().toString();
        String cbBC = cb_bangcap.getSelectedItem().toString();
        String HocHam = txt_hocham.getText();
        String ChuyenMon = txt_chuyenmon.getText();
        String KNLVChuyenMon = txt_knchuyenmon_nam.getText();
        String cbLNV = cb_loainv.getSelectedItem().toString();
        String cbDV = cb_donvi.getSelectedItem().toString();
        String cbPB = cb_phongban.getSelectedItem().toString();
        String cbBP = cb_bophan.getSelectedItem().toString();
        String cbCD = cb_chucdanh.getSelectedItem().toString();
        String cbCV = cb_chucvu.getSelectedItem().toString();
        String cbDDLV = cb_diadiemlamviec.getSelectedItem().toString();
        String LuongTV = txt_luongthuviec.getText();
        String LuongCB = txt_luongcoban.getText();
        String LuongKD = txt_luongkinhdoanh.getText();
        String NgayVaoCty = ns.format(date_ngayvaocty.getDate());
        String NgayHetHanTV = ns.format(date_ngayhethan.getDate());
        String NgayVaoChinhThuc = ns.format(date_ngayvaochinhthuc.getDate());
        employeeModel.setMaNV(MaNV);
        employeeModel.setPhai(cbPhai);
        employeeModel.setCMND(CMND);
        employeeModel.setNgayCapCMND(NgayCapCM);
        employeeModel.setNoiCapCMND(cbNoiCapCM);
        employeeModel.setSothe(Sothe);
        employeeModel.setHoTen(HoTen);
        employeeModel.setNamSinh(NamSinh);
        employeeModel.setNoiSinh(cbNS);
        employeeModel.setDiaChiThuongTru(DiaChiThuongTru);
        employeeModel.setDiaChiTamTru(DiaChiTamTru);
        employeeModel.setDienThoaiThuongTru(DienThoaiThuongChu);
        employeeModel.setDiDong(DiDong);
        employeeModel.setEmail(Email);
        employeeModel.setNgayVaoDoan(NgayVaoDoan);
        employeeModel.setNgayVaoDang(NgayVaoDang);
        employeeModel.setDanToc(cbDt);
        employeeModel.setTonGiao(cbTG);
        employeeModel.setQuocTich(cbQuocTich);
        employeeModel.setPassport(Passport);
        employeeModel.setNgayCapPassport(NgayCapPassport);
        employeeModel.setNoiCapPassport(NoiCapPassport);
        employeeModel.setTinhTrangHonNhan(cbTTHN);
        employeeModel.setMaSoThue(MaSoThue);
        employeeModel.setNgayCapMST(NgayCapMST);
        employeeModel.setSoTaiKhoan(SoTaiKhoan);
        employeeModel.setMaTaiKhoan(MaTaiKhoan);
        employeeModel.setNganHang(cbNH);
        employeeModel.setTrinhDo(cbTD);
        employeeModel.setBangCap(cbBC);
        employeeModel.setHocHam(HocHam);
        employeeModel.setChuyenMon(ChuyenMon);
        employeeModel.setKNLVChuyenMon(KNLVChuyenMon);
        employeeModel.setLoaiNhanVien(cbLNV);
        employeeModel.setDonVi(cbDV);
        employeeModel.setPhongBan(cbPB);
        employeeModel.setBoPhan(cbBP);
        employeeModel.setChucDanh(cbCD);
        employeeModel.setChucVu(cbCV);
        employeeModel.setDiaDiemLamViec(cbDDLV);
        employeeModel.setLuongThuViec(LuongTV);
        employeeModel.setLuongCB(LuongCB);
        employeeModel.setLuongKD(LuongKD);
        employeeModel.setNgayVaoCty(NgayVaoCty);
        employeeModel.setNgayVaoChinhThuc(NgayVaoChinhThuc);
        employeeModel.setNgayHetHanTV(NgayHetHanTV);
        employeeBLL.EditEmployeeDAL(employeeModel);
        btn_luu.setEnabled(false);
        dispose();
    }//GEN-LAST:event_btn_suaActionPerformed

    private void btn_chonhinhActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_chonhinhActionPerformed
        
    }//GEN-LAST:event_btn_chonhinhActionPerformed

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
            java.util.logging.Logger.getLogger(EmployeeGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EmployeeGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EmployeeGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EmployeeGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EmployeeGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_cancel;
    private javax.swing.JButton btn_chonhinh;
    public javax.swing.JButton btn_luu;
    private javax.swing.JButton btn_sua;
    public javax.swing.JComboBox<String> cb_bangcap;
    public javax.swing.JComboBox<String> cb_bophan;
    public javax.swing.JComboBox<String> cb_chucdanh;
    public javax.swing.JComboBox<String> cb_chucvu;
    public javax.swing.JComboBox<String> cb_dantoc;
    public javax.swing.JComboBox<String> cb_diadiemlamviec;
    public javax.swing.JComboBox<String> cb_donvi;
    public javax.swing.JComboBox<String> cb_loainv;
    public javax.swing.JComboBox<String> cb_nganhang;
    public javax.swing.JComboBox<String> cb_noicapcmnd;
    public javax.swing.JComboBox<String> cb_noisinh;
    public javax.swing.JComboBox<String> cb_phai;
    public javax.swing.JComboBox<String> cb_phongban;
    public javax.swing.JComboBox<String> cb_quoctich;
    public javax.swing.JComboBox<String> cb_tongiao;
    public javax.swing.JComboBox<String> cb_trinhdo;
    public javax.swing.JComboBox<String> cb_tthn;
    public com.toedter.calendar.JDateChooser date_namsinh;
    public com.toedter.calendar.JDateChooser date_ngaycapCMND;
    public com.toedter.calendar.JDateChooser date_ngaycapmst;
    public com.toedter.calendar.JDateChooser date_ngaycappassport;
    public com.toedter.calendar.JDateChooser date_ngayhethan;
    public com.toedter.calendar.JDateChooser date_ngayvaochinhthuc;
    public com.toedter.calendar.JDateChooser date_ngayvaocty;
    public com.toedter.calendar.JDateChooser date_ngayvaodang;
    public com.toedter.calendar.JDateChooser date_tongiao;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JTextField txt_chuyenmon;
    public javax.swing.JTextField txt_cmnd;
    public javax.swing.JTextField txt_diachitamtru;
    public javax.swing.JTextField txt_diachithuongtru;
    public javax.swing.JTextField txt_dienthoaididong;
    public javax.swing.JTextField txt_dienthoaithuongtru;
    public javax.swing.JTextField txt_email;
    public javax.swing.JTextField txt_hocham;
    public javax.swing.JTextField txt_hoten;
    public javax.swing.JTextField txt_knchuyenmon_nam;
    public javax.swing.JTextField txt_knchuyenmon_thang;
    public javax.swing.JTextField txt_luongcoban;
    public javax.swing.JTextField txt_luongkinhdoanh;
    public javax.swing.JTextField txt_luongthuviec;
    public javax.swing.JTextField txt_manv;
    public javax.swing.JTextField txt_masothue;
    public javax.swing.JTextField txt_mataikhoan;
    public javax.swing.JTextField txt_noicappassport;
    public javax.swing.JTextField txt_pasport;
    public javax.swing.JTextField txt_sotaikhoan;
    public javax.swing.JTextField txt_sothe;
    // End of variables declaration//GEN-END:variables
}
