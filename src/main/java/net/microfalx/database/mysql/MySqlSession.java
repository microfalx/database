package net.microfalx.database.mysql;

import net.microfalx.database.AbstractSession;
import net.microfalx.database.Node;

public class MySqlSession extends AbstractSession {

    private long threadId;

    public MySqlSession(Node node, String id, long threadId) {
        super(node, id);
        this.threadId = threadId;
    }

    @Override
    public void cancel() {

    }

    @Override
    public void close() {

    }
}
