Interface Protocal{
    fun next() : Int
}

open class Player : Protocal{
    var name : String = ""
    open fun next(): Int {
        println("Player")
        return 0
    }
}

class HumanPlayer : Player(){
    override fun next(): Int {
        println("HumanPlayer")
        return 0
    }
}

open class NaiveAI : Player(){
    override fun next(): Int {
        println("NaiveAI")
        return 0
    }
}

class BinarySearch : NaiveAI(){
    override fun next(): Int {
        println("BinarySearch")
        return 0
    }
}

class SuperAI : NaiveAI(){
    override fun next(): Int{
        println("SuperAI")
        return 0
    }
}

class Game{
    var secret_number : Int = 0
    var high : Int = 0
    var low : Int = 0
    var win_flag :Boolean = false
    var player : Player = NULL
    fun Game(player : Player){
        println("Game")
    }
    fun run(): Void{
        println("Run")
        return NULL
    }
    fun hasWon() : Boolean{
        println("Won, but at what cost")
        return false
    }
}


int main(){
    var ply = Player()
    ply.next()
    var NAI = NaiveAI()
    NAI.next()
    var HP = HumanPlayer()
    HP.next()
    var SP = SuperAI()
    SP.next()
    var BS = BinarySearch()
    BS.next()
    var G = Game()
    G.Game()
    G.Run()
    G.hasWon()
}