package entities

import com.google.gson.Gson

data class Product(
    val name : String,
    val description : String,
    val sku : String,
    var price : Long,
    var quantity : Int
) {
    fun toJson() : String {
        val gson = Gson()
        return gson.toJson(this)
    }

    companion object {
        fun fromJson(json: String): Product {
            val gson = Gson()
            return gson.fromJson(json, Product::class.java)
        }
    }
}
