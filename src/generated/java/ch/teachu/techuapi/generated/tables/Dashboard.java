/*
 * This file is generated by jOOQ.
 */
package ch.teachu.techuapi.generated.tables;


import ch.teachu.teachuapi.sql.generation.UuidConverter;
import ch.teachu.techuapi.generated.Keys;
import ch.teachu.techuapi.generated.Teachu;
import ch.teachu.techuapi.generated.tables.records.DashboardRecord;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row9;
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
public class Dashboard extends TableImpl<DashboardRecord> {

    private static final long serialVersionUID = 353349599;

    /**
     * The reference instance of <code>teachu.dashboard</code>
     */
    public static final Dashboard DASHBOARD = new Dashboard();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<DashboardRecord> getRecordType() {
        return DashboardRecord.class;
    }

    /**
     * The column <code>teachu.dashboard.id</code>.
     */
    public final TableField<DashboardRecord, UUID> ID = createField(DSL.name("id"), org.jooq.impl.SQLDataType.BINARY(16).nullable(false), this, "", new UuidConverter());

    /**
     * The column <code>teachu.dashboard.title</code>.
     */
    public final TableField<DashboardRecord, String> TITLE = createField(DSL.name("title"), org.jooq.impl.SQLDataType.VARCHAR(100), this, "");

    /**
     * The column <code>teachu.dashboard.message</code>.
     */
    public final TableField<DashboardRecord, String> MESSAGE = createField(DSL.name("message"), org.jooq.impl.SQLDataType.VARCHAR(1000), this, "");

    /**
     * The column <code>teachu.dashboard.date</code>.
     */
    public final TableField<DashboardRecord, LocalDate> DATE = createField(DSL.name("date"), org.jooq.impl.SQLDataType.LOCALDATE, this, "");

    /**
     * The column <code>teachu.dashboard.img</code>.
     */
    public final TableField<DashboardRecord, String> IMG = createField(DSL.name("img"), org.jooq.impl.SQLDataType.VARCHAR(100), this, "");

    /**
     * The column <code>teachu.dashboard.user_id</code>.
     */
    public final TableField<DashboardRecord, UUID> USER_ID = createField(DSL.name("user_id"), org.jooq.impl.SQLDataType.BINARY(16), this, "", new UuidConverter());

    /**
     * The column <code>teachu.dashboard.state</code>.
     */
    public final TableField<DashboardRecord, String> STATE = createField(DSL.name("state"), org.jooq.impl.SQLDataType.VARCHAR(100), this, "");

    /**
     * The column <code>teachu.dashboard.important</code>.
     */
    public final TableField<DashboardRecord, Byte> IMPORTANT = createField(DSL.name("important"), org.jooq.impl.SQLDataType.TINYINT, this, "");

    /**
     * The column <code>teachu.dashboard.pinned</code>.
     */
    public final TableField<DashboardRecord, Byte> PINNED = createField(DSL.name("pinned"), org.jooq.impl.SQLDataType.TINYINT, this, "");

    /**
     * Create a <code>teachu.dashboard</code> table reference
     */
    public Dashboard() {
        this(DSL.name("dashboard"), null);
    }

    /**
     * Create an aliased <code>teachu.dashboard</code> table reference
     */
    public Dashboard(String alias) {
        this(DSL.name(alias), DASHBOARD);
    }

    /**
     * Create an aliased <code>teachu.dashboard</code> table reference
     */
    public Dashboard(Name alias) {
        this(alias, DASHBOARD);
    }

    private Dashboard(Name alias, Table<DashboardRecord> aliased) {
        this(alias, aliased, null);
    }

    private Dashboard(Name alias, Table<DashboardRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    public <O extends Record> Dashboard(Table<O> child, ForeignKey<O, DashboardRecord> key) {
        super(child, key, DASHBOARD);
    }

    @Override
    public Schema getSchema() {
        return Teachu.TEACHU;
    }

    @Override
    public UniqueKey<DashboardRecord> getPrimaryKey() {
        return Keys.KEY_DASHBOARD_PRIMARY;
    }

    @Override
    public List<UniqueKey<DashboardRecord>> getKeys() {
        return Arrays.<UniqueKey<DashboardRecord>>asList(Keys.KEY_DASHBOARD_PRIMARY);
    }

    @Override
    public Dashboard as(String alias) {
        return new Dashboard(DSL.name(alias), this);
    }

    @Override
    public Dashboard as(Name alias) {
        return new Dashboard(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Dashboard rename(String name) {
        return new Dashboard(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Dashboard rename(Name name) {
        return new Dashboard(name, null);
    }

    // -------------------------------------------------------------------------
    // Row9 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row9<UUID, String, String, LocalDate, String, UUID, String, Byte, Byte> fieldsRow() {
        return (Row9) super.fieldsRow();
    }
}