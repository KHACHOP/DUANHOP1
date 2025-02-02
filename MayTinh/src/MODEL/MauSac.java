/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MODEL;

/**
 *
 * @author admin
 */
public class MauSac {

    private int id;
    private String maMauSac;
    private String ten;
    private int trangThaiXoa;
    private String ngayTao;
    private String ngaySuaCuoi;

    public MauSac() {
    }

    public MauSac(String maMauSac, String ten, int trangThaiXoa, String ngayTao, String ngaySuaCuoi) {
        this.maMauSac = maMauSac;
        this.ten = ten;
        this.trangThaiXoa = trangThaiXoa;
        this.ngayTao = ngayTao;
        this.ngaySuaCuoi = ngaySuaCuoi;
    }

    public MauSac(String maMauSac, String ten, int trangThaiXoa) {
        this.maMauSac = maMauSac;
        this.ten = ten;
        this.trangThaiXoa = trangThaiXoa;
    }
    

    public String getMaMauSac() {
        return maMauSac;
    }

    public void setMaMauSac(String maMauSac) {
        this.maMauSac = maMauSac;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public int getTrangThaiXoa() {
        return trangThaiXoa;
    }

    public void setTrangThaiXoa(int trangThaiXoa) {
        this.trangThaiXoa = trangThaiXoa;
    }

    public String getNgayTao() {
        return ngayTao;
    }

    public void setNgayTao(String ngayTao) {
        this.ngayTao = ngayTao;
    }

    public String getNgaySuaCuoi() {
        return ngaySuaCuoi;
    }

    public void setNgaySuaCuoi(String ngaySuaCuoi) {
        this.ngaySuaCuoi = ngaySuaCuoi;
    }

}
