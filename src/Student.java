/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author acer
 */
public class Student {
    private String name;
    private double mark;
    private String major;

    public Student() {
    }

    public Student(String name, double mark, String major) {
        this.name = name;
        this.mark = mark;
        this.major = major;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getMark() {
        return mark;
    }

    public void setMark(double mark) {
        this.mark = mark;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public String getGrade(){
        if (mark<=3) {
            return "kem";
        }
        if (mark<=5) {
            return "YEU";
        }
        if (mark<=6) {
            return "TRUNG BINH";
        }
        if (mark<=7) {
            return "KHA";
        }
        if (mark<=9) {
            return "GIOI";
        }
        return "XUAT SAC";
    }
    public boolean isBonus(){
        return mark >= 7.5;
    
    
}
}

