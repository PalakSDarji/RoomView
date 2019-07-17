package com.palak.roomview.dsl

data class Person(var name: String? = null,
                  var age: Int? = null,
                  var address: Address? = null)

data class Address(var street: String? = null,
                   var number: Int? = null,
                   var city: String? = null)


fun person(block: Person.() -> Unit): Person{
    val p = Person()
    p.block()
    return p
}

fun address(block: Address.() -> Unit) : Address{
    val a = Address()
    a.block()
    return a
}