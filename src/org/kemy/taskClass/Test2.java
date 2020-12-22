package org.kemy.taskClass;

import org.kemy.Input;

public class Test2 {
    private String name;
    private String city;
    {
        name = "asdf";
    }
    {
        city = "sdf";
    }

    public Test2() {
        this.name = "Timy";
        this.city = "Hrodno";
    }

    public void changeNum(int first, int second, int third){

    }
    public Test2(String name, String city) {
        this.name = name;
        this.city = city;
    }
    static {

    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }
static {

}
    public void setCity(String city) {
        this.city = city;
    }

    public void main(String[] args) {
        changeNum(1,3,4);
    }
}
