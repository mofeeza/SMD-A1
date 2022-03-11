interface IPayrollCalculator
{
    var id : Int
    var name : String
    fun calculate_payroll(): Number
    {
        return 0
    }
}

open class Employee
{
    var id : Int = 0
    var name : String = ""
}

open class SalaryEmployee : Employee(), IPayrollCalculator
{
    override fun calculate_payroll(): Number
    {
        println("Salary Employee")
        return 0
    }
}

class CommissionEmployee : SalaryEmployee(), IPayrollCalculator
{
    override fun calculate_payroll(): Number
    {
        println("Commission Employee")
        return 0
    }
}

class HourlyEmployee : Employee(), IPayrollCalculator
{
    override fun calculate_payroll(): Number
    {
        println("Hourly Employee")
        return 0
    }
}

fun main()
{
    val sal = SalaryEmployee()
    val hou = HourlyEmployee()
    val com = CommissionEmployee()
    sal.calculate_payroll()
    hou.calculate_payroll()
    com.calculate_payroll()
}