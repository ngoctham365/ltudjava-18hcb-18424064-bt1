/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */
public class TKBieu {
    protected String Malop;
    protected String Mamon;
    protected String Tenmon;
    protected String Phonghoc;
    
    public TKBieu(){
        
    }
    public TKBieu(String Malop, String Mamon, String Tenmon, String Phonghoc){
        this.Malop = Malop;
        this.Mamon = Mamon;
        this.Tenmon = Tenmon;
        this.Phonghoc = Phonghoc;
    }

    public String getMalop() {
        return Malop;
    }

    public void setMalop(String Malop) {
        this.Malop = Malop;
    }

    public String getMamon() {
        return Mamon;
    }

    public void setMamon(String Mamon) {
        this.Mamon = Mamon;
    }

    public String getTenmon() {
        return Tenmon;
    }

    public void setTenmon(String Tenmon) {
        this.Tenmon = Tenmon;
    }

    public String getPhonghoc() {
        return Phonghoc;
    }

    public void setPhonghoc(String Phonghoc) {
        this.Phonghoc = Phonghoc;
    }
    
}

