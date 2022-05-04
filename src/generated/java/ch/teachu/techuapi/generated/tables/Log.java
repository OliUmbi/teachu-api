/*
 * This file is generated by jOOQ.
 */
package ch.teachu.techuapi.generated.tables;


import ch.teachu.teachuapi.sql.generation.UuidConverter;
import ch.teachu.techuapi.generated.Keys;
import ch.teachu.techuapi.generated.Teachu;
import ch.teachu.techuapi.generated.tables.records.LogRecord;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row5;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.TableOptions;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Log extends TableImpl<LogRecord> {

    private static final long serialVersionUID = -1024218226;

    /**
     * The reference instance of <code>teachu.log</code>
     */
    public static final Log LOG = new Log();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<LogRecord> getRecordType() {
        return LogRecord.class;
    }

    /**
     * The column <code>teachu.log.id</code>.
     */
    public final TableField<LogRecord, UUID> ID = createField(DSL.name("id"), org.jooq.impl.SQLDataType.BINARY(16).nullable(false), this, "", new UuidConverter());

    /**
     * The column <code>teachu.log.message</code>.
     */
    public final TableField<LogRecord, String> MESSAGE = createField(DSL.name("message"), org.jooq.impl.SQLDataType.VARCHAR(250), this, "");

    /**
     * The column <code>teachu.log.origin</code>.
     */
    public final TableField<LogRecord, String> ORIGIN = createField(DSL.name("origin"), org.jooq.impl.SQLDataType.VARCHAR(100), this, "");

    /**
     * The column <code>teachu.log.level</code>.
     */
    public final TableField<LogRecord, String> LEVEL = createField(DSL.name("level"), org.jooq.impl.SQLDataType.VARCHAR(100), this, "");

    /**
     * The column <code>teachu.log.timestamp</code>.
     */
    public final TableField<LogRecord, LocalDateTime> TIMESTAMP = createField(DSL.name("timestamp"), org.jooq.impl.SQLDataType.LOCALDATETIME, this, "");

    /**
     * Create a <code>teachu.log</code> table reference
     */
    public Log() {
        this(DSL.name("log"), null);
    }

    /**
     * Create an aliased <code>teachu.log</code> table reference
     */
    public Log(String alias) {
        this(DSL.name(alias), LOG);
    }

    /**
     * Create an aliased <code>teachu.log</code> table reference
     */
    public Log(Name alias) {
        this(alias, LOG);
    }

    private Log(Name alias, Table<LogRecord> aliased) {
        this(alias, aliased, null);
    }

    private Log(Name alias, Table<LogRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    public <O extends Record> Log(Table<O> child, ForeignKey<O, LogRecord> key) {
        super(child, key, LOG);
    }

    @Override
    public Schema getSchema() {
        return Teachu.TEACHU;
    }

    @Override
    public UniqueKey<LogRecord> getPrimaryKey() {
        return Keys.KEY_LOG_PRIMARY;
    }

    @Override
    public List<UniqueKey<LogRecord>> getKeys() {
        return Arrays.<UniqueKey<LogRecord>>asList(Keys.KEY_LOG_PRIMARY);
    }

    @Override
    public Log as(String alias) {
        return new Log(DSL.name(alias), this);
    }

    @Override
    public Log as(Name alias) {
        return new Log(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Log rename(String name) {
        return new Log(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Log rename(Name name) {
        return new Log(name, null);
    }

    // -------------------------------------------------------------------------
    // Row5 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row5<UUID, String, String, String, LocalDateTime> fieldsRow() {
        return (Row5) super.fieldsRow();
    }
}