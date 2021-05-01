/*
 * This file is generated by jOOQ.
 */
package nu.studer.sample.information_schema;


import java.util.Arrays;
import java.util.List;

import nu.studer.sample.DefaultCatalog;
import nu.studer.sample.information_schema.tables.CharacterSets;
import nu.studer.sample.information_schema.tables.CollationCharacterSetApplicability;
import nu.studer.sample.information_schema.tables.Collations;
import nu.studer.sample.information_schema.tables.ColumnPrivileges;
import nu.studer.sample.information_schema.tables.Columns;
import nu.studer.sample.information_schema.tables.Engines;
import nu.studer.sample.information_schema.tables.Events;
import nu.studer.sample.information_schema.tables.Files;
import nu.studer.sample.information_schema.tables.GlobalStatus;
import nu.studer.sample.information_schema.tables.GlobalVariables;
import nu.studer.sample.information_schema.tables.InnodbBufferPage;
import nu.studer.sample.information_schema.tables.InnodbBufferPageLru;
import nu.studer.sample.information_schema.tables.InnodbBufferPoolStats;
import nu.studer.sample.information_schema.tables.InnodbCmp;
import nu.studer.sample.information_schema.tables.InnodbCmpPerIndex;
import nu.studer.sample.information_schema.tables.InnodbCmpPerIndexReset;
import nu.studer.sample.information_schema.tables.InnodbCmpReset;
import nu.studer.sample.information_schema.tables.InnodbCmpmem;
import nu.studer.sample.information_schema.tables.InnodbCmpmemReset;
import nu.studer.sample.information_schema.tables.InnodbFtBeingDeleted;
import nu.studer.sample.information_schema.tables.InnodbFtConfig;
import nu.studer.sample.information_schema.tables.InnodbFtDefaultStopword;
import nu.studer.sample.information_schema.tables.InnodbFtDeleted;
import nu.studer.sample.information_schema.tables.InnodbFtIndexCache;
import nu.studer.sample.information_schema.tables.InnodbFtIndexTable;
import nu.studer.sample.information_schema.tables.InnodbLockWaits;
import nu.studer.sample.information_schema.tables.InnodbLocks;
import nu.studer.sample.information_schema.tables.InnodbMetrics;
import nu.studer.sample.information_schema.tables.InnodbSysColumns;
import nu.studer.sample.information_schema.tables.InnodbSysDatafiles;
import nu.studer.sample.information_schema.tables.InnodbSysFields;
import nu.studer.sample.information_schema.tables.InnodbSysForeign;
import nu.studer.sample.information_schema.tables.InnodbSysForeignCols;
import nu.studer.sample.information_schema.tables.InnodbSysIndexes;
import nu.studer.sample.information_schema.tables.InnodbSysTables;
import nu.studer.sample.information_schema.tables.InnodbSysTablespaces;
import nu.studer.sample.information_schema.tables.InnodbSysTablestats;
import nu.studer.sample.information_schema.tables.InnodbSysVirtual;
import nu.studer.sample.information_schema.tables.InnodbTempTableInfo;
import nu.studer.sample.information_schema.tables.InnodbTrx;
import nu.studer.sample.information_schema.tables.KeyColumnUsage;
import nu.studer.sample.information_schema.tables.OptimizerTrace;
import nu.studer.sample.information_schema.tables.Parameters;
import nu.studer.sample.information_schema.tables.Partitions;
import nu.studer.sample.information_schema.tables.Plugins;
import nu.studer.sample.information_schema.tables.Processlist;
import nu.studer.sample.information_schema.tables.Profiling;
import nu.studer.sample.information_schema.tables.ReferentialConstraints;
import nu.studer.sample.information_schema.tables.Routines;
import nu.studer.sample.information_schema.tables.SchemaPrivileges;
import nu.studer.sample.information_schema.tables.Schemata;
import nu.studer.sample.information_schema.tables.SessionStatus;
import nu.studer.sample.information_schema.tables.SessionVariables;
import nu.studer.sample.information_schema.tables.Statistics;
import nu.studer.sample.information_schema.tables.TableConstraints;
import nu.studer.sample.information_schema.tables.TablePrivileges;
import nu.studer.sample.information_schema.tables.Tables;
import nu.studer.sample.information_schema.tables.Tablespaces;
import nu.studer.sample.information_schema.tables.Triggers;
import nu.studer.sample.information_schema.tables.UserPrivileges;
import nu.studer.sample.information_schema.tables.Views;

import org.jooq.Catalog;
import org.jooq.Table;
import org.jooq.impl.SchemaImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class InformationSchema extends SchemaImpl {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>information_schema</code>
     */
    public static final InformationSchema INFORMATION_SCHEMA = new InformationSchema();

    /**
     * The table <code>information_schema.CHARACTER_SETS</code>.
     */
    public final CharacterSets CHARACTER_SETS = CharacterSets.CHARACTER_SETS;

    /**
     * The table <code>information_schema.COLLATION_CHARACTER_SET_APPLICABILITY</code>.
     */
    public final CollationCharacterSetApplicability COLLATION_CHARACTER_SET_APPLICABILITY = CollationCharacterSetApplicability.COLLATION_CHARACTER_SET_APPLICABILITY;

    /**
     * The table <code>information_schema.COLLATIONS</code>.
     */
    public final Collations COLLATIONS = Collations.COLLATIONS;

    /**
     * The table <code>information_schema.COLUMN_PRIVILEGES</code>.
     */
    public final ColumnPrivileges COLUMN_PRIVILEGES = ColumnPrivileges.COLUMN_PRIVILEGES;

    /**
     * The table <code>information_schema.COLUMNS</code>.
     */
    public final Columns COLUMNS = Columns.COLUMNS;

    /**
     * The table <code>information_schema.ENGINES</code>.
     */
    public final Engines ENGINES = Engines.ENGINES;

    /**
     * The table <code>information_schema.EVENTS</code>.
     */
    public final Events EVENTS = Events.EVENTS;

    /**
     * The table <code>information_schema.FILES</code>.
     */
    public final Files FILES = Files.FILES;

    /**
     * The table <code>information_schema.GLOBAL_STATUS</code>.
     */
    public final GlobalStatus GLOBAL_STATUS = GlobalStatus.GLOBAL_STATUS;

    /**
     * The table <code>information_schema.GLOBAL_VARIABLES</code>.
     */
    public final GlobalVariables GLOBAL_VARIABLES = GlobalVariables.GLOBAL_VARIABLES;

    /**
     * The table <code>information_schema.INNODB_BUFFER_PAGE</code>.
     */
    public final InnodbBufferPage INNODB_BUFFER_PAGE = InnodbBufferPage.INNODB_BUFFER_PAGE;

    /**
     * The table <code>information_schema.INNODB_BUFFER_PAGE_LRU</code>.
     */
    public final InnodbBufferPageLru INNODB_BUFFER_PAGE_LRU = InnodbBufferPageLru.INNODB_BUFFER_PAGE_LRU;

    /**
     * The table <code>information_schema.INNODB_BUFFER_POOL_STATS</code>.
     */
    public final InnodbBufferPoolStats INNODB_BUFFER_POOL_STATS = InnodbBufferPoolStats.INNODB_BUFFER_POOL_STATS;

    /**
     * The table <code>information_schema.INNODB_CMP</code>.
     */
    public final InnodbCmp INNODB_CMP = InnodbCmp.INNODB_CMP;

    /**
     * The table <code>information_schema.INNODB_CMP_PER_INDEX</code>.
     */
    public final InnodbCmpPerIndex INNODB_CMP_PER_INDEX = InnodbCmpPerIndex.INNODB_CMP_PER_INDEX;

    /**
     * The table <code>information_schema.INNODB_CMP_PER_INDEX_RESET</code>.
     */
    public final InnodbCmpPerIndexReset INNODB_CMP_PER_INDEX_RESET = InnodbCmpPerIndexReset.INNODB_CMP_PER_INDEX_RESET;

    /**
     * The table <code>information_schema.INNODB_CMP_RESET</code>.
     */
    public final InnodbCmpReset INNODB_CMP_RESET = InnodbCmpReset.INNODB_CMP_RESET;

    /**
     * The table <code>information_schema.INNODB_CMPMEM</code>.
     */
    public final InnodbCmpmem INNODB_CMPMEM = InnodbCmpmem.INNODB_CMPMEM;

    /**
     * The table <code>information_schema.INNODB_CMPMEM_RESET</code>.
     */
    public final InnodbCmpmemReset INNODB_CMPMEM_RESET = InnodbCmpmemReset.INNODB_CMPMEM_RESET;

    /**
     * The table <code>information_schema.INNODB_FT_BEING_DELETED</code>.
     */
    public final InnodbFtBeingDeleted INNODB_FT_BEING_DELETED = InnodbFtBeingDeleted.INNODB_FT_BEING_DELETED;

    /**
     * The table <code>information_schema.INNODB_FT_CONFIG</code>.
     */
    public final InnodbFtConfig INNODB_FT_CONFIG = InnodbFtConfig.INNODB_FT_CONFIG;

    /**
     * The table <code>information_schema.INNODB_FT_DEFAULT_STOPWORD</code>.
     */
    public final InnodbFtDefaultStopword INNODB_FT_DEFAULT_STOPWORD = InnodbFtDefaultStopword.INNODB_FT_DEFAULT_STOPWORD;

    /**
     * The table <code>information_schema.INNODB_FT_DELETED</code>.
     */
    public final InnodbFtDeleted INNODB_FT_DELETED = InnodbFtDeleted.INNODB_FT_DELETED;

    /**
     * The table <code>information_schema.INNODB_FT_INDEX_CACHE</code>.
     */
    public final InnodbFtIndexCache INNODB_FT_INDEX_CACHE = InnodbFtIndexCache.INNODB_FT_INDEX_CACHE;

    /**
     * The table <code>information_schema.INNODB_FT_INDEX_TABLE</code>.
     */
    public final InnodbFtIndexTable INNODB_FT_INDEX_TABLE = InnodbFtIndexTable.INNODB_FT_INDEX_TABLE;

    /**
     * The table <code>information_schema.INNODB_LOCK_WAITS</code>.
     */
    public final InnodbLockWaits INNODB_LOCK_WAITS = InnodbLockWaits.INNODB_LOCK_WAITS;

    /**
     * The table <code>information_schema.INNODB_LOCKS</code>.
     */
    public final InnodbLocks INNODB_LOCKS = InnodbLocks.INNODB_LOCKS;

    /**
     * The table <code>information_schema.INNODB_METRICS</code>.
     */
    public final InnodbMetrics INNODB_METRICS = InnodbMetrics.INNODB_METRICS;

    /**
     * The table <code>information_schema.INNODB_SYS_COLUMNS</code>.
     */
    public final InnodbSysColumns INNODB_SYS_COLUMNS = InnodbSysColumns.INNODB_SYS_COLUMNS;

    /**
     * The table <code>information_schema.INNODB_SYS_DATAFILES</code>.
     */
    public final InnodbSysDatafiles INNODB_SYS_DATAFILES = InnodbSysDatafiles.INNODB_SYS_DATAFILES;

    /**
     * The table <code>information_schema.INNODB_SYS_FIELDS</code>.
     */
    public final InnodbSysFields INNODB_SYS_FIELDS = InnodbSysFields.INNODB_SYS_FIELDS;

    /**
     * The table <code>information_schema.INNODB_SYS_FOREIGN</code>.
     */
    public final InnodbSysForeign INNODB_SYS_FOREIGN = InnodbSysForeign.INNODB_SYS_FOREIGN;

    /**
     * The table <code>information_schema.INNODB_SYS_FOREIGN_COLS</code>.
     */
    public final InnodbSysForeignCols INNODB_SYS_FOREIGN_COLS = InnodbSysForeignCols.INNODB_SYS_FOREIGN_COLS;

    /**
     * The table <code>information_schema.INNODB_SYS_INDEXES</code>.
     */
    public final InnodbSysIndexes INNODB_SYS_INDEXES = InnodbSysIndexes.INNODB_SYS_INDEXES;

    /**
     * The table <code>information_schema.INNODB_SYS_TABLES</code>.
     */
    public final InnodbSysTables INNODB_SYS_TABLES = InnodbSysTables.INNODB_SYS_TABLES;

    /**
     * The table <code>information_schema.INNODB_SYS_TABLESPACES</code>.
     */
    public final InnodbSysTablespaces INNODB_SYS_TABLESPACES = InnodbSysTablespaces.INNODB_SYS_TABLESPACES;

    /**
     * The table <code>information_schema.INNODB_SYS_TABLESTATS</code>.
     */
    public final InnodbSysTablestats INNODB_SYS_TABLESTATS = InnodbSysTablestats.INNODB_SYS_TABLESTATS;

    /**
     * The table <code>information_schema.INNODB_SYS_VIRTUAL</code>.
     */
    public final InnodbSysVirtual INNODB_SYS_VIRTUAL = InnodbSysVirtual.INNODB_SYS_VIRTUAL;

    /**
     * The table <code>information_schema.INNODB_TEMP_TABLE_INFO</code>.
     */
    public final InnodbTempTableInfo INNODB_TEMP_TABLE_INFO = InnodbTempTableInfo.INNODB_TEMP_TABLE_INFO;

    /**
     * The table <code>information_schema.INNODB_TRX</code>.
     */
    public final InnodbTrx INNODB_TRX = InnodbTrx.INNODB_TRX;

    /**
     * The table <code>information_schema.KEY_COLUMN_USAGE</code>.
     */
    public final KeyColumnUsage KEY_COLUMN_USAGE = KeyColumnUsage.KEY_COLUMN_USAGE;

    /**
     * The table <code>information_schema.OPTIMIZER_TRACE</code>.
     */
    public final OptimizerTrace OPTIMIZER_TRACE = OptimizerTrace.OPTIMIZER_TRACE;

    /**
     * The table <code>information_schema.PARAMETERS</code>.
     */
    public final Parameters PARAMETERS = Parameters.PARAMETERS;

    /**
     * The table <code>information_schema.PARTITIONS</code>.
     */
    public final Partitions PARTITIONS = Partitions.PARTITIONS;

    /**
     * The table <code>information_schema.PLUGINS</code>.
     */
    public final Plugins PLUGINS = Plugins.PLUGINS;

    /**
     * The table <code>information_schema.PROCESSLIST</code>.
     */
    public final Processlist PROCESSLIST = Processlist.PROCESSLIST;

    /**
     * The table <code>information_schema.PROFILING</code>.
     */
    public final Profiling PROFILING = Profiling.PROFILING;

    /**
     * The table <code>information_schema.REFERENTIAL_CONSTRAINTS</code>.
     */
    public final ReferentialConstraints REFERENTIAL_CONSTRAINTS = ReferentialConstraints.REFERENTIAL_CONSTRAINTS;

    /**
     * The table <code>information_schema.ROUTINES</code>.
     */
    public final Routines ROUTINES = Routines.ROUTINES;

    /**
     * The table <code>information_schema.SCHEMA_PRIVILEGES</code>.
     */
    public final SchemaPrivileges SCHEMA_PRIVILEGES = SchemaPrivileges.SCHEMA_PRIVILEGES;

    /**
     * The table <code>information_schema.SCHEMATA</code>.
     */
    public final Schemata SCHEMATA = Schemata.SCHEMATA;

    /**
     * The table <code>information_schema.SESSION_STATUS</code>.
     */
    public final SessionStatus SESSION_STATUS = SessionStatus.SESSION_STATUS;

    /**
     * The table <code>information_schema.SESSION_VARIABLES</code>.
     */
    public final SessionVariables SESSION_VARIABLES = SessionVariables.SESSION_VARIABLES;

    /**
     * The table <code>information_schema.STATISTICS</code>.
     */
    public final Statistics STATISTICS = Statistics.STATISTICS;

    /**
     * The table <code>information_schema.TABLE_CONSTRAINTS</code>.
     */
    public final TableConstraints TABLE_CONSTRAINTS = TableConstraints.TABLE_CONSTRAINTS;

    /**
     * The table <code>information_schema.TABLE_PRIVILEGES</code>.
     */
    public final TablePrivileges TABLE_PRIVILEGES = TablePrivileges.TABLE_PRIVILEGES;

    /**
     * The table <code>information_schema.TABLES</code>.
     */
    public final Tables TABLES = Tables.TABLES;

    /**
     * The table <code>information_schema.TABLESPACES</code>.
     */
    public final Tablespaces TABLESPACES = Tablespaces.TABLESPACES;

    /**
     * The table <code>information_schema.TRIGGERS</code>.
     */
    public final Triggers TRIGGERS = Triggers.TRIGGERS;

    /**
     * The table <code>information_schema.USER_PRIVILEGES</code>.
     */
    public final UserPrivileges USER_PRIVILEGES = UserPrivileges.USER_PRIVILEGES;

    /**
     * The table <code>information_schema.VIEWS</code>.
     */
    public final Views VIEWS = Views.VIEWS;

    /**
     * No further instances allowed
     */
    private InformationSchema() {
        super("information_schema", null);
    }


    @Override
    public Catalog getCatalog() {
        return DefaultCatalog.DEFAULT_CATALOG;
    }

    @Override
    public final List<Table<?>> getTables() {
        return Arrays.<Table<?>>asList(
            CharacterSets.CHARACTER_SETS,
            CollationCharacterSetApplicability.COLLATION_CHARACTER_SET_APPLICABILITY,
            Collations.COLLATIONS,
            ColumnPrivileges.COLUMN_PRIVILEGES,
            Columns.COLUMNS,
            Engines.ENGINES,
            Events.EVENTS,
            Files.FILES,
            GlobalStatus.GLOBAL_STATUS,
            GlobalVariables.GLOBAL_VARIABLES,
            InnodbBufferPage.INNODB_BUFFER_PAGE,
            InnodbBufferPageLru.INNODB_BUFFER_PAGE_LRU,
            InnodbBufferPoolStats.INNODB_BUFFER_POOL_STATS,
            InnodbCmp.INNODB_CMP,
            InnodbCmpPerIndex.INNODB_CMP_PER_INDEX,
            InnodbCmpPerIndexReset.INNODB_CMP_PER_INDEX_RESET,
            InnodbCmpReset.INNODB_CMP_RESET,
            InnodbCmpmem.INNODB_CMPMEM,
            InnodbCmpmemReset.INNODB_CMPMEM_RESET,
            InnodbFtBeingDeleted.INNODB_FT_BEING_DELETED,
            InnodbFtConfig.INNODB_FT_CONFIG,
            InnodbFtDefaultStopword.INNODB_FT_DEFAULT_STOPWORD,
            InnodbFtDeleted.INNODB_FT_DELETED,
            InnodbFtIndexCache.INNODB_FT_INDEX_CACHE,
            InnodbFtIndexTable.INNODB_FT_INDEX_TABLE,
            InnodbLockWaits.INNODB_LOCK_WAITS,
            InnodbLocks.INNODB_LOCKS,
            InnodbMetrics.INNODB_METRICS,
            InnodbSysColumns.INNODB_SYS_COLUMNS,
            InnodbSysDatafiles.INNODB_SYS_DATAFILES,
            InnodbSysFields.INNODB_SYS_FIELDS,
            InnodbSysForeign.INNODB_SYS_FOREIGN,
            InnodbSysForeignCols.INNODB_SYS_FOREIGN_COLS,
            InnodbSysIndexes.INNODB_SYS_INDEXES,
            InnodbSysTables.INNODB_SYS_TABLES,
            InnodbSysTablespaces.INNODB_SYS_TABLESPACES,
            InnodbSysTablestats.INNODB_SYS_TABLESTATS,
            InnodbSysVirtual.INNODB_SYS_VIRTUAL,
            InnodbTempTableInfo.INNODB_TEMP_TABLE_INFO,
            InnodbTrx.INNODB_TRX,
            KeyColumnUsage.KEY_COLUMN_USAGE,
            OptimizerTrace.OPTIMIZER_TRACE,
            Parameters.PARAMETERS,
            Partitions.PARTITIONS,
            Plugins.PLUGINS,
            Processlist.PROCESSLIST,
            Profiling.PROFILING,
            ReferentialConstraints.REFERENTIAL_CONSTRAINTS,
            Routines.ROUTINES,
            SchemaPrivileges.SCHEMA_PRIVILEGES,
            Schemata.SCHEMATA,
            SessionStatus.SESSION_STATUS,
            SessionVariables.SESSION_VARIABLES,
            Statistics.STATISTICS,
            TableConstraints.TABLE_CONSTRAINTS,
            TablePrivileges.TABLE_PRIVILEGES,
            Tables.TABLES,
            Tablespaces.TABLESPACES,
            Triggers.TRIGGERS,
            UserPrivileges.USER_PRIVILEGES,
            Views.VIEWS);
    }
}
