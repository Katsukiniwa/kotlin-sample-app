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
 *  Takes a raw picoseconds value, and converts it to a human readable form.
 *  
 *  Picoseconds are the precision that all latency values are printed in
 *  within Performance Schema, however are not user friendly when wanting
 *  to scan output from the command line.
 *  
 *  Parameters
 *  
 *  picoseconds (    TEXT):
 *  The raw picoseconds value to convert.
 *  
 *  Returns
 *  
 *  TEXT
 *  
 *  Example
 *  
 *  mysql&gt; select format_time(342342342342345);
 *  +------------------------------+
 *  | format_time(342342342342345) |
 *  +------------------------------+
 *  | 00:05:42                     |
 *  +------------------------------+
 *  1 row in set (0.00 sec)
 *  
 *  mysql&gt; select format_time(342342342);
 *  +------------------------+
 *  | format_time(342342342) |
 *  +------------------------+
 *  | 342.34 us              |
 *  +------------------------+
 *  1 row in set (0.00 sec)
 *  
 *  mysql&gt; select format_time(34234);
 *  +--------------------+
 *  | format_time(34234) |
 *  +--------------------+
 *  | 34.23 ns           |
 *  +--------------------+
 *  1 row in set (0.00 sec)
 *  
 */
@Suppress("UNCHECKED_CAST")
open class FormatTime : AbstractRoutine<String>("format_time", Sys.SYS, SQLDataType.CLOB) {
    companion object {

        /**
         * The parameter <code>sys.format_time.RETURN_VALUE</code>.
         */
        val RETURN_VALUE: Parameter<String?> = Internal.createParameter("RETURN_VALUE", SQLDataType.CLOB, false, false)

        /**
         * The parameter <code>sys.format_time.picoseconds</code>.
         */
        val PICOSECONDS: Parameter<String?> = Internal.createParameter("picoseconds", SQLDataType.CLOB, false, false)
    }

    init {
        returnParameter = RETURN_VALUE
        addInParameter(PICOSECONDS)
    }

    /**
     * Set the <code>picoseconds</code> parameter IN value to the routine
     */
    fun setPicoseconds(value: String?) = setValue(PICOSECONDS, value)

    /**
     * Set the <code>picoseconds</code> parameter to the function to be used with a {@link org.jooq.Select} statement
     */
    fun setPicoseconds(field: Field<String?>): Unit {
        setField(PICOSECONDS, field)
    }
}
