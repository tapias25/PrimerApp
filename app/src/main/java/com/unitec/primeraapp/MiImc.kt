package com.unitec.primeraapp

class MiImc {
    //metodo para generar el imc
    fun calcular(peso: float, altura:float):float{
        var imc = peso/(altura*altura)
        return imc
    }
}