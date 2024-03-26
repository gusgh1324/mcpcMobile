package com.example.mcpc.dao

import android.annotation.SuppressLint
import android.content.ContentValues
import android.content.Context
import android.database.Cursor
import android.database.sqlite.SQLiteDatabase
import com.example.mcpc.vo.UserVO

// Kotlin Singleton 패턴
class DbSqlHandler private constructor(ctx: Context){
    private val openUserHelper: DbOpenHelper = DbOpenHelper(ctx, "user.db", null, 1)
    private val openStoreHelper: DbOpenHelper = DbOpenHelper(ctx, "store.db", null, 1)
    private val sqLiteDatabaseUser: SQLiteDatabase = openUserHelper.writableDatabase
    private val sqLiteDatabaseStore: SQLiteDatabase = openStoreHelper.writableDatabase

    companion object{
        private var sqlHandler: DbSqlHandler? = null
        fun open(ctx: Context): DbSqlHandler {
            if(sqlHandler == null){
                sqlHandler = DbSqlHandler(ctx)
            }
            return sqlHandler as DbSqlHandler
        }
    }
    //
    fun close(): Unit {openUserHelper.close()}
    fun insert(vo: UserVO): Long {
        TODO()
    }
    @SuppressLint("Range")
    fun get(num: Int): UserVO? {
        val cursor : Cursor = sqLiteDatabaseUser.query(
            "user", null, "_uNun=?", arrayOf(num.toString()), null, null, null)
        return if(cursor.moveToNext()){
            val _uNum = cursor.getInt(cursor.getColumnIndex("_num"))
            val uId = cursor.getString(cursor.getColumnIndex("id"))
            val uPw = cursor.getString(cursor.getColumnIndex("pw"))
            val uName = cursor.getString(cursor.getColumnIndex("name"))
            val uAge = cursor.getInt(cursor.getColumnIndex("age"))
            val uMobile = cursor.getString(cursor.getColumnIndex("mobile"))
            UserVO(_uNum, uId, uPw, uName, uAge, uMobile)
        }
        else{
            null
        }
    }
    //
    fun update(vo: UserVO): Int {
        val values = ContentValues()
        values.put("name", vo.uName)
        values.put("age", vo.uAge)
        values.put("mobile", vo.uMobile)
        return sqLiteDatabaseUser.update("user", values, "_uNum=?", arrayOf(vo.uNum.toString()))
    }

    fun delete(num: Int): Unit {
        sqLiteDatabaseUser.delete("user", "_uNum=?", arrayOf(num.toString()))
    }
}