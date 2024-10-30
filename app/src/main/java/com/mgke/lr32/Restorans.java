package com.mgke.lr32;

public class Restorans {
    private String name;
    private String description;
    private int imageResourceId;
    public static final Restorans[] restorans = {
            new Restorans("Вкусный Уголок", "Насладитесь домашней кухней с блюдами, которые согреют душу.", R.drawable.restaurant),
            new Restorans("Семейный Пир", "Уютное место, где каждый найдет свое любимое блюдо. Вкусно, как у бабушки!", R.drawable.restaurant),
            new Restorans("Кухня Друзей", "Здесь готовят с любовью и заботой, чтобы каждый гость чувствовал себя как дома.", R.drawable.restaurant)};

    private Restorans(String name, String description, int imageResourceId) {
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
