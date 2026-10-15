package net.microfalx.database.vertica;

import net.microfalx.database.AbstractIndex;
import net.microfalx.database.Schema;

public class VerticaIndex extends AbstractIndex<VerticaIndex> {

    public VerticaIndex(Schema schema, String name) {
        super(schema, name);
    }
}
