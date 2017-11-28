package classes;

public abstract class BasePerson {

    private String name;
    private String surname;
    private Integer age;

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public BasePerson(String name, String surname, Integer age) {

        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public abstract void displayInfo();
}