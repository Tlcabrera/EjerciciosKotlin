package com.tlcabrera.ejercicios.Condicionales

import androidx.core.util.rangeTo

class Ejercicio3 {
}

fun main() {
    //Condicionales Doble

    /*if(n1<10){
        println("Usted Gano")
    }else {
        println("Usted Perdio")
    }
    //Condicionales Anidados
    println("Ingrese el nombre deuna fruta")
    var fruta:String= readLine()!!.toString().lowercase()
    if (fruta=="manzana"){
        println("ingrese el color de la manzana")
        var colorFruta:String= readLine()!!.toString().lowercase()
        if (colorFruta=="rojo"){
            println("Se puede comer la manzana")
        }else if(colorFruta=="verde"){
            println("manzana es para la ensalada")
        }else{
            println("elegio un color de manzana equivocado")
        }
    }else if (fruta=="Fresa"){
        
    }else if (fruta=="uva"){

    }else{
        println("Usted eligió una fruta equivocada")
    }
    //Condicionales Multiples*/
//rangos

   /* println("ingrese un número")
    var n1:Int= readLine()!!.toInt()
    if (n1 in 1..10){
        println("el número ${n1} esta dentro del rango")
    }else{
        println("el número ${n1} no esta dentro del rango")
    }

    println("ingrese una letra")
    var letra:String= readLine()!!.toString().uppercase()
    var char="a" downTo("u")
    var n2=1..10 step 2

    }
    println("Ingrese su edad")
    var edad:Int= readLine()!!.toInt()
    if (edad in 0..14){
        println("Usted no debe estar en este lugar")
    }else if (edad in 15..17){
        println("Usted es menir de edad")

    }else if (edad in 18..100){
        println("Bienvenido")
    }*/
    var result:Int=(0..50).random()
    println(result)
    when (result){
        0-> println("No hay resultados")
        1,2,3,4,5,6-> println("El resultado esta entre 1 y 6")
        in 7..40 -> println("Su resultado esta entre 7 y 50")
        else -> println("fuera de rango")
    }
}