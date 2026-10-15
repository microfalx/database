package net.microfalx.database.mysql;

import net.microfalx.database.AbstractTransaction;
import net.microfalx.database.Node;

public class MySqlTransaction extends AbstractTransaction {

    private long transactionId;
    private long threadId;

    public MySqlTransaction(Node node, String id, long transactionId, long threadId) {
        super(node, id);
        this.transactionId = transactionId;
        this.threadId = threadId;
    }

    @Override
    public void close() {

    }
}
