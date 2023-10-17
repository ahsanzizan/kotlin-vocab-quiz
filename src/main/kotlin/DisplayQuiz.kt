object DisplayQuiz {
    fun start(quiz: List<Word>) {
        val userProgress = UserProgress()

        for ((index, word) in quiz.withIndex()) {
            print("Question ${index + 1}: What is the translation of the word ${word.origin}? ")
            val ans = readln()
            val isCorrect = ans.trim().equals(word.translated, ignoreCase = true)
            if (isCorrect) {
                println("Correct")
            } else {
                println("Incorrect. The correct answer is ${word.translated}")
            }

            userProgress.updateProgress(isCorrect)
        }

        userProgress.displayProgress()
    }
}