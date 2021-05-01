/*
 * This file is generated by jOOQ.
 */
package nu.studer.sample.sys.routines


import nu.studer.sample.sys.Sys

import org.jooq.Field
import org.jooq.Parameter
import org.jooq.impl.AbstractRoutine
import org.jooq.impl.Internal
import org.jooq.impl.SQLDataType


/**
 * 
 *  Description
 *  
 *  Returns the value for the requested variable using the following logic:
 *  
 *  1. If the option exists in sys.sys_config return the value from there.
 *  2. Else fall back on the provided default value.
 *  
 *  Notes for using sys_get_config():
 *  
 *  * If the default value argument to sys_get_config() is NULL and case 2. 
 * is reached, NULL is returned.
 *  It is then expected that the caller is able to handle NULL for the given 
 * configuration option.
 *  * The convention is to name the user variables @sys.&lt;name of variable&gt;. 
 * It is &lt;name of variable&gt; that
 *  is stored in the sys_config table and is what is expected as the argument 
 * to sys_get_config().
 *  * If you want to check whether the configuration option has already been 
 * set and if not assign with
 *  the return value of sys_get_config() you can use IFNULL(    ...) (see example 
     * below). However this should
 *  not be done inside a loop (e.g. for each row in a result set) as for repeated 
 * calls where assignment
 *  is only needed in the first iteration using IFNULL(    ...) is expected to 
 * be significantly slower than
 *  using an IF (    ...) THEN ... END IF; block (see example below).
 *  
 *  Parameters
 *  
 *  in_variable_name (VARCHAR(128)):
 *  The name of the config option to return the value for.
 *  
 *  in_default_value (VARCHAR(128)):
 *  The default value to return if the variable does not exist in sys.sys_config.
 *  
 *  Returns
 *  
 *  VARCHAR(128)
 *  
 *  Example
 *  
 *  mysql&gt; SELECT sys.sys_get_config('statement_truncate_len', 128) AS 
 * Value;
 *  +-------+
 *  | Value |
 *  +-------+
 *  | 64    |
 *  +-------+
 *  1 row in set (    0.00 sec)
 *  
 *  mysql&gt; SET @sys.statement_truncate_len = IFNULL(@sys.statement_truncate_len, 
     * sys.sys_get_config('statement_truncate_len', 64));
 *  Query OK, 0 rows affected (0.00 sec)
 *  
 *  IF (@sys.statement_truncate_len IS NULL) THEN
 *  SET @sys.statement_truncate_len = sys.sys_get_config('statement_truncate_len', 
     * 64);
 *  END IF;
 *  
 */
@Suppress("UNCHECKED_CAST")
open class SysGetConfig : AbstractRoutine<String>("sys_get_config", Sys.SYS, SQLDataType.VARCHAR(128)) {
    companion object {

        /**
         * The parameter <code>sys.sys_get_config.RETURN_VALUE</code>.
         */
        val RETURN_VALUE: Parameter<String?> = Internal.createParameter("RETURN_VALUE", SQLDataType.VARCHAR(128), false, false)

        /**
         * The parameter <code>sys.sys_get_config.in_variable_name</code>.
         */
        val IN_VARIABLE_NAME: Parameter<String?> = Internal.createParameter("in_variable_name", SQLDataType.VARCHAR(128), false, false)

        /**
         * The parameter <code>sys.sys_get_config.in_default_value</code>.
         */
        val IN_DEFAULT_VALUE: Parameter<String?> = Internal.createParameter("in_default_value", SQLDataType.VARCHAR(128), false, false)
    }

    init {
        returnParameter = RETURN_VALUE
        addInParameter(IN_VARIABLE_NAME)
        addInParameter(IN_DEFAULT_VALUE)
    }

    /**
     * Set the <code>in_variable_name</code> parameter IN value to the routine
     */
    fun setInVariableName(value: String?) = setValue(IN_VARIABLE_NAME, value)

    /**
     * Set the <code>in_variable_name</code> parameter to the function to be used with a {@link org.jooq.Select} statement
     */
    fun setInVariableName(field: Field<String?>): Unit {
        setField(IN_VARIABLE_NAME, field)
    }

    /**
     * Set the <code>in_default_value</code> parameter IN value to the routine
     */
    fun setInDefaultValue(value: String?) = setValue(IN_DEFAULT_VALUE, value)

    /**
     * Set the <code>in_default_value</code> parameter to the function to be used with a {@link org.jooq.Select} statement
     */
    fun setInDefaultValue(field: Field<String?>): Unit {
        setField(IN_DEFAULT_VALUE, field)
    }
}
