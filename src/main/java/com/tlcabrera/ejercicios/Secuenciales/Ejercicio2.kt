package com.tlcabrera.ejercicios.Secuenciales

class Ejercicio2 {
}

fun main() {
    println("Ingrese el nombre de la enfermera: ")
    var nomEnfer:String=readLine().toString()
    println("Ingrese el nombre del bebe: ")
    var nomBebe:String=readLine().toString().lowercase()
    println("Ingrese el nombre del papa: ")
    var nomPadre:String=readLine().toString()
    println("Ingrese el peso del bebe: ")
    var pesoBebe:Double=readLine()!!.toDouble()
    println("Ingrese el mes del bebe: ")
    var mesBebe:Int=readLine()!!.toInt()
    var dosisVacuna:Double=(((pesoBebe+10)/(mesBebe*10))*8)
    println("La enfermera ${nomEnfer} le puso una dosis de vacuna de ${dosisVacuna} L al bebe ${nomBebe} con el peso de ${pesoBebe} Kg y ${mesBebe} meses de nacido del padre ${nomPadre}")

}