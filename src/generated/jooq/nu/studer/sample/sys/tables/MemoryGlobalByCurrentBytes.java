/*
 * This file is generated by jOOQ.
 */
package nu.studer.sample.sys.tables;


import nu.studer.sample.sys.Sys;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.TableOptions;
import org.jooq.impl.DSL;
import org.jooq.impl.SQLDataType;
import org.jooq.impl.TableImpl;


/**
 * VIEW
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class MemoryGlobalByCurrentBytes extends TableImpl<Record> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>sys.memory_global_by_current_bytes</code>
     */
    public static final MemoryGlobalByCurrentBytes MEMORY_GLOBAL_BY_CURRENT_BYTES = new MemoryGlobalByCurrentBytes();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<Record> getRecordType() {
        return Record.class;
    }

    /**
     * The column <code>sys.memory_global_by_current_bytes.event_name</code>.
     */
    public final TableField<Record, String> EVENT_NAME = createField(DSL.name("event_name"), SQLDataType.VARCHAR(128).nullable(false), this, "");

    /**
     * The column <code>sys.memory_global_by_current_bytes.current_count</code>.
     */
    public final TableField<Record, Long> CURRENT_COUNT = createField(DSL.name("current_count"), SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>sys.memory_global_by_current_bytes.current_alloc</code>.
     */
    public final TableField<Record, String> CURRENT_ALLOC = createField(DSL.name("current_alloc"), SQLDataType.CLOB, this, "");

    /**
     * The column <code>sys.memory_global_by_current_bytes.current_avg_alloc</code>.
     */
    public final TableField<Record, String> CURRENT_AVG_ALLOC = createField(DSL.name("current_avg_alloc"), SQLDataType.CLOB, this, "");

    /**
     * The column <code>sys.memory_global_by_current_bytes.high_count</code>.
     */
    public final TableField<Record, Long> HIGH_COUNT = createField(DSL.name("high_count"), SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>sys.memory_global_by_current_bytes.high_alloc</code>.
     */
    public final TableField<Record, String> HIGH_ALLOC = createField(DSL.name("high_alloc"), SQLDataType.CLOB, this, "");

    /**
     * The column <code>sys.memory_global_by_current_bytes.high_avg_alloc</code>.
     */
    public final TableField<Record, String> HIGH_AVG_ALLOC = createField(DSL.name("high_avg_alloc"), SQLDataType.CLOB, this, "");

    private MemoryGlobalByCurrentBytes(Name alias, Table<Record> aliased) {
        this(alias, aliased, null);
    }

    private MemoryGlobalByCurrentBytes(Name alias, Table<Record> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment("VIEW"), TableOptions.view("create view `memory_global_by_current_bytes` as select `performance_schema`.`memory_summary_global_by_event_name`.`EVENT_NAME` AS `event_name`,`performance_schema`.`memory_summary_global_by_event_name`.`CURRENT_COUNT_USED` AS `current_count`,`sys`.`format_bytes`(`performance_schema`.`memory_summary_global_by_event_name`.`CURRENT_NUMBER_OF_BYTES_USED`) AS `current_alloc`,`sys`.`format_bytes`(ifnull((`performance_schema`.`memory_summary_global_by_event_name`.`CURRENT_NUMBER_OF_BYTES_USED` / nullif(`performance_schema`.`memory_summary_global_by_event_name`.`CURRENT_COUNT_USED`,0)),0)) AS `current_avg_alloc`,`performance_schema`.`memory_summary_global_by_event_name`.`HIGH_COUNT_USED` AS `high_count`,`sys`.`format_bytes`(`performance_schema`.`memory_summary_global_by_event_name`.`HIGH_NUMBER_OF_BYTES_USED`) AS `high_alloc`,`sys`.`format_bytes`(ifnull((`performance_schema`.`memory_summary_global_by_event_name`.`HIGH_NUMBER_OF_BYTES_USED` / nullif(`performance_schema`.`memory_summary_global_by_event_name`.`HIGH_COUNT_USED`,0)),0)) AS `high_avg_alloc` from `performance_schema`.`memory_summary_global_by_event_name` where (`performance_schema`.`memory_summary_global_by_event_name`.`CURRENT_NUMBER_OF_BYTES_USED` > 0) order by `performance_schema`.`memory_summary_global_by_event_name`.`CURRENT_NUMBER_OF_BYTES_USED` desc"));
    }

    /**
     * Create an aliased <code>sys.memory_global_by_current_bytes</code> table reference
     */
    public MemoryGlobalByCurrentBytes(String alias) {
        this(DSL.name(alias), MEMORY_GLOBAL_BY_CURRENT_BYTES);
    }

    /**
     * Create an aliased <code>sys.memory_global_by_current_bytes</code> table reference
     */
    public MemoryGlobalByCurrentBytes(Name alias) {
        this(alias, MEMORY_GLOBAL_BY_CURRENT_BYTES);
    }

    /**
     * Create a <code>sys.memory_global_by_current_bytes</code> table reference
     */
    public MemoryGlobalByCurrentBytes() {
        this(DSL.name("memory_global_by_current_bytes"), null);
    }

    public <O extends Record> MemoryGlobalByCurrentBytes(Table<O> child, ForeignKey<O, Record> key) {
        super(child, key, MEMORY_GLOBAL_BY_CURRENT_BYTES);
    }

    @Override
    public Schema getSchema() {
        return Sys.SYS;
    }

    @Override
    public MemoryGlobalByCurrentBytes as(String alias) {
        return new MemoryGlobalByCurrentBytes(DSL.name(alias), this);
    }

    @Override
    public MemoryGlobalByCurrentBytes as(Name alias) {
        return new MemoryGlobalByCurrentBytes(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public MemoryGlobalByCurrentBytes rename(String name) {
        return new MemoryGlobalByCurrentBytes(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public MemoryGlobalByCurrentBytes rename(Name name) {
        return new MemoryGlobalByCurrentBytes(name, null);
    }
}