/*
 * This file is generated by jOOQ.
 */
package nu.studer.sample.sys;


import nu.studer.sample.sys.tables.HostSummary;
import nu.studer.sample.sys.tables.HostSummaryByFileIo;
import nu.studer.sample.sys.tables.HostSummaryByFileIoType;
import nu.studer.sample.sys.tables.HostSummaryByStages;
import nu.studer.sample.sys.tables.HostSummaryByStatementLatency;
import nu.studer.sample.sys.tables.HostSummaryByStatementType;
import nu.studer.sample.sys.tables.InnodbBufferStatsBySchema;
import nu.studer.sample.sys.tables.InnodbBufferStatsByTable;
import nu.studer.sample.sys.tables.InnodbLockWaits;
import nu.studer.sample.sys.tables.IoByThreadByLatency;
import nu.studer.sample.sys.tables.IoGlobalByFileByBytes;
import nu.studer.sample.sys.tables.IoGlobalByFileByLatency;
import nu.studer.sample.sys.tables.IoGlobalByWaitByBytes;
import nu.studer.sample.sys.tables.IoGlobalByWaitByLatency;
import nu.studer.sample.sys.tables.LatestFileIo;
import nu.studer.sample.sys.tables.MemoryByHostByCurrentBytes;
import nu.studer.sample.sys.tables.MemoryByThreadByCurrentBytes;
import nu.studer.sample.sys.tables.MemoryByUserByCurrentBytes;
import nu.studer.sample.sys.tables.MemoryGlobalByCurrentBytes;
import nu.studer.sample.sys.tables.MemoryGlobalTotal;
import nu.studer.sample.sys.tables.Metrics;
import nu.studer.sample.sys.tables.Processlist;
import nu.studer.sample.sys.tables.PsCheckLostInstrumentation;
import nu.studer.sample.sys.tables.SchemaAutoIncrementColumns;
import nu.studer.sample.sys.tables.SchemaIndexStatistics;
import nu.studer.sample.sys.tables.SchemaObjectOverview;
import nu.studer.sample.sys.tables.SchemaRedundantIndexes;
import nu.studer.sample.sys.tables.SchemaTableLockWaits;
import nu.studer.sample.sys.tables.SchemaTableStatistics;
import nu.studer.sample.sys.tables.SchemaTableStatisticsWithBuffer;
import nu.studer.sample.sys.tables.SchemaTablesWithFullTableScans;
import nu.studer.sample.sys.tables.SchemaUnusedIndexes;
import nu.studer.sample.sys.tables.Session;
import nu.studer.sample.sys.tables.SessionSslStatus;
import nu.studer.sample.sys.tables.StatementAnalysis;
import nu.studer.sample.sys.tables.StatementsWithErrorsOrWarnings;
import nu.studer.sample.sys.tables.StatementsWithFullTableScans;
import nu.studer.sample.sys.tables.StatementsWithRuntimesIn_95thPercentile;
import nu.studer.sample.sys.tables.StatementsWithSorting;
import nu.studer.sample.sys.tables.StatementsWithTempTables;
import nu.studer.sample.sys.tables.SysConfig;
import nu.studer.sample.sys.tables.UserSummary;
import nu.studer.sample.sys.tables.UserSummaryByFileIo;
import nu.studer.sample.sys.tables.UserSummaryByFileIoType;
import nu.studer.sample.sys.tables.UserSummaryByStages;
import nu.studer.sample.sys.tables.UserSummaryByStatementLatency;
import nu.studer.sample.sys.tables.UserSummaryByStatementType;
import nu.studer.sample.sys.tables.Version;
import nu.studer.sample.sys.tables.WaitClassesGlobalByAvgLatency;
import nu.studer.sample.sys.tables.WaitClassesGlobalByLatency;
import nu.studer.sample.sys.tables.WaitsByHostByLatency;
import nu.studer.sample.sys.tables.WaitsByUserByLatency;
import nu.studer.sample.sys.tables.WaitsGlobalByLatency;
import nu.studer.sample.sys.tables.X$hostSummary;
import nu.studer.sample.sys.tables.X$hostSummaryByFileIo;
import nu.studer.sample.sys.tables.X$hostSummaryByFileIoType;
import nu.studer.sample.sys.tables.X$hostSummaryByStages;
import nu.studer.sample.sys.tables.X$hostSummaryByStatementLatency;
import nu.studer.sample.sys.tables.X$hostSummaryByStatementType;
import nu.studer.sample.sys.tables.X$innodbBufferStatsBySchema;
import nu.studer.sample.sys.tables.X$innodbBufferStatsByTable;
import nu.studer.sample.sys.tables.X$innodbLockWaits;
import nu.studer.sample.sys.tables.X$ioByThreadByLatency;
import nu.studer.sample.sys.tables.X$ioGlobalByFileByBytes;
import nu.studer.sample.sys.tables.X$ioGlobalByFileByLatency;
import nu.studer.sample.sys.tables.X$ioGlobalByWaitByBytes;
import nu.studer.sample.sys.tables.X$ioGlobalByWaitByLatency;
import nu.studer.sample.sys.tables.X$latestFileIo;
import nu.studer.sample.sys.tables.X$memoryByHostByCurrentBytes;
import nu.studer.sample.sys.tables.X$memoryByThreadByCurrentBytes;
import nu.studer.sample.sys.tables.X$memoryByUserByCurrentBytes;
import nu.studer.sample.sys.tables.X$memoryGlobalByCurrentBytes;
import nu.studer.sample.sys.tables.X$memoryGlobalTotal;
import nu.studer.sample.sys.tables.X$processlist;
import nu.studer.sample.sys.tables.X$psDigestAvgLatencyDistribution;
import nu.studer.sample.sys.tables.X$psDigest_95thPercentileByAvgUs;
import nu.studer.sample.sys.tables.X$psSchemaTableStatisticsIo;
import nu.studer.sample.sys.tables.X$schemaFlattenedKeys;
import nu.studer.sample.sys.tables.X$schemaIndexStatistics;
import nu.studer.sample.sys.tables.X$schemaTableLockWaits;
import nu.studer.sample.sys.tables.X$schemaTableStatistics;
import nu.studer.sample.sys.tables.X$schemaTableStatisticsWithBuffer;
import nu.studer.sample.sys.tables.X$schemaTablesWithFullTableScans;
import nu.studer.sample.sys.tables.X$session;
import nu.studer.sample.sys.tables.X$statementAnalysis;
import nu.studer.sample.sys.tables.X$statementsWithErrorsOrWarnings;
import nu.studer.sample.sys.tables.X$statementsWithFullTableScans;
import nu.studer.sample.sys.tables.X$statementsWithRuntimesIn_95thPercentile;
import nu.studer.sample.sys.tables.X$statementsWithSorting;
import nu.studer.sample.sys.tables.X$statementsWithTempTables;
import nu.studer.sample.sys.tables.X$userSummary;
import nu.studer.sample.sys.tables.X$userSummaryByFileIo;
import nu.studer.sample.sys.tables.X$userSummaryByFileIoType;
import nu.studer.sample.sys.tables.X$userSummaryByStages;
import nu.studer.sample.sys.tables.X$userSummaryByStatementLatency;
import nu.studer.sample.sys.tables.X$userSummaryByStatementType;
import nu.studer.sample.sys.tables.X$waitClassesGlobalByAvgLatency;
import nu.studer.sample.sys.tables.X$waitClassesGlobalByLatency;
import nu.studer.sample.sys.tables.X$waitsByHostByLatency;
import nu.studer.sample.sys.tables.X$waitsByUserByLatency;
import nu.studer.sample.sys.tables.X$waitsGlobalByLatency;


/**
 * Convenience access to all tables in sys.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Tables {

    /**
     * VIEW
     */
    public static final HostSummary HOST_SUMMARY = HostSummary.HOST_SUMMARY;

    /**
     * VIEW
     */
    public static final HostSummaryByFileIo HOST_SUMMARY_BY_FILE_IO = HostSummaryByFileIo.HOST_SUMMARY_BY_FILE_IO;

    /**
     * VIEW
     */
    public static final HostSummaryByFileIoType HOST_SUMMARY_BY_FILE_IO_TYPE = HostSummaryByFileIoType.HOST_SUMMARY_BY_FILE_IO_TYPE;

    /**
     * VIEW
     */
    public static final HostSummaryByStages HOST_SUMMARY_BY_STAGES = HostSummaryByStages.HOST_SUMMARY_BY_STAGES;

    /**
     * VIEW
     */
    public static final HostSummaryByStatementLatency HOST_SUMMARY_BY_STATEMENT_LATENCY = HostSummaryByStatementLatency.HOST_SUMMARY_BY_STATEMENT_LATENCY;

    /**
     * VIEW
     */
    public static final HostSummaryByStatementType HOST_SUMMARY_BY_STATEMENT_TYPE = HostSummaryByStatementType.HOST_SUMMARY_BY_STATEMENT_TYPE;

    /**
     * VIEW
     */
    public static final InnodbBufferStatsBySchema INNODB_BUFFER_STATS_BY_SCHEMA = InnodbBufferStatsBySchema.INNODB_BUFFER_STATS_BY_SCHEMA;

    /**
     * VIEW
     */
    public static final InnodbBufferStatsByTable INNODB_BUFFER_STATS_BY_TABLE = InnodbBufferStatsByTable.INNODB_BUFFER_STATS_BY_TABLE;

    /**
     * VIEW
     */
    public static final InnodbLockWaits INNODB_LOCK_WAITS = InnodbLockWaits.INNODB_LOCK_WAITS;

    /**
     * VIEW
     */
    public static final IoByThreadByLatency IO_BY_THREAD_BY_LATENCY = IoByThreadByLatency.IO_BY_THREAD_BY_LATENCY;

    /**
     * VIEW
     */
    public static final IoGlobalByFileByBytes IO_GLOBAL_BY_FILE_BY_BYTES = IoGlobalByFileByBytes.IO_GLOBAL_BY_FILE_BY_BYTES;

    /**
     * VIEW
     */
    public static final IoGlobalByFileByLatency IO_GLOBAL_BY_FILE_BY_LATENCY = IoGlobalByFileByLatency.IO_GLOBAL_BY_FILE_BY_LATENCY;

    /**
     * VIEW
     */
    public static final IoGlobalByWaitByBytes IO_GLOBAL_BY_WAIT_BY_BYTES = IoGlobalByWaitByBytes.IO_GLOBAL_BY_WAIT_BY_BYTES;

    /**
     * VIEW
     */
    public static final IoGlobalByWaitByLatency IO_GLOBAL_BY_WAIT_BY_LATENCY = IoGlobalByWaitByLatency.IO_GLOBAL_BY_WAIT_BY_LATENCY;

    /**
     * VIEW
     */
    public static final LatestFileIo LATEST_FILE_IO = LatestFileIo.LATEST_FILE_IO;

    /**
     * VIEW
     */
    public static final MemoryByHostByCurrentBytes MEMORY_BY_HOST_BY_CURRENT_BYTES = MemoryByHostByCurrentBytes.MEMORY_BY_HOST_BY_CURRENT_BYTES;

    /**
     * VIEW
     */
    public static final MemoryByThreadByCurrentBytes MEMORY_BY_THREAD_BY_CURRENT_BYTES = MemoryByThreadByCurrentBytes.MEMORY_BY_THREAD_BY_CURRENT_BYTES;

    /**
     * VIEW
     */
    public static final MemoryByUserByCurrentBytes MEMORY_BY_USER_BY_CURRENT_BYTES = MemoryByUserByCurrentBytes.MEMORY_BY_USER_BY_CURRENT_BYTES;

    /**
     * VIEW
     */
    public static final MemoryGlobalByCurrentBytes MEMORY_GLOBAL_BY_CURRENT_BYTES = MemoryGlobalByCurrentBytes.MEMORY_GLOBAL_BY_CURRENT_BYTES;

    /**
     * VIEW
     */
    public static final MemoryGlobalTotal MEMORY_GLOBAL_TOTAL = MemoryGlobalTotal.MEMORY_GLOBAL_TOTAL;

    /**
     * VIEW
     */
    public static final Metrics METRICS = Metrics.METRICS;

    /**
     * VIEW
     */
    public static final Processlist PROCESSLIST = Processlist.PROCESSLIST;

    /**
     * VIEW
     */
    public static final PsCheckLostInstrumentation PS_CHECK_LOST_INSTRUMENTATION = PsCheckLostInstrumentation.PS_CHECK_LOST_INSTRUMENTATION;

    /**
     * VIEW
     */
    public static final SchemaAutoIncrementColumns SCHEMA_AUTO_INCREMENT_COLUMNS = SchemaAutoIncrementColumns.SCHEMA_AUTO_INCREMENT_COLUMNS;

    /**
     * VIEW
     */
    public static final SchemaIndexStatistics SCHEMA_INDEX_STATISTICS = SchemaIndexStatistics.SCHEMA_INDEX_STATISTICS;

    /**
     * VIEW
     */
    public static final SchemaObjectOverview SCHEMA_OBJECT_OVERVIEW = SchemaObjectOverview.SCHEMA_OBJECT_OVERVIEW;

    /**
     * VIEW
     */
    public static final SchemaRedundantIndexes SCHEMA_REDUNDANT_INDEXES = SchemaRedundantIndexes.SCHEMA_REDUNDANT_INDEXES;

    /**
     * VIEW
     */
    public static final SchemaTableLockWaits SCHEMA_TABLE_LOCK_WAITS = SchemaTableLockWaits.SCHEMA_TABLE_LOCK_WAITS;

    /**
     * VIEW
     */
    public static final SchemaTableStatistics SCHEMA_TABLE_STATISTICS = SchemaTableStatistics.SCHEMA_TABLE_STATISTICS;

    /**
     * VIEW
     */
    public static final SchemaTableStatisticsWithBuffer SCHEMA_TABLE_STATISTICS_WITH_BUFFER = SchemaTableStatisticsWithBuffer.SCHEMA_TABLE_STATISTICS_WITH_BUFFER;

    /**
     * VIEW
     */
    public static final SchemaTablesWithFullTableScans SCHEMA_TABLES_WITH_FULL_TABLE_SCANS = SchemaTablesWithFullTableScans.SCHEMA_TABLES_WITH_FULL_TABLE_SCANS;

    /**
     * VIEW
     */
    public static final SchemaUnusedIndexes SCHEMA_UNUSED_INDEXES = SchemaUnusedIndexes.SCHEMA_UNUSED_INDEXES;

    /**
     * VIEW
     */
    public static final Session SESSION = Session.SESSION;

    /**
     * VIEW
     */
    public static final SessionSslStatus SESSION_SSL_STATUS = SessionSslStatus.SESSION_SSL_STATUS;

    /**
     * VIEW
     */
    public static final StatementAnalysis STATEMENT_ANALYSIS = StatementAnalysis.STATEMENT_ANALYSIS;

    /**
     * VIEW
     */
    public static final StatementsWithErrorsOrWarnings STATEMENTS_WITH_ERRORS_OR_WARNINGS = StatementsWithErrorsOrWarnings.STATEMENTS_WITH_ERRORS_OR_WARNINGS;

    /**
     * VIEW
     */
    public static final StatementsWithFullTableScans STATEMENTS_WITH_FULL_TABLE_SCANS = StatementsWithFullTableScans.STATEMENTS_WITH_FULL_TABLE_SCANS;

    /**
     * VIEW
     */
    public static final StatementsWithRuntimesIn_95thPercentile STATEMENTS_WITH_RUNTIMES_IN_95TH_PERCENTILE = StatementsWithRuntimesIn_95thPercentile.STATEMENTS_WITH_RUNTIMES_IN_95TH_PERCENTILE;

    /**
     * VIEW
     */
    public static final StatementsWithSorting STATEMENTS_WITH_SORTING = StatementsWithSorting.STATEMENTS_WITH_SORTING;

    /**
     * VIEW
     */
    public static final StatementsWithTempTables STATEMENTS_WITH_TEMP_TABLES = StatementsWithTempTables.STATEMENTS_WITH_TEMP_TABLES;

    /**
     * The table <code>sys.sys_config</code>.
     */
    public static final SysConfig SYS_CONFIG = SysConfig.SYS_CONFIG;

    /**
     * VIEW
     */
    public static final UserSummary USER_SUMMARY = UserSummary.USER_SUMMARY;

    /**
     * VIEW
     */
    public static final UserSummaryByFileIo USER_SUMMARY_BY_FILE_IO = UserSummaryByFileIo.USER_SUMMARY_BY_FILE_IO;

    /**
     * VIEW
     */
    public static final UserSummaryByFileIoType USER_SUMMARY_BY_FILE_IO_TYPE = UserSummaryByFileIoType.USER_SUMMARY_BY_FILE_IO_TYPE;

    /**
     * VIEW
     */
    public static final UserSummaryByStages USER_SUMMARY_BY_STAGES = UserSummaryByStages.USER_SUMMARY_BY_STAGES;

    /**
     * VIEW
     */
    public static final UserSummaryByStatementLatency USER_SUMMARY_BY_STATEMENT_LATENCY = UserSummaryByStatementLatency.USER_SUMMARY_BY_STATEMENT_LATENCY;

    /**
     * VIEW
     */
    public static final UserSummaryByStatementType USER_SUMMARY_BY_STATEMENT_TYPE = UserSummaryByStatementType.USER_SUMMARY_BY_STATEMENT_TYPE;

    /**
     * VIEW
     */
    public static final Version VERSION = Version.VERSION;

    /**
     * VIEW
     */
    public static final WaitClassesGlobalByAvgLatency WAIT_CLASSES_GLOBAL_BY_AVG_LATENCY = WaitClassesGlobalByAvgLatency.WAIT_CLASSES_GLOBAL_BY_AVG_LATENCY;

    /**
     * VIEW
     */
    public static final WaitClassesGlobalByLatency WAIT_CLASSES_GLOBAL_BY_LATENCY = WaitClassesGlobalByLatency.WAIT_CLASSES_GLOBAL_BY_LATENCY;

    /**
     * VIEW
     */
    public static final WaitsByHostByLatency WAITS_BY_HOST_BY_LATENCY = WaitsByHostByLatency.WAITS_BY_HOST_BY_LATENCY;

    /**
     * VIEW
     */
    public static final WaitsByUserByLatency WAITS_BY_USER_BY_LATENCY = WaitsByUserByLatency.WAITS_BY_USER_BY_LATENCY;

    /**
     * VIEW
     */
    public static final WaitsGlobalByLatency WAITS_GLOBAL_BY_LATENCY = WaitsGlobalByLatency.WAITS_GLOBAL_BY_LATENCY;

    /**
     * VIEW
     */
    public static final X$hostSummary X$HOST_SUMMARY = X$hostSummary.X$HOST_SUMMARY;

    /**
     * VIEW
     */
    public static final X$hostSummaryByFileIo X$HOST_SUMMARY_BY_FILE_IO = X$hostSummaryByFileIo.X$HOST_SUMMARY_BY_FILE_IO;

    /**
     * VIEW
     */
    public static final X$hostSummaryByFileIoType X$HOST_SUMMARY_BY_FILE_IO_TYPE = X$hostSummaryByFileIoType.X$HOST_SUMMARY_BY_FILE_IO_TYPE;

    /**
     * VIEW
     */
    public static final X$hostSummaryByStages X$HOST_SUMMARY_BY_STAGES = X$hostSummaryByStages.X$HOST_SUMMARY_BY_STAGES;

    /**
     * VIEW
     */
    public static final X$hostSummaryByStatementLatency X$HOST_SUMMARY_BY_STATEMENT_LATENCY = X$hostSummaryByStatementLatency.X$HOST_SUMMARY_BY_STATEMENT_LATENCY;

    /**
     * VIEW
     */
    public static final X$hostSummaryByStatementType X$HOST_SUMMARY_BY_STATEMENT_TYPE = X$hostSummaryByStatementType.X$HOST_SUMMARY_BY_STATEMENT_TYPE;

    /**
     * VIEW
     */
    public static final X$innodbBufferStatsBySchema X$INNODB_BUFFER_STATS_BY_SCHEMA = X$innodbBufferStatsBySchema.X$INNODB_BUFFER_STATS_BY_SCHEMA;

    /**
     * VIEW
     */
    public static final X$innodbBufferStatsByTable X$INNODB_BUFFER_STATS_BY_TABLE = X$innodbBufferStatsByTable.X$INNODB_BUFFER_STATS_BY_TABLE;

    /**
     * VIEW
     */
    public static final X$innodbLockWaits X$INNODB_LOCK_WAITS = X$innodbLockWaits.X$INNODB_LOCK_WAITS;

    /**
     * VIEW
     */
    public static final X$ioByThreadByLatency X$IO_BY_THREAD_BY_LATENCY = X$ioByThreadByLatency.X$IO_BY_THREAD_BY_LATENCY;

    /**
     * VIEW
     */
    public static final X$ioGlobalByFileByBytes X$IO_GLOBAL_BY_FILE_BY_BYTES = X$ioGlobalByFileByBytes.X$IO_GLOBAL_BY_FILE_BY_BYTES;

    /**
     * VIEW
     */
    public static final X$ioGlobalByFileByLatency X$IO_GLOBAL_BY_FILE_BY_LATENCY = X$ioGlobalByFileByLatency.X$IO_GLOBAL_BY_FILE_BY_LATENCY;

    /**
     * VIEW
     */
    public static final X$ioGlobalByWaitByBytes X$IO_GLOBAL_BY_WAIT_BY_BYTES = X$ioGlobalByWaitByBytes.X$IO_GLOBAL_BY_WAIT_BY_BYTES;

    /**
     * VIEW
     */
    public static final X$ioGlobalByWaitByLatency X$IO_GLOBAL_BY_WAIT_BY_LATENCY = X$ioGlobalByWaitByLatency.X$IO_GLOBAL_BY_WAIT_BY_LATENCY;

    /**
     * VIEW
     */
    public static final X$latestFileIo X$LATEST_FILE_IO = X$latestFileIo.X$LATEST_FILE_IO;

    /**
     * VIEW
     */
    public static final X$memoryByHostByCurrentBytes X$MEMORY_BY_HOST_BY_CURRENT_BYTES = X$memoryByHostByCurrentBytes.X$MEMORY_BY_HOST_BY_CURRENT_BYTES;

    /**
     * VIEW
     */
    public static final X$memoryByThreadByCurrentBytes X$MEMORY_BY_THREAD_BY_CURRENT_BYTES = X$memoryByThreadByCurrentBytes.X$MEMORY_BY_THREAD_BY_CURRENT_BYTES;

    /**
     * VIEW
     */
    public static final X$memoryByUserByCurrentBytes X$MEMORY_BY_USER_BY_CURRENT_BYTES = X$memoryByUserByCurrentBytes.X$MEMORY_BY_USER_BY_CURRENT_BYTES;

    /**
     * VIEW
     */
    public static final X$memoryGlobalByCurrentBytes X$MEMORY_GLOBAL_BY_CURRENT_BYTES = X$memoryGlobalByCurrentBytes.X$MEMORY_GLOBAL_BY_CURRENT_BYTES;

    /**
     * VIEW
     */
    public static final X$memoryGlobalTotal X$MEMORY_GLOBAL_TOTAL = X$memoryGlobalTotal.X$MEMORY_GLOBAL_TOTAL;

    /**
     * VIEW
     */
    public static final X$processlist X$PROCESSLIST = X$processlist.X$PROCESSLIST;

    /**
     * VIEW
     */
    public static final X$psDigest_95thPercentileByAvgUs X$PS_DIGEST_95TH_PERCENTILE_BY_AVG_US = X$psDigest_95thPercentileByAvgUs.X$PS_DIGEST_95TH_PERCENTILE_BY_AVG_US;

    /**
     * VIEW
     */
    public static final X$psDigestAvgLatencyDistribution X$PS_DIGEST_AVG_LATENCY_DISTRIBUTION = X$psDigestAvgLatencyDistribution.X$PS_DIGEST_AVG_LATENCY_DISTRIBUTION;

    /**
     * VIEW
     */
    public static final X$psSchemaTableStatisticsIo X$PS_SCHEMA_TABLE_STATISTICS_IO = X$psSchemaTableStatisticsIo.X$PS_SCHEMA_TABLE_STATISTICS_IO;

    /**
     * VIEW
     */
    public static final X$schemaFlattenedKeys X$SCHEMA_FLATTENED_KEYS = X$schemaFlattenedKeys.X$SCHEMA_FLATTENED_KEYS;

    /**
     * VIEW
     */
    public static final X$schemaIndexStatistics X$SCHEMA_INDEX_STATISTICS = X$schemaIndexStatistics.X$SCHEMA_INDEX_STATISTICS;

    /**
     * VIEW
     */
    public static final X$schemaTableLockWaits X$SCHEMA_TABLE_LOCK_WAITS = X$schemaTableLockWaits.X$SCHEMA_TABLE_LOCK_WAITS;

    /**
     * VIEW
     */
    public static final X$schemaTableStatistics X$SCHEMA_TABLE_STATISTICS = X$schemaTableStatistics.X$SCHEMA_TABLE_STATISTICS;

    /**
     * VIEW
     */
    public static final X$schemaTableStatisticsWithBuffer X$SCHEMA_TABLE_STATISTICS_WITH_BUFFER = X$schemaTableStatisticsWithBuffer.X$SCHEMA_TABLE_STATISTICS_WITH_BUFFER;

    /**
     * VIEW
     */
    public static final X$schemaTablesWithFullTableScans X$SCHEMA_TABLES_WITH_FULL_TABLE_SCANS = X$schemaTablesWithFullTableScans.X$SCHEMA_TABLES_WITH_FULL_TABLE_SCANS;

    /**
     * VIEW
     */
    public static final X$session X$SESSION = X$session.X$SESSION;

    /**
     * VIEW
     */
    public static final X$statementAnalysis X$STATEMENT_ANALYSIS = X$statementAnalysis.X$STATEMENT_ANALYSIS;

    /**
     * VIEW
     */
    public static final X$statementsWithErrorsOrWarnings X$STATEMENTS_WITH_ERRORS_OR_WARNINGS = X$statementsWithErrorsOrWarnings.X$STATEMENTS_WITH_ERRORS_OR_WARNINGS;

    /**
     * VIEW
     */
    public static final X$statementsWithFullTableScans X$STATEMENTS_WITH_FULL_TABLE_SCANS = X$statementsWithFullTableScans.X$STATEMENTS_WITH_FULL_TABLE_SCANS;

    /**
     * VIEW
     */
    public static final X$statementsWithRuntimesIn_95thPercentile X$STATEMENTS_WITH_RUNTIMES_IN_95TH_PERCENTILE = X$statementsWithRuntimesIn_95thPercentile.X$STATEMENTS_WITH_RUNTIMES_IN_95TH_PERCENTILE;

    /**
     * VIEW
     */
    public static final X$statementsWithSorting X$STATEMENTS_WITH_SORTING = X$statementsWithSorting.X$STATEMENTS_WITH_SORTING;

    /**
     * VIEW
     */
    public static final X$statementsWithTempTables X$STATEMENTS_WITH_TEMP_TABLES = X$statementsWithTempTables.X$STATEMENTS_WITH_TEMP_TABLES;

    /**
     * VIEW
     */
    public static final X$userSummary X$USER_SUMMARY = X$userSummary.X$USER_SUMMARY;

    /**
     * VIEW
     */
    public static final X$userSummaryByFileIo X$USER_SUMMARY_BY_FILE_IO = X$userSummaryByFileIo.X$USER_SUMMARY_BY_FILE_IO;

    /**
     * VIEW
     */
    public static final X$userSummaryByFileIoType X$USER_SUMMARY_BY_FILE_IO_TYPE = X$userSummaryByFileIoType.X$USER_SUMMARY_BY_FILE_IO_TYPE;

    /**
     * VIEW
     */
    public static final X$userSummaryByStages X$USER_SUMMARY_BY_STAGES = X$userSummaryByStages.X$USER_SUMMARY_BY_STAGES;

    /**
     * VIEW
     */
    public static final X$userSummaryByStatementLatency X$USER_SUMMARY_BY_STATEMENT_LATENCY = X$userSummaryByStatementLatency.X$USER_SUMMARY_BY_STATEMENT_LATENCY;

    /**
     * VIEW
     */
    public static final X$userSummaryByStatementType X$USER_SUMMARY_BY_STATEMENT_TYPE = X$userSummaryByStatementType.X$USER_SUMMARY_BY_STATEMENT_TYPE;

    /**
     * VIEW
     */
    public static final X$waitClassesGlobalByAvgLatency X$WAIT_CLASSES_GLOBAL_BY_AVG_LATENCY = X$waitClassesGlobalByAvgLatency.X$WAIT_CLASSES_GLOBAL_BY_AVG_LATENCY;

    /**
     * VIEW
     */
    public static final X$waitClassesGlobalByLatency X$WAIT_CLASSES_GLOBAL_BY_LATENCY = X$waitClassesGlobalByLatency.X$WAIT_CLASSES_GLOBAL_BY_LATENCY;

    /**
     * VIEW
     */
    public static final X$waitsByHostByLatency X$WAITS_BY_HOST_BY_LATENCY = X$waitsByHostByLatency.X$WAITS_BY_HOST_BY_LATENCY;

    /**
     * VIEW
     */
    public static final X$waitsByUserByLatency X$WAITS_BY_USER_BY_LATENCY = X$waitsByUserByLatency.X$WAITS_BY_USER_BY_LATENCY;

    /**
     * VIEW
     */
    public static final X$waitsGlobalByLatency X$WAITS_GLOBAL_BY_LATENCY = X$waitsGlobalByLatency.X$WAITS_GLOBAL_BY_LATENCY;
}