/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studentlist;

/**
 *
 * @author srinivsi
 */
public class Student
{   
    private String name;
    private int age;
    private int partSId;
    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the age
     */
    public int getAge() {
        return age;
    }

    /**
     * @param age the age to set
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * @return the partSId
     */
    public int getPartSId() {
        return partSId;
    }

    /**
     * @param partSId the partSId to set
     */
    public void setPartSId(int partSId) {
        this.partSId = partSId;
    }
    
}
