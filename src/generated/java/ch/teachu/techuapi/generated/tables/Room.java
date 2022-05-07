/*
 * This file is generated by jOOQ.
 */
package ch.teachu.techuapi.generated.tables;


import ch.teachu.teachuapi.sql.generation.UuidConverter;
import ch.teachu.techuapi.generated.Keys;
import ch.teachu.techuapi.generated.Teachu;
import ch.teachu.techuapi.generated.tables.records.RoomRecord;

import java.util.Arrays;
import java.util.List;
import java.util.UUID;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row3;
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
public class Room extends TableImpl<RoomRecord> {

    private static final long serialVersionUID = 776546018;

    /**
     * The reference instance of <code>teachu.room</code>
     */
    public static final Room ROOM = new Room();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<RoomRecord> getRecordType() {
        return RoomRecord.class;
    }

    /**
     * The column <code>teachu.room.id</code>.
     */
    public final TableField<RoomRecord, UUID> ID = createField(DSL.name("id"), org.jooq.impl.SQLDataType.BINARY(16).nullable(false), this, "", new UuidConverter());

    /**
     * The column <code>teachu.room.name</code>.
     */
    public final TableField<RoomRecord, String> NAME = createField(DSL.name("name"), org.jooq.impl.SQLDataType.VARCHAR(100), this, "");

    /**
     * The column <code>teachu.room.note</code>.
     */
    public final TableField<RoomRecord, String> NOTE = createField(DSL.name("note"), org.jooq.impl.SQLDataType.VARCHAR(1000), this, "");

    /**
     * Create a <code>teachu.room</code> table reference
     */
    public Room() {
        this(DSL.name("room"), null);
    }

    /**
     * Create an aliased <code>teachu.room</code> table reference
     */
    public Room(String alias) {
        this(DSL.name(alias), ROOM);
    }

    /**
     * Create an aliased <code>teachu.room</code> table reference
     */
    public Room(Name alias) {
        this(alias, ROOM);
    }

    private Room(Name alias, Table<RoomRecord> aliased) {
        this(alias, aliased, null);
    }

    private Room(Name alias, Table<RoomRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    public <O extends Record> Room(Table<O> child, ForeignKey<O, RoomRecord> key) {
        super(child, key, ROOM);
    }

    @Override
    public Schema getSchema() {
        return Teachu.TEACHU;
    }

    @Override
    public UniqueKey<RoomRecord> getPrimaryKey() {
        return Keys.KEY_ROOM_PRIMARY;
    }

    @Override
    public List<UniqueKey<RoomRecord>> getKeys() {
        return Arrays.<UniqueKey<RoomRecord>>asList(Keys.KEY_ROOM_PRIMARY);
    }

    @Override
    public Room as(String alias) {
        return new Room(DSL.name(alias), this);
    }

    @Override
    public Room as(Name alias) {
        return new Room(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Room rename(String name) {
        return new Room(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Room rename(Name name) {
        return new Room(name, null);
    }

    // -------------------------------------------------------------------------
    // Row3 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row3<UUID, String, String> fieldsRow() {
        return (Row3) super.fieldsRow();
    }
}