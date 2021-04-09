package patterns.facade;

import java.util.EnumSet;

public enum MenuItem {
    CHEESEBURGER(EnumSet.of(Ingredient.CHEESE, Ingredient.BEEF, Ingredient.TOMATO, Ingredient.LETTUCE, Ingredient.BREAD)),
    FISH_AND_CHIPS(EnumSet.of(Ingredient.FISH, Ingredient.POTATO)),
    TOMATO_SOUP(EnumSet.of(Ingredient.TOMATO)),
    ONION_SOUP(EnumSet.of(Ingredient.ONION, Ingredient.CHEESE)),
    POTATO_SOUP(EnumSet.of(Ingredient.POTATO, Ingredient.CHEESE)),
    SALAD(EnumSet.of(Ingredient.TOMATO, Ingredient.LETTUCE)),
    FISH_SANDWICH(EnumSet.of(Ingredient.FISH, Ingredient.TOMATO, Ingredient.LETTUCE, Ingredient.BREAD)),
    FRIES(EnumSet.of(Ingredient.POTATO)),
    ONION_RINGS(EnumSet.of(Ingredient.ONION));

    private EnumSet<Ingredient> components;
    private MenuItem(EnumSet<Ingredient> components) {
        this.components.addAll(components);
    }
}
