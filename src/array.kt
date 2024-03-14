fun main() {
    //Accessing an array
    var languages = arrayOf("Kotlin","Javascript","C++","Python")
    println(languages[1] )

    //Reassigning a string
    languages[1] = "PHP"
    println(languages[1])

    //looping through an array
    for (lang in languages){
        println(lang)
    }

    if ("PHP" in languages){
        println("It exists")
    }
    else{
        println("It does not exists")
    }
}