package patterns.facade;

public enum Ingredient {
    BEEF("ground beef"),
    FISH("cod"),
    TOMATO("tomato"),
    ONION("white onion"),
    POTATO("Idaho potato"),
    CHEESE("cheddar cheese"),
    LETTUCE("lettuce"),
    BREAD("bun");

    private String component;
    private Ingredient(String ingredient) {
        this.component = ingredient;
    }

    public String getIngredient() {
        return component;
    }
}
