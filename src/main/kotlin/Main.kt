 fun main(args: Array<String>) {


     var nota1: Float = 0.0F
     var nota2:  Float = 0.0F
     var nota3: Float = 0.0F
     var nota4:  Float = 0.0F
     println("Informe a primeira nota:")
     nota1 = readLine()!!.toFloat()
     if (nota1 < 0) {
         println(" Nota invalida")
     } else {
         println("Informe a segunda nota:")
         nota2 = readLine()!!.toFloat()
         if (nota2 < 0) {
             println(" Nota invalida")
         } else {
             println("Informe a terceira nota:")
             nota3 = readLine()!!.toFloat()
             if (nota3 < 0) {

             } else {
                 println("Informe a quarta nota:")
                 nota4 = readLine()!!.toFloat()
                 if(nota4<0){
                     println("Informe a quarta nota:")
                 }else{
                     var media:Float =(nota1+nota2+nota3+nota4)/4

                     if(media<=4){
                         println("Aluno reprovado! Media $media")
                     }else if(media>4 && media <=5){
                         println("Aluno Regular! Media $media")
                     }else if(media>5 && media <=8){
                         println("Media Boa! Media $media")
                     }else if(media>8){
                         println("Media Excelente! Media $media")
                     }

                 }

             }

         }

     }

 }