package hello.advanced.trace;

import java.util.UUID;

public class TraceId {

    private String id;
    private int level;

    public TraceId() {
        this.id = createId();
        this.level = 0;
    }

    public TraceId(String id, int i) {
        this.id = id;
        this.level = i;
    }

    private String createId() {
        return UUID.randomUUID().toString().substring(0,8);
    }

    private TraceId createNextId() {
        return new TraceId(id, level + 1);
    }

    private TraceId createPrevId() {
        return new TraceId(id, level - 1);
    }

    private boolean isFirstLevel() {
        return level == 0;
    }

    public String getId() {
        return this.id;
    }

    public int getLevel() {
        return this.level;
    }
}
