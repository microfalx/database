package net.microfalx.database.mysql;

import net.microfalx.database.AbstractDatabase;
import net.microfalx.database.AbstractNode;
import net.microfalx.database.DataSource;

public class MySqlNode extends AbstractNode {

    public MySqlNode(AbstractDatabase database, String id, String name, DataSource dataSource) {
        super(database, id, name, dataSource);
    }
}
