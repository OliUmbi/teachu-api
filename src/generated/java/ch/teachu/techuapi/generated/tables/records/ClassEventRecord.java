/*
 * This file is generated by jOOQ.
 */
package ch.teachu.techuapi.generated.tables.records;


import ch.teachu.techuapi.generated.tables.ClassEvent;

import java.time.LocalDate;
import java.util.UUID;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record6;
import org.jooq.Row6;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class ClassEventRecord extends UpdatableRecordImpl<ClassEventRecord> implements Record6<UUID, UUID, String, String, LocalDate, Byte> {

    private static final long serialVersionUID = -1432000197;

    /**
     * Setter for <code>teachu.class_event.id</code>.
     */
    public void setId(UUID value) {
        set(0, value);
    }

    /**
     * Getter for <code>teachu.class_event.id</code>.
     */
    public UUID getId() {
        return (UUID) get(0);
    }

    /**
     * Setter for <code>teachu.class_event.class_id</code>.
     */
    public void setClassId(UUID value) {
        set(1, value);
    }

    /**
     * Getter for <code>teachu.class_event.class_id</code>.
     */
    public UUID getClassId() {
        return (UUID) get(1);
    }

    /**
     * Setter for <code>teachu.class_event.title</code>.
     */
    public void setTitle(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>teachu.class_event.title</code>.
     */
    public String getTitle() {
        return (String) get(2);
    }

    /**
     * Setter for <code>teachu.class_event.description</code>.
     */
    public void setDescription(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>teachu.class_event.description</code>.
     */
    public String getDescription() {
        return (String) get(3);
    }

    /**
     * Setter for <code>teachu.class_event.date</code>.
     */
    public void setDate(LocalDate value) {
        set(4, value);
    }

    /**
     * Getter for <code>teachu.class_event.date</code>.
     */
    public LocalDate getDate() {
        return (LocalDate) get(4);
    }

    /**
     * Setter for <code>teachu.class_event.noSchool</code>.
     */
    public void setNoschool(Byte value) {
        set(5, value);
    }

    /**
     * Getter for <code>teachu.class_event.noSchool</code>.
     */
    public Byte getNoschool() {
        return (Byte) get(5);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<UUID> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record6 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row6<UUID, UUID, String, String, LocalDate, Byte> fieldsRow() {
        return (Row6) super.fieldsRow();
    }

    @Override
    public Row6<UUID, UUID, String, String, LocalDate, Byte> valuesRow() {
        return (Row6) super.valuesRow();
    }

    @Override
    public Field<UUID> field1() {
        return ClassEvent.CLASS_EVENT.ID;
    }

    @Override
    public Field<UUID> field2() {
        return ClassEvent.CLASS_EVENT.CLASS_ID;
    }

    @Override
    public Field<String> field3() {
        return ClassEvent.CLASS_EVENT.TITLE;
    }

    @Override
    public Field<String> field4() {
        return ClassEvent.CLASS_EVENT.DESCRIPTION;
    }

    @Override
    public Field<LocalDate> field5() {
        return ClassEvent.CLASS_EVENT.DATE;
    }

    @Override
    public Field<Byte> field6() {
        return ClassEvent.CLASS_EVENT.NOSCHOOL;
    }

    @Override
    public UUID component1() {
        return getId();
    }

    @Override
    public UUID component2() {
        return getClassId();
    }

    @Override
    public String component3() {
        return getTitle();
    }

    @Override
    public String component4() {
        return getDescription();
    }

    @Override
    public LocalDate component5() {
        return getDate();
    }

    @Override
    public Byte component6() {
        return getNoschool();
    }

    @Override
    public UUID value1() {
        return getId();
    }

    @Override
    public UUID value2() {
        return getClassId();
    }

    @Override
    public String value3() {
        return getTitle();
    }

    @Override
    public String value4() {
        return getDescription();
    }

    @Override
    public LocalDate value5() {
        return getDate();
    }

    @Override
    public Byte value6() {
        return getNoschool();
    }

    @Override
    public ClassEventRecord value1(UUID value) {
        setId(value);
        return this;
    }

    @Override
    public ClassEventRecord value2(UUID value) {
        setClassId(value);
        return this;
    }

    @Override
    public ClassEventRecord value3(String value) {
        setTitle(value);
        return this;
    }

    @Override
    public ClassEventRecord value4(String value) {
        setDescription(value);
        return this;
    }

    @Override
    public ClassEventRecord value5(LocalDate value) {
        setDate(value);
        return this;
    }

    @Override
    public ClassEventRecord value6(Byte value) {
        setNoschool(value);
        return this;
    }

    @Override
    public ClassEventRecord values(UUID value1, UUID value2, String value3, String value4, LocalDate value5, Byte value6) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached ClassEventRecord
     */
    public ClassEventRecord() {
        super(ClassEvent.CLASS_EVENT);
    }

    /**
     * Create a detached, initialised ClassEventRecord
     */
    public ClassEventRecord(UUID id, UUID classId, String title, String description, LocalDate date, Byte noschool) {
        super(ClassEvent.CLASS_EVENT);

        set(0, id);
        set(1, classId);
        set(2, title);
        set(3, description);
        set(4, date);
        set(5, noschool);
    }
}