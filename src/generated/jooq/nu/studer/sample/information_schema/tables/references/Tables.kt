/*
 * This file is generated by jOOQ.
 */
package nu.studer.sample.information_schema.tables.references


import nu.studer.sample.information_schema.tables.CharacterSets
import nu.studer.sample.information_schema.tables.CollationCharacterSetApplicability
import nu.studer.sample.information_schema.tables.Collations
import nu.studer.sample.information_schema.tables.ColumnPrivileges
import nu.studer.sample.information_schema.tables.Columns
import nu.studer.sample.information_schema.tables.Engines
import nu.studer.sample.information_schema.tables.Events
import nu.studer.sample.information_schema.tables.Files
import nu.studer.sample.information_schema.tables.GlobalStatus
import nu.studer.sample.information_schema.tables.GlobalVariables
import nu.studer.sample.information_schema.tables.InnodbBufferPage
import nu.studer.sample.information_schema.tables.InnodbBufferPageLru
import nu.studer.sample.information_schema.tables.InnodbBufferPoolStats
import nu.studer.sample.information_schema.tables.InnodbCmp
import nu.studer.sample.information_schema.tables.InnodbCmpPerIndex
import nu.studer.sample.information_schema.tables.InnodbCmpPerIndexReset
import nu.studer.sample.information_schema.tables.InnodbCmpReset
import nu.studer.sample.information_schema.tables.InnodbCmpmem
import nu.studer.sample.information_schema.tables.InnodbCmpmemReset
import nu.studer.sample.information_schema.tables.InnodbFtBeingDeleted
import nu.studer.sample.information_schema.tables.InnodbFtConfig
import nu.studer.sample.information_schema.tables.InnodbFtDefaultStopword
import nu.studer.sample.information_schema.tables.InnodbFtDeleted
import nu.studer.sample.information_schema.tables.InnodbFtIndexCache
import nu.studer.sample.information_schema.tables.InnodbFtIndexTable
import nu.studer.sample.information_schema.tables.InnodbLockWaits
import nu.studer.sample.information_schema.tables.InnodbLocks
import nu.studer.sample.information_schema.tables.InnodbMetrics
import nu.studer.sample.information_schema.tables.InnodbSysColumns
import nu.studer.sample.information_schema.tables.InnodbSysDatafiles
import nu.studer.sample.information_schema.tables.InnodbSysFields
import nu.studer.sample.information_schema.tables.InnodbSysForeign
import nu.studer.sample.information_schema.tables.InnodbSysForeignCols
import nu.studer.sample.information_schema.tables.InnodbSysIndexes
import nu.studer.sample.information_schema.tables.InnodbSysTables
import nu.studer.sample.information_schema.tables.InnodbSysTablespaces
import nu.studer.sample.information_schema.tables.InnodbSysTablestats
import nu.studer.sample.information_schema.tables.InnodbSysVirtual
import nu.studer.sample.information_schema.tables.InnodbTempTableInfo
import nu.studer.sample.information_schema.tables.InnodbTrx
import nu.studer.sample.information_schema.tables.KeyColumnUsage
import nu.studer.sample.information_schema.tables.OptimizerTrace
import nu.studer.sample.information_schema.tables.Parameters
import nu.studer.sample.information_schema.tables.Partitions
import nu.studer.sample.information_schema.tables.Plugins
import nu.studer.sample.information_schema.tables.Processlist
import nu.studer.sample.information_schema.tables.Profiling
import nu.studer.sample.information_schema.tables.ReferentialConstraints
import nu.studer.sample.information_schema.tables.Routines
import nu.studer.sample.information_schema.tables.SchemaPrivileges
import nu.studer.sample.information_schema.tables.Schemata
import nu.studer.sample.information_schema.tables.SessionStatus
import nu.studer.sample.information_schema.tables.SessionVariables
import nu.studer.sample.information_schema.tables.Statistics
import nu.studer.sample.information_schema.tables.TableConstraints
import nu.studer.sample.information_schema.tables.TablePrivileges
import nu.studer.sample.information_schema.tables.Tablespaces
import nu.studer.sample.information_schema.tables.Triggers
import nu.studer.sample.information_schema.tables.UserPrivileges
import nu.studer.sample.information_schema.tables.Views



/**
 * The table <code>information_schema.CHARACTER_SETS</code>.
 */
val CHARACTER_SETS = CharacterSets.CHARACTER_SETS

/**
 * The table <code>information_schema.COLLATION_CHARACTER_SET_APPLICABILITY</code>.
 */
val COLLATION_CHARACTER_SET_APPLICABILITY = CollationCharacterSetApplicability.COLLATION_CHARACTER_SET_APPLICABILITY

/**
 * The table <code>information_schema.COLLATIONS</code>.
 */
val COLLATIONS = Collations.COLLATIONS

/**
 * The table <code>information_schema.COLUMN_PRIVILEGES</code>.
 */
val COLUMN_PRIVILEGES = ColumnPrivileges.COLUMN_PRIVILEGES

/**
 * The table <code>information_schema.COLUMNS</code>.
 */
val COLUMNS = Columns.COLUMNS

/**
 * The table <code>information_schema.ENGINES</code>.
 */
val ENGINES = Engines.ENGINES

/**
 * The table <code>information_schema.EVENTS</code>.
 */
val EVENTS = Events.EVENTS

/**
 * The table <code>information_schema.FILES</code>.
 */
val FILES = Files.FILES

/**
 * The table <code>information_schema.GLOBAL_STATUS</code>.
 */
val GLOBAL_STATUS = GlobalStatus.GLOBAL_STATUS

/**
 * The table <code>information_schema.GLOBAL_VARIABLES</code>.
 */
val GLOBAL_VARIABLES = GlobalVariables.GLOBAL_VARIABLES

/**
 * The table <code>information_schema.INNODB_BUFFER_PAGE</code>.
 */
val INNODB_BUFFER_PAGE = InnodbBufferPage.INNODB_BUFFER_PAGE

/**
 * The table <code>information_schema.INNODB_BUFFER_PAGE_LRU</code>.
 */
val INNODB_BUFFER_PAGE_LRU = InnodbBufferPageLru.INNODB_BUFFER_PAGE_LRU

/**
 * The table <code>information_schema.INNODB_BUFFER_POOL_STATS</code>.
 */
val INNODB_BUFFER_POOL_STATS = InnodbBufferPoolStats.INNODB_BUFFER_POOL_STATS

/**
 * The table <code>information_schema.INNODB_CMP</code>.
 */
val INNODB_CMP = InnodbCmp.INNODB_CMP

/**
 * The table <code>information_schema.INNODB_CMP_PER_INDEX</code>.
 */
val INNODB_CMP_PER_INDEX = InnodbCmpPerIndex.INNODB_CMP_PER_INDEX

/**
 * The table <code>information_schema.INNODB_CMP_PER_INDEX_RESET</code>.
 */
val INNODB_CMP_PER_INDEX_RESET = InnodbCmpPerIndexReset.INNODB_CMP_PER_INDEX_RESET

/**
 * The table <code>information_schema.INNODB_CMP_RESET</code>.
 */
val INNODB_CMP_RESET = InnodbCmpReset.INNODB_CMP_RESET

/**
 * The table <code>information_schema.INNODB_CMPMEM</code>.
 */
val INNODB_CMPMEM = InnodbCmpmem.INNODB_CMPMEM

/**
 * The table <code>information_schema.INNODB_CMPMEM_RESET</code>.
 */
val INNODB_CMPMEM_RESET = InnodbCmpmemReset.INNODB_CMPMEM_RESET

/**
 * The table <code>information_schema.INNODB_FT_BEING_DELETED</code>.
 */
val INNODB_FT_BEING_DELETED = InnodbFtBeingDeleted.INNODB_FT_BEING_DELETED

/**
 * The table <code>information_schema.INNODB_FT_CONFIG</code>.
 */
val INNODB_FT_CONFIG = InnodbFtConfig.INNODB_FT_CONFIG

/**
 * The table <code>information_schema.INNODB_FT_DEFAULT_STOPWORD</code>.
 */
val INNODB_FT_DEFAULT_STOPWORD = InnodbFtDefaultStopword.INNODB_FT_DEFAULT_STOPWORD

/**
 * The table <code>information_schema.INNODB_FT_DELETED</code>.
 */
val INNODB_FT_DELETED = InnodbFtDeleted.INNODB_FT_DELETED

/**
 * The table <code>information_schema.INNODB_FT_INDEX_CACHE</code>.
 */
val INNODB_FT_INDEX_CACHE = InnodbFtIndexCache.INNODB_FT_INDEX_CACHE

/**
 * The table <code>information_schema.INNODB_FT_INDEX_TABLE</code>.
 */
val INNODB_FT_INDEX_TABLE = InnodbFtIndexTable.INNODB_FT_INDEX_TABLE

/**
 * The table <code>information_schema.INNODB_LOCK_WAITS</code>.
 */
val INNODB_LOCK_WAITS = InnodbLockWaits.INNODB_LOCK_WAITS

/**
 * The table <code>information_schema.INNODB_LOCKS</code>.
 */
val INNODB_LOCKS = InnodbLocks.INNODB_LOCKS

/**
 * The table <code>information_schema.INNODB_METRICS</code>.
 */
val INNODB_METRICS = InnodbMetrics.INNODB_METRICS

/**
 * The table <code>information_schema.INNODB_SYS_COLUMNS</code>.
 */
val INNODB_SYS_COLUMNS = InnodbSysColumns.INNODB_SYS_COLUMNS

/**
 * The table <code>information_schema.INNODB_SYS_DATAFILES</code>.
 */
val INNODB_SYS_DATAFILES = InnodbSysDatafiles.INNODB_SYS_DATAFILES

/**
 * The table <code>information_schema.INNODB_SYS_FIELDS</code>.
 */
val INNODB_SYS_FIELDS = InnodbSysFields.INNODB_SYS_FIELDS

/**
 * The table <code>information_schema.INNODB_SYS_FOREIGN</code>.
 */
val INNODB_SYS_FOREIGN = InnodbSysForeign.INNODB_SYS_FOREIGN

/**
 * The table <code>information_schema.INNODB_SYS_FOREIGN_COLS</code>.
 */
val INNODB_SYS_FOREIGN_COLS = InnodbSysForeignCols.INNODB_SYS_FOREIGN_COLS

/**
 * The table <code>information_schema.INNODB_SYS_INDEXES</code>.
 */
val INNODB_SYS_INDEXES = InnodbSysIndexes.INNODB_SYS_INDEXES

/**
 * The table <code>information_schema.INNODB_SYS_TABLES</code>.
 */
val INNODB_SYS_TABLES = InnodbSysTables.INNODB_SYS_TABLES

/**
 * The table <code>information_schema.INNODB_SYS_TABLESPACES</code>.
 */
val INNODB_SYS_TABLESPACES = InnodbSysTablespaces.INNODB_SYS_TABLESPACES

/**
 * The table <code>information_schema.INNODB_SYS_TABLESTATS</code>.
 */
val INNODB_SYS_TABLESTATS = InnodbSysTablestats.INNODB_SYS_TABLESTATS

/**
 * The table <code>information_schema.INNODB_SYS_VIRTUAL</code>.
 */
val INNODB_SYS_VIRTUAL = InnodbSysVirtual.INNODB_SYS_VIRTUAL

/**
 * The table <code>information_schema.INNODB_TEMP_TABLE_INFO</code>.
 */
val INNODB_TEMP_TABLE_INFO = InnodbTempTableInfo.INNODB_TEMP_TABLE_INFO

/**
 * The table <code>information_schema.INNODB_TRX</code>.
 */
val INNODB_TRX = InnodbTrx.INNODB_TRX

/**
 * The table <code>information_schema.KEY_COLUMN_USAGE</code>.
 */
val KEY_COLUMN_USAGE = KeyColumnUsage.KEY_COLUMN_USAGE

/**
 * The table <code>information_schema.OPTIMIZER_TRACE</code>.
 */
val OPTIMIZER_TRACE = OptimizerTrace.OPTIMIZER_TRACE

/**
 * The table <code>information_schema.PARAMETERS</code>.
 */
val PARAMETERS = Parameters.PARAMETERS

/**
 * The table <code>information_schema.PARTITIONS</code>.
 */
val PARTITIONS = Partitions.PARTITIONS

/**
 * The table <code>information_schema.PLUGINS</code>.
 */
val PLUGINS = Plugins.PLUGINS

/**
 * The table <code>information_schema.PROCESSLIST</code>.
 */
val PROCESSLIST = Processlist.PROCESSLIST

/**
 * The table <code>information_schema.PROFILING</code>.
 */
val PROFILING = Profiling.PROFILING

/**
 * The table <code>information_schema.REFERENTIAL_CONSTRAINTS</code>.
 */
val REFERENTIAL_CONSTRAINTS = ReferentialConstraints.REFERENTIAL_CONSTRAINTS

/**
 * The table <code>information_schema.ROUTINES</code>.
 */
val ROUTINES = Routines.ROUTINES

/**
 * The table <code>information_schema.SCHEMA_PRIVILEGES</code>.
 */
val SCHEMA_PRIVILEGES = SchemaPrivileges.SCHEMA_PRIVILEGES

/**
 * The table <code>information_schema.SCHEMATA</code>.
 */
val SCHEMATA = Schemata.SCHEMATA

/**
 * The table <code>information_schema.SESSION_STATUS</code>.
 */
val SESSION_STATUS = SessionStatus.SESSION_STATUS

/**
 * The table <code>information_schema.SESSION_VARIABLES</code>.
 */
val SESSION_VARIABLES = SessionVariables.SESSION_VARIABLES

/**
 * The table <code>information_schema.STATISTICS</code>.
 */
val STATISTICS = Statistics.STATISTICS

/**
 * The table <code>information_schema.TABLE_CONSTRAINTS</code>.
 */
val TABLE_CONSTRAINTS = TableConstraints.TABLE_CONSTRAINTS

/**
 * The table <code>information_schema.TABLE_PRIVILEGES</code>.
 */
val TABLE_PRIVILEGES = TablePrivileges.TABLE_PRIVILEGES

/**
 * The table <code>information_schema.TABLES</code>.
 */
val TABLES = nu.studer.sample.information_schema.tables.Tables.TABLES

/**
 * The table <code>information_schema.TABLESPACES</code>.
 */
val TABLESPACES = Tablespaces.TABLESPACES

/**
 * The table <code>information_schema.TRIGGERS</code>.
 */
val TRIGGERS = Triggers.TRIGGERS

/**
 * The table <code>information_schema.USER_PRIVILEGES</code>.
 */
val USER_PRIVILEGES = UserPrivileges.USER_PRIVILEGES

/**
 * The table <code>information_schema.VIEWS</code>.
 */
val VIEWS = Views.VIEWS
