package net.microfalx.database.vertica;

import net.microfalx.database.AbstractView;
import net.microfalx.database.Schema;

public class VerticaView extends AbstractView<VerticaView> {

    public VerticaView(Schema schema, String name) {
        super(schema, name);
    }
}
