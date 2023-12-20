Exception - abnormal termination of program

                __________Throwable_________
               |                            |
        ___Exception___                   Error
        |             |                     |
CompileTime          RunTime                - StackOverFlowError
 |                    |                     - VirtualMachineError
 - IOException        - ArithmaticE         - OutOfMemoryError
 - SQLException       - NullPointerE
 - ClassNotFoundE     - NumberFormatE
                      - IndexOutOfBoundsE

try -> risk code 
catch -> through object
finally -> always executed
throw -> create Exception
throws -> throw exception
