package pairmatching.domain;

import java.util.Collections;
import java.util.List;

public class Pair {
    private final List<Crew> crews;

    public Pair(List<Crew> crews) {
        this.crews = crews;
    }

    public List<Crew> getCrews() {
        return Collections.unmodifiableList(crews);
    }
}