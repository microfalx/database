package net.microfalx.database.mysql;

import net.microfalx.database.AbstractColumn;
import net.microfalx.database.Table;

public class MySqlColumn extends AbstractColumn<MySqlColumn> {

    public MySqlColumn(Table<?> table, String name) {
        super(table, name);
    }
}
