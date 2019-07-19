package com.pandaclouds.android.pages.sdk

import android.app.Application
import android.content.Context
import android.support.v7.app.AppCompatActivity
import org.json.JSONObject
import java.io.IOException
import java.nio.charset.Charset
import java.util.*
import android.content.res.AssetManager
import android.os.Parcel
import android.os.Parcelable
import android.webkit.JsPromptResult
import java.io.InputStream


class PCJSON() : Parcelable {



    var json : JSONObject? = null
    var jsonString:String? = null

    constructor(parcel: Parcel) : this() {
        //jsonfileName = parcel.readString()
        jsonString = parcel.readString()
    }

    constructor(dictionary: JSONObject) : this() {
        this.json = dictionary
    }
// For JSONStrings
    constructor(string:String) : this() {

    var returnString = "hello"
    if(string.contains("“")){
      //  for (item in string.indices) {

            returnString = string.replace("“" , "\"").replace("”" , "\"")
       // }
    }else{
        returnString = string
    }

        json = JSONObject(returnString)
        var check = json
        //this.init() gets called after every construstor
    }
// For the file name that contains a Json String
    constructor(jsonfileName:String,c: Context) : this() {

    if(jsonfileName != null){
        try {
            val am = c.getAssets()
            val thaTing : InputStream = am.open(jsonfileName)

            val size = thaTing.available()

            val buffer = ByteArray(size)

            thaTing.read(buffer)

            thaTing.close()

            jsonString = String(buffer, Charset.defaultCharset())


        } catch (ex: IOException) {
            ex.printStackTrace()

            //return null
        }
    }

    if(this.jsonString != null){


        json = JSONObject(jsonString)


    }

    if(json != null){

    }else{

    }
    //this.init() gets called after every constructor

}
    fun getString(key: String):String {
        return this.get(key).toString()
    }

    fun get(key: String):Any? {

        var objecting : Any ? = null


        if(json != null && json!!.has(key)) {
            objecting=  json!!.get(key)

        }
        return objecting
    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {
       // parcel.writeString(jsonfileName)
        parcel.writeString(jsonString)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<PCJSON> {
        override fun createFromParcel(parcel: Parcel): PCJSON {
            return PCJSON(parcel)
        }

        override fun newArray(size: Int): Array<PCJSON?> {
            return arrayOfNulls(size)
        }
    }

}