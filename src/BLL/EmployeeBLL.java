/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BLL;

import DAL.EmployeeDAL;
import DAL.Employee;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author manng
 */
public class EmployeeBLL {

    EmployeeDAL dal = new EmployeeDAL();

    public ArrayList<Employee> ReadEmployeeBll() {
        ArrayList<Employee> listEmployee = new ArrayList<>();
        listEmployee = dal.readEmployee();
        return listEmployee;
    }
    
    public ArrayList<Employee> ReadCBPhaiBll() {
        ArrayList<Employee> listEmployee = new ArrayList<>();
        listEmployee = dal.readCBPhai();
        return listEmployee;
    }
    public ArrayList<Employee> ReadCBNoiSinhBll() {
        ArrayList<Employee> listEmployee = new ArrayList<>();
        listEmployee = dal.readCBNoiSinh();
        return listEmployee;
    }
    public ArrayList<Employee> ReadCBBangCapBll() {
        ArrayList<Employee> listEmployee = new ArrayList<>();
        listEmployee = dal.readCBBangCap();
        return listEmployee;
    }
    public ArrayList<Employee> ReadCBBoPhanBll() {
        ArrayList<Employee> listEmployee = new ArrayList<>();
        listEmployee = dal.readCBBoPhan();
        return listEmployee;
    }
    public ArrayList<Employee> ReadCBChucDanhBll() {
        ArrayList<Employee> listEmployee = new ArrayList<>();
        listEmployee = dal.readCBChucDanh();
        return listEmployee;
    }
    public ArrayList<Employee> ReadCBChucVuBll() {
        ArrayList<Employee> listEmployee = new ArrayList<>();
        listEmployee = dal.readCBChucVu();
        return listEmployee;
    }
    public ArrayList<Employee> ReadCBCMNDBll() {
        ArrayList<Employee> listEmployee = new ArrayList<>();
        listEmployee = dal.readCBCMND();
        return listEmployee;
    }
    public ArrayList<Employee> ReadCBDanTocBll() {
        ArrayList<Employee> listEmployee = new ArrayList<>();
        listEmployee = dal.readCBDanToc();
        return listEmployee;
    }
    public ArrayList<Employee> ReadCBDiaDiemLamViecBll() {
        ArrayList<Employee> listEmployee = new ArrayList<>();
        listEmployee = dal.readCBDiaDiemLamViec();
        return listEmployee;
    }
    public ArrayList<Employee> ReadCBDonViBll() {
        ArrayList<Employee> listEmployee = new ArrayList<>();
        listEmployee = dal.readCBDonVi();
        return listEmployee;
    }
    public ArrayList<Employee> ReadCBLoaiNVBll() {
        ArrayList<Employee> listEmployee = new ArrayList<>();
        listEmployee = dal.readCBLoaiNV();
        return listEmployee;
    }
    public ArrayList<Employee> ReadCBNganHangBll() {
        ArrayList<Employee> listEmployee = new ArrayList<>();
        listEmployee = dal.readCBNganHang();
        return listEmployee;
    }
    public ArrayList<Employee> ReadCBPhongBanBll() {
        ArrayList<Employee> listEmployee = new ArrayList<>();
        listEmployee = dal.readCBPhongBan();
        return listEmployee;
    }
    public ArrayList<Employee> ReadCBTonGiaoBll() {
        ArrayList<Employee> listEmployee = new ArrayList<>();
        listEmployee = dal.readCBTonGiao();
        return listEmployee;
    }
    public ArrayList<Employee> ReadCBTrinhDoBll() {
        ArrayList<Employee> listEmployee = new ArrayList<>();
        listEmployee = dal.readCBTrinhDo();
        return listEmployee;
    }
    public ArrayList<Employee> ReadCBTTHNBll() {
        ArrayList<Employee> listEmployee = new ArrayList<>();
        listEmployee = dal.readCBTTHN();
        return listEmployee;
    }
    public ArrayList<Employee> ReadCBQuocTichBll() {
        ArrayList<Employee> listEmployee = new ArrayList<>();
        listEmployee = dal.readCBQuocTich();
        return listEmployee;
    }

    public void AddNewEmployeeDAL(Employee employeeModel) {
        try {
            dal.AddNewEmployee(employeeModel);
        } catch (SQLException ex) {
            Logger.getLogger(EmployeeBLL.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void EditEmployeeDAL(Employee employeeModel) {
        try {
            dal.EditEmployee(employeeModel);
        } catch (SQLException ex) {
            Logger.getLogger(EmployeeBLL.class.getName()).log(Level.SEVERE, null, ex);
        } 
    }
     public void DeleteEmployeeDAL(int MaNV) {
        try {
            dal.DeleteEmployee(MaNV);
        } catch (SQLException ex) {
            Logger.getLogger(EmployeeBLL.class.getName()).log(Level.SEVERE, null, ex);
        } 
    }
}
