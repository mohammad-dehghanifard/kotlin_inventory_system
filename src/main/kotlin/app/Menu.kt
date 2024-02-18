package app

class Menu {
    companion object {
        fun getMenu() : Int {
            println("به پنل انبارداری خوش آمدید! لطفا یکی از گزینه های زیر را انتخاب کنید")
            println(" نمایش محصولات موحود <-[1]")
            println(" درج محصول <-[2]")
            println(" افزایش موجودی یک محصول <-[3]")
            println(" کاهش موجودی یک محصول <-[4]")
            println(" حذف محصول <-[5]")
            println(" خروج از سامانه <-[0]")
            return readln().toInt()
        }
    }
}