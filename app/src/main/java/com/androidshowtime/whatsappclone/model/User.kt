package com.androidshowtime.whatsappclone.model

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class User(val phoneNumber: String? = null, val  name:String? = null): Parcelable