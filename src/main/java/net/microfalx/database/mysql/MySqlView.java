package net.microfalx.database.mysql;

import net.microfalx.database.AbstractView;
import net.microfalx.database.Schema;

public class MySqlView extends AbstractView<MySqlView> {

    public MySqlView(Schema schema, String name) {
        super(schema, name);
    }
}
