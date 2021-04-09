package patterns.facade;

import java.util.Arrays;
import java.util.HashSet;

public enum MenuItem {
    CHEESEBURGER(new HashSet<>(Arrays.asList(Ingredient.BEEF, Ingredient.LETTUCE, Ingredient.TOMATO, Ingredient.CHEESE, Ingredient.BREAD))),
    FISH_AND_CHIPS(new HashSet<>(Arrays.asList(Ingredient.FISH, Ingredient.POTATO))),
    TOMATO_SOUP(new HashSet<>(Arrays.asList(Ingredient.TOMATO))),
    ONION_SOUP(new HashSet<>(Arrays.asList(Ingredient.ONION, Ingredient.CHEESE))),
    POTATO_SOUP(new HashSet<>(Arrays.asList(Ingredient.POTATO, Ingredient.CHEESE))),
    SALAD(new HashSet<>(Arrays.asList(Ingredient.TOMATO, Ingredient.LETTUCE))),
    FISH_SANDWICH(new HashSet<>(Arrays.asList(Ingredient.FISH, Ingredient.TOMATO, Ingredient.LETTUCE, Ingredient.BREAD))),
    FRIES(new HashSet<>(Arrays.asList(Ingredient.POTATO))),
    ONION_RINGS(new HashSet<>(Arrays.asList(Ingredient.ONION)));

    private HashSet<Ingredient> components;
    private MenuItem(HashSet<Ingredient> components) {
        this.components.addAll(components);
    }

    @Override
    public String toString() {
        return components.toString();
    }
}
