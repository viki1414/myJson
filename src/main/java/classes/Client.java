package classes;

class Client extends BasePerson {
    private String bank;

    public Client(String name, String surname, Integer age, String company) {

        super(name, surname, age);
        this.bank = company;
    }

    public void displayInfo() {

        System.out.println("Имя: " + super.getName() + " Фамилия: "
                + super.getSurname() + " Клиент банка: " + bank);
    }
}
