package java8;

import java.util.Optional;

public class OptionalDemo {

    public static void main(String[] args) {

        Student obj = new Student(1, null);

        if (obj.getName() != null) {
            System.out.println(obj.getName().toUpperCase());
        } else {
            System.out.println("Name is null");
        }

//        Optional<String> optional = Optional.of(obj.getName());
//        System.out.println(optional.get());

        Optional<String> optional = Optional.empty();
        System.out.println(optional);

        Optional<String> optional1 = Optional.ofNullable(obj.getName());
        if (optional1.isPresent()) {
            System.out.println(optional1.get());
        }

        Optional<String> optional2 = Optional.ofNullable(obj.getName());
        System.out.println(optional2.orElse("Rahul"));

        Optional<String> optional3 = Optional.ofNullable(obj.getName());
        System.out.println(optional3.orElseGet(() -> "Rahul"));

        Optional<String> optional4 = Optional.ofNullable(obj.getName());
        System.out.println(optional4.orElseThrow());

        try {
            Optional<String> optional5 = Optional.ofNullable(obj.getName());
            System.out.println(optional5.orElseThrow(()->new Exception("Throwing exc")));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}

class Student {

    private int id;
    private String name;

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
