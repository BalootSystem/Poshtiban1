package com.Baloot.Poshtiban;

import com.Baloot.Poshtiban.FileDataBase.*;
import com.Baloot.Poshtiban.Management.Person;
import com.Baloot.Poshtiban.Management.Student.Student;

import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;
import javax.swing.*;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * برای ورود داداهاای که ابتدا مورد نیاز است
 */
@ManagedBean
@ApplicationScoped
public class InitialDataEntry {
/*
    private SourceOfClass sourceOfClass;
    private List<Classes> classesList;
    private SourceOfRole sourceOfRole;
    private List<RolePerson> roleList;

*/
    private SourceOfPerson sourceOfPerson;
    private List<Person> personList;
    private SourceOfStudent sourceOfStudent;
    private List<Student> studentList;
/*
    private SourceOfTimeTable sourceOfTimeTable;
    private List<TimeTable> timeTableList;
    private SourceOfSetting sourceOfSetting;
    private List<Settings> settingList;
    private int currentSetting;
*/

    public InitialDataEntry() {
        dataEntry();
    }

    public void dataEntry() {
        /*
        initialSetting();
        initialClass();
        initialRole();
        */
        initialPerson();
        initialStudent();
        /*
        initialTimeTable();
        */
    }

/*
    public List<Classes> getClassesList() {
        return classesList;
    }

    public List<RolePerson> getRoleList() {
        return roleList;
    }

    public List<TimeTable> getTimeTableList() {
        return timeTableList;
    }

    public void initialSetting() {
        this.settingList = new ArrayList<>();
        sourceOfSetting = new SourceOfSetting();
        Settings[] readFileSetting;
        try {
            readFileSetting = sourceOfSetting.readFile();
        } catch (ClassNotFoundException | IOException var6) {
            JOptionPane.showMessageDialog(null, var6);
            Settings newSettings = new Settings();
            newSettings.getWeekOption().setEnableDays(new Boolean[]{true, true, true, true, true, true, false});
            newSettings.setCurrent(true);
            readFileSetting = new Settings[]{newSettings};
            try {
                sourceOfSetting.writeFile(readFileSetting);
            } catch (ClassNotFoundException | IOException var2) {
                JOptionPane.showMessageDialog(null, var2);
            }
        }
        settingList.addAll(Arrays.asList(readFileSetting));
        for (Settings settings :
                settingList) {
            if (settings.isCurrent()) {
                currentSetting = settings.getSettingId();
                break;
            }
        }
    }

    public void initialClass() {
        classesList = new ArrayList<>();
        sourceOfClass = new SourceOfClass();
        Classes[] readFileClass;
        try {
            readFileClass = sourceOfClass.readFile();
        } catch (ClassNotFoundException | IOException var1) {
            JOptionPane.showMessageDialog(null, var1);
            readFileClass = new Classes[]{
                    new Classes(0, "Class1", 1, 1, 0, 1),
                    new Classes(1, "Class2", 1, 1, 0, 1),
                    new Classes(2, "Class3", 1, 1, 0, 1)};

            try {
                sourceOfClass.writeFile(readFileClass);
            } catch (ClassNotFoundException | IOException var2) {
                JOptionPane.showMessageDialog(null, var2);
            }
        }
        classesList.addAll(Arrays.asList(readFileClass));
    }

    public void initialRole() {
        roleList = new ArrayList<>();
        sourceOfRole = new SourceOfRole();
        RolePerson[] readFileRole;
        try {
            readFileRole = sourceOfRole.readFile();
        } catch (ClassNotFoundException | IOException var1) {
            JOptionPane.showMessageDialog(null, var1);
            readFileRole = new RolePerson[]{
                    new RolePerson(0, "دانش آموز", fieldStudent, fieldRequierdStudent),
                    new RolePerson(1, "معلم", fieldTeacher, fieldRequierdTeacher),
            };
            try {
                sourceOfRole.writeFile(readFileRole);
            } catch (ClassNotFoundException | IOException var2) {
                JOptionPane.showMessageDialog(null, var2);
            }
        }
        roleList.addAll(Arrays.asList(readFileRole));
    }
*/
    public void initialPerson() {
        personList = new ArrayList<>();
        sourceOfPerson = new SourceOfPerson();
        Person[] readFilePerson;
        try {
            readFilePerson = sourceOfPerson.readFile();
        } catch (ClassNotFoundException | IOException var1) {
            JOptionPane.showMessageDialog(null, var1);
            readFilePerson = new Person[]{
                    new Person(1,"student1", "stL1", "father1", "01/01/1394", "resource/student.png", "nationalCode1", "nationalCode1","nationalCode1",1),
                    new Person(2,"student2", "stL2", "father2", "02/01/1394", "resource/student.png", "nationalCode2", "nationalCode2", "nationalCode2",2),
                    new Person(3,"student3", "stL3", "father3", "03/01/1394", "resource/student.png", "nationalCode3", "nationalCode3", "nationalCode3",3),
                    new Person(4,"student4", "stL4", "father4", "04/01/1394", "resource/student.png", "nationalCode4", "nationalCode4", "nationalCode4",4),
                    new Person(5,"student5", "stL5", "father5", "05/01/1394", "resource/student.png", "nationalCode5", "nationalCode5", "nationalCode5",5),
                    new Person(6,"student6", "stL6", "father6", "06/01/1394", "resource/student.png", "nationalCode6", "nationalCode6", "nationalCode6",6),
                    new Person(7,"student7", "stL7", "father7", "07/01/1394", "resource/student.png", "nationalCode7", "nationalCode7", "nationalCode7",7),
                    new Person(8,"student8", "stL8", "father8", "08/01/1394", "resource/student.png", "nationalCode8", "nationalCode8", "nationalCode8",8),
                    new Person(9,"student9", "stL9", "father9", "09/01/1394", "resource/student.png", "nationalCode9", "nationalCode9", "nationalCode9",9),
                    new Person(10,"student10", "stL10", "father10", "10/01/1394", "resource/student.png", "nationalCode10", "nationalCode10", "nationalCode10",10),

                    new Person(11,"teacher11", "thL11", "father11", "11/01/1394", "resource/teacher.png", "nationalCode11", "nationalCode11", "nationalCode11",11),
                    new Person(12,"teacher12", "thL12", "father12", "12/01/1394", "resource/teacher.png", "nationalCode12", "nationalCode12", "nationalCode12",12),
                    new Person(13,"teacher13", "thL13", "father13", "13/01/1394", "resource/teacher.png", "nationalCode13", "nationalCode13", "nationalCode13",13),
            };
            try {
                sourceOfPerson.writeFile(readFilePerson);
            } catch (ClassNotFoundException | IOException var2) {
                JOptionPane.showMessageDialog(null, var2);
            }
        }
        personList.addAll(Arrays.asList(readFilePerson));
    }
    private void initialStudent() {
        studentList = new ArrayList<>();
        sourceOfStudent = new SourceOfStudent();
        Student[] readFileStudent;
        try {
            readFileStudent = sourceOfStudent.readFile();
        } catch (ClassNotFoundException | IOException var1) {
            JOptionPane.showMessageDialog(null, var1);
            readFileStudent = new Student[]{
                    new Student(1,0,1,personList.get(0).getId()),
                    new Student(2,0,2,personList.get(1).getId()),
                    new Student(3,0,3,personList.get(2).getId()),
                    new Student(4,0,4,personList.get(3).getId()),
                    new Student(5,0,5,personList.get(4).getId()),
                    new Student(6,0,6,personList.get(5).getId()),
                    new Student(7,0,7,personList.get(6).getId()),
                    new Student(8,0,8,personList.get(7).getId()),
                    new Student(9,0,9,personList.get(8).getId()),
                    new Student(10,0,10,personList.get(9).getId()),
            };
            try {
                sourceOfStudent.writeFile(readFileStudent);
            } catch (ClassNotFoundException | IOException var2) {
                JOptionPane.showMessageDialog(null, var2);
            }
        }
        studentList.addAll(Arrays.asList(readFileStudent));
    }
/*
    public void initialTimeTable() {
        sourceOfTimeTable = new SourceOfTimeTable();
        timeTableList = new ArrayList<>();
        TimeTable[] readFileTimeTable;
        try {
            readFileTimeTable = sourceOfTimeTable.readFile();
        } catch (ClassNotFoundException | IOException var1) {
            JOptionPane.showMessageDialog(null, var1);
            readFileTimeTable = new TimeTable[]{
                    new TimeTable(0, 0, 0, personList.get(4).getnationalCode(), classesList.get(0).getId()),
                    new TimeTable(1, 3, 1, personList.get(4).getnationalCode(), classesList.get(0).getId()),
                    new TimeTable(2, 1, 2, personList.get(4).getnationalCode(), classesList.get(0).getId()),
                    new TimeTable(3, 0, 3, personList.get(4).getnationalCode(), classesList.get(0).getId()),
                    new TimeTable(4, 2, 0, personList.get(5).getnationalCode(), classesList.get(1).getId()),
                    new TimeTable(5, 4, 1, personList.get(5).getnationalCode(), classesList.get(1).getId()),
                    new TimeTable(6, 3, 2, personList.get(5).getnationalCode(), classesList.get(1).getId()),
                    new TimeTable(7, 0, 3, personList.get(5).getnationalCode(), classesList.get(1).getId()),
                    new TimeTable(8, 4, 0, personList.get(6).getnationalCode(), classesList.get(2).getId()),
                    new TimeTable(9, 0, 1, personList.get(6).getnationalCode(), classesList.get(2).getId()),
                    new TimeTable(10, 3, 2, personList.get(6).getnationalCode(), classesList.get(2).getId()),
                    new TimeTable(11, 1, 3, personList.get(6).getnationalCode(), classesList.get(2).getId()),
            };

            try {
                sourceOfTimeTable.writeFile(readFileTimeTable);
            } catch (ClassNotFoundException | IOException var2) {
                JOptionPane.showMessageDialog(null, var2);
            }
        }
        this.timeTableList.addAll(Arrays.asList(readFileTimeTable));
    }

    public List<Settings> getSettingList() {
        return settingList;
    }

*/
    public boolean updatePersonList(Person[] persons) {
        this.personList.clear();
        this.personList.addAll(Arrays.asList(persons));
        try {
            sourceOfPerson.writeFile(persons);
            return true;
        } catch (ClassNotFoundException | IOException e) {
            JOptionPane.showMessageDialog(null, e);
            return false;
        }
    }

    public boolean updateStudentList(Student[] students) {
        this.studentList.clear();
        this.studentList.addAll(Arrays.asList(students));
        try {
            sourceOfStudent.writeFile(students);
            return true;
        } catch (ClassNotFoundException | IOException e) {
            JOptionPane.showMessageDialog(null, e);
            return false;
        }
    }

    public List<Person> getPersonList() {
        return personList;
    }

    public List<Student> getStudentList() {
        return studentList;
    }
/*
    public boolean updateTimeTablgList(TimeTable[] timeTableList) {
        this.timeTableList.clear();
        this.timeTableList.addAll(Arrays.asList(timeTableList));
        try {
            sourceOfTimeTable.writeFile(timeTableList);
            return true;
        } catch (ClassNotFoundException | IOException var2) {
            JOptionPane.showMessageDialog(null, var2);
            return false;
        }
    }

    public boolean updateSettingList(Settings[] settingList) {
        this.settingList.clear();
        this.settingList.addAll(Arrays.asList(settingList));
        try {
            sourceOfSetting.writeFile(settingList);
            for (Settings settings :
                    settingList) {
                if (settings.isCurrent()) {
                    currentSetting = settings.getSettingId();
                    break;
                }
            }
            return true;
        } catch (ClassNotFoundException | IOException var2) {
            JOptionPane.showMessageDialog(null, var2);
            return false;
        }
    }

    public int getCurrentSetting() {
        return currentSetting;
    }

    public boolean updateRoleList(RolePerson[] roleList) {
        this.roleList.clear();
        this.roleList.addAll(Arrays.asList(roleList));
        try {
            sourceOfRole.writeFile(roleList);
            return true;
        } catch (ClassNotFoundException | IOException var2) {
            JOptionPane.showMessageDialog(null, var2);
            return false;
        }
    }
    */
}
