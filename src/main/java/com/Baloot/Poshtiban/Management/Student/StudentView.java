package com.Baloot.Poshtiban.Management.Student;

import com.Baloot.Poshtiban.InitialDataEntry;
import com.Baloot.Poshtiban.Management.Person;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import java.util.ArrayList;
import java.util.List;

/**
 * کلاس مربوط ه نمایش اطلاعات دانش آموز
 */
@ManagedBean
@ViewScoped
public class StudentView {
    /**
     * لیست دانش آموزان
     */
    private List<Student> students;
    private List<Person> persons;
    private InitialDataEntry data;
    private List<Student> filterList;
    private Student selectedPerson;
    public StudentView()
    {
        students=new ArrayList<>();
        persons=new ArrayList<>();
        data=new InitialDataEntry();
        students.addAll(data.getStudentList());
        persons.addAll(data.getPersonList());
    }
    public Person givePerson(int id)
    {
        if (id==-1)
            return null;
        else
            return persons.get(id);
    }

    public List<Student> getStudents() {
        return students;
    }

    public List<Person> getPersons() {
        return persons;
    }

    public List<Student> getFilterList() {
        return filterList;
    }

    public Student getSelectedPerson() {
        return selectedPerson;
    }

    public void setSelectedPerson(Student selectedPerson) {
        this.selectedPerson = selectedPerson;
    }

    public void setFilterList(List<Student> filterList) {
        this.filterList = filterList;
    }
}
