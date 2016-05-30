package com.example.haibeiapp.DB.dao;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;


import com.example.haibeiapp.DB.DBHelper;
import com.example.haibeiapp.bean.Search;
import com.example.haibeiapp.table.TABLES;

import java.util.ArrayList;
import java.util.List;


/**
 * 对外的search表的操作对象
 * Created by sxh on 2016/5/1.
 */
public class SearchDAO {
    private SQLiteDatabase db;
    private DBHelper helper;

    public SearchDAO(DBHelper helper){
        this.helper = helper;
    }

    /**
     * 添加
     */
    public void add(Search search){
        db = helper.getReadableDatabase();
        ContentValues values = new ContentValues();
        values.put(TABLES.Search.TITLE,search.getTitle());
        values.put(TABLES.Search.DATA, search.getData());
        db.insert(TABLES.Search.TABLE_NAME, null, values);
    }
    /**
     * 删除
     */
    public void del(int id){

        db = helper.getReadableDatabase();
        /**
         * dalete from table *** where id =?
         * 参数1：表名
         * 参数2：删除条件
         * 参数3：参数条件的值
         */
        String whereClause = TABLES.Search.ID+"=?";
        String[] whereArgs = {String.valueOf(id)};
        db.delete(TABLES.Search.TABLE_NAME, whereClause, whereArgs);

        db.close();
    }
    /**
     * 修改
     */
    public void update(Search search){
        db = helper.getReadableDatabase();
        ContentValues values = new ContentValues();
        values.put(TABLES.Search.TITLE,search.getTitle());
        values.put(TABLES.Search.DATA,search.getData());
        String whereClause = TABLES.Search.ID+"=?";
        String [] whereArgs = {String.valueOf(search.getId())};
        /**
         * 参数1：表名
         * 参数2：要修改的值
         * 参数3：修改条件
         * 参数4：修改条件的值
         */
        db.update(TABLES.Search.TABLE_NAME, values, whereClause, whereArgs);
        db.close();
    }
    /**
     * 查询所有
     */
    public List<Search> queryAll(){
        List<Search> searchs = new ArrayList<>();
        db = helper.getReadableDatabase();
        // select id,title form search;
        // String [] columns = {TABLES.search.TITLE,TABLSE.search.CONTENT}
        Cursor cursor = db.query(TABLES.Search.TABLE_NAME, null, null, null, null, null, null, null);
        while(cursor.moveToNext()){
            int id = cursor.getInt(cursor.getColumnIndex(TABLES.Search.ID));
            String title = cursor.getString(cursor.getColumnIndex(TABLES.Search.TITLE));
            String date = cursor.getString(cursor.getColumnIndex(TABLES.Search.DATA));
            searchs.add(new Search(id,title,date));
        }
        db.close();
        //添加集合
        return searchs;
    }
    /**
     * 根据条件查找
     */
    public List<Search> query(String mTitle){
        List<Search> searchs = new ArrayList<>();
        db = helper.getReadableDatabase();

        // String [] columns = {TABLES.search.TITLE,TABLSE.search.CONTENT}
        String selection = TABLES.Search.TITLE+" like '%?&'";
        String []selectionArgs ={mTitle};
        Cursor cursor = db.query(TABLES.Search.TABLE_NAME, null, selection, selectionArgs, null, null, null, null);
        while(cursor.moveToNext()){
            int id = cursor.getInt(cursor.getColumnIndex(TABLES.Search.ID));
            String title = cursor.getString(cursor.getColumnIndex(TABLES.Search.TITLE));
            String date = cursor.getString(cursor.getColumnIndex(TABLES.Search.DATA));
            //添加到集合
            searchs.add(new Search(id,title,date));
        }
        db.close();

        return searchs;
    }
    /**
     * 查询一个
     */
    public Search queryById(int mId){
        db = helper.getReadableDatabase();
        Search search = null;
        String selection = TABLES.Search.ID+" = ? ";
        String[] selectionArgs = {String.valueOf(mId)};
        Cursor cursor = db.query(TABLES.Search.TABLE_NAME, null, selection, selectionArgs, null, null, null, null);
        while(cursor.moveToNext()){
            int id = cursor.getInt(cursor.getColumnIndex(TABLES.Search.ID));
            String title = cursor.getString(cursor.getColumnIndex(TABLES.Search.TITLE));
            String date = cursor.getString(cursor.getColumnIndex(TABLES.Search.DATA));
             search = new Search(id,title,date);
        }
        db.close();
        return search;
    }

}
