package net.microfalx.database.mysql;

import net.microfalx.database.AbstractIndex;
import net.microfalx.database.Schema;

public class MySqlIndex extends AbstractIndex<MySqlIndex> {

    public MySqlIndex(Schema schema, String name) {
        super(schema, name);
    }
}
