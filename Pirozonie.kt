class pie(
    val name: String,
    val testo: String,
    val cream: String,
    val ves: String,
    val kalori: String,
    val price: Double
)
{
    fun info ()
    {
        println("Имя: $name")
        println("Вид теста: $testo")
        println("Крем: $cream")
        println("Вес: $ves грамм")
        println("Количество калорий: $kalori каллорий")
        println("Цена: $price рублей")
    }
}
fun create(): pie {
    println("Введите Имя:")
    val name = readLine()!!
    println("Введите тип теста:")
    val testo = readLine()!!
    println("Введите вид крема:")
    val cream = readLine()!!
    println("Введите вес:")
    val ves = readLine()!!
    println("Введите количество калорий:")
    val kalori = readLine()!!
    println("Введите цену:")
    val price = readLine()!!.toDouble()
    return pie(name,testo,cream,ves,kalori,price)
}
