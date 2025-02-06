package me.a8kj.common.behavior;

public interface Discountable {

    /**
     * Gets the original price of the item.
     *
     * @return the original price
     */
    int getOriginalPrice();

    /**
     * Gets the discount percentage applied to the item.
     *
     * @return the discount percentage (0-100)
     */
    int getDiscountPercentage();

    /**
     * Calculates the discounted price of the item.
     *
     * @return the discounted price
     */
    default int getDiscountedPrice() {
        return getOriginalPrice() * (100 - getDiscountPercentage()) / 100;
    }

    /**
     * Checks if the item is currently discounted.
     *
     * @return true if discounted, false otherwise
     */
    default boolean isDiscounted() {
        return getDiscountPercentage() > 0;
    }
}
