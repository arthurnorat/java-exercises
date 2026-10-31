package codesignal;

import java.util.HashMap;
import java.util.Map;

class StoreInventoryImpl implements StoreInventory {

    private final HashMap<String, Integer> inventory;

    public StoreInventoryImpl() {
        // TODO: implement
        this.inventory = new HashMap<>();
    }

    // TODO: implement interface methods here
    @Override
    public int addStock(String product, int quantity) {
        int amount = inventory.getOrDefault(product, 0);
        int newAmount = amount + quantity;
        inventory.put(product, newAmount);
        return newAmount;
    }

    @Override
    public boolean hasProduct(String product) {
        return inventory.containsKey(product);
    }

    @Override
    public boolean removeStock(String product, int quantity) {
        if (!inventory.containsKey(product)) {
            return false;
        }

        int amount = inventory.get(product);
        if (quantity > amount) {
            return false;
        }

        int amountAfterSubtraction = amount - quantity;
        if (amountAfterSubtraction == 0) {
            inventory.remove(product);
        } else {
            inventory.put(product, amountAfterSubtraction);
        }
        return true;
    }

    @Override
    public int totalUnits() {
        int total = 0;
        for (int units : inventory.values()) {
            total += units;
        }
        return total;
    }

    @Override
    public String topProduct() {

        String melhorNome = "";
        int melhorEstoque = -1;

        for (Map.Entry<String, Integer> entry : inventory.entrySet()) {
            String nome = entry.getKey();
            int estoque = entry.getValue();

            if (estoque > melhorEstoque || (estoque == melhorEstoque && nome.compareTo(melhorNome) < 0)) {
                melhorEstoque = estoque;
                melhorNome = nome;
            }
        }

        return melhorNome;
    }
}