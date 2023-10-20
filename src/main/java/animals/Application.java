package main.java.animals;

public class Application {
    public static void main(String[] args) {
        Kotik kotik1 = new Kotik("Мурзик", "Мяу", 10, 5);
        Kotik kotik2 = new Kotik();

        String[] activities = kotik1.liveAnotherDay();
        for (String activity : activities) {
            System.out.println(activity);
        }

        System.out.println("Имя котика: " + kotik1.getName());
        System.out.println("Вес котика: " + kotik1.getWeight());

        if (Kotik.compareVoice(kotik1, kotik2)) {
            System.out.println("Котики разговаривают одинаково.");
        } else {
            System.out.println("Котики разговаривают по-разному.");
        }

        System.out.println("Количество котиков: " + Kotik.getCount());
    }
}