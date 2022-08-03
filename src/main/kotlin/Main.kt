fun main() {
    var likes = 8
    val message = if (likes % 10 == 1 && likes % 100 != 11) {
        "Это понравилось " + likes + " человеку!"
    } else if (likes == 0) {
        "Пока нет оценок"
    } else {
        "Это понравилось " + likes + " людям!"
    }
    println(message)
}
