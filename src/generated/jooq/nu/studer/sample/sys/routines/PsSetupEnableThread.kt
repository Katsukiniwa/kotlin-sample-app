/*
 * This file is generated by jOOQ.
 */
package nu.studer.sample.sys.routines


import nu.studer.sample.sys.Sys

import org.jooq.Parameter
import org.jooq.impl.AbstractRoutine
import org.jooq.impl.Internal
import org.jooq.impl.SQLDataType


/**
 * 
 *  Description
 *  
 *  Enable the given connection/thread in Performance Schema.
 *  
 *  Parameters
 *  
 *  in_connection_id (    BIGINT):
 *  The connection ID (PROCESSLIST_ID from performance_schema.threads
 *  or the ID shown within SHOW PROCESSLIST)
 *  
 *  Example
 *  
 *  mysql&gt; CALL sys.ps_setup_enable_thread(3);
 *  +------------------+
 *  | summary          |
 *  +------------------+
 *  | Enabled 1 thread |
 *  +------------------+
 *  1 row in set (0.01 sec)
 *  
 *  To enable the current connection:
 *  
 *  mysql&gt; CALL sys.ps_setup_enable_thread(CONNECTION_ID());
 *  +------------------+
 *  | summary          |
 *  +------------------+
 *  | Enabled 1 thread |
 *  +------------------+
 *  1 row in set (0.00 sec)
 *  
 */
@Suppress("UNCHECKED_CAST")
open class PsSetupEnableThread : AbstractRoutine<java.lang.Void>("ps_setup_enable_thread", Sys.SYS) {
    companion object {

        /**
         * The parameter <code>sys.ps_setup_enable_thread.in_connection_id</code>.
         */
        val IN_CONNECTION_ID: Parameter<Long?> = Internal.createParameter("in_connection_id", SQLDataType.BIGINT, false, false)
    }

    init {
        addInParameter(IN_CONNECTION_ID)
    }

    /**
     * Set the <code>in_connection_id</code> parameter IN value to the routine
     */
    fun setInConnectionId(value: Long?) = setValue(IN_CONNECTION_ID, value)
}
