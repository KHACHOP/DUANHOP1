
package MODEL;

/**
 *
 * @author admin
 */
public class KichThuoc {

    private int id;
    private String maKichThuoc;
    private String ten;
    private int trangThaiXoa;
    private String ngayTao;
    private String ngaySuaCuoi;

    public KichThuoc() {
    }

    public KichThuoc(String maKichThuoc, String ten, int trangThaiXoa, String ngayTao, String ngaySuaCuoi) {
        this.maKichThuoc = maKichThuoc;
        this.ten = ten;
        this.trangThaiXoa = trangThaiXoa;
        this.ngayTao = ngayTao;
        this.ngaySuaCuoi = ngaySuaCuoi;
    }

    public KichThuoc(String maKichThuoc, String ten, int trangThaiXoa) {
        this.maKichThuoc = maKichThuoc;
        this.ten = ten;
        this.trangThaiXoa = trangThaiXoa;
    }
    

    public String getMaKichThuoc() {
        return maKichThuoc;
    }

    public void setMaKichThuoc(String maKichThuoc) {
        this.maKichThuoc = maKichThuoc;
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

    @Override
    public String toString() {
        return "KichCo{" + "id=" + id + ", maKichCo=" + maKichThuoc + ", ten=" + ten + ", trangThaiXoa=" + trangThaiXoa + ", ngayTao=" + ngayTao + ", ngaySuaCuoi=" + ngaySuaCuoi + '}';
    }
    
}
