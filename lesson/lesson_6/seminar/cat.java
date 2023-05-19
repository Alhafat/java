package lesson.lesson_6.seminar;

import java.util.List;

public class cat {

    /*
     * . Продумайте структуру класса Кот. Какие поля и методы будут актуальны для
     * приложения, которое является
     * а) информационной системой ветеринарной клиники
     * б) архивом выставки котов
     * в) информационной системой Театра кошек Ю. Д. Куклачёва
     * Можно записать в текстовом виде, не обязательно реализовывать в java.
     */
    private String name;
    private String type;
    private int age;
    private String owner;
    private List<String> health_history;

    cat(String name, String type, int age, String owner) {
        this.name = name;
        this.type = type;
        this.age = age;
        this.owner = owner;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "name: " + name + ", type: " + type + ", age: " + age + ", owner: " + owner;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cat)) {
            return false;
        }
        cat cat = (cat) obj;
        return name.equals(cat.name) && type.equals(cat.type) && age == cat.age && owner.equals(cat.owner);
    }

    @Override
    public int hashCode() {
        return name.hashCode() + 7*age + 11*type.hashCode() + 17*owner.hashCode();
    }
}
