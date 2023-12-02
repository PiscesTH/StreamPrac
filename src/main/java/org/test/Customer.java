package org.test;

import java.util.Objects;

public class Customer implements Comparable<Customer> {
    private final String name;
    private final int age;

    public Customer(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Customer{name='%s', age=%d}".formatted(name, age);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) { return true; }
        if (obj == null || obj.getClass() != getClass()) { return false; }
        Customer customer = (Customer) obj;
        return Objects.equals(name, customer.name) && age == customer.age;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    @Override
    public int compareTo(Customer o) {
        if (this.age > o.getAge()) { return 1; }
        if (age == o.getAge()) { return 0; }
        return -1;
    }
}
