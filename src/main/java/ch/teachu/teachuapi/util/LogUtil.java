package ch.teachu.teachuapi.util;

import ch.teachu.teachuapi.enums.LogLevel;
import ch.teachu.techuapi.generated.tables.Log;
import ch.teachu.techuapi.generated.tables.records.LogRecord;

import java.time.LocalDateTime;
import java.util.UUID;

import static ch.teachu.teachuapi.sql.Sql.SQL;

public class LogUtil {

    public static void log(String message, Class<?> origin, LogLevel level) {
        LogRecord logRecord = SQL.newRecord(Log.LOG);
        logRecord.setId(UUID.randomUUID());
        logRecord.setMessage(message);
        logRecord.setOrigin(origin.getSimpleName());
        logRecord.setLevel(level);
        logRecord.setTimestamp(LocalDateTime.now());
        logRecord.store();
    }
}