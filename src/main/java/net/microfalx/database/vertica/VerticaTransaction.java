package net.microfalx.database.vertica;

import net.microfalx.database.AbstractTransaction;
import net.microfalx.database.Node;

public class VerticaTransaction extends AbstractTransaction {

    public VerticaTransaction(Node node, String id) {
        super(node, id);
    }

    @Override
    public void close() {

    }
}
