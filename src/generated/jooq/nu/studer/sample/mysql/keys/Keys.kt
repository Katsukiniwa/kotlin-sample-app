/*
 * This file is generated by jOOQ.
 */
package nu.studer.sample.mysql.keys


import nu.studer.sample.mysql.tables.ColumnsPriv
import nu.studer.sample.mysql.tables.Db
import nu.studer.sample.mysql.tables.EngineCost
import nu.studer.sample.mysql.tables.Event
import nu.studer.sample.mysql.tables.Func
import nu.studer.sample.mysql.tables.GtidExecuted
import nu.studer.sample.mysql.tables.HelpCategory
import nu.studer.sample.mysql.tables.HelpKeyword
import nu.studer.sample.mysql.tables.HelpRelation
import nu.studer.sample.mysql.tables.HelpTopic
import nu.studer.sample.mysql.tables.InnodbIndexStats
import nu.studer.sample.mysql.tables.InnodbTableStats
import nu.studer.sample.mysql.tables.NdbBinlogIndex
import nu.studer.sample.mysql.tables.Plugin
import nu.studer.sample.mysql.tables.Proc
import nu.studer.sample.mysql.tables.ProcsPriv
import nu.studer.sample.mysql.tables.ProxiesPriv
import nu.studer.sample.mysql.tables.ServerCost
import nu.studer.sample.mysql.tables.Servers
import nu.studer.sample.mysql.tables.SlaveMasterInfo
import nu.studer.sample.mysql.tables.SlaveRelayLogInfo
import nu.studer.sample.mysql.tables.SlaveWorkerInfo
import nu.studer.sample.mysql.tables.TablesPriv
import nu.studer.sample.mysql.tables.TimeZone
import nu.studer.sample.mysql.tables.TimeZoneLeapSecond
import nu.studer.sample.mysql.tables.TimeZoneName
import nu.studer.sample.mysql.tables.TimeZoneTransition
import nu.studer.sample.mysql.tables.TimeZoneTransitionType
import nu.studer.sample.mysql.tables.User

import org.jooq.Record
import org.jooq.UniqueKey
import org.jooq.impl.DSL
import org.jooq.impl.Internal



// -------------------------------------------------------------------------
// UNIQUE and PRIMARY KEY definitions
// -------------------------------------------------------------------------

val KEY_COLUMNS_PRIV_PRIMARY: UniqueKey<Record> = Internal.createUniqueKey(ColumnsPriv.COLUMNS_PRIV, DSL.name("KEY_columns_priv_PRIMARY"), arrayOf(ColumnsPriv.COLUMNS_PRIV.HOST, ColumnsPriv.COLUMNS_PRIV.DB, ColumnsPriv.COLUMNS_PRIV.USER, ColumnsPriv.COLUMNS_PRIV.TABLE_NAME, ColumnsPriv.COLUMNS_PRIV.COLUMN_NAME), true)
val KEY_DB_PRIMARY: UniqueKey<Record> = Internal.createUniqueKey(Db.DB, DSL.name("KEY_db_PRIMARY"), arrayOf(Db.DB.HOST, Db.DB.DB_, Db.DB.USER), true)
val KEY_ENGINE_COST_PRIMARY: UniqueKey<Record> = Internal.createUniqueKey(EngineCost.ENGINE_COST, DSL.name("KEY_engine_cost_PRIMARY"), arrayOf(EngineCost.ENGINE_COST.COST_NAME, EngineCost.ENGINE_COST.ENGINE_NAME, EngineCost.ENGINE_COST.DEVICE_TYPE), true)
val KEY_EVENT_PRIMARY: UniqueKey<Record> = Internal.createUniqueKey(Event.EVENT, DSL.name("KEY_event_PRIMARY"), arrayOf(Event.EVENT.DB, Event.EVENT.NAME), true)
val KEY_FUNC_PRIMARY: UniqueKey<Record> = Internal.createUniqueKey(Func.FUNC, DSL.name("KEY_func_PRIMARY"), arrayOf(Func.FUNC.NAME), true)
val KEY_GTID_EXECUTED_PRIMARY: UniqueKey<Record> = Internal.createUniqueKey(GtidExecuted.GTID_EXECUTED, DSL.name("KEY_gtid_executed_PRIMARY"), arrayOf(GtidExecuted.GTID_EXECUTED.SOURCE_UUID, GtidExecuted.GTID_EXECUTED.INTERVAL_START), true)
val KEY_HELP_CATEGORY_NAME: UniqueKey<Record> = Internal.createUniqueKey(HelpCategory.HELP_CATEGORY, DSL.name("KEY_help_category_name"), arrayOf(HelpCategory.HELP_CATEGORY.NAME), true)
val KEY_HELP_CATEGORY_PRIMARY: UniqueKey<Record> = Internal.createUniqueKey(HelpCategory.HELP_CATEGORY, DSL.name("KEY_help_category_PRIMARY"), arrayOf(HelpCategory.HELP_CATEGORY.HELP_CATEGORY_ID), true)
val KEY_HELP_KEYWORD_NAME: UniqueKey<Record> = Internal.createUniqueKey(HelpKeyword.HELP_KEYWORD, DSL.name("KEY_help_keyword_name"), arrayOf(HelpKeyword.HELP_KEYWORD.NAME), true)
val KEY_HELP_KEYWORD_PRIMARY: UniqueKey<Record> = Internal.createUniqueKey(HelpKeyword.HELP_KEYWORD, DSL.name("KEY_help_keyword_PRIMARY"), arrayOf(HelpKeyword.HELP_KEYWORD.HELP_KEYWORD_ID), true)
val KEY_HELP_RELATION_PRIMARY: UniqueKey<Record> = Internal.createUniqueKey(HelpRelation.HELP_RELATION, DSL.name("KEY_help_relation_PRIMARY"), arrayOf(HelpRelation.HELP_RELATION.HELP_KEYWORD_ID, HelpRelation.HELP_RELATION.HELP_TOPIC_ID), true)
val KEY_HELP_TOPIC_NAME: UniqueKey<Record> = Internal.createUniqueKey(HelpTopic.HELP_TOPIC, DSL.name("KEY_help_topic_name"), arrayOf(HelpTopic.HELP_TOPIC.NAME), true)
val KEY_HELP_TOPIC_PRIMARY: UniqueKey<Record> = Internal.createUniqueKey(HelpTopic.HELP_TOPIC, DSL.name("KEY_help_topic_PRIMARY"), arrayOf(HelpTopic.HELP_TOPIC.HELP_TOPIC_ID), true)
val KEY_INNODB_INDEX_STATS_PRIMARY: UniqueKey<Record> = Internal.createUniqueKey(InnodbIndexStats.INNODB_INDEX_STATS, DSL.name("KEY_innodb_index_stats_PRIMARY"), arrayOf(InnodbIndexStats.INNODB_INDEX_STATS.DATABASE_NAME, InnodbIndexStats.INNODB_INDEX_STATS.TABLE_NAME, InnodbIndexStats.INNODB_INDEX_STATS.INDEX_NAME, InnodbIndexStats.INNODB_INDEX_STATS.STAT_NAME), true)
val KEY_INNODB_TABLE_STATS_PRIMARY: UniqueKey<Record> = Internal.createUniqueKey(InnodbTableStats.INNODB_TABLE_STATS, DSL.name("KEY_innodb_table_stats_PRIMARY"), arrayOf(InnodbTableStats.INNODB_TABLE_STATS.DATABASE_NAME, InnodbTableStats.INNODB_TABLE_STATS.TABLE_NAME), true)
val KEY_NDB_BINLOG_INDEX_PRIMARY: UniqueKey<Record> = Internal.createUniqueKey(NdbBinlogIndex.NDB_BINLOG_INDEX, DSL.name("KEY_ndb_binlog_index_PRIMARY"), arrayOf(NdbBinlogIndex.NDB_BINLOG_INDEX.EPOCH, NdbBinlogIndex.NDB_BINLOG_INDEX.ORIG_SERVER_ID, NdbBinlogIndex.NDB_BINLOG_INDEX.ORIG_EPOCH), true)
val KEY_PLUGIN_PRIMARY: UniqueKey<Record> = Internal.createUniqueKey(Plugin.PLUGIN, DSL.name("KEY_plugin_PRIMARY"), arrayOf(Plugin.PLUGIN.NAME), true)
val KEY_PROC_PRIMARY: UniqueKey<Record> = Internal.createUniqueKey(Proc.PROC, DSL.name("KEY_proc_PRIMARY"), arrayOf(Proc.PROC.DB, Proc.PROC.NAME, Proc.PROC.TYPE), true)
val KEY_PROCS_PRIV_PRIMARY: UniqueKey<Record> = Internal.createUniqueKey(ProcsPriv.PROCS_PRIV, DSL.name("KEY_procs_priv_PRIMARY"), arrayOf(ProcsPriv.PROCS_PRIV.HOST, ProcsPriv.PROCS_PRIV.DB, ProcsPriv.PROCS_PRIV.USER, ProcsPriv.PROCS_PRIV.ROUTINE_NAME, ProcsPriv.PROCS_PRIV.ROUTINE_TYPE), true)
val KEY_PROXIES_PRIV_PRIMARY: UniqueKey<Record> = Internal.createUniqueKey(ProxiesPriv.PROXIES_PRIV, DSL.name("KEY_proxies_priv_PRIMARY"), arrayOf(ProxiesPriv.PROXIES_PRIV.HOST, ProxiesPriv.PROXIES_PRIV.USER, ProxiesPriv.PROXIES_PRIV.PROXIED_HOST, ProxiesPriv.PROXIES_PRIV.PROXIED_USER), true)
val KEY_SERVER_COST_PRIMARY: UniqueKey<Record> = Internal.createUniqueKey(ServerCost.SERVER_COST, DSL.name("KEY_server_cost_PRIMARY"), arrayOf(ServerCost.SERVER_COST.COST_NAME), true)
val KEY_SERVERS_PRIMARY: UniqueKey<Record> = Internal.createUniqueKey(Servers.SERVERS, DSL.name("KEY_servers_PRIMARY"), arrayOf(Servers.SERVERS.SERVER_NAME), true)
val KEY_SLAVE_MASTER_INFO_PRIMARY: UniqueKey<Record> = Internal.createUniqueKey(SlaveMasterInfo.SLAVE_MASTER_INFO, DSL.name("KEY_slave_master_info_PRIMARY"), arrayOf(SlaveMasterInfo.SLAVE_MASTER_INFO.CHANNEL_NAME), true)
val KEY_SLAVE_RELAY_LOG_INFO_PRIMARY: UniqueKey<Record> = Internal.createUniqueKey(SlaveRelayLogInfo.SLAVE_RELAY_LOG_INFO, DSL.name("KEY_slave_relay_log_info_PRIMARY"), arrayOf(SlaveRelayLogInfo.SLAVE_RELAY_LOG_INFO.CHANNEL_NAME), true)
val KEY_SLAVE_WORKER_INFO_PRIMARY: UniqueKey<Record> = Internal.createUniqueKey(SlaveWorkerInfo.SLAVE_WORKER_INFO, DSL.name("KEY_slave_worker_info_PRIMARY"), arrayOf(SlaveWorkerInfo.SLAVE_WORKER_INFO.CHANNEL_NAME, SlaveWorkerInfo.SLAVE_WORKER_INFO.ID), true)
val KEY_TABLES_PRIV_PRIMARY: UniqueKey<Record> = Internal.createUniqueKey(TablesPriv.TABLES_PRIV, DSL.name("KEY_tables_priv_PRIMARY"), arrayOf(TablesPriv.TABLES_PRIV.HOST, TablesPriv.TABLES_PRIV.DB, TablesPriv.TABLES_PRIV.USER, TablesPriv.TABLES_PRIV.TABLE_NAME), true)
val KEY_TIME_ZONE_PRIMARY: UniqueKey<Record> = Internal.createUniqueKey(TimeZone.TIME_ZONE, DSL.name("KEY_time_zone_PRIMARY"), arrayOf(TimeZone.TIME_ZONE.TIME_ZONE_ID), true)
val KEY_TIME_ZONE_LEAP_SECOND_PRIMARY: UniqueKey<Record> = Internal.createUniqueKey(TimeZoneLeapSecond.TIME_ZONE_LEAP_SECOND, DSL.name("KEY_time_zone_leap_second_PRIMARY"), arrayOf(TimeZoneLeapSecond.TIME_ZONE_LEAP_SECOND.TRANSITION_TIME), true)
val KEY_TIME_ZONE_NAME_PRIMARY: UniqueKey<Record> = Internal.createUniqueKey(TimeZoneName.TIME_ZONE_NAME, DSL.name("KEY_time_zone_name_PRIMARY"), arrayOf(TimeZoneName.TIME_ZONE_NAME.NAME), true)
val KEY_TIME_ZONE_TRANSITION_PRIMARY: UniqueKey<Record> = Internal.createUniqueKey(TimeZoneTransition.TIME_ZONE_TRANSITION, DSL.name("KEY_time_zone_transition_PRIMARY"), arrayOf(TimeZoneTransition.TIME_ZONE_TRANSITION.TIME_ZONE_ID, TimeZoneTransition.TIME_ZONE_TRANSITION.TRANSITION_TIME), true)
val KEY_TIME_ZONE_TRANSITION_TYPE_PRIMARY: UniqueKey<Record> = Internal.createUniqueKey(TimeZoneTransitionType.TIME_ZONE_TRANSITION_TYPE, DSL.name("KEY_time_zone_transition_type_PRIMARY"), arrayOf(TimeZoneTransitionType.TIME_ZONE_TRANSITION_TYPE.TIME_ZONE_ID, TimeZoneTransitionType.TIME_ZONE_TRANSITION_TYPE.TRANSITION_TYPE_ID), true)
val KEY_USER_PRIMARY: UniqueKey<Record> = Internal.createUniqueKey(User.USER, DSL.name("KEY_user_PRIMARY"), arrayOf(User.USER.HOST, User.USER.USER_), true)