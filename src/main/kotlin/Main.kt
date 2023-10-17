fun main(args: Array<String>) {
    val wordList = listOf<Word>(Word("Monyet", "Monkey"), Word("Babi", "Pig"))
    val quiz = GenerateQuiz.generate(wordList, 2)
    DisplayQuiz.start(quiz)
}