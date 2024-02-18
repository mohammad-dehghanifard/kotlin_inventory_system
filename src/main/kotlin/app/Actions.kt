package app

import coroutines.WriteFileCoroutines
import entities.Product
import handler.ProductHandler

class Actions {
    companion object {
        fun addProduct(handler: ProductHandler, writer: WriteFileCoroutines) {
            println("شناسه محصول جدید را وارد کنید")
            val sku : String = readln()
            println("نام محصول را وارد کنید")
            val name : String = readln()
            println("توضیحات  محصول را وارد کنید")
            val description : String = readln()
            println("تعداد  محصول را وارد کنید")
            val quantity : Int = readln().toInt()
            println("قیمت  محصول را وارد کنید")
            val price : Long = readln().toLong()
            val product = Product(name = name,description = description,sku = sku,quantity = quantity, price = price)
            handler.addToProduct(product)
            writer.write(handler.toJson())
            println("محصول جدید با موفقیت اضافه شد!")
        }
        fun increaseProduct(handler: ProductHandler, writer: WriteFileCoroutines) {
            println("شناسه محصوا را وارد کنید")
            val sku = readln()
            println("تعدادا را وارد کنید")
            val input = readln().toInt()
            handler.incrementProductQuantity(sky = sku, count = input)
            println("تعداد موجودی انبار با موفقیت افزایش یافت!")
            writer.write(handler.toJson())
        }
        fun decreaseProduct(handler: ProductHandler, writer: WriteFileCoroutines) {
            println("شناسه محصوا را وارد کنید")
            val sku = readln()
            println("تعدادا را وارد کنید")
            val input = readln().toInt()
            handler.decreaseProductQuantity(sky = sku, count = input)
            println("تعداد موجودی انبار با موفقیت کاهش یافت!")
            handler.toJson()
        }
        fun deleteProduct(handler: ProductHandler, writer: WriteFileCoroutines) {
            println("شناسه محصوا را وارد کنید")
            val sku = readln()
            handler.removeProduct(sku)
            println("محصول مورد نظر با موفقیت حذف شد!")
            handler.toJson()
        }
    }
}