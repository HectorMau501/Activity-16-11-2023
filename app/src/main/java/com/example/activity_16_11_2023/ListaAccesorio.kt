package com.example.activity_16_11_2023

//Objetos complementarios: Declarar un objeto dentro de una clase
//Enlace: https://kotlin

class ListaAccesorio {
    companion object{
        val listaAccesorio = listOf<Accesorio>(
            Accesorio("Gafas", "ABC", "GF001", 102.50f, 1),
            Accesorio("Guantes","XYZ","GF001",300.50f,2),
            Accesorio("Guantes","KLM", "GF001", 250.50f,3),
            Accesorio("Casco","ABC", "GF001", 850.50f,4),
            Accesorio("Chamarra","ABC", "GF001", 2500.50f,5),
            Accesorio("Candado","LOP", "GF001", 150.50f,6),
            Accesorio("Pantalon","XYZ", "GF001", 760.50f,7),
            Accesorio("Llavero","ABC", "GF001", 300.50f,8),
            Accesorio("Retrovisor","XYZ", "GF001", 1300.50f,9),
            Accesorio("Candado","KLM", "GF001", 250.50f,10)

        )
    }
}