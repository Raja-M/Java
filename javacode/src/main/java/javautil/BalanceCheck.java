package javautil;

/*
 Account
 balance (decimal number)
 name: (string)
 accountType (e.g. credit card, checking, savings)
 openedDate: (time stamp)

 for example
 balance: 1000.00
 name : Chase Freedom
 accountType : credit card
 opened Date: 6/19/2004

Compare 2 sets of accounts for a user - one set from the current month, and one set from the prior month, e.g.:
previous: [ { "balance":2000.0, "name":"Chase Freedom", "accountType":"credit_card", "openedDate":1111680799 }, { "balance":100.0, "name":"Citibank", "accountType":"credit_card", "openedDate":1000680799 } ]
 current: [ { "balance":1000.0, "name":"Chase Freedom", "accountType":"credit_card", "openedDate":1111680799 }, { "balance":500.0, "name":"American Express", "accountType":"credit_card", "openedDate":1222680799 } ]

 * print out "<name>: <balance change>" for accounts that are in both months, e.g. "Chase Freedom: -1000"
 * print out "<name>: added" for those that are in the current month but not the previous month, e.g. "American Express: added"
 * print out "<name>: deleted" for those that are in the previous month but not the current month, e.g. "Citibank: deleted"


 */
public class BalanceCheck {

    public static void main( String args[]){
        System.out.println(" Balance Check Annotation ");

    }
}
