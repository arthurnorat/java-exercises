package hashmap;

import java.util.HashMap;
import java.util.Map;

public class UserRegistry {

    private final Map<String, Integer> users;

    public UserRegistry() {
        this.users = new HashMap<>();
    }

    public boolean hasUser(String userId) {
        return users.containsKey(userId);
    }
}