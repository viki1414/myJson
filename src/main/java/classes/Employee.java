package classes;

class Employee extends BasePerson {

    private String bank;

    public Employee(String name, String surname, Integer age, String company) {

        super(name, surname, age);
        this.bank = company;
    }

    public void displayInfo() {

        System.out.println("Имя: " + super.getName() + " Фамилия: "
                + super.getSurname() + " Работает в банке: " + bank);
    }
}