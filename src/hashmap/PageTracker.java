package hashmap;

import java.util.HashMap;
import java.util.Map;

public class PageTracker {

    private final Map<String, Integer> views;

    public PageTracker() {
        this.views = new HashMap<>();
    }

    public int addView(String pageId) {
        int amountOfViews = views.getOrDefault(pageId, 0); // Ler
        int totalViews = amountOfViews + 1; // Calcular
        views.put(pageId, totalViews); // Gravar
        return totalViews; // Devolver
    }
}
