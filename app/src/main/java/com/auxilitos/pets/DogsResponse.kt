package com.auxilitos.pets
import com.google.gson.annotations.SerializedName

data class DogsResponse (@SerializedName("status") var status:String,
                         @SerializedName("message") var images:List<String>)//@SerializedName("") ayuda a poner el nombre
// original y poder cambiar el de afuera como se desee