package com.example.mcpc.vo

import android.os.Parcel
import android.os.Parcelable

class StoreVO(var sNum: Int, var sId: String?, var sPw: String?, var sName: String?, var sMobile: String?)
    :Parcelable{
    constructor(sId: String?, sPw: String?, sName: String?, sMobile: String?) : this(0, sId, sPw, sName, sMobile)
    constructor(source: Parcel) : this(
        source.readInt(),
        source.readString(),
        source.readString(),
        source.readString(),
        source.readString()
    )

    companion object CREATOR : Parcelable.Creator<StoreVO> {
        override fun createFromParcel(parcel: Parcel): StoreVO {
            return StoreVO(parcel)
        }

        override fun newArray(size: Int): Array<StoreVO?> {
            return arrayOfNulls(size)
        }
    }
    override fun describeContents(): Int {
        return 0
    }

    override fun writeToParcel(dest: Parcel, flags: Int) {
        dest.writeInt(sNum)
        dest.writeString(sId)
        dest.writeString(sPw)
        dest.writeString(sName)
        dest.writeString(sMobile)
    }

    override fun toString(): String {
        return "$sNum/$sName/$sMobile"
    }
}