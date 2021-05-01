/*
 * This file is generated by jOOQ.
 */
package nu.studer.sample.sys.keys


import nu.studer.sample.sys.tables.SysConfig

import org.jooq.Record
import org.jooq.UniqueKey
import org.jooq.impl.DSL
import org.jooq.impl.Internal



// -------------------------------------------------------------------------
// UNIQUE and PRIMARY KEY definitions
// -------------------------------------------------------------------------

val KEY_SYS_CONFIG_PRIMARY: UniqueKey<Record> = Internal.createUniqueKey(SysConfig.SYS_CONFIG, DSL.name("KEY_sys_config_PRIMARY"), arrayOf(SysConfig.SYS_CONFIG.VARIABLE), true)
