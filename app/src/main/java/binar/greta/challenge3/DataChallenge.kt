package binar.greta.challenge3

import android.os.Parcel
import android.os.Parcelable

data class DataChallenge(
        val usia : Int,
        val alamat : String?,
        val pekerjaan : String?
) : Parcelable {

    constructor(parcel: Parcel) : this(
            parcel.readInt(),
            parcel.readString(),
            parcel.readString()) {
    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeInt(usia)
        parcel.writeString(alamat)
        parcel.writeString(pekerjaan)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<DataChallenge> {
        override fun createFromParcel(parcel: Parcel): DataChallenge {
            return DataChallenge(parcel)
        }

        override fun newArray(size: Int): Array<DataChallenge?> {
            return arrayOfNulls(size)
        }
    }
}
