package org.example;

public class Main {
    public static void main(String[] args) {
       
        Person p1 = new Person("1","Max",DaysOfWeek.FRIDAY);

        PersonRepository personRepository = new PersonRepository();

        personRepository.savePerson(p1);

        Person result = personRepository.findById("1");
        if (result != null) {
            System.out.println(result.favoriteDay());
        }


    }

    public static String week(DaysOfWeek weekday) {
        if (weekday == DaysOfWeek.MONDAY ||
                weekday == DaysOfWeek.TUESDAY ||
                weekday == DaysOfWeek.WEDNESDAY ||
                weekday == DaysOfWeek.THURSDAY ||
                weekday == DaysOfWeek.FRIDAY ) {
            return weekday.toString();
        }
        return "Wochenende";
        }

}