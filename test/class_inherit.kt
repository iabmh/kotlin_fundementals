import kotlin.math.PI
fun main() {
    val Squarecabin = squarecabin(6,50.0)
    println("Building metirial : ${Squarecabin.BuildMetirial}")
    println("Cpacaity : ${Squarecabin.capacity}")
    println("Has any room left : ${Squarecabin.hasroom()}")
    println("Floor area : ${Squarecabin.FloorArea()}")
    val Roundhut = RoundHut(5,15.5)
    with(Roundhut) {
        println("Building Metirial : ${BuildMetirial}")
        println("Capacity :${capacity}")
        println("avalable = ${hasroom()}" )
        println("area = ${FloorArea()}")
        }
    val Roundtower = RoundTower(5,15.5)
    with(Roundtower){
        println("Building Metirial : ${BuildMetirial}")
        println("Capacity :${capacity}")
        println("avalable = ${hasroom()}" )
        println("area = ${FloorArea()}") 
    }
}
abstract class Dwelling(private var residents: Int){
    abstract val BuildMetirial: String
    abstract val capacity : Int
    
    fun hasroom(): Boolean {
        return residents<capacity
    }
    abstract fun FloorArea(): Double
}
class squarecabin(residents:Int,val length:Double) : Dwelling(residents){
        override val BuildMetirial = "wood"
        override val capacity = 6
    
    	override fun FloorArea():Double{
            return length*length
        }
}
open class RoundHut(residents:Int ,val radius:Double) : Dwelling(residents){
    override val BuildMetirial = "straw"
    override val capacity = 6
    override fun FloorArea():Double{
            
            return PI*radius*radius
            
        }
}
class RoundTower(residents: Int, radius: Double, 
    val floors: Int = 2) : RoundHut(residents, radius){
    override val  BuildMetirial = "stone"
    override val capacity = 6
    
    override fun FloorArea():Double{
        return super.FloorArea()*floors
    }
}
