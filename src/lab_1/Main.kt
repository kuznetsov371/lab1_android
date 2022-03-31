package lab_1
//Поигрался с Kotlin


// pascal style
// a:Int = 5

//Unit = void

// Top-level fun = fun without class
//Встроенные типы:byte,short,int,long;Float,Double;Boolean



fun main(args: Array<String>){
    println("hello world!")

    val a:Float = 5f

    val text:String = """
        dbldt,b  
        tdln
        l;dtn
        """ //сырые строки

    //String template
    val b: Int = 5;
    println("Значение:$b"+"${text.length}")

    val arr:Array<Int> = arrayOf(1,2,3,4,5)
    val arr2:Array<Int> = Array(5,{i->i*i})
    for (i in arr2){
        println(i)
    }

    val c = 10 //Type inference - Вычисление типов

    //Локальные переменные
    //Поля классов -> свойства !

    // val=const;var - можно переназначить
    //везде где можно - val

    // control flow
    //if
    //1.В Котлине нет тернарного оператора
    //2.if может быть как оператором так и выражением
    val max = if(a > b) a else b
    val max2 = if(a > b){
        println(a)
        a
    }else{
        println(b)
        b
    }

    //when = switch
    val x = 5
    when(x){
        0 -> println("x = 0")
        1 -> println("x = 1")
        else -> println("else")
    }
    val y : Int = when(x){
        0,2,4 -> 10
        1 -> 20
        else -> 0
    }

    val food = listOf("apple","strawberry")
    when("apple"){
        in food -> println("яблоки есть")
    }

    when(x){
        in 1..10 -> println("x in range")
    }

    //for
    for(i in food)
        print(food)
    for (num in 1..10)
        println(num)
    for (i in arr.indices)
        println(i)
    for ((idx,value) in arr.withIndex())
        println("index: $idx value: $value ")
    for (el in 1..10 step 2)
        println(el)
    for (el in 10 downTo 1 step 2)
        println(el)
    for (el in 1 until 6) // без 6
        println(el)
    //while - дефолт
}
//top level property

    val d = 5
class Person private constructor(val firstName:String,val lastName:String){     //основной конструктор

    //Блоки инициализации
    init {
        println("Отработал 1 блок")
    }
    init {
        println("Отработал 2 блок")
    }
    init {
        println("Отработал 3 блок")
    }

    //(Доп конструктор)
//    constructor(){
//
//    }

class Rectangle(val width:Double,val height: Double){
    var color: Int = 0
        set(value){
            field = value //теневое поле
        }
}
}
