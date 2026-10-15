package net.microfalx.database.vertica;

import net.microfalx.database.AbstractColumn;
import net.microfalx.database.Table;

public class VerticaColumn extends AbstractColumn<VerticaColumn> {

    public VerticaColumn(Table<?> table, String name) {
        super(table, name);
    }
}
