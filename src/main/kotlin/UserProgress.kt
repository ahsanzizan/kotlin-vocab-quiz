class UserProgress {
    private var totalQuestions: Int = 0
    private var correctAnswers: Int = 0

    fun updateProgress(isCorrect: Boolean) {
        totalQuestions++
        if (isCorrect) {
            correctAnswers++
        }
    }

    fun displayProgress() {
        println("Current progress: $correctAnswers out of $totalQuestions questions correct.")
    }
}