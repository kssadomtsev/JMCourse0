package tasks;

public class Task4 {

    public static class Human {
        private String name;
        private int age;

        public Human(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public void sayHello() {
            System.out.println("Привет, меня зовут " + name + ", мне " + age + " лет.");
        }
    }

    public static void main(String[] args) {
        Human human = new Human("Jack", 35);
        human.sayHello();
    }
}
