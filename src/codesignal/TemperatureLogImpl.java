package codesignal;

import java.util.*;

class TemperatureLogImpl implements TemperatureLog {

    private final List<Integer> temperatures;

    public TemperatureLogImpl() {

        // TODO: implement
        this.temperatures = new ArrayList<>();
    }

    // TODO: implement interface methods here

    @Override
    public int record(int temperature) {
        temperatures.add(temperature);
        return temperatures.size();
    }

    @Override
    public boolean undo() {
        if (temperatures.isEmpty()) {
            return false;
        }
        temperatures.remove(temperatures.size() - 1);
        return true;
    }

    @Override
    public int size() {
        return temperatures.size();
    }

    public Optional<Integer> getMax() {
        if (temperatures.isEmpty()) {
            return Optional.empty();
        }
//        return Optional.of(Collections.max(temperatures));
        int maior = temperatures.get(0);
        for (int t : temperatures) {
            if (t > maior) {
                maior = t;
            }
        }
        return Optional.of(maior);
    }
}