/*
 * This file is generated by jOOQ.
 */
package ch.teachu.techuapi.generated.tables.records;


import ch.teachu.teachuapi.enums.ClassSubjectInterval;
import ch.teachu.techuapi.generated.tables.ClassSubject;

import java.time.LocalDate;
import java.util.UUID;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record9;
import org.jooq.Row9;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class ClassSubjectRecord extends UpdatableRecordImpl<ClassSubjectRecord> implements Record9<UUID, UUID, UUID, UUID, String, LocalDate, LocalDate, ClassSubjectInterval, Byte> {

    private static final long serialVersionUID = -1031021125;

    /**
     * Setter for <code>teachu.class_subject.id</code>.
     */
    public void setId(UUID value) {
        set(0, value);
    }

    /**
     * Getter for <code>teachu.class_subject.id</code>.
     */
    public UUID getId() {
        return (UUID) get(0);
    }

    /**
     * Setter for <code>teachu.class_subject.class_id</code>.
     */
    public void setClassId(UUID value) {
        set(1, value);
    }

    /**
     * Getter for <code>teachu.class_subject.class_id</code>.
     */
    public UUID getClassId() {
        return (UUID) get(1);
    }

    /**
     * Setter for <code>teachu.class_subject.teacher_id</code>.
     */
    public void setTeacherId(UUID value) {
        set(2, value);
    }

    /**
     * Getter for <code>teachu.class_subject.teacher_id</code>.
     */
    public UUID getTeacherId() {
        return (UUID) get(2);
    }

    /**
     * Setter for <code>teachu.class_subject.subject_id</code>.
     */
    public void setSubjectId(UUID value) {
        set(3, value);
    }

    /**
     * Getter for <code>teachu.class_subject.subject_id</code>.
     */
    public UUID getSubjectId() {
        return (UUID) get(3);
    }

    /**
     * Setter for <code>teachu.class_subject.note</code>.
     */
    public void setNote(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>teachu.class_subject.note</code>.
     */
    public String getNote() {
        return (String) get(4);
    }

    /**
     * Setter for <code>teachu.class_subject.start_date</code>.
     */
    public void setStartDate(LocalDate value) {
        set(5, value);
    }

    /**
     * Getter for <code>teachu.class_subject.start_date</code>.
     */
    public LocalDate getStartDate() {
        return (LocalDate) get(5);
    }

    /**
     * Setter for <code>teachu.class_subject.end_date</code>.
     */
    public void setEndDate(LocalDate value) {
        set(6, value);
    }

    /**
     * Getter for <code>teachu.class_subject.end_date</code>.
     */
    public LocalDate getEndDate() {
        return (LocalDate) get(6);
    }

    /**
     * Setter for <code>teachu.class_subject.interval</code>.
     */
    public void setInterval(ClassSubjectInterval value) {
        set(7, value);
    }

    /**
     * Getter for <code>teachu.class_subject.interval</code>.
     */
    public ClassSubjectInterval getInterval() {
        return (ClassSubjectInterval) get(7);
    }

    /**
     * Setter for <code>teachu.class_subject.active</code>.
     */
    public void setActive(Byte value) {
        set(8, value);
    }

    /**
     * Getter for <code>teachu.class_subject.active</code>.
     */
    public Byte getActive() {
        return (Byte) get(8);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<UUID> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record9 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row9<UUID, UUID, UUID, UUID, String, LocalDate, LocalDate, ClassSubjectInterval, Byte> fieldsRow() {
        return (Row9) super.fieldsRow();
    }

    @Override
    public Row9<UUID, UUID, UUID, UUID, String, LocalDate, LocalDate, ClassSubjectInterval, Byte> valuesRow() {
        return (Row9) super.valuesRow();
    }

    @Override
    public Field<UUID> field1() {
        return ClassSubject.CLASS_SUBJECT.ID;
    }

    @Override
    public Field<UUID> field2() {
        return ClassSubject.CLASS_SUBJECT.CLASS_ID;
    }

    @Override
    public Field<UUID> field3() {
        return ClassSubject.CLASS_SUBJECT.TEACHER_ID;
    }

    @Override
    public Field<UUID> field4() {
        return ClassSubject.CLASS_SUBJECT.SUBJECT_ID;
    }

    @Override
    public Field<String> field5() {
        return ClassSubject.CLASS_SUBJECT.NOTE;
    }

    @Override
    public Field<LocalDate> field6() {
        return ClassSubject.CLASS_SUBJECT.START_DATE;
    }

    @Override
    public Field<LocalDate> field7() {
        return ClassSubject.CLASS_SUBJECT.END_DATE;
    }

    @Override
    public Field<ClassSubjectInterval> field8() {
        return ClassSubject.CLASS_SUBJECT.INTERVAL;
    }

    @Override
    public Field<Byte> field9() {
        return ClassSubject.CLASS_SUBJECT.ACTIVE;
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
    public UUID component3() {
        return getTeacherId();
    }

    @Override
    public UUID component4() {
        return getSubjectId();
    }

    @Override
    public String component5() {
        return getNote();
    }

    @Override
    public LocalDate component6() {
        return getStartDate();
    }

    @Override
    public LocalDate component7() {
        return getEndDate();
    }

    @Override
    public ClassSubjectInterval component8() {
        return getInterval();
    }

    @Override
    public Byte component9() {
        return getActive();
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
    public UUID value3() {
        return getTeacherId();
    }

    @Override
    public UUID value4() {
        return getSubjectId();
    }

    @Override
    public String value5() {
        return getNote();
    }

    @Override
    public LocalDate value6() {
        return getStartDate();
    }

    @Override
    public LocalDate value7() {
        return getEndDate();
    }

    @Override
    public ClassSubjectInterval value8() {
        return getInterval();
    }

    @Override
    public Byte value9() {
        return getActive();
    }

    @Override
    public ClassSubjectRecord value1(UUID value) {
        setId(value);
        return this;
    }

    @Override
    public ClassSubjectRecord value2(UUID value) {
        setClassId(value);
        return this;
    }

    @Override
    public ClassSubjectRecord value3(UUID value) {
        setTeacherId(value);
        return this;
    }

    @Override
    public ClassSubjectRecord value4(UUID value) {
        setSubjectId(value);
        return this;
    }

    @Override
    public ClassSubjectRecord value5(String value) {
        setNote(value);
        return this;
    }

    @Override
    public ClassSubjectRecord value6(LocalDate value) {
        setStartDate(value);
        return this;
    }

    @Override
    public ClassSubjectRecord value7(LocalDate value) {
        setEndDate(value);
        return this;
    }

    @Override
    public ClassSubjectRecord value8(ClassSubjectInterval value) {
        setInterval(value);
        return this;
    }

    @Override
    public ClassSubjectRecord value9(Byte value) {
        setActive(value);
        return this;
    }

    @Override
    public ClassSubjectRecord values(UUID value1, UUID value2, UUID value3, UUID value4, String value5, LocalDate value6, LocalDate value7, ClassSubjectInterval value8, Byte value9) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        value9(value9);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached ClassSubjectRecord
     */
    public ClassSubjectRecord() {
        super(ClassSubject.CLASS_SUBJECT);
    }

    /**
     * Create a detached, initialised ClassSubjectRecord
     */
    public ClassSubjectRecord(UUID id, UUID classId, UUID teacherId, UUID subjectId, String note, LocalDate startDate, LocalDate endDate, ClassSubjectInterval interval, Byte active) {
        super(ClassSubject.CLASS_SUBJECT);

        set(0, id);
        set(1, classId);
        set(2, teacherId);
        set(3, subjectId);
        set(4, note);
        set(5, startDate);
        set(6, endDate);
        set(7, interval);
        set(8, active);
    }
}