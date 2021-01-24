
def Test01Runner() {
    def TestA = load "src/TestClass01.groovy"
    println ('2 About to call TestClass01.testMethod1()!!! ')
    TestA.testMethod1()

    def TestB = load "src/CConstants.groovy"
    println ('XX1 About to call CC.printPara()!! ')
    TestB.printPara()
    println ('XX2 About to call CC.printPara()!! ')

}

return this