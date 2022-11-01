package Util;

public class Dept {
    String number ;
   String salary;
    String location;
    String time;
  String id;
    String name;

    public Dept(String number , String name,String location) {
        this.number = number;
        this.location = location;
        this.name = name;
    }

    public Dept() {
    }

    public Dept(String number, String salary, String time, String id, String name) {
        this.number = number;
        this.salary = salary;
        this.time = time;
        this.id = id;
        this.name = name;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
