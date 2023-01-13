import kotlin.random.Random

fun main(args: Array<String>) {
    var continuee = true
    while (continuee){
        var health = 7
        var gameState = true
        var computerGuess = Random.nextInt(1,30)
        println(computerGuess)
        println("1 ile 30 Arasında sayı tuttum. Lütfen Tahmin ediniz : ")
        while (gameState){
            println("Lütfen Sayıyı Giriniz : ")
            var userGuess = readLine()?.toInt()
            if (computerGuess == userGuess){
                println("Tebrikler Doğru Tahmin Ettiniz :)")
                gameState = false
            }else{
                if (!(health < 2)){
                    health--
                    println("Yanlış tahmin Kalan Canınız : ${health} Tekar Deneyiniz : ")
                }else{
                    println("Maalesef Bu Eli Kaybettiniz... ${health} ")
                    gameState = false
                }

                }

            }
        println("Oyuna devam etmek isterseniz <y> harfine! devam etmek istemiyorsanız herhangi birisine tıklayınız")
        var userOptionn = readLine().toString()
        if (userOptionn != "y"){
            continuee = false
        }

    }



}