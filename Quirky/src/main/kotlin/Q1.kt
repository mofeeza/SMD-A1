interface Veh
{
    fun functIon()
    {
    }
}

interface Boat:Veh
{
    override fun functIon()
    {
        print("Water Vehicle")
    }
}

interface Car:Veh
{
    override fun functIon()
    {
        print("Ground Vehicle")
    }
}

class ACar : Car, Boat
{
    override fun functIon()
    {
        print("Grter Vehicle")
    }
}

fun main()
{
    var veh = ACar()
}