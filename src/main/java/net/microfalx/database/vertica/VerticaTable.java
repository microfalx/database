package net.microfalx.database.vertica;

import net.microfalx.database.AbstractTable;
import net.microfalx.database.Schema;

public class VerticaTable extends AbstractTable<VerticaTable> {

    public VerticaTable(Schema schema, String name) {
        super(schema, name);
    }

    @Override
    protected Columns loadColumns() {
        return null;
    }

    @Override
    protected Indexes loadIndexes() {
        return null;
    }
}
