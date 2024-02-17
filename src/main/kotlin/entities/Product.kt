package entities

data class Product(
    val name : String,
    val description : String,
    val sku : String,
    var price : Long,
    var quantity : Int
)
