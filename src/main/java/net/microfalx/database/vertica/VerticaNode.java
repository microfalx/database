package net.microfalx.database.vertica;

import net.microfalx.database.AbstractDatabase;
import net.microfalx.database.AbstractNode;
import net.microfalx.database.DataSource;

public class VerticaNode extends AbstractNode {

    public VerticaNode(AbstractDatabase database, String id, String name, DataSource dataSource) {
        super(database, id, name, dataSource);
    }
}
