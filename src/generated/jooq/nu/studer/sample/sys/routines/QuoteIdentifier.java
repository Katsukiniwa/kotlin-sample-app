/*
 * This file is generated by jOOQ.
 */
package nu.studer.sample.sys.routines;


import nu.studer.sample.sys.Sys;

import org.jooq.Field;
import org.jooq.Parameter;
import org.jooq.impl.AbstractRoutine;
import org.jooq.impl.Internal;
import org.jooq.impl.SQLDataType;


/**
 * 
 *  Description
 *  
 *  Takes an unquoted identifier (    schema name, table name, etc.) and
 *  returns the identifier quoted with backticks.
 *  
 *  Parameters
 *  
 *  in_identifier (TEXT):
 *  The identifier to quote.
 *  
 *  Returns
 *  
 *  TEXT
 *  
 *  Example
 *  
 *  mysql&gt; SELECT sys.quote_identifier('my_identifier') AS Identifier;
 *  +-----------------+
 *  | Identifier      |
 *  +-----------------+
 *  | `my_identifier` |
 *  +-----------------+
 *  1 row in set (0.00 sec)
 *  
 *  mysql&gt; SELECT sys.quote_identifier('my`idenfier') AS Identifier;
 *  +----------------+
 *  | Identifier     |
 *  +----------------+
 *  | `my``idenfier` |
 *  +----------------+
 *  1 row in set (0.00 sec)
 *  
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class QuoteIdentifier extends AbstractRoutine<String> {

    private static final long serialVersionUID = 1L;

    /**
     * The parameter <code>sys.quote_identifier.RETURN_VALUE</code>.
     */
    public static final Parameter<String> RETURN_VALUE = Internal.createParameter("RETURN_VALUE", SQLDataType.CLOB, false, false);

    /**
     * The parameter <code>sys.quote_identifier.in_identifier</code>.
     */
    public static final Parameter<String> IN_IDENTIFIER = Internal.createParameter("in_identifier", SQLDataType.CLOB, false, false);

    /**
     * Create a new routine call instance
     */
    public QuoteIdentifier() {
        super("quote_identifier", Sys.SYS, SQLDataType.CLOB);

        setReturnParameter(RETURN_VALUE);
        addInParameter(IN_IDENTIFIER);
    }

    /**
     * Set the <code>in_identifier</code> parameter IN value to the routine
     */
    public void setInIdentifier(String value) {
        setValue(IN_IDENTIFIER, value);
    }

    /**
     * Set the <code>in_identifier</code> parameter to the function to be used with a {@link org.jooq.Select} statement
     */
    public void setInIdentifier(Field<String> field) {
        setField(IN_IDENTIFIER, field);
    }
}
