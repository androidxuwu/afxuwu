package com.example.haibeiapp.DB;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import com.example.haibeiapp.table.DBConstast;
import com.example.haibeiapp.table.TABLES;

/**
 * Created by Administrator on 2016/5/26 0026.
 */
public class DBHelper extends SQLiteOpenHelper {
    public DBHelper(Context context) {
        super(context, DBConstast.DATABASE_NAME, null, DBConstast.DATABASE_VERSION);
    }

    /**
     *  只会在创建数据库的时候调用
     * @param db
     */
    @Override
    public void onCreate(SQLiteDatabase db) {
        //创建表
        String sql = "create table "+ TABLES.Search.TABLE_NAME+" ("+TABLES.Search.ID+" integer primary key autoincrement,"+
                TABLES.Search.TITLE+" text,"+TABLES.Search.DATA+")";
        db.execSQL(sql);

    }

    /**
     * 打开表
     * @param db
     */
    public void onOpen(SQLiteDatabase db){
        super.onOpen(db);
    }

    /**
     * 更新数据库版本
     * @param db
     * @param oldVersion
     * @param newVersion
     */
    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}

