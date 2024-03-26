package com.example.mcpc.vo

import android.os.Parcel
import android.os.Parcelable

class UserVO(var uNum: Int, var uId: String?, var uPw: String?, var uName: String?, var uAge: Int, var uMobile: String?)
    :Parcelable {
    constructor(uId: String?, uPw: String?, uName: String?, uAge: Int, uMobile: String?) : this(0, uId, uPw, uName, uAge, uMobile)
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
        dest.writeInt(uNum)
        dest.writeString(uId)
        dest.writeString(uPw)
        dest.writeString(uName)
        dest.writeInt(uAge)
        dest.writeString(uMobile)
    }

    override fun toString(): String {
        return "$uNum/$uName/$uAge/$uMobile"
    }
}
