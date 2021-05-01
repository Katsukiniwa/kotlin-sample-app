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
import org.jooq.types.ULong


/**
 * 
 *  Description
 *  
 *  Return the user@host account for the given Performance Schema thread id.
 *  
 *  Parameters
 *  
 *  in_thread_id (    BIGINT UNSIGNED):
 *  The id of the thread to return the account for.
 *  
 *  Example
 *  
 *  mysql&gt; select thread_id, processlist_user, processlist_host from performance_schema.threads 
 * where type = 'foreground';
 *  +-----------+------------------+------------------+
 *  | thread_id | processlist_user | processlist_host |
 *  +-----------+------------------+------------------+
 *  |        23 | NULL             | NULL             |
 *  |        30 | root             | localhost        |
 *  |        31 | msandbox         | localhost        |
 *  |        32 | msandbox         | localhost        |
 *  +-----------+------------------+------------------+
 *  4 rows in set (    0.00 sec)
 *  
 *  mysql&gt; select sys.ps_thread_account(31);
 *  +---------------------------+
 *  | sys.ps_thread_account(31) |
 *  +---------------------------+
 *  | msandbox@localhost        |
 *  +---------------------------+
 *  1 row in set (0.00 sec)
 *  
 */
@Suppress("UNCHECKED_CAST")
open class PsThreadAccount : AbstractRoutine<String>("ps_thread_account", Sys.SYS, SQLDataType.CLOB) {
    companion object {

        /**
         * The parameter <code>sys.ps_thread_account.RETURN_VALUE</code>.
         */
        val RETURN_VALUE: Parameter<String?> = Internal.createParameter("RETURN_VALUE", SQLDataType.CLOB, false, false)

        /**
         * The parameter <code>sys.ps_thread_account.in_thread_id</code>.
         */
        val IN_THREAD_ID: Parameter<ULong?> = Internal.createParameter("in_thread_id", SQLDataType.BIGINTUNSIGNED, false, false)
    }

    init {
        returnParameter = RETURN_VALUE
        addInParameter(IN_THREAD_ID)
    }

    /**
     * Set the <code>in_thread_id</code> parameter IN value to the routine
     */
    fun setInThreadId(value: ULong?) = setValue(IN_THREAD_ID, value)

    /**
     * Set the <code>in_thread_id</code> parameter to the function to be used with a {@link org.jooq.Select} statement
     */
    fun setInThreadId(field: Field<ULong?>): Unit {
        setField(IN_THREAD_ID, field)
    }
}