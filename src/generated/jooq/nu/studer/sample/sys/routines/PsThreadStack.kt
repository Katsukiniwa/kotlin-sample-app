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
 *  Outputs a JSON formatted stack of all statements, stages and events
 *  within Performance Schema for the specified thread.
 *  
 *  Parameters
 *  
 *  thd_id (    BIGINT UNSIGNED):
 *  The id of the thread to trace. This should match the thread_id
 *  column from the performance_schema.threads table.
 *  in_verbose (BOOLEAN):
 *  Include file:lineno information in the events.
 *  
 *  Example
 *  
 *  (line separation added for output)
 *  
 *  mysql&gt; SELECT sys.ps_thread_stack(37, FALSE) AS thread_stack\G
 *  *************************** 1. row ***************************
 *  thread_stack: {"rankdir": "LR","nodesep": "0.10","stack_created": "2014-02-19 
     * 13:39:03",
 *  "mysql_version": "5.7.3-m13","mysql_user": "root@localhost","events": 
     * 
 *  [{"nesting_event_id": "0", "event_id": "10", "timer_wait": 256.35, "event_info": 
             * 
 *  "sql/select", "wait_info": "select @@version_comment limit 1\nerrors: 
             * 0\nwarnings: 0\nlock time:
 *  ...
 *  
             */
            @Suppress("UNCHECKED_CAST")
            open class PsThreadStack : AbstractRoutine<String>("ps_thread_stack", Sys.SYS, SQLDataType.CLOB) {
                companion object {

                    /**
                     * The parameter <code>sys.ps_thread_stack.RETURN_VALUE</code>.
                     */
                    val RETURN_VALUE: Parameter<String?> = Internal.createParameter("RETURN_VALUE", SQLDataType.CLOB, false, false)

                    /**
                     * The parameter <code>sys.ps_thread_stack.thd_id</code>.
                     */
                    val THD_ID: Parameter<ULong?> = Internal.createParameter("thd_id", SQLDataType.BIGINTUNSIGNED, false, false)

                    /**
                     * The parameter <code>sys.ps_thread_stack.debug</code>.
                     */
                    val DEBUG: Parameter<Byte?> = Internal.createParameter("debug", SQLDataType.TINYINT, false, false)
                }

                init {
                    returnParameter = RETURN_VALUE
                    addInParameter(THD_ID)
                    addInParameter(DEBUG)
                }

                /**
                 * Set the <code>thd_id</code> parameter IN value to the routine
                 */
                fun setThdId(value: ULong?) = setValue(THD_ID, value)

                /**
                 * Set the <code>thd_id</code> parameter to the function to be used with a {@link org.jooq.Select} statement
                 */
                fun setThdId(field: Field<ULong?>): Unit {
                    setField(THD_ID, field)
                }

                /**
                 * Set the <code>debug</code> parameter IN value to the routine
                 */
                fun setDebug(value: Byte?) = setValue(DEBUG, value)

                /**
                 * Set the <code>debug</code> parameter to the function to be used with a {@link org.jooq.Select} statement
                 */
                fun setDebug(field: Field<Byte?>): Unit {
                    setField(DEBUG, field)
                }
            }