package enums

import java.util.*

class Account (val accountNumber :String, val type: String){
    override fun toString(): String {
        return """
            Account number: $accountNumber
            Account Type: $type
        """.trimIndent()
    }
}

object AccountCreator{
    fun create(type: AccountType): Account{
        val accountNumber = UUID.randomUUID().toString().substring(0, 10)
        val accType = when(type){
            AccountType.SAVINGS -> "Savings"
            AccountType.CURRENT -> "Current"
            AccountType.FIXED_DEPOSIT -> "Fixed deposit"
        }
        return Account(accountNumber, accType)
    }
}

