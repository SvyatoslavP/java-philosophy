package com.example.javaphilosophy.chapters.three.equalsAndHashcode;

import lombok.Getter;
import lombok.Setter;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

/**
 * Обязательно переопределять метод equals и hashcode
 */
@Getter
@Setter
public class MyClass {
    private Long id;
    private String name;

    public MyClass(Long id, String name) {
        this.id = id;
        this.name = name;
    }
    @Override
    public boolean equals(Object o) {
        System.out.println("выполняется метод equals");
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MyClass myClass = (MyClass) o;
        return Objects.equals(id, myClass.id) &&
                Objects.equals(name, myClass.name);
    }

    @Override
    public int hashCode() {
        System.out.println("выполняется метод - hashCode");
        return Objects.hash(id, name);
    }

    @Override
    public String toString() {
        return "MyClass{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}

/**
 * Проверка очередности выполнения методов equals и hashcode при добавлении в множество HashSet
 */
 class Test {
    public static void main(String[] args) {

        Set<MyClass> mySet = new HashSet<>();
        System.out.println("Добавим Зайца");
        mySet.add(new MyClass(1L, "Заяц"));
        System.out.println("Добавим Волка");
        mySet.add(new MyClass(1L, "Волк"));
        System.out.println("Добавим Ежика");
        mySet.add(new MyClass(1L, "Ежик"));
        System.out.println("Добавим еще одного Ежика");
        mySet.add(new MyClass(1L, "Ежик"));

        System.out.println("SIZE(размер всех элементов) - " + mySet.size());
    }
}