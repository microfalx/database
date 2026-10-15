package net.microfalx.database.migration;

import net.microfalx.database.DatabaseException;

/**
 * An exception related to database migration.
 */
public class MigrationException extends DatabaseException {

    public MigrationException(String message) {
        super(message);
    }

    public MigrationException(String message, Throwable cause) {
        super(message, cause);
    }
}
