package com.example.clearschedule;

import androidx.room.Database;
import androidx.room.RoomDatabase;

/**
 * Room DataBaseクラス
 */
@Database(entities = {ScheduleData.class}, version = 1, exportSchema = false)
public abstract class AppDatabase extends RoomDatabase {
    //DAO用メソッド
    public abstract ScheduleDao scheduleDao();
}