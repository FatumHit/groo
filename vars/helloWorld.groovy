def sayHello() {
    println "Hello"
}

class MyClass {
    MyClass(Script host) {
        host.sayHello()
    }
}

def a = new MyClass(this)
