package org.example;


/*
        Annotations:

        1. Configuration
        2. ComponentScan
        3. Bean

        4. Component : model, basic class
        5. Service : for business logic
        6. Repository : DAO, db

        7. Autowired  : IOC, Dependency injection

        8. Value
        9. Qualifier

            interface:   Payment

                        method: abstract printBill();

            @Componenet
            @Primary
            class Online implements Payment


            Class    :   Online implements Payment

            Class    :   Offline implements Payment

            core java
            Payment online = new Online();

            Payment offline = new Offline();

            advance java

            @Autowired
            @Qualifier("online")
            Payment onlinePayment;

            @Autowired
            @Qualifier("offline")
            Payment offlinePayment;

            // primary usage:

            @Autowired
            Payment payment;


        10. Scope
        11. PropertySource

        12. Primary

        13. Lazy

        AOP : what is aop in spring

        common class: CommonClass

           AOP   ------->   calcuateSomeThing --------> AOP

        @Around
        method calcuateSomeThing()
        {
                // print who and when
                // start time


                // end time
        }

 */

public class Main {
    public static void main(String[] args) {

    }
}