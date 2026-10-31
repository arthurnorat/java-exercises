package hashmap;

import java.util.HashMap;
import java.util.Map;

public class BankAccounts {

    private final Map<String, Integer> balances;

    public BankAccounts() {
        this.balances = new HashMap<>();
    }

    public boolean withdraw(String accountId, int amount) {
        if (!balances.containsKey(accountId)) {
            return false;
        }

        int currentAmount = balances.get(accountId);

        if (amount > currentAmount) {
            return false;
        } else if (amount < currentAmount) {
            currentAmount -= amount;
            balances.put(accountId, currentAmount);
        } else {
            balances.remove(accountId);
        }
        return true;
    }
}