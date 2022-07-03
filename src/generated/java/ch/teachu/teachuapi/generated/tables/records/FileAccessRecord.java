/*
 * This file is generated by jOOQ.
 */
package ch.teachu.teachuapi.generated.tables.records;


import ch.teachu.teachuapi.generated.tables.FileAccess;

import java.time.LocalDateTime;
import java.util.UUID;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record7;
import org.jooq.Row7;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class FileAccessRecord extends UpdatableRecordImpl<FileAccessRecord> implements Record7<UUID, String, String, String, UUID, Integer, LocalDateTime> {

    private static final long serialVersionUID = 1218734496;

    /**
     * Setter for <code>teachu.file_access.id</code>.
     */
    public void setId(UUID value) {
        set(0, value);
    }

    /**
     * Getter for <code>teachu.file_access.id</code>.
     */
    public UUID getId() {
        return (UUID) get(0);
    }

    /**
     * Setter for <code>teachu.file_access.custom_name</code>.
     */
    public void setCustomName(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>teachu.file_access.custom_name</code>.
     */
    public String getCustomName() {
        return (String) get(1);
    }

    /**
     * Setter for <code>teachu.file_access.file_name</code>.
     */
    public void setFileName(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>teachu.file_access.file_name</code>.
     */
    public String getFileName() {
        return (String) get(2);
    }

    /**
     * Setter for <code>teachu.file_access.file_type</code>.
     */
    public void setFileType(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>teachu.file_access.file_type</code>.
     */
    public String getFileType() {
        return (String) get(3);
    }

    /**
     * Setter for <code>teachu.file_access.uploader_id</code>.
     */
    public void setUploaderId(UUID value) {
        set(4, value);
    }

    /**
     * Getter for <code>teachu.file_access.uploader_id</code>.
     */
    public UUID getUploaderId() {
        return (UUID) get(4);
    }

    /**
     * Setter for <code>teachu.file_access.size</code>.
     */
    public void setSize(Integer value) {
        set(5, value);
    }

    /**
     * Getter for <code>teachu.file_access.size</code>.
     */
    public Integer getSize() {
        return (Integer) get(5);
    }

    /**
     * Setter for <code>teachu.file_access.upload_date</code>.
     */
    public void setUploadDate(LocalDateTime value) {
        set(6, value);
    }

    /**
     * Getter for <code>teachu.file_access.upload_date</code>.
     */
    public LocalDateTime getUploadDate() {
        return (LocalDateTime) get(6);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<UUID> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record7 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row7<UUID, String, String, String, UUID, Integer, LocalDateTime> fieldsRow() {
        return (Row7) super.fieldsRow();
    }

    @Override
    public Row7<UUID, String, String, String, UUID, Integer, LocalDateTime> valuesRow() {
        return (Row7) super.valuesRow();
    }

    @Override
    public Field<UUID> field1() {
        return FileAccess.FILE_ACCESS.ID;
    }

    @Override
    public Field<String> field2() {
        return FileAccess.FILE_ACCESS.CUSTOM_NAME;
    }

    @Override
    public Field<String> field3() {
        return FileAccess.FILE_ACCESS.FILE_NAME;
    }

    @Override
    public Field<String> field4() {
        return FileAccess.FILE_ACCESS.FILE_TYPE;
    }

    @Override
    public Field<UUID> field5() {
        return FileAccess.FILE_ACCESS.UPLOADER_ID;
    }

    @Override
    public Field<Integer> field6() {
        return FileAccess.FILE_ACCESS.SIZE;
    }

    @Override
    public Field<LocalDateTime> field7() {
        return FileAccess.FILE_ACCESS.UPLOAD_DATE;
    }

    @Override
    public UUID component1() {
        return getId();
    }

    @Override
    public String component2() {
        return getCustomName();
    }

    @Override
    public String component3() {
        return getFileName();
    }

    @Override
    public String component4() {
        return getFileType();
    }

    @Override
    public UUID component5() {
        return getUploaderId();
    }

    @Override
    public Integer component6() {
        return getSize();
    }

    @Override
    public LocalDateTime component7() {
        return getUploadDate();
    }

    @Override
    public UUID value1() {
        return getId();
    }

    @Override
    public String value2() {
        return getCustomName();
    }

    @Override
    public String value3() {
        return getFileName();
    }

    @Override
    public String value4() {
        return getFileType();
    }

    @Override
    public UUID value5() {
        return getUploaderId();
    }

    @Override
    public Integer value6() {
        return getSize();
    }

    @Override
    public LocalDateTime value7() {
        return getUploadDate();
    }

    @Override
    public FileAccessRecord value1(UUID value) {
        setId(value);
        return this;
    }

    @Override
    public FileAccessRecord value2(String value) {
        setCustomName(value);
        return this;
    }

    @Override
    public FileAccessRecord value3(String value) {
        setFileName(value);
        return this;
    }

    @Override
    public FileAccessRecord value4(String value) {
        setFileType(value);
        return this;
    }

    @Override
    public FileAccessRecord value5(UUID value) {
        setUploaderId(value);
        return this;
    }

    @Override
    public FileAccessRecord value6(Integer value) {
        setSize(value);
        return this;
    }

    @Override
    public FileAccessRecord value7(LocalDateTime value) {
        setUploadDate(value);
        return this;
    }

    @Override
    public FileAccessRecord values(UUID value1, String value2, String value3, String value4, UUID value5, Integer value6, LocalDateTime value7) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached FileAccessRecord
     */
    public FileAccessRecord() {
        super(FileAccess.FILE_ACCESS);
    }

    /**
     * Create a detached, initialised FileAccessRecord
     */
    public FileAccessRecord(UUID id, String customName, String fileName, String fileType, UUID uploaderId, Integer size, LocalDateTime uploadDate) {
        super(FileAccess.FILE_ACCESS);

        set(0, id);
        set(1, customName);
        set(2, fileName);
        set(3, fileType);
        set(4, uploaderId);
        set(5, size);
        set(6, uploadDate);
    }
}