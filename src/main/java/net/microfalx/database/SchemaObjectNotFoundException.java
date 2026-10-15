package net.microfalx.database;

/**
 * Thrown when a schema object is not found.
 */
public class SchemaObjectNotFoundException extends DatabaseException {

    public SchemaObjectNotFoundException(String message) {
        super(message);
    }
}
