package it.develhope.incapsulation2;

public class StartPerson {
    public static void main(String args[]){


Person person = new Person();

        person.setAge(22);
        person.setName("gino");
        person.setHeight(1.73);
        person.setSurname("Pastrocchi");

System.out.println("This is "+ person.getName()+ " "+ person.getSurname()+  " he's "+ person.getAge() +" years old and is "+ person.getHeight()+ "m tall");
    }
}
