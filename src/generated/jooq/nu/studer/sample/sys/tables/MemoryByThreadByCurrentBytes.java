/*
 * This file is generated by jOOQ.
 */
package nu.studer.sample.sys.tables;


import java.math.BigInteger;

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
import org.jooq.types.ULong;


/**
 * VIEW
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class MemoryByThreadByCurrentBytes extends TableImpl<Record> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>sys.memory_by_thread_by_current_bytes</code>
     */
    public static final MemoryByThreadByCurrentBytes MEMORY_BY_THREAD_BY_CURRENT_BYTES = new MemoryByThreadByCurrentBytes();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<Record> getRecordType() {
        return Record.class;
    }

    /**
     * The column <code>sys.memory_by_thread_by_current_bytes.thread_id</code>.
     */
    public final TableField<Record, ULong> THREAD_ID = createField(DSL.name("thread_id"), SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>sys.memory_by_thread_by_current_bytes.user</code>.
     */
    public final TableField<Record, String> USER = createField(DSL.name("user"), SQLDataType.VARCHAR(128), this, "");

    /**
     * The column <code>sys.memory_by_thread_by_current_bytes.current_count_used</code>.
     */
    public final TableField<Record, BigInteger> CURRENT_COUNT_USED = createField(DSL.name("current_count_used"), SQLDataType.DECIMAL_INTEGER(41), this, "");

    /**
     * The column <code>sys.memory_by_thread_by_current_bytes.current_allocated</code>.
     */
    public final TableField<Record, String> CURRENT_ALLOCATED = createField(DSL.name("current_allocated"), SQLDataType.CLOB, this, "");

    /**
     * The column <code>sys.memory_by_thread_by_current_bytes.current_avg_alloc</code>.
     */
    public final TableField<Record, String> CURRENT_AVG_ALLOC = createField(DSL.name("current_avg_alloc"), SQLDataType.CLOB, this, "");

    /**
     * The column <code>sys.memory_by_thread_by_current_bytes.current_max_alloc</code>.
     */
    public final TableField<Record, String> CURRENT_MAX_ALLOC = createField(DSL.name("current_max_alloc"), SQLDataType.CLOB, this, "");

    /**
     * The column <code>sys.memory_by_thread_by_current_bytes.total_allocated</code>.
     */
    public final TableField<Record, String> TOTAL_ALLOCATED = createField(DSL.name("total_allocated"), SQLDataType.CLOB, this, "");

    private MemoryByThreadByCurrentBytes(Name alias, Table<Record> aliased) {
        this(alias, aliased, null);
    }

    private MemoryByThreadByCurrentBytes(Name alias, Table<Record> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment("VIEW"), TableOptions.view("create view `memory_by_thread_by_current_bytes` as select `mt`.`THREAD_ID` AS `thread_id`,if((`t`.`NAME` = 'thread/sql/one_connection'),concat(`t`.`PROCESSLIST_USER`,'@',`t`.`PROCESSLIST_HOST`),replace(`t`.`NAME`,'thread/','')) AS `user`,sum(`mt`.`CURRENT_COUNT_USED`) AS `current_count_used`,`sys`.`format_bytes`(sum(`mt`.`CURRENT_NUMBER_OF_BYTES_USED`)) AS `current_allocated`,`sys`.`format_bytes`(ifnull((sum(`mt`.`CURRENT_NUMBER_OF_BYTES_USED`) / nullif(sum(`mt`.`CURRENT_COUNT_USED`),0)),0)) AS `current_avg_alloc`,`sys`.`format_bytes`(max(`mt`.`CURRENT_NUMBER_OF_BYTES_USED`)) AS `current_max_alloc`,`sys`.`format_bytes`(sum(`mt`.`SUM_NUMBER_OF_BYTES_ALLOC`)) AS `total_allocated` from (`performance_schema`.`memory_summary_by_thread_by_event_name` `mt` join `performance_schema`.`threads` `t` on((`mt`.`THREAD_ID` = `t`.`THREAD_ID`))) group by `mt`.`THREAD_ID`,if((`t`.`NAME` = 'thread/sql/one_connection'),concat(`t`.`PROCESSLIST_USER`,'@',`t`.`PROCESSLIST_HOST`),replace(`t`.`NAME`,'thread/','')) order by sum(`mt`.`CURRENT_NUMBER_OF_BYTES_USED`) desc"));
    }

    /**
     * Create an aliased <code>sys.memory_by_thread_by_current_bytes</code> table reference
     */
    public MemoryByThreadByCurrentBytes(String alias) {
        this(DSL.name(alias), MEMORY_BY_THREAD_BY_CURRENT_BYTES);
    }

    /**
     * Create an aliased <code>sys.memory_by_thread_by_current_bytes</code> table reference
     */
    public MemoryByThreadByCurrentBytes(Name alias) {
        this(alias, MEMORY_BY_THREAD_BY_CURRENT_BYTES);
    }

    /**
     * Create a <code>sys.memory_by_thread_by_current_bytes</code> table reference
     */
    public MemoryByThreadByCurrentBytes() {
        this(DSL.name("memory_by_thread_by_current_bytes"), null);
    }

    public <O extends Record> MemoryByThreadByCurrentBytes(Table<O> child, ForeignKey<O, Record> key) {
        super(child, key, MEMORY_BY_THREAD_BY_CURRENT_BYTES);
    }

    @Override
    public Schema getSchema() {
        return Sys.SYS;
    }

    @Override
    public MemoryByThreadByCurrentBytes as(String alias) {
        return new MemoryByThreadByCurrentBytes(DSL.name(alias), this);
    }

    @Override
    public MemoryByThreadByCurrentBytes as(Name alias) {
        return new MemoryByThreadByCurrentBytes(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public MemoryByThreadByCurrentBytes rename(String name) {
        return new MemoryByThreadByCurrentBytes(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public MemoryByThreadByCurrentBytes rename(Name name) {
        return new MemoryByThreadByCurrentBytes(name, null);
    }
}
