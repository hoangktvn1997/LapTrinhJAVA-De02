/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;
import java.util.Date;

/**
 *
 * @author Hifumin
 */
public class Employee {
    private int MaNV;
    private String Phai;
    private int CMND;
    private String NgayCapCMND;
    private String NoiCapCMND;
    private String Sothe;
    private String HoTen;
    private String NamSinh;
    private String NoiSinh;
    private String DiaChiThuongTru;
    private String DiaChiTamTru;
    private int DienThoaiThuongTru;
    private int DiDong;
    private String Email;
    private String NgayVaoDoan;
    private String NgayVaoDang;
    private String DanToc;
    private String TonGiao;
    private String QuocTich;
    private int Passport;
    private String NgayCapPassport;
    private String NoiCapPassport;
    private String TinhTrangHonNhan;
    private int MaSoThue;
    private String NgayCapMST;
    private int SoTaiKhoan;
    private String MaTaiKhoan;
    private String NganHang;
    private String TrinhDo;
    private String BangCap;
    private String HocHam;
    private String ChuyenMon;
    private String KNLVChuyenMon;
    private String LoaiNhanVien;
    private String DonVi;
    private String PhongBan;
    private String BoPhan;
    private String ChucDanh;
    private String ChucVu;
    private String DiaDiemLamViec;
    private String LuongThuViec;
    private String LuongCB;
    private String LuongKD;
    private String NgayVaoCty;
    private String NgayHetHanTV;
    private String NgayVaoChinhThuc;
    private String img;

    
    public Employee() {
    }
    
    public int getMaNV() {
        return MaNV;
    }

    public void setMaNV(int MaNV) {
        this.MaNV = MaNV;
    }

    public String getPhai() {
        return Phai;
    }

    public void setPhai(String Phai) {
        this.Phai = Phai;
    }

    public int getCMND() {
        return CMND;
    }

    public void setCMND(int CMND) {
        this.CMND = CMND;
    }

    public String getNgayCapCMND() {
        return NgayCapCMND;
    }

    public void setNgayCapCMND(String NgayCapCMND) {
        this.NgayCapCMND = NgayCapCMND;
    }

    public String getNoiCapCMND() {
        return NoiCapCMND;
    }

    public void setNoiCapCMND(String NoiCapCMND) {
        this.NoiCapCMND = NoiCapCMND;
    }

    public String getSothe() {
        return Sothe;
    }

    public void setSothe(String Sothe) {
        this.Sothe = Sothe;
    }

    public String getHoTen() {
        return HoTen;
    }

    public void setHoTen(String HoTen) {
        this.HoTen = HoTen;
    }

    public String getNamSinh() {
        return NamSinh;
    }

    public void setNamSinh(String NamSinh) {
        this.NamSinh = NamSinh;
    }

    public String getNoiSinh() {
        return NoiSinh;
    }

    public void setNoiSinh(String NoiSinh) {
        this.NoiSinh = NoiSinh;
    }

    public String getDiaChiThuongTru() {
        return DiaChiThuongTru;
    }

    public void setDiaChiThuongTru(String DiaChiThuongTru) {
        this.DiaChiThuongTru = DiaChiThuongTru;
    }

    public String getDiaChiTamTru() {
        return DiaChiTamTru;
    }

    public void setDiaChiTamTru(String DiaChiTamTru) {
        this.DiaChiTamTru = DiaChiTamTru;
    }

    public int getDienThoaiThuongTru() {
        return DienThoaiThuongTru;
    }

    public void setDienThoaiThuongTru(int DienThoaiThuongTru) {
        this.DienThoaiThuongTru = DienThoaiThuongTru;
    }

    public int getDiDong() {
        return DiDong;
    }

    public void setDiDong(int DiDong) {
        this.DiDong = DiDong;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getNgayVaoDoan() {
        return NgayVaoDoan;
    }

    public void setNgayVaoDoan(String NgayVaoDoan) {
        this.NgayVaoDoan = NgayVaoDoan;
    }

    public String getNgayVaoDang() {
        return NgayVaoDang;
    }

    public void setNgayVaoDang(String NgayVaoDang) {
        this.NgayVaoDang = NgayVaoDang;
    }

    public String getDanToc() {
        return DanToc;
    }

    public void setDanToc(String DanToc) {
        this.DanToc = DanToc;
    }

    public String getTonGiao() {
        return TonGiao;
    }

    public void setTonGiao(String TonGiao) {
        this.TonGiao = TonGiao;
    }

    public String getQuocTich() {
        return QuocTich;
    }

    public void setQuocTich(String QuocTich) {
        this.QuocTich = QuocTich;
    }

    public int getPassport() {
        return Passport;
    }

    public void setPassport(int Passport) {
        this.Passport = Passport;
    }

    public String getNgayCapPassport() {
        return NgayCapPassport;
    }

    public void setNgayCapPassport(String NgayCapPassport) {
        this.NgayCapPassport = NgayCapPassport;
    }

    public String getNoiCapPassport() {
        return NoiCapPassport;
    }

    public void setNoiCapPassport(String NoiCapPassport) {
        this.NoiCapPassport = NoiCapPassport;
    }

    public String getTinhTrangHonNhan() {
        return TinhTrangHonNhan;
    }

    public void setTinhTrangHonNhan(String TinhTrangHonNhan) {
        this.TinhTrangHonNhan = TinhTrangHonNhan;
    }

    public int getMaSoThue() {
        return MaSoThue;
    }

    public void setMaSoThue(int MaSoThue) {
        this.MaSoThue = MaSoThue;
    }

    public String getNgayCapMST() {
        return NgayCapMST;
    }

    public void setNgayCapMST(String NgayCapMST) {
        this.NgayCapMST = NgayCapMST;
    }

    public int getSoTaiKhoan() {
        return SoTaiKhoan;
    }

    public void setSoTaiKhoan(int SoTaiKhoan) {
        this.SoTaiKhoan = SoTaiKhoan;
    }

    public String getMaTaiKhoan() {
        return MaTaiKhoan;
    }

    public void setMaTaiKhoan(String MaTaiKhoan) {
        this.MaTaiKhoan = MaTaiKhoan;
    }

    public String getNganHang() {
        return NganHang;
    }

    public void setNganHang(String NganHang) {
        this.NganHang = NganHang;
    }

    public String getTrinhDo() {
        return TrinhDo;
    }

    public void setTrinhDo(String TrinhDo) {
        this.TrinhDo = TrinhDo;
    }

    public String getBangCap() {
        return BangCap;
    }

    public void setBangCap(String BangCap) {
        this.BangCap = BangCap;
    }

    public String getHocHam() {
        return HocHam;
    }

    public void setHocHam(String HocHam) {
        this.HocHam = HocHam;
    }

    public String getChuyenMon() {
        return ChuyenMon;
    }

    public void setChuyenMon(String ChuyenMon) {
        this.ChuyenMon = ChuyenMon;
    }

    public String getKNLVChuyenMon() {
        return KNLVChuyenMon;
    }

    public void setKNLVChuyenMon(String KNLVChuyenMon) {
        this.KNLVChuyenMon = KNLVChuyenMon;
    }

    public String getLoaiNhanVien() {
        return LoaiNhanVien;
    }

    public void setLoaiNhanVien(String LoaiNhanVien) {
        this.LoaiNhanVien = LoaiNhanVien;
    }

    public String getDonVi() {
        return DonVi;
    }

    public void setDonVi(String DonVi) {
        this.DonVi = DonVi;
    }

    public String getPhongBan() {
        return PhongBan;
    }

    public void setPhongBan(String PhongBan) {
        this.PhongBan = PhongBan;
    }

    public String getBoPhan() {
        return BoPhan;
    }

    public void setBoPhan(String BoPhan) {
        this.BoPhan = BoPhan;
    }

    public String getChucDanh() {
        return ChucDanh;
    }

    public void setChucDanh(String ChucDanh) {
        this.ChucDanh = ChucDanh;
    }

    public String getChucVu() {
        return ChucVu;
    }

    public void setChucVu(String ChucVu) {
        this.ChucVu = ChucVu;
    }

    public String getDiaDiemLamViec() {
        return DiaDiemLamViec;
    }

    public void setDiaDiemLamViec(String DiaDiemLamViec) {
        this.DiaDiemLamViec = DiaDiemLamViec;
    }

    public String getLuongThuViec() {
        return LuongThuViec;
    }

    public void setLuongThuViec(String LuongThuViec) {
        this.LuongThuViec = LuongThuViec;
    }

    public String getLuongCB() {
        return LuongCB;
    }

    public void setLuongCB(String LuongCB) {
        this.LuongCB = LuongCB;
    }

    public String getLuongKD() {
        return LuongKD;
    }

    public void setLuongKD(String LuongKD) {
        this.LuongKD = LuongKD;
    }

    public String getNgayVaoCty() {
        return NgayVaoCty;
    }

    public void setNgayVaoCty(String NgayVaoCty) {
        this.NgayVaoCty = NgayVaoCty;
    }

    public String getNgayHetHanTV() {
        return NgayHetHanTV;
    }

    public void setNgayHetHanTV(String NgayHetHanTV) {
        this.NgayHetHanTV = NgayHetHanTV;
    }

    public String getNgayVaoChinhThuc() {
        return NgayVaoChinhThuc;
    }

    public void setNgayVaoChinhThuc(String NgayVaoChinhThuc) {
        this.NgayVaoChinhThuc = NgayVaoChinhThuc;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public Employee(int MaNV, String Phai, int CMND, String NgayCapCMND, String NoiCapCMND, String Sothe, String HoTen, String NamSinh, String NoiSinh, String DiaChiThuongTru, String DiaChiTamTru, int DienThoaiThuongTru, int DiDong, String Email, String NgayVaoDoan, String NgayVaoDang, String DanToc, String TonGiao, String QuocTich, int Passport, String NgayCapPassport, String NoiCapPassport, String TinhTrangHonNhan, int MaSoThue, String NgayCapMST, int SoTaiKhoan, String MaTaiKhoan, String NganHang, String TrinhDo, String BangCap, String HocHam, String ChuyenMon, String KNLVChuyenMon, String LoaiNhanVien, String DonVi, String PhongBan, String BoPhan, String ChucDanh, String ChucVu, String DiaDiemLamViec, String LuongThuViec, String LuongCB, String LuongKD, String NgayVaoCty, String NgayHetHanTV, String NgayVaoChinhThuc, String img) {
        this.MaNV = MaNV;
        this.Phai = Phai;
        this.CMND = CMND;
        this.NgayCapCMND = NgayCapCMND;
        this.NoiCapCMND = NoiCapCMND;
        this.Sothe = Sothe;
        this.HoTen = HoTen;
        this.NamSinh = NamSinh;
        this.NoiSinh = NoiSinh;
        this.DiaChiThuongTru = DiaChiThuongTru;
        this.DiaChiTamTru = DiaChiTamTru;
        this.DienThoaiThuongTru = DienThoaiThuongTru;
        this.DiDong = DiDong;
        this.Email = Email;
        this.NgayVaoDoan = NgayVaoDoan;
        this.NgayVaoDang = NgayVaoDang;
        this.DanToc = DanToc;
        this.TonGiao = TonGiao;
        this.QuocTich = QuocTich;
        this.Passport = Passport;
        this.NgayCapPassport = NgayCapPassport;
        this.NoiCapPassport = NoiCapPassport;
        this.TinhTrangHonNhan = TinhTrangHonNhan;
        this.MaSoThue = MaSoThue;
        this.NgayCapMST = NgayCapMST;
        this.SoTaiKhoan = SoTaiKhoan;
        this.MaTaiKhoan = MaTaiKhoan;
        this.NganHang = NganHang;
        this.TrinhDo = TrinhDo;
        this.BangCap = BangCap;
        this.HocHam = HocHam;
        this.ChuyenMon = ChuyenMon;
        this.KNLVChuyenMon = KNLVChuyenMon;
        this.LoaiNhanVien = LoaiNhanVien;
        this.DonVi = DonVi;
        this.PhongBan = PhongBan;
        this.BoPhan = BoPhan;
        this.ChucDanh = ChucDanh;
        this.ChucVu = ChucVu;
        this.DiaDiemLamViec = DiaDiemLamViec;
        this.LuongThuViec = LuongThuViec;
        this.LuongCB = LuongCB;
        this.LuongKD = LuongKD;
        this.NgayVaoCty = NgayVaoCty;
        this.NgayHetHanTV = NgayHetHanTV;
        this.NgayVaoChinhThuc = NgayVaoChinhThuc;
        this.img = img;
    }

   

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
        
    

    
    
}
