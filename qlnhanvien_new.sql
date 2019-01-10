-- phpMyAdmin SQL Dump
-- version 4.8.4
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jan 10, 2019 at 08:42 AM
-- Server version: 10.1.37-MariaDB
-- PHP Version: 7.3.0

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `qlnhanvien_new`
--

-- --------------------------------------------------------

--
-- Table structure for table `bangcap`
--

CREATE TABLE `bangcap` (
  `MaBangCap` int(11) NOT NULL,
  `TenBangCap` varchar(255) COLLATE utf8_vietnamese_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_vietnamese_ci;

--
-- Dumping data for table `bangcap`
--

INSERT INTO `bangcap` (`MaBangCap`, `TenBangCap`) VALUES
(1, 'Khá'),
(2, 'Giỏi');

-- --------------------------------------------------------

--
-- Table structure for table `bophan`
--

CREATE TABLE `bophan` (
  `MaBoPhan` int(11) NOT NULL,
  `TenBoPhan` varchar(255) COLLATE utf8_vietnamese_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_vietnamese_ci;

--
-- Dumping data for table `bophan`
--

INSERT INTO `bophan` (`MaBoPhan`, `TenBoPhan`) VALUES
(1, 'Sale'),
(2, 'Marketing');

-- --------------------------------------------------------

--
-- Table structure for table `chucdanh`
--

CREATE TABLE `chucdanh` (
  `MaChucDanh` int(11) NOT NULL,
  `TenChucDanh` varchar(255) COLLATE utf8_vietnamese_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_vietnamese_ci;

--
-- Dumping data for table `chucdanh`
--

INSERT INTO `chucdanh` (`MaChucDanh`, `TenChucDanh`) VALUES
(1, 'Giám đốc nhân sự'),
(2, 'Giám đốc sale');

-- --------------------------------------------------------

--
-- Table structure for table `chucvu`
--

CREATE TABLE `chucvu` (
  `MaChucVu` int(11) NOT NULL,
  `TenChucVu` varchar(255) COLLATE utf8_vietnamese_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_vietnamese_ci;

--
-- Dumping data for table `chucvu`
--

INSERT INTO `chucvu` (`MaChucVu`, `TenChucVu`) VALUES
(1, 'nhân viên'),
(2, 'quản lý'),
(3, 'giám đốc');

-- --------------------------------------------------------

--
-- Table structure for table `dantoc`
--

CREATE TABLE `dantoc` (
  `MaDanToc` int(11) NOT NULL,
  `TenDanToc` varchar(255) COLLATE utf8_vietnamese_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_vietnamese_ci;

--
-- Dumping data for table `dantoc`
--

INSERT INTO `dantoc` (`MaDanToc`, `TenDanToc`) VALUES
(1, 'Kinh'),
(2, 'Chăm'),
(3, 'Khác');

-- --------------------------------------------------------

--
-- Table structure for table `diadiemlamviec`
--

CREATE TABLE `diadiemlamviec` (
  `MaDiaDiem` int(11) NOT NULL,
  `TenDiaDiem` varchar(255) COLLATE utf8_vietnamese_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_vietnamese_ci;

--
-- Dumping data for table `diadiemlamviec`
--

INSERT INTO `diadiemlamviec` (`MaDiaDiem`, `TenDiaDiem`) VALUES
(1, 'TpHCM'),
(2, 'Hà Nội'),
(3, 'Gia Lai');

-- --------------------------------------------------------

--
-- Table structure for table `donvi`
--

CREATE TABLE `donvi` (
  `MaDonVi` int(11) NOT NULL,
  `TenDonVi` varchar(255) COLLATE utf8_vietnamese_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_vietnamese_ci;

--
-- Dumping data for table `donvi`
--

INSERT INTO `donvi` (`MaDonVi`, `TenDonVi`) VALUES
(1, 'Sale'),
(2, 'Marrketing'),
(3, 'Nhân Sự');

-- --------------------------------------------------------

--
-- Table structure for table `loainv`
--

CREATE TABLE `loainv` (
  `MaLoaiNV` int(11) NOT NULL,
  `TenLoaiNV` varchar(255) COLLATE utf8_vietnamese_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_vietnamese_ci;

--
-- Dumping data for table `loainv`
--

INSERT INTO `loainv` (`MaLoaiNV`, `TenLoaiNV`) VALUES
(1, 'NV Thử Việc'),
(2, 'NV Chính Thức');

-- --------------------------------------------------------

--
-- Table structure for table `nganhang`
--

CREATE TABLE `nganhang` (
  `MaNganHang` int(11) NOT NULL,
  `TenNganHang` varchar(255) COLLATE utf8_vietnamese_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_vietnamese_ci;

--
-- Dumping data for table `nganhang`
--

INSERT INTO `nganhang` (`MaNganHang`, `TenNganHang`) VALUES
(1, 'BIDV'),
(2, 'VCB'),
(3, 'ACB');

-- --------------------------------------------------------

--
-- Table structure for table `nhanvien`
--

CREATE TABLE `nhanvien` (
  `MaNV` int(11) NOT NULL,
  `Phai` varchar(255) COLLATE utf8_vietnamese_ci NOT NULL,
  `CMND` int(11) NOT NULL,
  `NgayCapCMND` date NOT NULL,
  `NoiCapCMND` varchar(255) COLLATE utf8_vietnamese_ci NOT NULL,
  `Sothe` varchar(255) COLLATE utf8_vietnamese_ci NOT NULL,
  `HoTen` varchar(255) COLLATE utf8_vietnamese_ci NOT NULL,
  `NamSinh` date NOT NULL,
  `NoiSinh` varchar(255) COLLATE utf8_vietnamese_ci NOT NULL,
  `DiaChiThuongTru` varchar(255) COLLATE utf8_vietnamese_ci NOT NULL,
  `DiaChiTamTru` varchar(255) COLLATE utf8_vietnamese_ci NOT NULL,
  `DienThoaiThuongTru` int(11) NOT NULL,
  `DiDong` int(11) NOT NULL,
  `Email` varchar(255) COLLATE utf8_vietnamese_ci NOT NULL,
  `NgayVaoDoan` date NOT NULL,
  `NgayVaoDang` date NOT NULL,
  `DanToc` varchar(255) COLLATE utf8_vietnamese_ci NOT NULL,
  `TonGiao` varchar(255) COLLATE utf8_vietnamese_ci NOT NULL,
  `QuocTich` varchar(255) COLLATE utf8_vietnamese_ci NOT NULL,
  `Passport` int(11) NOT NULL,
  `NgayCapPassport` date NOT NULL,
  `NoiCapPassport` varchar(255) COLLATE utf8_vietnamese_ci NOT NULL,
  `TinhTrangHonNhan` varchar(255) COLLATE utf8_vietnamese_ci NOT NULL,
  `MaSoThue` int(11) NOT NULL,
  `NgayCapMST` date NOT NULL,
  `SoTaiKhoan` int(11) NOT NULL,
  `MaTaiKhoan` varchar(255) COLLATE utf8_vietnamese_ci NOT NULL,
  `NganHang` varchar(255) COLLATE utf8_vietnamese_ci NOT NULL,
  `TrinhDo` varchar(255) COLLATE utf8_vietnamese_ci NOT NULL,
  `BangCap` varchar(255) COLLATE utf8_vietnamese_ci NOT NULL,
  `HocHam` varchar(255) COLLATE utf8_vietnamese_ci NOT NULL,
  `ChuyenMon` varchar(255) COLLATE utf8_vietnamese_ci NOT NULL,
  `KNLVChuyenMon` varchar(255) COLLATE utf8_vietnamese_ci NOT NULL,
  `LoaiNhanVien` varchar(255) COLLATE utf8_vietnamese_ci NOT NULL,
  `DonVi` varchar(255) COLLATE utf8_vietnamese_ci NOT NULL,
  `PhongBan` varchar(255) COLLATE utf8_vietnamese_ci NOT NULL,
  `BoPhan` varchar(255) COLLATE utf8_vietnamese_ci NOT NULL,
  `ChucDanh` varchar(255) COLLATE utf8_vietnamese_ci NOT NULL,
  `ChucVu` varchar(255) COLLATE utf8_vietnamese_ci NOT NULL,
  `DiaDiemLamViec` varchar(255) COLLATE utf8_vietnamese_ci NOT NULL,
  `LuongThuViec` varchar(255) COLLATE utf8_vietnamese_ci NOT NULL,
  `LuongCB` varchar(255) COLLATE utf8_vietnamese_ci NOT NULL,
  `LuongKD` varchar(255) COLLATE utf8_vietnamese_ci NOT NULL,
  `NgayVaoCty` date NOT NULL,
  `NgayHetHanTV` date NOT NULL,
  `NgayVaoChinhThuc` date NOT NULL,
  `Img` varchar(255) COLLATE utf8_vietnamese_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_vietnamese_ci;

--
-- Dumping data for table `nhanvien`
--

INSERT INTO `nhanvien` (`MaNV`, `Phai`, `CMND`, `NgayCapCMND`, `NoiCapCMND`, `Sothe`, `HoTen`, `NamSinh`, `NoiSinh`, `DiaChiThuongTru`, `DiaChiTamTru`, `DienThoaiThuongTru`, `DiDong`, `Email`, `NgayVaoDoan`, `NgayVaoDang`, `DanToc`, `TonGiao`, `QuocTich`, `Passport`, `NgayCapPassport`, `NoiCapPassport`, `TinhTrangHonNhan`, `MaSoThue`, `NgayCapMST`, `SoTaiKhoan`, `MaTaiKhoan`, `NganHang`, `TrinhDo`, `BangCap`, `HocHam`, `ChuyenMon`, `KNLVChuyenMon`, `LoaiNhanVien`, `DonVi`, `PhongBan`, `BoPhan`, `ChucDanh`, `ChucVu`, `DiaDiemLamViec`, `LuongThuViec`, `LuongCB`, `LuongKD`, `NgayVaoCty`, `NgayHetHanTV`, `NgayVaoChinhThuc`, `Img`) VALUES
(151112, 'nam', 233256789, '2018-08-14', 'kontum', '1234124abc', 'Nguyễn Sỹ Hoàng', '1997-12-14', 'kontum', 'kontum', 'tphcm', 987654321, 764318732, 'hoang@gmail', '2014-12-22', '0000-00-00', 'Kinh', 'Không', 'VN', 0, '0000-00-00', '', 'Độc Thân', 0, '0000-00-00', 0, '', 'BIDV', 'Đại Học', '', '', 'CNTT', '4 năm', 'Nhân viên chính thức', 'Coding', '', 'Sale', '', '', 'tphcm', '10000000', '11000000', '12000000', '2019-01-10', '0000-00-00', '2019-01-10', '');

-- --------------------------------------------------------

--
-- Table structure for table `noicapcmnd`
--

CREATE TABLE `noicapcmnd` (
  `MaNoiCap` int(11) NOT NULL,
  `TenNoiCap` varchar(255) COLLATE utf8_vietnamese_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_vietnamese_ci;

--
-- Dumping data for table `noicapcmnd`
--

INSERT INTO `noicapcmnd` (`MaNoiCap`, `TenNoiCap`) VALUES
(1, 'Kon Tum'),
(2, 'Gia Lai'),
(3, 'Khác');

-- --------------------------------------------------------

--
-- Table structure for table `noisinh`
--

CREATE TABLE `noisinh` (
  `MaNoiSinh` int(11) NOT NULL,
  `TenNoiSinh` varchar(255) COLLATE utf8_vietnamese_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_vietnamese_ci;

--
-- Dumping data for table `noisinh`
--

INSERT INTO `noisinh` (`MaNoiSinh`, `TenNoiSinh`) VALUES
(1, 'Kon Tum'),
(2, 'Gia Lai');

-- --------------------------------------------------------

--
-- Table structure for table `phai`
--

CREATE TABLE `phai` (
  `MaPhai` int(11) NOT NULL,
  `TenPhai` varchar(255) COLLATE utf8_vietnamese_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_vietnamese_ci;

--
-- Dumping data for table `phai`
--

INSERT INTO `phai` (`MaPhai`, `TenPhai`) VALUES
(1, 'Nam'),
(2, 'Nữ'),
(3, 'Khác');

-- --------------------------------------------------------

--
-- Table structure for table `phongban`
--

CREATE TABLE `phongban` (
  `MaPhongBan` int(11) NOT NULL,
  `TenPhongBan` varchar(255) COLLATE utf8_vietnamese_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_vietnamese_ci;

--
-- Dumping data for table `phongban`
--

INSERT INTO `phongban` (`MaPhongBan`, `TenPhongBan`) VALUES
(1, 'Ban Giám Đốc'),
(2, 'Ban Quản lý dự án');

-- --------------------------------------------------------

--
-- Table structure for table `quoctich`
--

CREATE TABLE `quoctich` (
  `MaQuocTich` int(11) NOT NULL,
  `TenQuocTich` varchar(255) COLLATE utf8_vietnamese_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_vietnamese_ci;

--
-- Dumping data for table `quoctich`
--

INSERT INTO `quoctich` (`MaQuocTich`, `TenQuocTich`) VALUES
(1, 'Việt Nam'),
(2, 'Trung Quốc'),
(3, 'Lào'),
(4, 'Cam-pu-chia');

-- --------------------------------------------------------

--
-- Table structure for table `tinhtranghonnhan`
--

CREATE TABLE `tinhtranghonnhan` (
  `MaTTHN` int(11) NOT NULL,
  `TenTTHN` varchar(255) COLLATE utf8_vietnamese_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_vietnamese_ci;

--
-- Dumping data for table `tinhtranghonnhan`
--

INSERT INTO `tinhtranghonnhan` (`MaTTHN`, `TenTTHN`) VALUES
(1, 'Độc thân'),
(2, 'Đã lập gia đình');

-- --------------------------------------------------------

--
-- Table structure for table `tongiao`
--

CREATE TABLE `tongiao` (
  `MaTonGiao` int(11) NOT NULL,
  `TenTonGiao` varchar(255) COLLATE utf8_vietnamese_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_vietnamese_ci;

--
-- Dumping data for table `tongiao`
--

INSERT INTO `tongiao` (`MaTonGiao`, `TenTonGiao`) VALUES
(1, 'Kito'),
(2, 'Phật');

-- --------------------------------------------------------

--
-- Table structure for table `trinhdo`
--

CREATE TABLE `trinhdo` (
  `MaTrinhDo` int(11) NOT NULL,
  `TenTrinhDo` varchar(255) COLLATE utf8_vietnamese_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_vietnamese_ci;

--
-- Dumping data for table `trinhdo`
--

INSERT INTO `trinhdo` (`MaTrinhDo`, `TenTrinhDo`) VALUES
(1, 'Đại Học'),
(2, 'Cao Đẳng');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `bangcap`
--
ALTER TABLE `bangcap`
  ADD PRIMARY KEY (`MaBangCap`);

--
-- Indexes for table `bophan`
--
ALTER TABLE `bophan`
  ADD PRIMARY KEY (`MaBoPhan`);

--
-- Indexes for table `chucdanh`
--
ALTER TABLE `chucdanh`
  ADD PRIMARY KEY (`MaChucDanh`);

--
-- Indexes for table `chucvu`
--
ALTER TABLE `chucvu`
  ADD PRIMARY KEY (`MaChucVu`);

--
-- Indexes for table `dantoc`
--
ALTER TABLE `dantoc`
  ADD PRIMARY KEY (`MaDanToc`);

--
-- Indexes for table `diadiemlamviec`
--
ALTER TABLE `diadiemlamviec`
  ADD PRIMARY KEY (`MaDiaDiem`);

--
-- Indexes for table `donvi`
--
ALTER TABLE `donvi`
  ADD PRIMARY KEY (`MaDonVi`);

--
-- Indexes for table `loainv`
--
ALTER TABLE `loainv`
  ADD PRIMARY KEY (`MaLoaiNV`);

--
-- Indexes for table `nganhang`
--
ALTER TABLE `nganhang`
  ADD PRIMARY KEY (`MaNganHang`);

--
-- Indexes for table `nhanvien`
--
ALTER TABLE `nhanvien`
  ADD PRIMARY KEY (`MaNV`);

--
-- Indexes for table `noicapcmnd`
--
ALTER TABLE `noicapcmnd`
  ADD PRIMARY KEY (`MaNoiCap`);

--
-- Indexes for table `noisinh`
--
ALTER TABLE `noisinh`
  ADD PRIMARY KEY (`MaNoiSinh`);

--
-- Indexes for table `phai`
--
ALTER TABLE `phai`
  ADD PRIMARY KEY (`MaPhai`);

--
-- Indexes for table `phongban`
--
ALTER TABLE `phongban`
  ADD PRIMARY KEY (`MaPhongBan`);

--
-- Indexes for table `quoctich`
--
ALTER TABLE `quoctich`
  ADD PRIMARY KEY (`MaQuocTich`);

--
-- Indexes for table `tinhtranghonnhan`
--
ALTER TABLE `tinhtranghonnhan`
  ADD PRIMARY KEY (`MaTTHN`);

--
-- Indexes for table `tongiao`
--
ALTER TABLE `tongiao`
  ADD PRIMARY KEY (`MaTonGiao`);

--
-- Indexes for table `trinhdo`
--
ALTER TABLE `trinhdo`
  ADD PRIMARY KEY (`MaTrinhDo`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
