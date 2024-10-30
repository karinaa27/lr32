package com.mgke.lr32;

public class Drink {
    private String name;
    private String description;
    private int imageResourceId;
    public static final Drink[] drinks = {
            new Drink("Латте", "Кофейный напиток, на основе молока, представляющий собой трёхслойную смесь из пены, молока и кофе эспрессо", R.drawable.coffee_house),
            new Drink("Капучино", "Кофейный напиток итальянской кухни на основе эспрессо с добавлением в него подогретого вспененного молока", R.drawable.coffee_house),
            new Drink("Raf", "Кофейный напиток, готовится путём добавления нагретых паром сливок с небольшим количеством пены в одиночную порцию эспрессо", R.drawable.coffee_house)};

    public Drink(String name, String description, int imageResourceId) {
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