package codesignal;

import java.util.List;

interface StoreInventory {

    // Level 1
    default int addStock(String product, int quantity) {
        return 0;
    }

    default boolean hasProduct(String product) {
        return false;
    }

    // Level 2
    default boolean removeStock(String product, int quantity) {
        return false;
    }

    default int totalUnits() {
        return 0;
    }

    // Level 3
    default boolean assignCategory(String product, String category) {
        return false;
    }

    default int unitsInCategory(String category) {
        return 0;
    }

    default String topProduct() {
        return "";
    }

    // Level 4
    default List<String> topProducts(int n) {
        return null;
    }
}