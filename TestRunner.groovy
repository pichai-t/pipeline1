
def Test01Runner() {
    def TestA = load "src/TestClass01.groovy"
    println ('2 About to call TestClass01.testMethod1()!!! ')
    TestA.Test01.testMethod1()
}

return this