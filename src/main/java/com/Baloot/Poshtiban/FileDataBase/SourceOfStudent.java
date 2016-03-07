package com.Baloot.Poshtiban.FileDataBase;

import com.Baloot.Poshtiban.Management.Person;
import com.Baloot.Poshtiban.Management.Student.Student;

import java.io.*;

/**
 * کلاسی جهت دسترسی به اطلاعات اشخاص در دیتابیس
 */
public class SourceOfStudent {
    private String path;
    public SourceOfStudent() {
        path = "SourceOfStudent2.txt";
    }

    /**
     * @return  اطلاعات دانش آموزان
     * @throws IOException
     * @throws ClassNotFoundException
     */
    public Student[] readFile() throws IOException, ClassNotFoundException {
        FileInputStream fileInputStream = new FileInputStream(this.path);
        ObjectInputStream file = new ObjectInputStream(fileInputStream);
        Student[] data = (Student[])file.readObject();
        file.close();
        fileInputStream.close();
        return data;
    }

    /**
     * @param data اطلاعات دانش آموزان
     * @throws IOException
     * @throws ClassNotFoundException
     */
    public void writeFile(Student[] data) throws IOException, ClassNotFoundException {
        FileOutputStream fileOutputStream = new FileOutputStream(this.path);
        ObjectOutputStream file = new ObjectOutputStream(fileOutputStream);
        file.writeObject(data);
        file.close();
        fileOutputStream.close();
    }
}

