object GenerateQuiz {
    fun generate(words: List<Word>, totalQuestions: Int): List<Word> {
        return words.shuffled().take(totalQuestions);
    }
}