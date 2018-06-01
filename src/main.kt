import java.util.*

/*
fun main(args: Array<String>) {
    val r = Array(100) { Random().nextInt() }
    val n = MaxNum(0)
    r.forEach { n = it }
}

class MaxNum(s: Int) {
    private var x: Int = s
        set(n) {
            field = if (field < n) n else field
        }
    infix operator fun plusAssign(n: Int) {
        x =
    }
}

*/

open class Person(var name: String, var lvl: Int = 1, var exp: Double = 0.0, var hp: Double = 100.0, var getlvl: Double = 200.0, var maxhp: Double = 100.0){
    fun getXp(xp: Double){
        if (exp + xp >= getlvl)
            getLvl(xp)
        else
            exp += xp;
    }

    fun getLvl(xp: Double){
        exp += xp
        while(exp >= getlvl) {
            print("Level up")
            lvl++
            exp -= getlvl
        }
    }

    fun deathPenalty(){
        exp /= 2.0
        hp = maxhp * 0.05
    }

}

fun main(args: Array<String>) {
    val x = Person("Person")
}





