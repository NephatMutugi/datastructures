package org.neph.kotlin

import com.google.gson.Gson
import com.google.gson.GsonBuilder
import com.google.gson.JsonObject
import java.util.*

/**
@ Author NMuchiri
 **/

fun main() {

    myFunction()
    println(addUp(5,3))
    println(avg(3.2,5.3))

    val jsonString =
        "{\"corporateCreditInformationRecord\":{\"currencyType\":\"RWF\",\"country\":\"RW\",\"companyRegNo\":\"\",\"dateAccountUpdated\":\"20221129\",\"postalCode\":\"\",\"telephone3\":\"0788866618\",\"telephone2\":\"0788866618\",\"telephone1\":\"0788866618\",\"physicalAddressPlotNumber\":\"\",\"daysInArrears\":\"0\",\"facsimile1\":\"\",\"facsimile2\":\"\",\"institution\":\"SOEURS PALOTTINES REGION MASAKA\",\"emailAddress\":\"\",\"telephone6\":\"0788866618\",\"telephone5\":\"0788866618\",\"telephone4\":\"0788866618\",\"openingBalance\":\"5400000000\",\"companyRegistrationDate\":\"20170501\",\"interestRateatDisbursement\":\"\",\"sectorOfActivity\":\"Religious Institutions/Churches\",\"availableCredit\":\"5400000000\",\"companyCeaseDate\":\"\",\"accountRepaymentTerm\":\"BUL\",\"accountType\":\"I\",\"currentBalance\":\"5400000000\",\"taxNumber\":\"\",\"accountOwner\":\"P\",\"classification\":\"1\",\"physicalAddressDistrict\":\"NYARUGENGE\",\"scheduledPaymentAmount\":\"0\",\"actualPaymentAmount\":\"0\",\"dateAccountOpened\":\"20220210\",\"physicalAddressProvince\":\"UMUJYI WA KIGALI\",\"currentBalanceIndicator\":\"C\",\"postalAddressNumber\":\"\",\"approvalDate\":\"20221129\",\"physicalAddressSector\":\"Masaka\",\"dateAccountClosed\":\"20230101\",\"firstPaymentDate\":\"20230210\",\"industry\":\"Religious Institutions/Churches\",\"dateClosed\":\"\",\"accountStatus\":\"A\",\"termsDuration\":\"2\",\"lastPaymentDate\":\"20230101\",\"physicalAddressCell\":\"OL02000765\",\"physicalAddressLine2\":\"KICUKIRO\",\"tradingName\":\"SOEURS PALOTTINES REGION MASAKA\",\"physicalAddressLine1\":\"MASAKA KICUKIRO\",\"physicalAddressPostalCode\":\"\",\"nature\":\"23\",\"vatNo\":\"\",\"numberofLoanJoinParticipants\":\"\",\"accountNumber\":\"AA2233301PNW\",\"finalPaymentDate\":\"20230210\",\"installmentsInArrears\":\"0\",\"amountPastDue\":\"0\",\"category\":\"11\"},\"recordType\":\"CI\"}\n"
    val gson = GsonBuilder().setPrettyPrinting().create()
    println("ACCOUNT HOLDER: \n${gson.toJson(setAccountHolder(jsonString))}")

}

fun setAccountHolder(jsonString: String): AccountHolder{
    val gson = Gson()
    val jsonObject: JsonObject = gson.fromJson(jsonString, JsonObject::class.java)
    val accountOwner = jsonObject.get("corporateCreditInformationRecord").asJsonObject.get("accountOwner").asString
    val accountNumber = jsonObject.get("corporateCreditInformationRecord").asJsonObject.get("accountNumber").asString
    val physicalAddressLine1 = jsonObject.get("corporateCreditInformationRecord").asJsonObject.get("physicalAddressLine1").asString
    val physicalAddressLine2 = jsonObject.get("corporateCreditInformationRecord").asJsonObject.get("physicalAddressLine2").asString
    val accountStatus = jsonObject.get("corporateCreditInformationRecord").asJsonObject.get("accountStatus").asString
    val industry = jsonObject.get("corporateCreditInformationRecord").asJsonObject.get("industry").asString
    val recordType = jsonObject.get("recordType").asString

    return AccountHolder(accountOwner, accountNumber, physicalAddressLine1, physicalAddressLine2, accountStatus, industry, recordType)

}
// The syntax of a function - fun stands for function
fun myFunction(){
    // The body of a function
    println("myFunction was called")

    var nullableName: String = "Nephat"
//    nullableName = null
    var len = nullableName.lowercase(Locale.getDefault())
}

// This function has two parameters and returns a value of type Int
fun addUp(a: Int, b: Int): Int{
    // the return keyword indicates that this function will return the following value
    // once this function is called and executed
    return (a+b)
}

fun avg(a: Double, b: Double): Double {
    return  (a + b)/2
}

data class AccountHolder(
    val accountOwner: String,
    val accountNumber: String,
    val physicalAddressLine1: String,
    val physicalAddressLine2: String,
    val accountStatus: String,
    val industry: String,
    val recordType: String
)