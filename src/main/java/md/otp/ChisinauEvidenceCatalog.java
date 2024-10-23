package md.otp;

import md.otp.peopleevidence.Person;

    public class ChisinauEvidenceCatalog {

        public static void main(String[] args) {

            Person ion001 = new Person("Ion", "Busuioc", 546245);
            System.out.println(ion001.firstname);
            System.out.println(ion001.getAge());
            System.out.println(ion001.isRetired); // valoarea predefinita pentru isRetired este false

            Person andrei = new Person("Andrei", "Secu", 5646546, 18, false);
            System.out.println(andrei.firstname);
            System.out.println(andrei.getAge());

            Person person1 = new Person("Person1", "Person1", 5456465, 524, true);

            System.out.println(person1.getAge());

            Person person2 = new Person("Person2", "Person2", 256448658, -20, true);
            System.out.println(person2.getAge());

            Person person3 = new Person("Person3", "Person3", 548794649);
            System.out.println(person3.firstname);
            System.out.println("ID=" + person3.ID);

            ion001.printRetirementStatus();

            andrei.printRetirementStatus();

            person1.printRetirementStatus();

            person2.printRetirementStatus();

            person3.printRetirementStatus();

            Person.isHuman = false;
        }
    }