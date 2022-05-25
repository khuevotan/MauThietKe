/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package designpattern.Behavioral.stratery.baitap3;

/**
 *
 * @author THIS PC
 */
public class SoSanhTheoDiem implements ISoSanh <SinhVien>{

    @Override
    public int soSanh(SinhVien o1, SinhVien o2) {
        if(o1.getDiemTB() > o2.getDiemTB())
        {
            return 1;
        }
        else if(o1.getDiemTB() < o2.getDiemTB())
        {
            return -1;
        }
        else return 0;
    }
}