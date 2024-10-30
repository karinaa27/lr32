package com.mgke.lr32;

public class Food {
    private String name;
    private String description;
    private int imageResourceId;
    public static final Food[] foods = {
            new Food("Бургер", "Нежный булочка с сочным мясом, свежими овощами и специальным соусом, который придаёт блюду уникальный вкус. Идеально подходит для быстрого перекуса или сытного обеда.", R.drawable.fast_food),
            new Food("Пицца", "Классическая итальянская пицца с тонким тестом, покрытая расплавленным сыром, томатным соусом и разнообразными начинками на ваш выбор. Отличный вариант для дружеской вечеринки.", R.drawable.fast_food),
            new Food("Шаурма", "Ароматный лаваш, наполненный нежным мясом, свежими овощами и пикантным соусом. Идеальный выбор для тех, кто хочет попробовать что-то вкусное и сытное на ходу.", R.drawable.fast_food)};

    private Food(String name, String description, int imageResourceId) {
        this.name = name;
        this.description = description;
        this.imageResourceId = imageResourceId;
    }

    public String getDescription() {
        return description;
    }

    public String getName() {
        return name;
    }

    public int getImageResourceId() {
        return imageResourceId;
    }

    public String toString() {
        return this.name;
    }
}
