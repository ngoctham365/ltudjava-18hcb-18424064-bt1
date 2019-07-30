/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */
public class Danhsachlop {
    protected String MaLop;
    protected String MSSV;
    protected String HoTen;
    protected String GioiTinh;
    protected int CMND;
    
    public Danhsachlop(){
        
    }

    public Danhsachlop(String MaLop, String MSSV, String HoTen, String GioiTinh, int CMND) {
        this.MaLop = MaLop;
        this.MSSV = MSSV;
        this.HoTen = HoTen;
        this.GioiTinh = GioiTinh;
        this.CMND = CMND;
    }

    public String getMaLop(){
        return MaLop;
    }
    
    public void setMaLop(String MaLop) {
        this.MaLop = MaLop;
    }
    
    public String getMSSV() {
        return MSSV;
    }

    public void setMSSV(String MSSV) {
        this.MSSV = MSSV;
    }

    public String getHoTen() {
        return HoTen;
    }

    public void setHoTen(String HoTen) {
        this.HoTen = HoTen;
    }

    public String getGioiTinh() {
        return GioiTinh;
    }

    public void setGioiTinh(String GioiTinh) {
        this.GioiTinh = GioiTinh;
    }

    public int getCMND() {
        return CMND;
    }

    public void setCMND(int CMND) {
        this.CMND = CMND;
    }
    
}
