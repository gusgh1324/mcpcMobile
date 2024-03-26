package com.example.mcpc.dao

import android.content.Context
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper

// DataBase 를 없으면 생성하고 있으면 업데이트, table 을 생성하고 검색할 수 있도록 해주는 객체
class DbOpenHelper(
    ctx: Context?, name: String?, factory: SQLiteDatabase.CursorFactory?, ver: Int
): SQLiteOpenHelper(ctx, name, factory, ver){

    override fun onCreate(db: SQLiteDatabase?) {
        /*user 테이블*/
        db?.execSQL("create table if not exists user " +
                "(_uNum integer primary key autoincrement,uId text, uPw text, uName text, " +
                "uage integer, uMobile text)")
//        /*store 테이블*/
//        db?.execSQL("create table if not exists store " +
//                "(_sNum integer primary key autoincrement,sId text, sPw text, sName text, " +
//                "sMobile text)")
    }

    override fun onUpgrade(db: SQLiteDatabase?, oldVersion: Int, newVersion: Int) {
        if (oldVersion != newVersion){
            db?.execSQL("drop table if exists user")
            onCreate(db)
        }
        if (oldVersion != newVersion){
            db?.execSQL("drop table if exists store")
            onCreate(db)
        }
    }
}