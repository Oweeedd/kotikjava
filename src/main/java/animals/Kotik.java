package main.java.animals;

import java.util.Random;

public class Kotik {

    private String name;
    private String voice;
    private int satiety;
    private int weight;
    private static int count = 0;
    private static final int METHODS = 5;


    public Kotik() {
        count++;
    }


    public Kotik(String name, String voice, int satiety, int weight) {
        this.name = name;
        this.voice = voice;
        this.satiety = satiety;
        this.weight = weight;
        count++;
    }

                            //приемка
    public String getName() {
        return name;
    }

    public String getVoice() {
        return voice;
    }

    public int getSatiety() {
        return satiety;
    }

    public int getWeight() {
        return weight;
    }


    public void setName(String name) {
        this.name = name;
    }

    public void setVoice(String voice) {
        this.voice = voice;
    }

    public void setSatiety(int satiety) {
        this.satiety = satiety;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    // Остальные методы
    public boolean play() {
        if (satiety > 0) {
            System.out.println("Котик играет.");
            satiety--;
            return true;
        } else {
            System.out.println("Котик голоден, покормите его.");
            return false;
        }
    }

    public boolean sleep() {
        if (satiety > 0) {
            System.out.println("Котик спит.");
            satiety--;
            return true;
        } else {
            System.out.println("Котик голоден, покормите его.");
            return false;
        }
    }

    public boolean wash() {
        if (satiety > 0) {
            System.out.println("Котик умывается.");
            satiety--;
            return true;
        } else {
            System.out.println("Котик голоден, покормите его.");
            return false;
        }
    }

    public boolean walk() {
        if (satiety > 0) {
            System.out.println("Котик гуляет.");
            satiety--;
            return true;
        } else {
            System.out.println("Котик голоден, покормите его.");
            return false;
        }
    }

    public boolean hunt() {
        if (satiety > 0) {
            System.out.println("Котик охотится.");
            satiety--;
            return true;
        } else {
            System.out.println("Котик голоден, покормите его.");
            return false;
        }
    }

    public boolean eat(int foodAmount, String foodName) {
        System.out.println("Котик ест " + foodName + " в количестве " + foodAmount + " единиц.");
        satiety += foodAmount;
        return true;
    }

    public boolean eat(int foodAmount) {
        System.out.println("Котик ест в количестве " + foodAmount + " единиц.");
        satiety += foodAmount;
        return true;
    }

    public boolean eat() {
        return eat(5, "корм");
    }

    public static int getCount() {
        return count;
    }

    public String[] liveAnotherDay() {
        String[] activities = new String[24];
        Random random = new Random();

        for (int hour = 0; hour < 24; hour++) {
            int method = random.nextInt(METHODS);
            boolean result = false;

            switch (method) {
                case 0:
                    result = play();
                    break;
                case 1:
                    result = sleep();
                    break;
                case 2:
                    result = eat();
                    break;
                case 3:
                    result = wash();
                    break;
                case 4:
                    result = hunt();
                    break;
            }

            activities[hour] = hour + " - " + (result ? "выполнил" : "просил есть");
            if (!result) {
                eat(5, "корм");
            }
        }
        return activities;
    }

    public static boolean compareVoice(Kotik kotik1, Kotik kotik2) {
        return kotik1.getVoice().equals(kotik2.getVoice());
    }
}