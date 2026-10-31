package codesignal;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class TaskRegistryImpl implements TaskRegistry {

    private final List<String> names;

    public TaskRegistryImpl() {
        // TODO: implement
        this.names = new ArrayList<>();
    }

    // TODO: implement interface methods here
    @Override
    public boolean addTask(String name) {
        if (names.contains(name)) {
            return false;
        }
        names.add(name);
        return true;
    }

    @Override
    public boolean hasTask(String name) {
        return names.contains(name);
    }

    @Override
    public int count() {
        return names.size();
    }

    // O registro deve suportar obter a tarefa mais recente.
    // Optional<String> getLatest()
    // Retorna o nome da tarefa adicionada mais recentemente ao registro.
    // Se o registro estiver vazio, retorna Optional.empty().
    @Override
    public Optional<String> getLatest() {
        if (names.isEmpty()) {
            return Optional.empty();
        }
        return Optional.of(names.get(names.size() -1 ));
    }
}
