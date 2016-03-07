package com.Baloot.Poshtiban.Management.Student;

import java.io.Serializable;

/**
 * کلاس دانش آموز
 */
public class Student implements Serializable {
    /**
     * کلید اصلی
     */
    private int id;
    /**
     * وضعیت یکی از فیلد های فایل سناد است
     */
    private int condition;
    /**
     * کد دانا
     */
    private int danaCode;
    /**
     * کلید خارجی از جدول Person
     */
    private int personId;

    public Student(int id, int condition, int danaCode, int personId) {
        this.id = id;
        this.condition = condition;
        this.danaCode = danaCode;
        this.personId = personId;
    }

    public int getId() {
        return id;
    }

    public int getCondition() {
        return condition;
    }

    public int getDanaCode() {
        return danaCode;
    }

    public int getPersonId() {
        return personId;
    }
}
