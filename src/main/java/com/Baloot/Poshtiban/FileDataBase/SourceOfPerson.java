package com.Baloot.Poshtiban.FileDataBase;

import com.Baloot.Poshtiban.Management.Person;

import java.io.*;

/**
 * کلاسی جهت دسترسی به اطلاعات اشخاص در دیتابیس
 */
public class SourceOfPerson {
    private String path;
    public SourceOfPerson() {
        path = "SourceOfPerson2.txt";
    }

    /**
     * @return اطلاعات اشخاص
     * @throws IOException
     * @throws ClassNotFoundException
     */
    public Person[] readFile() throws IOException, ClassNotFoundException {
        FileInputStream fileInputStream = new FileInputStream(this.path);
        ObjectInputStream file = new ObjectInputStream(fileInputStream);
        Person[] data = (Person[])file.readObject();
        file.close();
        fileInputStream.close();
        return data;
    }

    /**
     * @param data اطلاعات اشخاص
     * @throws IOException
     * @throws ClassNotFoundException
     */
    public void writeFile(Person[] data) throws IOException, ClassNotFoundException {
        FileOutputStream fileOutputStream = new FileOutputStream(this.path);
        ObjectOutputStream file = new ObjectOutputStream(fileOutputStream);
        file.writeObject(data);
        file.close();
        fileOutputStream.close();
    }
}

