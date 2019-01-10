/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author manng
 */
public class EmployeeDAL extends Database {

    public static Connection conn = null;
    public static Statement stmt = null;

    // Get Employee
    public ArrayList<Employee> readEmployee() {

        ArrayList<Employee> emlist = new ArrayList<>();
        conn = getConnection();
        try {
            stmt = conn.createStatement();
        } catch (SQLException ex) {
            Logger.getLogger(EmployeeDAL.class.getName()).log(Level.SEVERE, null, ex);
        }
        String sql = "SELECT * FROM nhanvien";
        ResultSet rs = null;
        try {
            rs = stmt.executeQuery(sql);
        } catch (SQLException ex) {
            Logger.getLogger(EmployeeDAL.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            while (rs.next()) {
                Employee em = new Employee();
                em.setMaNV(rs.getInt("MaNV"));
                em.setPhai(rs.getString("Phai"));
                em.setCMND(rs.getInt("CMND"));
                em.setNgayCapCMND(rs.getString("NgayCapCMND"));
                em.setNoiCapCMND(rs.getString("NoiCapCMND"));
                em.setSothe(rs.getString("Sothe"));
                em.setHoTen(rs.getString("HoTen"));
                em.setNamSinh(rs.getString("NamSinh"));
                em.setNoiSinh(rs.getString("NoiSinh"));
                em.setDiaChiThuongTru(rs.getString("DiaChiThuongTru"));
                em.setDiaChiTamTru(rs.getString("DiaChiTamTru"));
                em.setDienThoaiThuongTru(rs.getInt("DienThoaiThuongTru"));
                em.setDiDong(rs.getInt("DiDong"));
                em.setEmail(rs.getString("Email"));
                em.setNgayVaoDoan(rs.getString("NgayVaoDoan"));
                em.setNgayVaoDang(rs.getString("NgayVaoDang"));
                em.setDanToc(rs.getString("DanToc"));
                em.setTonGiao(rs.getString("TonGiao"));
                em.setQuocTich(rs.getString("QuocTich"));
                em.setPassport(rs.getInt("Passport"));
                em.setNgayCapPassport(rs.getString("NgayCapPassport"));
                em.setNoiCapPassport(rs.getString("NoiCapPassport"));
                em.setTinhTrangHonNhan(rs.getString("TinhTrangHonNhan"));
                em.setMaSoThue(rs.getInt("MaSoThue"));
                em.setNgayCapMST(rs.getString("NgayCapMST"));
                em.setSoTaiKhoan(rs.getInt("SoTaiKhoan"));
                em.setMaTaiKhoan(rs.getString("MaTaiKhoan"));
                em.setNganHang(rs.getString("NganHang"));
                em.setTrinhDo(rs.getString("TrinhDo"));
                em.setBangCap(rs.getString("BangCap"));
                em.setHocHam(rs.getString("HocHam"));
                em.setChuyenMon(rs.getString("ChuyenMon"));
                em.setKNLVChuyenMon(rs.getString("KNLVChuyenMon"));
                em.setLoaiNhanVien(rs.getString("LoaiNhanVien"));
                em.setDonVi(rs.getString("DonVi"));
                em.setPhongBan(rs.getString("PhongBan"));
                em.setBoPhan(rs.getString("BoPhan"));
                em.setChucDanh(rs.getString("ChucDanh"));
                em.setChucVu(rs.getString("ChucVu"));
                em.setDiaDiemLamViec(rs.getString("DiaDiemLamViec"));
                em.setLuongThuViec(rs.getString("LuongThuViec"));
                em.setLuongCB(rs.getString("LuongCB"));
                em.setLuongKD(rs.getString("LuongKD"));
                em.setNgayVaoCty(rs.getString("NgayVaoCty"));
                em.setNgayHetHanTV(rs.getString("NgayHetHanTV"));
                em.setNgayVaoChinhThuc(rs.getString("NgayVaoChinhThuc"));
                em.setImg(rs.getString("Img"));
                emlist.add(em);

            }
        } catch (SQLException ex) {
            Logger.getLogger(EmployeeDAL.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            return emlist;
        }

    }

    public ArrayList<Employee> readCBPhai() {

        ArrayList<Employee> emlist = new ArrayList<>();
        conn = getConnection();
        try {
            stmt = conn.createStatement();
        } catch (SQLException ex) {
            Logger.getLogger(EmployeeDAL.class.getName()).log(Level.SEVERE, null, ex);
        }
        String sql = "SELECT * FROM phai";
        ResultSet rs = null;
        try {
            rs = stmt.executeQuery(sql);
        } catch (SQLException ex) {
            Logger.getLogger(EmployeeDAL.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            while (rs.next()) {
                Employee em = new Employee();
                em.setPhai(rs.getString("TenPhai"));
                emlist.add(em);
            }
        } catch (SQLException ex) {
            Logger.getLogger(EmployeeDAL.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            return emlist;
        }

    }

    public ArrayList<Employee> readCBNoiSinh() {

        ArrayList<Employee> emlist = new ArrayList<>();
        conn = getConnection();
        try {
            stmt = conn.createStatement();
        } catch (SQLException ex) {
            Logger.getLogger(EmployeeDAL.class.getName()).log(Level.SEVERE, null, ex);
        }
        String sql = "SELECT * FROM noisinh";
        ResultSet rs = null;
        try {
            rs = stmt.executeQuery(sql);
        } catch (SQLException ex) {
            Logger.getLogger(EmployeeDAL.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            while (rs.next()) {
                Employee em = new Employee();
                em.setNoiSinh(rs.getString("TenNoiSinh"));
                emlist.add(em);
            }
        } catch (SQLException ex) {
            Logger.getLogger(EmployeeDAL.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            return emlist;
        }

    }

    public ArrayList<Employee> readCBBangCap() {

        ArrayList<Employee> emlist = new ArrayList<>();
        conn = getConnection();
        try {
            stmt = conn.createStatement();
        } catch (SQLException ex) {
            Logger.getLogger(EmployeeDAL.class.getName()).log(Level.SEVERE, null, ex);
        }
        String sql = "SELECT * FROM bangcap";
        ResultSet rs = null;
        try {
            rs = stmt.executeQuery(sql);
        } catch (SQLException ex) {
            Logger.getLogger(EmployeeDAL.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            while (rs.next()) {
                Employee em = new Employee();
                em.setBangCap(rs.getString("TenBangCap"));
                emlist.add(em);
            }
        } catch (SQLException ex) {
            Logger.getLogger(EmployeeDAL.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            return emlist;
        }

    }

    public ArrayList<Employee> readCBBoPhan() {

        ArrayList<Employee> emlist = new ArrayList<>();
        conn = getConnection();
        try {
            stmt = conn.createStatement();
        } catch (SQLException ex) {
            Logger.getLogger(EmployeeDAL.class.getName()).log(Level.SEVERE, null, ex);
        }
        String sql = "SELECT * FROM bophan";
        ResultSet rs = null;
        try {
            rs = stmt.executeQuery(sql);
        } catch (SQLException ex) {
            Logger.getLogger(EmployeeDAL.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            while (rs.next()) {
                Employee em = new Employee();
                em.setBoPhan(rs.getString("TenBoPhan"));
                emlist.add(em);
            }
        } catch (SQLException ex) {
            Logger.getLogger(EmployeeDAL.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            return emlist;
        }

    }

    public ArrayList<Employee> readCBChucDanh() {

        ArrayList<Employee> emlist = new ArrayList<>();
        conn = getConnection();
        try {
            stmt = conn.createStatement();
        } catch (SQLException ex) {
            Logger.getLogger(EmployeeDAL.class.getName()).log(Level.SEVERE, null, ex);
        }
        String sql = "SELECT * FROM chucdanh";
        ResultSet rs = null;
        try {
            rs = stmt.executeQuery(sql);
        } catch (SQLException ex) {
            Logger.getLogger(EmployeeDAL.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            while (rs.next()) {
                Employee em = new Employee();
                em.setChucDanh(rs.getString("TenChucDanh"));
                emlist.add(em);
            }
        } catch (SQLException ex) {
            Logger.getLogger(EmployeeDAL.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            return emlist;
        }

    }

    public ArrayList<Employee> readCBChucVu() {

        ArrayList<Employee> emlist = new ArrayList<>();
        conn = getConnection();
        try {
            stmt = conn.createStatement();
        } catch (SQLException ex) {
            Logger.getLogger(EmployeeDAL.class.getName()).log(Level.SEVERE, null, ex);
        }
        String sql = "SELECT * FROM chucvu";
        ResultSet rs = null;
        try {
            rs = stmt.executeQuery(sql);
        } catch (SQLException ex) {
            Logger.getLogger(EmployeeDAL.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            while (rs.next()) {
                Employee em = new Employee();
                em.setChucVu(rs.getString("TenChucVu"));
                emlist.add(em);
            }
        } catch (SQLException ex) {
            Logger.getLogger(EmployeeDAL.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            return emlist;
        }

    }

    public ArrayList<Employee> readCBCMND() {

        ArrayList<Employee> emlist = new ArrayList<>();
        conn = getConnection();
        try {
            stmt = conn.createStatement();
        } catch (SQLException ex) {
            Logger.getLogger(EmployeeDAL.class.getName()).log(Level.SEVERE, null, ex);
        }
        String sql = "SELECT * FROM noicapcmnd";
        ResultSet rs = null;
        try {
            rs = stmt.executeQuery(sql);
        } catch (SQLException ex) {
            Logger.getLogger(EmployeeDAL.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            while (rs.next()) {
                Employee em = new Employee();
                em.setNoiCapCMND(rs.getString("TenNoiCap"));
                emlist.add(em);
            }
        } catch (SQLException ex) {
            Logger.getLogger(EmployeeDAL.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            return emlist;
        }

    }

    public ArrayList<Employee> readCBDanToc() {

        ArrayList<Employee> emlist = new ArrayList<>();
        conn = getConnection();
        try {
            stmt = conn.createStatement();
        } catch (SQLException ex) {
            Logger.getLogger(EmployeeDAL.class.getName()).log(Level.SEVERE, null, ex);
        }
        String sql = "SELECT * FROM dantoc";
        ResultSet rs = null;
        try {
            rs = stmt.executeQuery(sql);
        } catch (SQLException ex) {
            Logger.getLogger(EmployeeDAL.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            while (rs.next()) {
                Employee em = new Employee();
                em.setDanToc(rs.getString("TenDanToc"));
                emlist.add(em);
            }
        } catch (SQLException ex) {
            Logger.getLogger(EmployeeDAL.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            return emlist;
        }

    }

    public ArrayList<Employee> readCBDiaDiemLamViec() {

        ArrayList<Employee> emlist = new ArrayList<>();
        conn = getConnection();
        try {
            stmt = conn.createStatement();
        } catch (SQLException ex) {
            Logger.getLogger(EmployeeDAL.class.getName()).log(Level.SEVERE, null, ex);
        }
        String sql = "SELECT * FROM diadiemlamviec";
        ResultSet rs = null;
        try {
            rs = stmt.executeQuery(sql);
        } catch (SQLException ex) {
            Logger.getLogger(EmployeeDAL.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            while (rs.next()) {
                Employee em = new Employee();
                em.setDiaDiemLamViec(rs.getString("TenDiaDiem"));
                emlist.add(em);
            }
        } catch (SQLException ex) {
            Logger.getLogger(EmployeeDAL.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            return emlist;
        }

    }

    public ArrayList<Employee> readCBDonVi() {

        ArrayList<Employee> emlist = new ArrayList<>();
        conn = getConnection();
        try {
            stmt = conn.createStatement();
        } catch (SQLException ex) {
            Logger.getLogger(EmployeeDAL.class.getName()).log(Level.SEVERE, null, ex);
        }
        String sql = "SELECT * FROM donvi";
        ResultSet rs = null;
        try {
            rs = stmt.executeQuery(sql);
        } catch (SQLException ex) {
            Logger.getLogger(EmployeeDAL.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            while (rs.next()) {
                Employee em = new Employee();
                em.setDonVi(rs.getString("TenDonVi"));
                emlist.add(em);
            }
        } catch (SQLException ex) {
            Logger.getLogger(EmployeeDAL.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            return emlist;
        }

    }

    public ArrayList<Employee> readCBLoaiNV() {

        ArrayList<Employee> emlist = new ArrayList<>();
        conn = getConnection();
        try {
            stmt = conn.createStatement();
        } catch (SQLException ex) {
            Logger.getLogger(EmployeeDAL.class.getName()).log(Level.SEVERE, null, ex);
        }
        String sql = "SELECT * FROM loainv";
        ResultSet rs = null;
        try {
            rs = stmt.executeQuery(sql);
        } catch (SQLException ex) {
            Logger.getLogger(EmployeeDAL.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            while (rs.next()) {
                Employee em = new Employee();
                em.setLoaiNhanVien(rs.getString("TenLoaiNV"));
                emlist.add(em);
            }
        } catch (SQLException ex) {
            Logger.getLogger(EmployeeDAL.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            return emlist;
        }

    }

    public ArrayList<Employee> readCBNganHang() {

        ArrayList<Employee> emlist = new ArrayList<>();
        conn = getConnection();
        try {
            stmt = conn.createStatement();
        } catch (SQLException ex) {
            Logger.getLogger(EmployeeDAL.class.getName()).log(Level.SEVERE, null, ex);
        }
        String sql = "SELECT * FROM nganhang";
        ResultSet rs = null;
        try {
            rs = stmt.executeQuery(sql);
        } catch (SQLException ex) {
            Logger.getLogger(EmployeeDAL.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            while (rs.next()) {
                Employee em = new Employee();
                em.setNganHang(rs.getString("TenNganHang"));
                emlist.add(em);
            }
        } catch (SQLException ex) {
            Logger.getLogger(EmployeeDAL.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            return emlist;
        }

    }

    public ArrayList<Employee> readCBPhongBan() {

        ArrayList<Employee> emlist = new ArrayList<>();
        conn = getConnection();
        try {
            stmt = conn.createStatement();
        } catch (SQLException ex) {
            Logger.getLogger(EmployeeDAL.class.getName()).log(Level.SEVERE, null, ex);
        }
        String sql = "SELECT * FROM phongban";
        ResultSet rs = null;
        try {
            rs = stmt.executeQuery(sql);
        } catch (SQLException ex) {
            Logger.getLogger(EmployeeDAL.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            while (rs.next()) {
                Employee em = new Employee();
                em.setPhongBan(rs.getString("TenPhongBan"));
                emlist.add(em);
            }
        } catch (SQLException ex) {
            Logger.getLogger(EmployeeDAL.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            return emlist;
        }

    }

    public ArrayList<Employee> readCBTonGiao() {

        ArrayList<Employee> emlist = new ArrayList<>();
        conn = getConnection();
        try {
            stmt = conn.createStatement();
        } catch (SQLException ex) {
            Logger.getLogger(EmployeeDAL.class.getName()).log(Level.SEVERE, null, ex);
        }
        String sql = "SELECT * FROM tongiao";
        ResultSet rs = null;
        try {
            rs = stmt.executeQuery(sql);
        } catch (SQLException ex) {
            Logger.getLogger(EmployeeDAL.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            while (rs.next()) {
                Employee em = new Employee();
                em.setTonGiao(rs.getString("TenTonGiao"));
                emlist.add(em);
            }
        } catch (SQLException ex) {
            Logger.getLogger(EmployeeDAL.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            return emlist;
        }

    }

    public ArrayList<Employee> readCBTrinhDo() {

        ArrayList<Employee> emlist = new ArrayList<>();
        conn = getConnection();
        try {
            stmt = conn.createStatement();
        } catch (SQLException ex) {
            Logger.getLogger(EmployeeDAL.class.getName()).log(Level.SEVERE, null, ex);
        }
        String sql = "SELECT * FROM trinhdo";
        ResultSet rs = null;
        try {
            rs = stmt.executeQuery(sql);
        } catch (SQLException ex) {
            Logger.getLogger(EmployeeDAL.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            while (rs.next()) {
                Employee em = new Employee();
                em.setTrinhDo(rs.getString("TenTrinhDo"));
                emlist.add(em);
            }
        } catch (SQLException ex) {
            Logger.getLogger(EmployeeDAL.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            return emlist;
        }

    }

    public ArrayList<Employee> readCBTTHN() {

        ArrayList<Employee> emlist = new ArrayList<>();
        conn = getConnection();
        try {
            stmt = conn.createStatement();
        } catch (SQLException ex) {
            Logger.getLogger(EmployeeDAL.class.getName()).log(Level.SEVERE, null, ex);
        }
        String sql = "SELECT * FROM tinhtranghonnhan";
        ResultSet rs = null;
        try {
            rs = stmt.executeQuery(sql);
        } catch (SQLException ex) {
            Logger.getLogger(EmployeeDAL.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            while (rs.next()) {
                Employee em = new Employee();
                em.setTinhTrangHonNhan(rs.getString("TenTTHN"));
                emlist.add(em);
            }
        } catch (SQLException ex) {
            Logger.getLogger(EmployeeDAL.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            return emlist;
        }

    }

    public ArrayList<Employee> readCBQuocTich() {

        ArrayList<Employee> emlist = new ArrayList<>();
        conn = getConnection();
        try {
            stmt = conn.createStatement();
        } catch (SQLException ex) {
            Logger.getLogger(EmployeeDAL.class.getName()).log(Level.SEVERE, null, ex);
        }
        String sql = "SELECT * FROM quoctich";
        ResultSet rs = null;
        try {
            rs = stmt.executeQuery(sql);
        } catch (SQLException ex) {
            Logger.getLogger(EmployeeDAL.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            while (rs.next()) {
                Employee em = new Employee();
                em.setQuocTich(rs.getString("TenQuocTich"));
                emlist.add(em);
            }
        } catch (SQLException ex) {
            Logger.getLogger(EmployeeDAL.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            return emlist;
        }

    }
    

    // Insert Emplemlistoyee 
    public void AddNewEmployee(Employee employeeModel) throws SQLException {
        conn = getConnection();
        try {
            stmt = conn.createStatement();
        } catch (SQLException ex) {
            Logger.getLogger(EmployeeDAL.class.getName()).log(Level.SEVERE, null, ex);
        }
        int MaNV = employeeModel.getMaNV();
        String Phai = employeeModel.getPhai();
        int CMND = employeeModel.getCMND();
        String NgayCapCMND = employeeModel.getNgayCapCMND();
        String NoiCapCMND = employeeModel.getNoiCapCMND();
        String Sothe = employeeModel.getSothe();
        String HoTen = employeeModel.getHoTen();
        String NamSinh = employeeModel.getNamSinh();
        String NoiSinh = employeeModel.getNoiSinh();
        String DiaChiThuongTru = employeeModel.getDiaChiThuongTru();
        String DiaChiTamTru = employeeModel.getDiaChiTamTru();
        int DienThoaiThuongTru = employeeModel.getDienThoaiThuongTru();
        int DiDong = employeeModel.getDiDong();
        String Email = employeeModel.getEmail();
        String NgayVaoDoan = employeeModel.getNgayVaoDoan();
        String NgayVaoDang = employeeModel.getNgayVaoDang();
        String DanToc = employeeModel.getDanToc();
        String TonGiao = employeeModel.getTonGiao();
        String QuocTich = employeeModel.getQuocTich();
        int Passport = employeeModel.getPassport();
        String NgayCapPassport = employeeModel.getNgayCapPassport();
        String NoiCapPassport = employeeModel.getNoiCapPassport();
        String TinhTrangHonNhan = employeeModel.getTinhTrangHonNhan();
        int MaSoThue = employeeModel.getMaSoThue();
        String NgayCapMST = employeeModel.getNgayCapMST();
        int SoTaiKhoan = employeeModel.getSoTaiKhoan();
        String MaTaiKhoan = employeeModel.getMaTaiKhoan();
        String NganHang = employeeModel.getNganHang();
        String TrinhDo = employeeModel.getTrinhDo();
        String BangCap = employeeModel.getBangCap();
        String HocHam = employeeModel.getHocHam();
        String ChuyenMon = employeeModel.getChuyenMon();
        String KNLVChuyenMon = employeeModel.getKNLVChuyenMon();
        String LoaiNhanVien = employeeModel.getLoaiNhanVien();
        String DonVi = employeeModel.getDonVi();
        String PhongBan = employeeModel.getPhongBan();
        String BoPhan = employeeModel.getBoPhan();
        String ChucDanh = employeeModel.getChucDanh();
        String ChucVu = employeeModel.getChucVu();
        String DiaDiemLamViec = employeeModel.getDiaDiemLamViec();
        String LuongThuViec = employeeModel.getLuongThuViec();
        String LuongCB = employeeModel.getLuongCB();
        String LuongKD = employeeModel.getLuongKD();
        String NgayVaoCty = employeeModel.getNgayVaoCty();
        String NgayHetHanTV = employeeModel.getNgayHetHanTV();
        String NgayVaoChinhThuc = employeeModel.getNgayVaoChinhThuc();
        String sql = "INSERT INTO `nhanvien`(`MaNV`, `Phai`, `CMND`, `NgayCapCMND`, `NoiCapCMND`, `Sothe`, `HoTen`, `NamSinh`, `NoiSinh`,"
                + " `DiaChiThuongTru`, `DiaChiTamTru`, `DienThoaiThuongTru`, `DiDong`, `Email`, `NgayVaoDoan`, `NgayVaoDang`, `DanToc`, `TonGiao`"
                + ", `QuocTich`, `Passport`, `NgayCapPassport`, `NoiCapPassport`, `TinhTrangHonNhan`, `MaSoThue`, `NgayCapMST`, `SoTaiKhoan`,"
                + " `MaTaiKhoan`, `NganHang`, `TrinhDo`, `BangCap`, `HocHam`, `ChuyenMon`, `KNLVChuyenMon`, `LoaiNhanVien`, `DonVi`, `PhongBan`, `BoPhan`, `ChucDanh`,"
                + " `ChucVu`, `DiaDiemLamViec`, `LuongThuViec`, `LuongCB`, `LuongKD`, `NgayVaoCty`, `NgayHetHanTV`, `NgayVaoChinhThuc`) "
                + "VALUES (" + MaNV + ",'" + Phai + "','" + CMND + "','" + NgayCapCMND + "','" + NoiCapCMND + "','" + Sothe + "','" + HoTen + "','" + NamSinh + "','" + NoiSinh + "','" + DiaChiThuongTru + "','" + DiaChiTamTru + "','" + DienThoaiThuongTru + "','" + DiDong + "','" + Email + "','" + NgayVaoDoan + "','" + NgayVaoDang + "','" + DanToc + "','" + TonGiao + "','" + QuocTich + "','" + Passport + "','" + NgayCapPassport + "','" + NoiCapPassport + "','" + TinhTrangHonNhan + "','" + MaSoThue + "','" + NgayCapMST + "','" + SoTaiKhoan + "','" + MaTaiKhoan + "','" + NganHang + "','" + TrinhDo + "','" + BangCap + "','" + HocHam + "','" + ChuyenMon + "','" + KNLVChuyenMon + "','" + LoaiNhanVien + "','" + DonVi + "','" + PhongBan + "','" + BoPhan + "','" + ChucDanh + "','" + ChucVu + "','" + DiaDiemLamViec + "','" + LuongThuViec + "','" + LuongCB + "','" + LuongKD + "','" + NgayVaoCty + "','" + NgayHetHanTV + "'," + NgayVaoChinhThuc + ")";
        stmt.executeUpdate(sql);

    }

    // Edit Employee 
    public void EditEmployee(Employee employeeModel) throws SQLException {
        conn = getConnection();
        try {
            stmt = conn.createStatement();
        } catch (SQLException ex) {
            Logger.getLogger(EmployeeDAL.class.getName()).log(Level.SEVERE, null, ex);
        }
        int MaNV = employeeModel.getMaNV();
        String Phai = employeeModel.getPhai();
        int CMND = employeeModel.getCMND();
        String NgayCapCMND = employeeModel.getNgayCapCMND();
        String NoiCapCMND = employeeModel.getNoiCapCMND();
        String Sothe = employeeModel.getSothe();
        String HoTen = employeeModel.getHoTen();
        String NamSinh = employeeModel.getNamSinh();
        String NoiSinh = employeeModel.getNoiSinh();
        String DiaChiThuongTru = employeeModel.getDiaChiThuongTru();
        String DiaChiTamTru = employeeModel.getDiaChiTamTru();
        int DienThoaiThuongTru = employeeModel.getDienThoaiThuongTru();
        int DiDong = employeeModel.getDiDong();
        String Email = employeeModel.getEmail();
        String NgayVaoDoan = employeeModel.getNgayVaoDoan();
        String NgayVaoDang = employeeModel.getNgayVaoDang();
        String DanToc = employeeModel.getDanToc();
        String TonGiao = employeeModel.getTonGiao();
        String QuocTich = employeeModel.getQuocTich();
        int Passport = employeeModel.getPassport();
        String NgayCapPassport = employeeModel.getNgayCapPassport();
        String NoiCapPassport = employeeModel.getNoiCapPassport();
        String TinhTrangHonNhan = employeeModel.getTinhTrangHonNhan();
        int MaSoThue = employeeModel.getMaSoThue();
        String NgayCapMST = employeeModel.getNgayCapMST();
        int SoTaiKhoan = employeeModel.getSoTaiKhoan();
        String MaTaiKhoan = employeeModel.getMaTaiKhoan();
        String NganHang = employeeModel.getNganHang();
        String TrinhDo = employeeModel.getTrinhDo();
        String BangCap = employeeModel.getBangCap();
        String HocHam = employeeModel.getHocHam();
        String ChuyenMon = employeeModel.getChuyenMon();
        String KNLVChuyenMon = employeeModel.getKNLVChuyenMon();
        String LoaiNhanVien = employeeModel.getLoaiNhanVien();
        String DonVi = employeeModel.getDonVi();
        String PhongBan = employeeModel.getPhongBan();
        String BoPhan = employeeModel.getBoPhan();
        String ChucDanh = employeeModel.getChucDanh();
        String ChucVu = employeeModel.getChucVu();
        String DiaDiemLamViec = employeeModel.getDiaDiemLamViec();
        String LuongThuViec = employeeModel.getLuongThuViec();
        String LuongCB = employeeModel.getLuongCB();
        String LuongKD = employeeModel.getLuongKD();
        String NgayVaoCty = employeeModel.getNgayVaoCty();
        String NgayHetHanTV = employeeModel.getNgayHetHanTV();
        String NgayVaoChinhThuc = employeeModel.getNgayVaoChinhThuc();
        String sql = "UPDATE nhanvien SET Phai = " + Phai + ", CMDN = '" + CMND + "',NgayCapCMND = '" + NgayCapCMND + "',"
                + " NoiCapCMND = '" + NoiCapCMND + "' , Sothe = '" + Sothe + ", HoTen = '" + HoTen + "', NamSinh = '" + NamSinh + "',"
                + " NoiSinh = '" + NoiSinh + "', DiaChiThuongTru = '" + DiaChiThuongTru + "', DiaChiTamTru = '" + DiaChiTamTru + "', DienThoaiThuongTru = '" + DienThoaiThuongTru + "',"
                + " DiDong = '" + DiDong + "', Email = '" + Email + "', NgayVaoDoan = '" + NgayVaoDoan + "', NgayVaoDang = '" + NgayVaoDang + "',"
                + " DanToc = '" + DanToc + "', TonGiao = '" + TonGiao + "', QuocTich = '" + QuocTich + "', Passport = '" + Passport + "',"
                + " NgayCapPassport = '" + NgayCapPassport + "', NoiCapPassport = '" + NoiCapPassport + "', TinhTrangHonNhan = '" + TinhTrangHonNhan + "',"
                + " MaSoThue = '" + MaSoThue + "', NgayCapMST = '" + NgayCapMST + "', SoTaiKhoan = '" + SoTaiKhoan + "', MaTaiKhoan = '" + MaTaiKhoan + "',"
                + " NganHang = '" + NganHang + "', TrinhDo = '" + TrinhDo + "', BangCap = '" + BangCap + "', HocHam = '" + HocHam + "',"
                + " ChuyenMon = '" + ChuyenMon + "', KNLVChuyenMon = '" + KNLVChuyenMon + "', LoaiNhanVien = '" + LoaiNhanVien + "', DonVi = '" + DonVi + "',"
                + " PhongBan = '" + PhongBan + "', BoPhan = '" + BoPhan + "', ChucDanh = '" + ChucDanh + "', ChucVu = '" + ChucVu + "',"
                + " DiaDiemLamViec = '" + DiaDiemLamViec + "', LuongThuViec = '" + LuongThuViec + "', LuongCB = '" + LuongCB + "',"
                + " LuongKD = '" + LuongKD + "', NgayVaoCty = '" + NgayVaoCty + "', NgayHetHanTV = '" + NgayHetHanTV + "',"
                + " NgayVaoChinhThuc = '" + NgayVaoChinhThuc + "'WHERE MaNV = " + MaNV + " ";
        stmt.executeUpdate(sql);

    }
    // Delete Employee 

    public void DeleteEmployee(int MaNV) throws SQLException {
        conn = getConnection();
        try {
            stmt = conn.createStatement();
            String sql = "DELETE FROM nhanvien WHERE MaNV = " + MaNV + " ";
            stmt.executeUpdate(sql);
        } catch (SQLException ex) {
            Logger.getLogger(EmployeeDAL.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}
