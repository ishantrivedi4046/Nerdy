package com.astro.kidgeek

import android.os.Parcel
import android.os.Parcelable

class Data(
    val imageId: Int,
    val imageBackgroundId: Int,
    val name: String?,
    val desc: String?,
    val head1: Int,
    val head2: Int,
    val h1text: Int,
    val h2text: Int,
    val f1: Int, val f2: Int, val f3: Int, val f4: Int, val f5: Int
) :
    Parcelable {
    constructor(parcel: Parcel) : this(
        parcel.readInt(),
        parcel.readInt(),
        parcel.readString(),
        parcel.readString(),
        parcel.readInt(),
        parcel.readInt(),
        parcel.readInt(),
        parcel.readInt(),
        parcel.readInt(),
        parcel.readInt(),
        parcel.readInt(),
        parcel.readInt(),
        parcel.readInt()
    ) {
    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeInt(imageId)
        parcel.writeInt(imageBackgroundId)
        parcel.writeString(name)
        parcel.writeString(desc)
        parcel.writeInt(head1)
        parcel.writeInt(head2)
        parcel.writeInt(h1text)
        parcel.writeInt(h2text)
        parcel.writeInt(f1)
        parcel.writeInt(f2)
        parcel.writeInt(f3)
        parcel.writeInt(f4)
        parcel.writeInt(f5)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<Data> {
        override fun createFromParcel(parcel: Parcel): Data {
            return Data(parcel)
        }

        override fun newArray(size: Int): Array<Data?> {
            return arrayOfNulls(size)
        }
    }
}