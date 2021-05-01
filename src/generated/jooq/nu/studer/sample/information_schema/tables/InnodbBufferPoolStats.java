/*
 * This file is generated by jOOQ.
 */
package nu.studer.sample.information_schema.tables;


import nu.studer.sample.information_schema.InformationSchema;

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
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class InnodbBufferPoolStats extends TableImpl<Record> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>information_schema.INNODB_BUFFER_POOL_STATS</code>
     */
    public static final InnodbBufferPoolStats INNODB_BUFFER_POOL_STATS = new InnodbBufferPoolStats();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<Record> getRecordType() {
        return Record.class;
    }

    /**
     * The column <code>information_schema.INNODB_BUFFER_POOL_STATS.POOL_ID</code>.
     */
    public final TableField<Record, ULong> POOL_ID = createField(DSL.name("POOL_ID"), SQLDataType.BIGINTUNSIGNED.nullable(false).defaultValue(DSL.inline("0", SQLDataType.BIGINTUNSIGNED)), this, "");

    /**
     * The column <code>information_schema.INNODB_BUFFER_POOL_STATS.POOL_SIZE</code>.
     */
    public final TableField<Record, ULong> POOL_SIZE = createField(DSL.name("POOL_SIZE"), SQLDataType.BIGINTUNSIGNED.nullable(false).defaultValue(DSL.inline("0", SQLDataType.BIGINTUNSIGNED)), this, "");

    /**
     * The column <code>information_schema.INNODB_BUFFER_POOL_STATS.FREE_BUFFERS</code>.
     */
    public final TableField<Record, ULong> FREE_BUFFERS = createField(DSL.name("FREE_BUFFERS"), SQLDataType.BIGINTUNSIGNED.nullable(false).defaultValue(DSL.inline("0", SQLDataType.BIGINTUNSIGNED)), this, "");

    /**
     * The column <code>information_schema.INNODB_BUFFER_POOL_STATS.DATABASE_PAGES</code>.
     */
    public final TableField<Record, ULong> DATABASE_PAGES = createField(DSL.name("DATABASE_PAGES"), SQLDataType.BIGINTUNSIGNED.nullable(false).defaultValue(DSL.inline("0", SQLDataType.BIGINTUNSIGNED)), this, "");

    /**
     * The column <code>information_schema.INNODB_BUFFER_POOL_STATS.OLD_DATABASE_PAGES</code>.
     */
    public final TableField<Record, ULong> OLD_DATABASE_PAGES = createField(DSL.name("OLD_DATABASE_PAGES"), SQLDataType.BIGINTUNSIGNED.nullable(false).defaultValue(DSL.inline("0", SQLDataType.BIGINTUNSIGNED)), this, "");

    /**
     * The column <code>information_schema.INNODB_BUFFER_POOL_STATS.MODIFIED_DATABASE_PAGES</code>.
     */
    public final TableField<Record, ULong> MODIFIED_DATABASE_PAGES = createField(DSL.name("MODIFIED_DATABASE_PAGES"), SQLDataType.BIGINTUNSIGNED.nullable(false).defaultValue(DSL.inline("0", SQLDataType.BIGINTUNSIGNED)), this, "");

    /**
     * The column <code>information_schema.INNODB_BUFFER_POOL_STATS.PENDING_DECOMPRESS</code>.
     */
    public final TableField<Record, ULong> PENDING_DECOMPRESS = createField(DSL.name("PENDING_DECOMPRESS"), SQLDataType.BIGINTUNSIGNED.nullable(false).defaultValue(DSL.inline("0", SQLDataType.BIGINTUNSIGNED)), this, "");

    /**
     * The column <code>information_schema.INNODB_BUFFER_POOL_STATS.PENDING_READS</code>.
     */
    public final TableField<Record, ULong> PENDING_READS = createField(DSL.name("PENDING_READS"), SQLDataType.BIGINTUNSIGNED.nullable(false).defaultValue(DSL.inline("0", SQLDataType.BIGINTUNSIGNED)), this, "");

    /**
     * The column <code>information_schema.INNODB_BUFFER_POOL_STATS.PENDING_FLUSH_LRU</code>.
     */
    public final TableField<Record, ULong> PENDING_FLUSH_LRU = createField(DSL.name("PENDING_FLUSH_LRU"), SQLDataType.BIGINTUNSIGNED.nullable(false).defaultValue(DSL.inline("0", SQLDataType.BIGINTUNSIGNED)), this, "");

    /**
     * The column <code>information_schema.INNODB_BUFFER_POOL_STATS.PENDING_FLUSH_LIST</code>.
     */
    public final TableField<Record, ULong> PENDING_FLUSH_LIST = createField(DSL.name("PENDING_FLUSH_LIST"), SQLDataType.BIGINTUNSIGNED.nullable(false).defaultValue(DSL.inline("0", SQLDataType.BIGINTUNSIGNED)), this, "");

    /**
     * The column <code>information_schema.INNODB_BUFFER_POOL_STATS.PAGES_MADE_YOUNG</code>.
     */
    public final TableField<Record, ULong> PAGES_MADE_YOUNG = createField(DSL.name("PAGES_MADE_YOUNG"), SQLDataType.BIGINTUNSIGNED.nullable(false).defaultValue(DSL.inline("0", SQLDataType.BIGINTUNSIGNED)), this, "");

    /**
     * The column <code>information_schema.INNODB_BUFFER_POOL_STATS.PAGES_NOT_MADE_YOUNG</code>.
     */
    public final TableField<Record, ULong> PAGES_NOT_MADE_YOUNG = createField(DSL.name("PAGES_NOT_MADE_YOUNG"), SQLDataType.BIGINTUNSIGNED.nullable(false).defaultValue(DSL.inline("0", SQLDataType.BIGINTUNSIGNED)), this, "");

    /**
     * The column <code>information_schema.INNODB_BUFFER_POOL_STATS.PAGES_MADE_YOUNG_RATE</code>.
     */
    public final TableField<Record, Double> PAGES_MADE_YOUNG_RATE = createField(DSL.name("PAGES_MADE_YOUNG_RATE"), SQLDataType.DOUBLE.nullable(false).defaultValue(DSL.inline("0", SQLDataType.DOUBLE)), this, "");

    /**
     * The column <code>information_schema.INNODB_BUFFER_POOL_STATS.PAGES_MADE_NOT_YOUNG_RATE</code>.
     */
    public final TableField<Record, Double> PAGES_MADE_NOT_YOUNG_RATE = createField(DSL.name("PAGES_MADE_NOT_YOUNG_RATE"), SQLDataType.DOUBLE.nullable(false).defaultValue(DSL.inline("0", SQLDataType.DOUBLE)), this, "");

    /**
     * The column <code>information_schema.INNODB_BUFFER_POOL_STATS.NUMBER_PAGES_READ</code>.
     */
    public final TableField<Record, ULong> NUMBER_PAGES_READ = createField(DSL.name("NUMBER_PAGES_READ"), SQLDataType.BIGINTUNSIGNED.nullable(false).defaultValue(DSL.inline("0", SQLDataType.BIGINTUNSIGNED)), this, "");

    /**
     * The column <code>information_schema.INNODB_BUFFER_POOL_STATS.NUMBER_PAGES_CREATED</code>.
     */
    public final TableField<Record, ULong> NUMBER_PAGES_CREATED = createField(DSL.name("NUMBER_PAGES_CREATED"), SQLDataType.BIGINTUNSIGNED.nullable(false).defaultValue(DSL.inline("0", SQLDataType.BIGINTUNSIGNED)), this, "");

    /**
     * The column <code>information_schema.INNODB_BUFFER_POOL_STATS.NUMBER_PAGES_WRITTEN</code>.
     */
    public final TableField<Record, ULong> NUMBER_PAGES_WRITTEN = createField(DSL.name("NUMBER_PAGES_WRITTEN"), SQLDataType.BIGINTUNSIGNED.nullable(false).defaultValue(DSL.inline("0", SQLDataType.BIGINTUNSIGNED)), this, "");

    /**
     * The column <code>information_schema.INNODB_BUFFER_POOL_STATS.PAGES_READ_RATE</code>.
     */
    public final TableField<Record, Double> PAGES_READ_RATE = createField(DSL.name("PAGES_READ_RATE"), SQLDataType.DOUBLE.nullable(false).defaultValue(DSL.inline("0", SQLDataType.DOUBLE)), this, "");

    /**
     * The column <code>information_schema.INNODB_BUFFER_POOL_STATS.PAGES_CREATE_RATE</code>.
     */
    public final TableField<Record, Double> PAGES_CREATE_RATE = createField(DSL.name("PAGES_CREATE_RATE"), SQLDataType.DOUBLE.nullable(false).defaultValue(DSL.inline("0", SQLDataType.DOUBLE)), this, "");

    /**
     * The column <code>information_schema.INNODB_BUFFER_POOL_STATS.PAGES_WRITTEN_RATE</code>.
     */
    public final TableField<Record, Double> PAGES_WRITTEN_RATE = createField(DSL.name("PAGES_WRITTEN_RATE"), SQLDataType.DOUBLE.nullable(false).defaultValue(DSL.inline("0", SQLDataType.DOUBLE)), this, "");

    /**
     * The column <code>information_schema.INNODB_BUFFER_POOL_STATS.NUMBER_PAGES_GET</code>.
     */
    public final TableField<Record, ULong> NUMBER_PAGES_GET = createField(DSL.name("NUMBER_PAGES_GET"), SQLDataType.BIGINTUNSIGNED.nullable(false).defaultValue(DSL.inline("0", SQLDataType.BIGINTUNSIGNED)), this, "");

    /**
     * The column <code>information_schema.INNODB_BUFFER_POOL_STATS.HIT_RATE</code>.
     */
    public final TableField<Record, ULong> HIT_RATE = createField(DSL.name("HIT_RATE"), SQLDataType.BIGINTUNSIGNED.nullable(false).defaultValue(DSL.inline("0", SQLDataType.BIGINTUNSIGNED)), this, "");

    /**
     * The column <code>information_schema.INNODB_BUFFER_POOL_STATS.YOUNG_MAKE_PER_THOUSAND_GETS</code>.
     */
    public final TableField<Record, ULong> YOUNG_MAKE_PER_THOUSAND_GETS = createField(DSL.name("YOUNG_MAKE_PER_THOUSAND_GETS"), SQLDataType.BIGINTUNSIGNED.nullable(false).defaultValue(DSL.inline("0", SQLDataType.BIGINTUNSIGNED)), this, "");

    /**
     * The column <code>information_schema.INNODB_BUFFER_POOL_STATS.NOT_YOUNG_MAKE_PER_THOUSAND_GETS</code>.
     */
    public final TableField<Record, ULong> NOT_YOUNG_MAKE_PER_THOUSAND_GETS = createField(DSL.name("NOT_YOUNG_MAKE_PER_THOUSAND_GETS"), SQLDataType.BIGINTUNSIGNED.nullable(false).defaultValue(DSL.inline("0", SQLDataType.BIGINTUNSIGNED)), this, "");

    /**
     * The column <code>information_schema.INNODB_BUFFER_POOL_STATS.NUMBER_PAGES_READ_AHEAD</code>.
     */
    public final TableField<Record, ULong> NUMBER_PAGES_READ_AHEAD = createField(DSL.name("NUMBER_PAGES_READ_AHEAD"), SQLDataType.BIGINTUNSIGNED.nullable(false).defaultValue(DSL.inline("0", SQLDataType.BIGINTUNSIGNED)), this, "");

    /**
     * The column <code>information_schema.INNODB_BUFFER_POOL_STATS.NUMBER_READ_AHEAD_EVICTED</code>.
     */
    public final TableField<Record, ULong> NUMBER_READ_AHEAD_EVICTED = createField(DSL.name("NUMBER_READ_AHEAD_EVICTED"), SQLDataType.BIGINTUNSIGNED.nullable(false).defaultValue(DSL.inline("0", SQLDataType.BIGINTUNSIGNED)), this, "");

    /**
     * The column <code>information_schema.INNODB_BUFFER_POOL_STATS.READ_AHEAD_RATE</code>.
     */
    public final TableField<Record, Double> READ_AHEAD_RATE = createField(DSL.name("READ_AHEAD_RATE"), SQLDataType.DOUBLE.nullable(false).defaultValue(DSL.inline("0", SQLDataType.DOUBLE)), this, "");

    /**
     * The column <code>information_schema.INNODB_BUFFER_POOL_STATS.READ_AHEAD_EVICTED_RATE</code>.
     */
    public final TableField<Record, Double> READ_AHEAD_EVICTED_RATE = createField(DSL.name("READ_AHEAD_EVICTED_RATE"), SQLDataType.DOUBLE.nullable(false).defaultValue(DSL.inline("0", SQLDataType.DOUBLE)), this, "");

    /**
     * The column <code>information_schema.INNODB_BUFFER_POOL_STATS.LRU_IO_TOTAL</code>.
     */
    public final TableField<Record, ULong> LRU_IO_TOTAL = createField(DSL.name("LRU_IO_TOTAL"), SQLDataType.BIGINTUNSIGNED.nullable(false).defaultValue(DSL.inline("0", SQLDataType.BIGINTUNSIGNED)), this, "");

    /**
     * The column <code>information_schema.INNODB_BUFFER_POOL_STATS.LRU_IO_CURRENT</code>.
     */
    public final TableField<Record, ULong> LRU_IO_CURRENT = createField(DSL.name("LRU_IO_CURRENT"), SQLDataType.BIGINTUNSIGNED.nullable(false).defaultValue(DSL.inline("0", SQLDataType.BIGINTUNSIGNED)), this, "");

    /**
     * The column <code>information_schema.INNODB_BUFFER_POOL_STATS.UNCOMPRESS_TOTAL</code>.
     */
    public final TableField<Record, ULong> UNCOMPRESS_TOTAL = createField(DSL.name("UNCOMPRESS_TOTAL"), SQLDataType.BIGINTUNSIGNED.nullable(false).defaultValue(DSL.inline("0", SQLDataType.BIGINTUNSIGNED)), this, "");

    /**
     * The column <code>information_schema.INNODB_BUFFER_POOL_STATS.UNCOMPRESS_CURRENT</code>.
     */
    public final TableField<Record, ULong> UNCOMPRESS_CURRENT = createField(DSL.name("UNCOMPRESS_CURRENT"), SQLDataType.BIGINTUNSIGNED.nullable(false).defaultValue(DSL.inline("0", SQLDataType.BIGINTUNSIGNED)), this, "");

    private InnodbBufferPoolStats(Name alias, Table<Record> aliased) {
        this(alias, aliased, null);
    }

    private InnodbBufferPoolStats(Name alias, Table<Record> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>information_schema.INNODB_BUFFER_POOL_STATS</code> table reference
     */
    public InnodbBufferPoolStats(String alias) {
        this(DSL.name(alias), INNODB_BUFFER_POOL_STATS);
    }

    /**
     * Create an aliased <code>information_schema.INNODB_BUFFER_POOL_STATS</code> table reference
     */
    public InnodbBufferPoolStats(Name alias) {
        this(alias, INNODB_BUFFER_POOL_STATS);
    }

    /**
     * Create a <code>information_schema.INNODB_BUFFER_POOL_STATS</code> table reference
     */
    public InnodbBufferPoolStats() {
        this(DSL.name("INNODB_BUFFER_POOL_STATS"), null);
    }

    public <O extends Record> InnodbBufferPoolStats(Table<O> child, ForeignKey<O, Record> key) {
        super(child, key, INNODB_BUFFER_POOL_STATS);
    }

    @Override
    public Schema getSchema() {
        return InformationSchema.INFORMATION_SCHEMA;
    }

    @Override
    public InnodbBufferPoolStats as(String alias) {
        return new InnodbBufferPoolStats(DSL.name(alias), this);
    }

    @Override
    public InnodbBufferPoolStats as(Name alias) {
        return new InnodbBufferPoolStats(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public InnodbBufferPoolStats rename(String name) {
        return new InnodbBufferPoolStats(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public InnodbBufferPoolStats rename(Name name) {
        return new InnodbBufferPoolStats(name, null);
    }
}
