package handler
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
import entities.Product
import java.lang.reflect.Type

class ProductHandler {
    private val productList  = mutableListOf<Product>()

    fun addToProduct(product : Product) { productList.add(product) }

    fun  showAllProduct(){
        if (productList.isNotEmpty()){
            productList.forEach{ println(it) }
        } else {
            println("محصولی جهت نمایش وجود ندارد!")
        }
    }

    fun toJson(): String {
        val gson = Gson()
        return gson.toJson(productList)
    }

    fun fromJson(json : String) : List<Product> {
        val gson = Gson()
        val listType : Type = object  : TypeToken<MutableList<Product>>() {}.type
        val result = gson.fromJson<List<Product>>(json,listType)
        productList.clear()
        productList.addAll(result)
        return productList
    }

    fun removeProduct(sky : String) { productList.removeIf { it.sku.lowercase() == sky.lowercase() } }

    private fun getProductBySku(sku : String) : Product? { return productList.first { it.sku.lowercase() == sku.lowercase() } }

    fun incrementProductQuantity(sky : String,count : Int){
        val product = getProductBySku(sku = sky) ?: throw Exception ("محصول مورد نظر یافت نشد!")
            product.quantity += count
    }
    fun decreaseProductQuantity(sky : String,count : Int){
        val product = getProductBySku(sku = sky) ?: throw Exception ("محصول مورد نظر یافت نشد!")
        if(product.quantity - count < 0) {
            throw  Exception("تعداد $count در انبار شما موجود نمیباشد!")
        }
        product.quantity -= count
    }
}