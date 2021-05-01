/*
 * This file is generated by jOOQ.
 */
package nu.studer.sample.performance_schema


import kotlin.collections.List

import nu.studer.sample.DefaultCatalog
import nu.studer.sample.performance_schema.tables.Accounts
import nu.studer.sample.performance_schema.tables.CondInstances
import nu.studer.sample.performance_schema.tables.EventsStagesCurrent
import nu.studer.sample.performance_schema.tables.EventsStagesHistory
import nu.studer.sample.performance_schema.tables.EventsStagesHistoryLong
import nu.studer.sample.performance_schema.tables.EventsStagesSummaryByAccountByEventName
import nu.studer.sample.performance_schema.tables.EventsStagesSummaryByHostByEventName
import nu.studer.sample.performance_schema.tables.EventsStagesSummaryByThreadByEventName
import nu.studer.sample.performance_schema.tables.EventsStagesSummaryByUserByEventName
import nu.studer.sample.performance_schema.tables.EventsStagesSummaryGlobalByEventName
import nu.studer.sample.performance_schema.tables.EventsStatementsCurrent
import nu.studer.sample.performance_schema.tables.EventsStatementsHistory
import nu.studer.sample.performance_schema.tables.EventsStatementsHistoryLong
import nu.studer.sample.performance_schema.tables.EventsStatementsSummaryByAccountByEventName
import nu.studer.sample.performance_schema.tables.EventsStatementsSummaryByDigest
import nu.studer.sample.performance_schema.tables.EventsStatementsSummaryByHostByEventName
import nu.studer.sample.performance_schema.tables.EventsStatementsSummaryByProgram
import nu.studer.sample.performance_schema.tables.EventsStatementsSummaryByThreadByEventName
import nu.studer.sample.performance_schema.tables.EventsStatementsSummaryByUserByEventName
import nu.studer.sample.performance_schema.tables.EventsStatementsSummaryGlobalByEventName
import nu.studer.sample.performance_schema.tables.EventsTransactionsCurrent
import nu.studer.sample.performance_schema.tables.EventsTransactionsHistory
import nu.studer.sample.performance_schema.tables.EventsTransactionsHistoryLong
import nu.studer.sample.performance_schema.tables.EventsTransactionsSummaryByAccountByEventName
import nu.studer.sample.performance_schema.tables.EventsTransactionsSummaryByHostByEventName
import nu.studer.sample.performance_schema.tables.EventsTransactionsSummaryByThreadByEventName
import nu.studer.sample.performance_schema.tables.EventsTransactionsSummaryByUserByEventName
import nu.studer.sample.performance_schema.tables.EventsTransactionsSummaryGlobalByEventName
import nu.studer.sample.performance_schema.tables.EventsWaitsCurrent
import nu.studer.sample.performance_schema.tables.EventsWaitsHistory
import nu.studer.sample.performance_schema.tables.EventsWaitsHistoryLong
import nu.studer.sample.performance_schema.tables.EventsWaitsSummaryByAccountByEventName
import nu.studer.sample.performance_schema.tables.EventsWaitsSummaryByHostByEventName
import nu.studer.sample.performance_schema.tables.EventsWaitsSummaryByInstance
import nu.studer.sample.performance_schema.tables.EventsWaitsSummaryByThreadByEventName
import nu.studer.sample.performance_schema.tables.EventsWaitsSummaryByUserByEventName
import nu.studer.sample.performance_schema.tables.EventsWaitsSummaryGlobalByEventName
import nu.studer.sample.performance_schema.tables.FileInstances
import nu.studer.sample.performance_schema.tables.FileSummaryByEventName
import nu.studer.sample.performance_schema.tables.FileSummaryByInstance
import nu.studer.sample.performance_schema.tables.GlobalStatus
import nu.studer.sample.performance_schema.tables.GlobalVariables
import nu.studer.sample.performance_schema.tables.HostCache
import nu.studer.sample.performance_schema.tables.Hosts
import nu.studer.sample.performance_schema.tables.MemorySummaryByAccountByEventName
import nu.studer.sample.performance_schema.tables.MemorySummaryByHostByEventName
import nu.studer.sample.performance_schema.tables.MemorySummaryByThreadByEventName
import nu.studer.sample.performance_schema.tables.MemorySummaryByUserByEventName
import nu.studer.sample.performance_schema.tables.MemorySummaryGlobalByEventName
import nu.studer.sample.performance_schema.tables.MetadataLocks
import nu.studer.sample.performance_schema.tables.MutexInstances
import nu.studer.sample.performance_schema.tables.ObjectsSummaryGlobalByType
import nu.studer.sample.performance_schema.tables.PerformanceTimers
import nu.studer.sample.performance_schema.tables.PreparedStatementsInstances
import nu.studer.sample.performance_schema.tables.ReplicationApplierConfiguration
import nu.studer.sample.performance_schema.tables.ReplicationApplierStatus
import nu.studer.sample.performance_schema.tables.ReplicationApplierStatusByCoordinator
import nu.studer.sample.performance_schema.tables.ReplicationApplierStatusByWorker
import nu.studer.sample.performance_schema.tables.ReplicationConnectionConfiguration
import nu.studer.sample.performance_schema.tables.ReplicationConnectionStatus
import nu.studer.sample.performance_schema.tables.ReplicationGroupMemberStats
import nu.studer.sample.performance_schema.tables.ReplicationGroupMembers
import nu.studer.sample.performance_schema.tables.RwlockInstances
import nu.studer.sample.performance_schema.tables.SessionAccountConnectAttrs
import nu.studer.sample.performance_schema.tables.SessionConnectAttrs
import nu.studer.sample.performance_schema.tables.SessionStatus
import nu.studer.sample.performance_schema.tables.SessionVariables
import nu.studer.sample.performance_schema.tables.SetupActors
import nu.studer.sample.performance_schema.tables.SetupConsumers
import nu.studer.sample.performance_schema.tables.SetupInstruments
import nu.studer.sample.performance_schema.tables.SetupObjects
import nu.studer.sample.performance_schema.tables.SetupTimers
import nu.studer.sample.performance_schema.tables.SocketInstances
import nu.studer.sample.performance_schema.tables.SocketSummaryByEventName
import nu.studer.sample.performance_schema.tables.SocketSummaryByInstance
import nu.studer.sample.performance_schema.tables.StatusByAccount
import nu.studer.sample.performance_schema.tables.StatusByHost
import nu.studer.sample.performance_schema.tables.StatusByThread
import nu.studer.sample.performance_schema.tables.StatusByUser
import nu.studer.sample.performance_schema.tables.TableHandles
import nu.studer.sample.performance_schema.tables.TableIoWaitsSummaryByIndexUsage
import nu.studer.sample.performance_schema.tables.TableIoWaitsSummaryByTable
import nu.studer.sample.performance_schema.tables.TableLockWaitsSummaryByTable
import nu.studer.sample.performance_schema.tables.Threads
import nu.studer.sample.performance_schema.tables.UserVariablesByThread
import nu.studer.sample.performance_schema.tables.Users
import nu.studer.sample.performance_schema.tables.VariablesByThread

import org.jooq.Catalog
import org.jooq.Table
import org.jooq.impl.SchemaImpl


/**
 * This class is generated by jOOQ.
 */
@Suppress("UNCHECKED_CAST")
open class PerformanceSchema : SchemaImpl("performance_schema", DefaultCatalog.DEFAULT_CATALOG) {
    companion object {

        /**
         * The reference instance of <code>performance_schema</code>
         */
        val PERFORMANCE_SCHEMA = PerformanceSchema()
    }

    /**
     * The table <code>performance_schema.accounts</code>.
     */
    val ACCOUNTS get() = Accounts.ACCOUNTS

    /**
     * The table <code>performance_schema.cond_instances</code>.
     */
    val COND_INSTANCES get() = CondInstances.COND_INSTANCES

    /**
     * The table <code>performance_schema.events_stages_current</code>.
     */
    val EVENTS_STAGES_CURRENT get() = EventsStagesCurrent.EVENTS_STAGES_CURRENT

    /**
     * The table <code>performance_schema.events_stages_history</code>.
     */
    val EVENTS_STAGES_HISTORY get() = EventsStagesHistory.EVENTS_STAGES_HISTORY

    /**
     * The table <code>performance_schema.events_stages_history_long</code>.
     */
    val EVENTS_STAGES_HISTORY_LONG get() = EventsStagesHistoryLong.EVENTS_STAGES_HISTORY_LONG

    /**
     * The table <code>performance_schema.events_stages_summary_by_account_by_event_name</code>.
     */
    val EVENTS_STAGES_SUMMARY_BY_ACCOUNT_BY_EVENT_NAME get() = EventsStagesSummaryByAccountByEventName.EVENTS_STAGES_SUMMARY_BY_ACCOUNT_BY_EVENT_NAME

    /**
     * The table <code>performance_schema.events_stages_summary_by_host_by_event_name</code>.
     */
    val EVENTS_STAGES_SUMMARY_BY_HOST_BY_EVENT_NAME get() = EventsStagesSummaryByHostByEventName.EVENTS_STAGES_SUMMARY_BY_HOST_BY_EVENT_NAME

    /**
     * The table <code>performance_schema.events_stages_summary_by_thread_by_event_name</code>.
     */
    val EVENTS_STAGES_SUMMARY_BY_THREAD_BY_EVENT_NAME get() = EventsStagesSummaryByThreadByEventName.EVENTS_STAGES_SUMMARY_BY_THREAD_BY_EVENT_NAME

    /**
     * The table <code>performance_schema.events_stages_summary_by_user_by_event_name</code>.
     */
    val EVENTS_STAGES_SUMMARY_BY_USER_BY_EVENT_NAME get() = EventsStagesSummaryByUserByEventName.EVENTS_STAGES_SUMMARY_BY_USER_BY_EVENT_NAME

    /**
     * The table <code>performance_schema.events_stages_summary_global_by_event_name</code>.
     */
    val EVENTS_STAGES_SUMMARY_GLOBAL_BY_EVENT_NAME get() = EventsStagesSummaryGlobalByEventName.EVENTS_STAGES_SUMMARY_GLOBAL_BY_EVENT_NAME

    /**
     * The table <code>performance_schema.events_statements_current</code>.
     */
    val EVENTS_STATEMENTS_CURRENT get() = EventsStatementsCurrent.EVENTS_STATEMENTS_CURRENT

    /**
     * The table <code>performance_schema.events_statements_history</code>.
     */
    val EVENTS_STATEMENTS_HISTORY get() = EventsStatementsHistory.EVENTS_STATEMENTS_HISTORY

    /**
     * The table <code>performance_schema.events_statements_history_long</code>.
     */
    val EVENTS_STATEMENTS_HISTORY_LONG get() = EventsStatementsHistoryLong.EVENTS_STATEMENTS_HISTORY_LONG

    /**
     * The table <code>performance_schema.events_statements_summary_by_account_by_event_name</code>.
     */
    val EVENTS_STATEMENTS_SUMMARY_BY_ACCOUNT_BY_EVENT_NAME get() = EventsStatementsSummaryByAccountByEventName.EVENTS_STATEMENTS_SUMMARY_BY_ACCOUNT_BY_EVENT_NAME

    /**
     * The table <code>performance_schema.events_statements_summary_by_digest</code>.
     */
    val EVENTS_STATEMENTS_SUMMARY_BY_DIGEST get() = EventsStatementsSummaryByDigest.EVENTS_STATEMENTS_SUMMARY_BY_DIGEST

    /**
     * The table <code>performance_schema.events_statements_summary_by_host_by_event_name</code>.
     */
    val EVENTS_STATEMENTS_SUMMARY_BY_HOST_BY_EVENT_NAME get() = EventsStatementsSummaryByHostByEventName.EVENTS_STATEMENTS_SUMMARY_BY_HOST_BY_EVENT_NAME

    /**
     * The table <code>performance_schema.events_statements_summary_by_program</code>.
     */
    val EVENTS_STATEMENTS_SUMMARY_BY_PROGRAM get() = EventsStatementsSummaryByProgram.EVENTS_STATEMENTS_SUMMARY_BY_PROGRAM

    /**
     * The table <code>performance_schema.events_statements_summary_by_thread_by_event_name</code>.
     */
    val EVENTS_STATEMENTS_SUMMARY_BY_THREAD_BY_EVENT_NAME get() = EventsStatementsSummaryByThreadByEventName.EVENTS_STATEMENTS_SUMMARY_BY_THREAD_BY_EVENT_NAME

    /**
     * The table <code>performance_schema.events_statements_summary_by_user_by_event_name</code>.
     */
    val EVENTS_STATEMENTS_SUMMARY_BY_USER_BY_EVENT_NAME get() = EventsStatementsSummaryByUserByEventName.EVENTS_STATEMENTS_SUMMARY_BY_USER_BY_EVENT_NAME

    /**
     * The table <code>performance_schema.events_statements_summary_global_by_event_name</code>.
     */
    val EVENTS_STATEMENTS_SUMMARY_GLOBAL_BY_EVENT_NAME get() = EventsStatementsSummaryGlobalByEventName.EVENTS_STATEMENTS_SUMMARY_GLOBAL_BY_EVENT_NAME

    /**
     * The table <code>performance_schema.events_transactions_current</code>.
     */
    val EVENTS_TRANSACTIONS_CURRENT get() = EventsTransactionsCurrent.EVENTS_TRANSACTIONS_CURRENT

    /**
     * The table <code>performance_schema.events_transactions_history</code>.
     */
    val EVENTS_TRANSACTIONS_HISTORY get() = EventsTransactionsHistory.EVENTS_TRANSACTIONS_HISTORY

    /**
     * The table <code>performance_schema.events_transactions_history_long</code>.
     */
    val EVENTS_TRANSACTIONS_HISTORY_LONG get() = EventsTransactionsHistoryLong.EVENTS_TRANSACTIONS_HISTORY_LONG

    /**
     * The table <code>performance_schema.events_transactions_summary_by_account_by_event_name</code>.
     */
    val EVENTS_TRANSACTIONS_SUMMARY_BY_ACCOUNT_BY_EVENT_NAME get() = EventsTransactionsSummaryByAccountByEventName.EVENTS_TRANSACTIONS_SUMMARY_BY_ACCOUNT_BY_EVENT_NAME

    /**
     * The table <code>performance_schema.events_transactions_summary_by_host_by_event_name</code>.
     */
    val EVENTS_TRANSACTIONS_SUMMARY_BY_HOST_BY_EVENT_NAME get() = EventsTransactionsSummaryByHostByEventName.EVENTS_TRANSACTIONS_SUMMARY_BY_HOST_BY_EVENT_NAME

    /**
     * The table <code>performance_schema.events_transactions_summary_by_thread_by_event_name</code>.
     */
    val EVENTS_TRANSACTIONS_SUMMARY_BY_THREAD_BY_EVENT_NAME get() = EventsTransactionsSummaryByThreadByEventName.EVENTS_TRANSACTIONS_SUMMARY_BY_THREAD_BY_EVENT_NAME

    /**
     * The table <code>performance_schema.events_transactions_summary_by_user_by_event_name</code>.
     */
    val EVENTS_TRANSACTIONS_SUMMARY_BY_USER_BY_EVENT_NAME get() = EventsTransactionsSummaryByUserByEventName.EVENTS_TRANSACTIONS_SUMMARY_BY_USER_BY_EVENT_NAME

    /**
     * The table <code>performance_schema.events_transactions_summary_global_by_event_name</code>.
     */
    val EVENTS_TRANSACTIONS_SUMMARY_GLOBAL_BY_EVENT_NAME get() = EventsTransactionsSummaryGlobalByEventName.EVENTS_TRANSACTIONS_SUMMARY_GLOBAL_BY_EVENT_NAME

    /**
     * The table <code>performance_schema.events_waits_current</code>.
     */
    val EVENTS_WAITS_CURRENT get() = EventsWaitsCurrent.EVENTS_WAITS_CURRENT

    /**
     * The table <code>performance_schema.events_waits_history</code>.
     */
    val EVENTS_WAITS_HISTORY get() = EventsWaitsHistory.EVENTS_WAITS_HISTORY

    /**
     * The table <code>performance_schema.events_waits_history_long</code>.
     */
    val EVENTS_WAITS_HISTORY_LONG get() = EventsWaitsHistoryLong.EVENTS_WAITS_HISTORY_LONG

    /**
     * The table <code>performance_schema.events_waits_summary_by_account_by_event_name</code>.
     */
    val EVENTS_WAITS_SUMMARY_BY_ACCOUNT_BY_EVENT_NAME get() = EventsWaitsSummaryByAccountByEventName.EVENTS_WAITS_SUMMARY_BY_ACCOUNT_BY_EVENT_NAME

    /**
     * The table <code>performance_schema.events_waits_summary_by_host_by_event_name</code>.
     */
    val EVENTS_WAITS_SUMMARY_BY_HOST_BY_EVENT_NAME get() = EventsWaitsSummaryByHostByEventName.EVENTS_WAITS_SUMMARY_BY_HOST_BY_EVENT_NAME

    /**
     * The table <code>performance_schema.events_waits_summary_by_instance</code>.
     */
    val EVENTS_WAITS_SUMMARY_BY_INSTANCE get() = EventsWaitsSummaryByInstance.EVENTS_WAITS_SUMMARY_BY_INSTANCE

    /**
     * The table <code>performance_schema.events_waits_summary_by_thread_by_event_name</code>.
     */
    val EVENTS_WAITS_SUMMARY_BY_THREAD_BY_EVENT_NAME get() = EventsWaitsSummaryByThreadByEventName.EVENTS_WAITS_SUMMARY_BY_THREAD_BY_EVENT_NAME

    /**
     * The table <code>performance_schema.events_waits_summary_by_user_by_event_name</code>.
     */
    val EVENTS_WAITS_SUMMARY_BY_USER_BY_EVENT_NAME get() = EventsWaitsSummaryByUserByEventName.EVENTS_WAITS_SUMMARY_BY_USER_BY_EVENT_NAME

    /**
     * The table <code>performance_schema.events_waits_summary_global_by_event_name</code>.
     */
    val EVENTS_WAITS_SUMMARY_GLOBAL_BY_EVENT_NAME get() = EventsWaitsSummaryGlobalByEventName.EVENTS_WAITS_SUMMARY_GLOBAL_BY_EVENT_NAME

    /**
     * The table <code>performance_schema.file_instances</code>.
     */
    val FILE_INSTANCES get() = FileInstances.FILE_INSTANCES

    /**
     * The table <code>performance_schema.file_summary_by_event_name</code>.
     */
    val FILE_SUMMARY_BY_EVENT_NAME get() = FileSummaryByEventName.FILE_SUMMARY_BY_EVENT_NAME

    /**
     * The table <code>performance_schema.file_summary_by_instance</code>.
     */
    val FILE_SUMMARY_BY_INSTANCE get() = FileSummaryByInstance.FILE_SUMMARY_BY_INSTANCE

    /**
     * The table <code>performance_schema.global_status</code>.
     */
    val GLOBAL_STATUS get() = GlobalStatus.GLOBAL_STATUS

    /**
     * The table <code>performance_schema.global_variables</code>.
     */
    val GLOBAL_VARIABLES get() = GlobalVariables.GLOBAL_VARIABLES

    /**
     * The table <code>performance_schema.host_cache</code>.
     */
    val HOST_CACHE get() = HostCache.HOST_CACHE

    /**
     * The table <code>performance_schema.hosts</code>.
     */
    val HOSTS get() = Hosts.HOSTS

    /**
     * The table <code>performance_schema.memory_summary_by_account_by_event_name</code>.
     */
    val MEMORY_SUMMARY_BY_ACCOUNT_BY_EVENT_NAME get() = MemorySummaryByAccountByEventName.MEMORY_SUMMARY_BY_ACCOUNT_BY_EVENT_NAME

    /**
     * The table <code>performance_schema.memory_summary_by_host_by_event_name</code>.
     */
    val MEMORY_SUMMARY_BY_HOST_BY_EVENT_NAME get() = MemorySummaryByHostByEventName.MEMORY_SUMMARY_BY_HOST_BY_EVENT_NAME

    /**
     * The table <code>performance_schema.memory_summary_by_thread_by_event_name</code>.
     */
    val MEMORY_SUMMARY_BY_THREAD_BY_EVENT_NAME get() = MemorySummaryByThreadByEventName.MEMORY_SUMMARY_BY_THREAD_BY_EVENT_NAME

    /**
     * The table <code>performance_schema.memory_summary_by_user_by_event_name</code>.
     */
    val MEMORY_SUMMARY_BY_USER_BY_EVENT_NAME get() = MemorySummaryByUserByEventName.MEMORY_SUMMARY_BY_USER_BY_EVENT_NAME

    /**
     * The table <code>performance_schema.memory_summary_global_by_event_name</code>.
     */
    val MEMORY_SUMMARY_GLOBAL_BY_EVENT_NAME get() = MemorySummaryGlobalByEventName.MEMORY_SUMMARY_GLOBAL_BY_EVENT_NAME

    /**
     * The table <code>performance_schema.metadata_locks</code>.
     */
    val METADATA_LOCKS get() = MetadataLocks.METADATA_LOCKS

    /**
     * The table <code>performance_schema.mutex_instances</code>.
     */
    val MUTEX_INSTANCES get() = MutexInstances.MUTEX_INSTANCES

    /**
     * The table <code>performance_schema.objects_summary_global_by_type</code>.
     */
    val OBJECTS_SUMMARY_GLOBAL_BY_TYPE get() = ObjectsSummaryGlobalByType.OBJECTS_SUMMARY_GLOBAL_BY_TYPE

    /**
     * The table <code>performance_schema.performance_timers</code>.
     */
    val PERFORMANCE_TIMERS get() = PerformanceTimers.PERFORMANCE_TIMERS

    /**
     * The table <code>performance_schema.prepared_statements_instances</code>.
     */
    val PREPARED_STATEMENTS_INSTANCES get() = PreparedStatementsInstances.PREPARED_STATEMENTS_INSTANCES

    /**
     * The table <code>performance_schema.replication_applier_configuration</code>.
     */
    val REPLICATION_APPLIER_CONFIGURATION get() = ReplicationApplierConfiguration.REPLICATION_APPLIER_CONFIGURATION

    /**
     * The table <code>performance_schema.replication_applier_status</code>.
     */
    val REPLICATION_APPLIER_STATUS get() = ReplicationApplierStatus.REPLICATION_APPLIER_STATUS

    /**
     * The table <code>performance_schema.replication_applier_status_by_coordinator</code>.
     */
    val REPLICATION_APPLIER_STATUS_BY_COORDINATOR get() = ReplicationApplierStatusByCoordinator.REPLICATION_APPLIER_STATUS_BY_COORDINATOR

    /**
     * The table <code>performance_schema.replication_applier_status_by_worker</code>.
     */
    val REPLICATION_APPLIER_STATUS_BY_WORKER get() = ReplicationApplierStatusByWorker.REPLICATION_APPLIER_STATUS_BY_WORKER

    /**
     * The table <code>performance_schema.replication_connection_configuration</code>.
     */
    val REPLICATION_CONNECTION_CONFIGURATION get() = ReplicationConnectionConfiguration.REPLICATION_CONNECTION_CONFIGURATION

    /**
     * The table <code>performance_schema.replication_connection_status</code>.
     */
    val REPLICATION_CONNECTION_STATUS get() = ReplicationConnectionStatus.REPLICATION_CONNECTION_STATUS

    /**
     * The table <code>performance_schema.replication_group_member_stats</code>.
     */
    val REPLICATION_GROUP_MEMBER_STATS get() = ReplicationGroupMemberStats.REPLICATION_GROUP_MEMBER_STATS

    /**
     * The table <code>performance_schema.replication_group_members</code>.
     */
    val REPLICATION_GROUP_MEMBERS get() = ReplicationGroupMembers.REPLICATION_GROUP_MEMBERS

    /**
     * The table <code>performance_schema.rwlock_instances</code>.
     */
    val RWLOCK_INSTANCES get() = RwlockInstances.RWLOCK_INSTANCES

    /**
     * The table <code>performance_schema.session_account_connect_attrs</code>.
     */
    val SESSION_ACCOUNT_CONNECT_ATTRS get() = SessionAccountConnectAttrs.SESSION_ACCOUNT_CONNECT_ATTRS

    /**
     * The table <code>performance_schema.session_connect_attrs</code>.
     */
    val SESSION_CONNECT_ATTRS get() = SessionConnectAttrs.SESSION_CONNECT_ATTRS

    /**
     * The table <code>performance_schema.session_status</code>.
     */
    val SESSION_STATUS get() = SessionStatus.SESSION_STATUS

    /**
     * The table <code>performance_schema.session_variables</code>.
     */
    val SESSION_VARIABLES get() = SessionVariables.SESSION_VARIABLES

    /**
     * The table <code>performance_schema.setup_actors</code>.
     */
    val SETUP_ACTORS get() = SetupActors.SETUP_ACTORS

    /**
     * The table <code>performance_schema.setup_consumers</code>.
     */
    val SETUP_CONSUMERS get() = SetupConsumers.SETUP_CONSUMERS

    /**
     * The table <code>performance_schema.setup_instruments</code>.
     */
    val SETUP_INSTRUMENTS get() = SetupInstruments.SETUP_INSTRUMENTS

    /**
     * The table <code>performance_schema.setup_objects</code>.
     */
    val SETUP_OBJECTS get() = SetupObjects.SETUP_OBJECTS

    /**
     * The table <code>performance_schema.setup_timers</code>.
     */
    val SETUP_TIMERS get() = SetupTimers.SETUP_TIMERS

    /**
     * The table <code>performance_schema.socket_instances</code>.
     */
    val SOCKET_INSTANCES get() = SocketInstances.SOCKET_INSTANCES

    /**
     * The table <code>performance_schema.socket_summary_by_event_name</code>.
     */
    val SOCKET_SUMMARY_BY_EVENT_NAME get() = SocketSummaryByEventName.SOCKET_SUMMARY_BY_EVENT_NAME

    /**
     * The table <code>performance_schema.socket_summary_by_instance</code>.
     */
    val SOCKET_SUMMARY_BY_INSTANCE get() = SocketSummaryByInstance.SOCKET_SUMMARY_BY_INSTANCE

    /**
     * The table <code>performance_schema.status_by_account</code>.
     */
    val STATUS_BY_ACCOUNT get() = StatusByAccount.STATUS_BY_ACCOUNT

    /**
     * The table <code>performance_schema.status_by_host</code>.
     */
    val STATUS_BY_HOST get() = StatusByHost.STATUS_BY_HOST

    /**
     * The table <code>performance_schema.status_by_thread</code>.
     */
    val STATUS_BY_THREAD get() = StatusByThread.STATUS_BY_THREAD

    /**
     * The table <code>performance_schema.status_by_user</code>.
     */
    val STATUS_BY_USER get() = StatusByUser.STATUS_BY_USER

    /**
     * The table <code>performance_schema.table_handles</code>.
     */
    val TABLE_HANDLES get() = TableHandles.TABLE_HANDLES

    /**
     * The table <code>performance_schema.table_io_waits_summary_by_index_usage</code>.
     */
    val TABLE_IO_WAITS_SUMMARY_BY_INDEX_USAGE get() = TableIoWaitsSummaryByIndexUsage.TABLE_IO_WAITS_SUMMARY_BY_INDEX_USAGE

    /**
     * The table <code>performance_schema.table_io_waits_summary_by_table</code>.
     */
    val TABLE_IO_WAITS_SUMMARY_BY_TABLE get() = TableIoWaitsSummaryByTable.TABLE_IO_WAITS_SUMMARY_BY_TABLE

    /**
     * The table <code>performance_schema.table_lock_waits_summary_by_table</code>.
     */
    val TABLE_LOCK_WAITS_SUMMARY_BY_TABLE get() = TableLockWaitsSummaryByTable.TABLE_LOCK_WAITS_SUMMARY_BY_TABLE

    /**
     * The table <code>performance_schema.threads</code>.
     */
    val THREADS get() = Threads.THREADS

    /**
     * The table <code>performance_schema.user_variables_by_thread</code>.
     */
    val USER_VARIABLES_BY_THREAD get() = UserVariablesByThread.USER_VARIABLES_BY_THREAD

    /**
     * The table <code>performance_schema.users</code>.
     */
    val USERS get() = Users.USERS

    /**
     * The table <code>performance_schema.variables_by_thread</code>.
     */
    val VARIABLES_BY_THREAD get() = VariablesByThread.VARIABLES_BY_THREAD

    override fun getCatalog(): Catalog = DefaultCatalog.DEFAULT_CATALOG

    override fun getTables(): List<Table<*>> = listOf(
        Accounts.ACCOUNTS,
        CondInstances.COND_INSTANCES,
        EventsStagesCurrent.EVENTS_STAGES_CURRENT,
        EventsStagesHistory.EVENTS_STAGES_HISTORY,
        EventsStagesHistoryLong.EVENTS_STAGES_HISTORY_LONG,
        EventsStagesSummaryByAccountByEventName.EVENTS_STAGES_SUMMARY_BY_ACCOUNT_BY_EVENT_NAME,
        EventsStagesSummaryByHostByEventName.EVENTS_STAGES_SUMMARY_BY_HOST_BY_EVENT_NAME,
        EventsStagesSummaryByThreadByEventName.EVENTS_STAGES_SUMMARY_BY_THREAD_BY_EVENT_NAME,
        EventsStagesSummaryByUserByEventName.EVENTS_STAGES_SUMMARY_BY_USER_BY_EVENT_NAME,
        EventsStagesSummaryGlobalByEventName.EVENTS_STAGES_SUMMARY_GLOBAL_BY_EVENT_NAME,
        EventsStatementsCurrent.EVENTS_STATEMENTS_CURRENT,
        EventsStatementsHistory.EVENTS_STATEMENTS_HISTORY,
        EventsStatementsHistoryLong.EVENTS_STATEMENTS_HISTORY_LONG,
        EventsStatementsSummaryByAccountByEventName.EVENTS_STATEMENTS_SUMMARY_BY_ACCOUNT_BY_EVENT_NAME,
        EventsStatementsSummaryByDigest.EVENTS_STATEMENTS_SUMMARY_BY_DIGEST,
        EventsStatementsSummaryByHostByEventName.EVENTS_STATEMENTS_SUMMARY_BY_HOST_BY_EVENT_NAME,
        EventsStatementsSummaryByProgram.EVENTS_STATEMENTS_SUMMARY_BY_PROGRAM,
        EventsStatementsSummaryByThreadByEventName.EVENTS_STATEMENTS_SUMMARY_BY_THREAD_BY_EVENT_NAME,
        EventsStatementsSummaryByUserByEventName.EVENTS_STATEMENTS_SUMMARY_BY_USER_BY_EVENT_NAME,
        EventsStatementsSummaryGlobalByEventName.EVENTS_STATEMENTS_SUMMARY_GLOBAL_BY_EVENT_NAME,
        EventsTransactionsCurrent.EVENTS_TRANSACTIONS_CURRENT,
        EventsTransactionsHistory.EVENTS_TRANSACTIONS_HISTORY,
        EventsTransactionsHistoryLong.EVENTS_TRANSACTIONS_HISTORY_LONG,
        EventsTransactionsSummaryByAccountByEventName.EVENTS_TRANSACTIONS_SUMMARY_BY_ACCOUNT_BY_EVENT_NAME,
        EventsTransactionsSummaryByHostByEventName.EVENTS_TRANSACTIONS_SUMMARY_BY_HOST_BY_EVENT_NAME,
        EventsTransactionsSummaryByThreadByEventName.EVENTS_TRANSACTIONS_SUMMARY_BY_THREAD_BY_EVENT_NAME,
        EventsTransactionsSummaryByUserByEventName.EVENTS_TRANSACTIONS_SUMMARY_BY_USER_BY_EVENT_NAME,
        EventsTransactionsSummaryGlobalByEventName.EVENTS_TRANSACTIONS_SUMMARY_GLOBAL_BY_EVENT_NAME,
        EventsWaitsCurrent.EVENTS_WAITS_CURRENT,
        EventsWaitsHistory.EVENTS_WAITS_HISTORY,
        EventsWaitsHistoryLong.EVENTS_WAITS_HISTORY_LONG,
        EventsWaitsSummaryByAccountByEventName.EVENTS_WAITS_SUMMARY_BY_ACCOUNT_BY_EVENT_NAME,
        EventsWaitsSummaryByHostByEventName.EVENTS_WAITS_SUMMARY_BY_HOST_BY_EVENT_NAME,
        EventsWaitsSummaryByInstance.EVENTS_WAITS_SUMMARY_BY_INSTANCE,
        EventsWaitsSummaryByThreadByEventName.EVENTS_WAITS_SUMMARY_BY_THREAD_BY_EVENT_NAME,
        EventsWaitsSummaryByUserByEventName.EVENTS_WAITS_SUMMARY_BY_USER_BY_EVENT_NAME,
        EventsWaitsSummaryGlobalByEventName.EVENTS_WAITS_SUMMARY_GLOBAL_BY_EVENT_NAME,
        FileInstances.FILE_INSTANCES,
        FileSummaryByEventName.FILE_SUMMARY_BY_EVENT_NAME,
        FileSummaryByInstance.FILE_SUMMARY_BY_INSTANCE,
        GlobalStatus.GLOBAL_STATUS,
        GlobalVariables.GLOBAL_VARIABLES,
        HostCache.HOST_CACHE,
        Hosts.HOSTS,
        MemorySummaryByAccountByEventName.MEMORY_SUMMARY_BY_ACCOUNT_BY_EVENT_NAME,
        MemorySummaryByHostByEventName.MEMORY_SUMMARY_BY_HOST_BY_EVENT_NAME,
        MemorySummaryByThreadByEventName.MEMORY_SUMMARY_BY_THREAD_BY_EVENT_NAME,
        MemorySummaryByUserByEventName.MEMORY_SUMMARY_BY_USER_BY_EVENT_NAME,
        MemorySummaryGlobalByEventName.MEMORY_SUMMARY_GLOBAL_BY_EVENT_NAME,
        MetadataLocks.METADATA_LOCKS,
        MutexInstances.MUTEX_INSTANCES,
        ObjectsSummaryGlobalByType.OBJECTS_SUMMARY_GLOBAL_BY_TYPE,
        PerformanceTimers.PERFORMANCE_TIMERS,
        PreparedStatementsInstances.PREPARED_STATEMENTS_INSTANCES,
        ReplicationApplierConfiguration.REPLICATION_APPLIER_CONFIGURATION,
        ReplicationApplierStatus.REPLICATION_APPLIER_STATUS,
        ReplicationApplierStatusByCoordinator.REPLICATION_APPLIER_STATUS_BY_COORDINATOR,
        ReplicationApplierStatusByWorker.REPLICATION_APPLIER_STATUS_BY_WORKER,
        ReplicationConnectionConfiguration.REPLICATION_CONNECTION_CONFIGURATION,
        ReplicationConnectionStatus.REPLICATION_CONNECTION_STATUS,
        ReplicationGroupMemberStats.REPLICATION_GROUP_MEMBER_STATS,
        ReplicationGroupMembers.REPLICATION_GROUP_MEMBERS,
        RwlockInstances.RWLOCK_INSTANCES,
        SessionAccountConnectAttrs.SESSION_ACCOUNT_CONNECT_ATTRS,
        SessionConnectAttrs.SESSION_CONNECT_ATTRS,
        SessionStatus.SESSION_STATUS,
        SessionVariables.SESSION_VARIABLES,
        SetupActors.SETUP_ACTORS,
        SetupConsumers.SETUP_CONSUMERS,
        SetupInstruments.SETUP_INSTRUMENTS,
        SetupObjects.SETUP_OBJECTS,
        SetupTimers.SETUP_TIMERS,
        SocketInstances.SOCKET_INSTANCES,
        SocketSummaryByEventName.SOCKET_SUMMARY_BY_EVENT_NAME,
        SocketSummaryByInstance.SOCKET_SUMMARY_BY_INSTANCE,
        StatusByAccount.STATUS_BY_ACCOUNT,
        StatusByHost.STATUS_BY_HOST,
        StatusByThread.STATUS_BY_THREAD,
        StatusByUser.STATUS_BY_USER,
        TableHandles.TABLE_HANDLES,
        TableIoWaitsSummaryByIndexUsage.TABLE_IO_WAITS_SUMMARY_BY_INDEX_USAGE,
        TableIoWaitsSummaryByTable.TABLE_IO_WAITS_SUMMARY_BY_TABLE,
        TableLockWaitsSummaryByTable.TABLE_LOCK_WAITS_SUMMARY_BY_TABLE,
        Threads.THREADS,
        UserVariablesByThread.USER_VARIABLES_BY_THREAD,
        Users.USERS,
        VariablesByThread.VARIABLES_BY_THREAD
    )
}
