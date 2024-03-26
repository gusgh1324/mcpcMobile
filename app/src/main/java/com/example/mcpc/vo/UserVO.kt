package com.example.mcpc.vo

import android.os.Parcel
import android.os.Parcelable

class UserVO(var num: Int, var id: String?, var pw: String?, var name: String?, var age: Int, var mobile: String?)
    :Parcelable {
    constructor(id: String?, pw: String?, name: String?, age: Int, mobile: String?) : this(0, id, pw, name, age, mobile)
    constructor(source: Parcel) : this(
        source.readInt(),
        source.readString(),
        source.readString(),
        source.readString(),
        source.readInt(),
        source.readString()
    )
    companion object CREATOR : Parcelable.Creator<UserVO> {
        override fun createFromParcel(source: Parcel): UserVO {
            return UserVO(source)
        }

        override fun newArray(size: Int): Array<UserVO?> {
            return arrayOfNulls<UserVO>(size)
        }
    }

    override fun describeContents(): Int {
        return 0
    }

    override fun writeToParcel(dest: Parcel, flags: Int) {
        dest.writeInt(num)
        dest.writeString(id)
        dest.writeString(pw)
        dest.writeString(name)
        dest.writeInt(age)
        dest.writeString(mobile)
    }

    override fun toString(): String {
        return "$num/$name/$age/$mobile"
    }
}
