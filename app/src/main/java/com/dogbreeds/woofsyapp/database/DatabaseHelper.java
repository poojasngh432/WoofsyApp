package com.dogbreeds.woofsyapp.database;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;

public class DatabaseHelper extends SQLiteOpenHelper {
    public static final String DATABASE_NAME = "main.db";
    private static final String TAG = DatabaseHelper.class.getName();
    public static final int DATABASE_VERSION = 1;

    public DatabaseHelper(Context context){
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
       RMSMngr.createTables(sqLiteDatabase);
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

        switch (i){
            case 1: {
                //execSQL("alter table tbl_stores add column store_address Text", db);
                //db.execSQL(TblEachUnitStockDao.CREATE_TABLE_EACH_UNIT_STOCK_QUERY);
                //execSQL("UPDATE tbl_projects SET show_all_secondary_sku = 1 ", db);

            }
        }
    }

    private void execSQL(String sql, SQLiteDatabase db) {
        try {
            db.execSQL(sql);
        } catch (SQLiteException ex) {
            ex.printStackTrace();
        }
    }
}
