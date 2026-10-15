package net.microfalx.database.migration;

import net.microfalx.database.Query;

/**
 * An executor for the database migration
 */
public interface Executor {

    /**
     * Executes a statement.
     *
     * @param query the query
     */
    void execute(Query query);
}
