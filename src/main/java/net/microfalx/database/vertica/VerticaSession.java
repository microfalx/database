package net.microfalx.database.vertica;

import net.microfalx.database.AbstractSession;
import net.microfalx.database.Node;
import org.springframework.jdbc.core.JdbcTemplate;

public class VerticaSession extends AbstractSession {

    public VerticaSession(Node node, String id) {
        super(node, id);
    }

    @Override
    public void cancel() {

    }

    @Override
    public void close() {
        JdbcTemplate template = new JdbcTemplate(getNode().getDataSource().unwrap());
        template.execute("SELECT close_session ('" + getId() + "');");
    }
}
