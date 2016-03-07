package com.Baloot.Poshtiban.Management;

import java.io.Serializable;

/**
 * کلاس افراد که اطلاعات افراد مثل دانش آموزان و معلمان ذخیره میشود
 */
public class Person implements Serializable{
    /**
     * کلید اصلی
     */
    private int id;
    /**
     * نام کوچک افراد
     */
    private String name;
    /**
     * نام خانوادگی
     */
    private String lastName;
    /**
     * نام پدر
     */
    private String fatherName;
    /**
     * تاریخ تولد که شاید برای معلمین ذخیره نشود
     */
    private String birthday;
    /**
     * آدرس تصویر شخص
     */
    private String picture;
    /**
     * نام کاربری افراد...
     */
    private String userName;
    /**
     * پسورد افراد که به طور پیش فرض شماره ملی است
     */
    private String password;
    /**
     * کد ملی افراد
     */
    private String nationalCode;
    /**
     *کلید برای ارتباط با جدول نقشها
     */
    private int communicationId;

    public Person(int id, String name, String lastName, String fatherName, String birthday, String picture, String userName, String password, String nationalCode, int communicationId) {
        this.id = id;
        this.name = name;
        this.lastName = lastName;
        this.fatherName = fatherName;
        this.birthday = birthday;
        this.picture = picture;
        this.userName = userName;
        this.password = password;
        this.nationalCode = nationalCode;
        this.communicationId = communicationId;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public String getFatherName() {
        return fatherName;
    }

    public String getBirthday() {
        return birthday;
    }

    public String getPicture() {
        return picture;
    }

    public String getUserName() {
        return userName;
    }

    public String getPassword() {
        return password;
    }

    public String getNationalCode() {
        return nationalCode;
    }

    public int getCommunicationId() {
        return communicationId;
    }
}
