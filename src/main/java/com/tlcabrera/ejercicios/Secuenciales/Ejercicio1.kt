package com.tlcabrera.ejercicios.Secuenciales

class Ejercicio1 {
}
//Reto Abuela
fun main() {
    println("Ingrese los grados fahrenheit del horno")
    var gradosF: Double= readLine()!!.toDouble()
    var gradosC: Double=((gradosF-32)/1.8)
    println("La temperatura en grados centigrados de ${gradosF} grados fahrenheit  es ${gradosC} ")

}
