object Bob {
    fun hey(input: String): String {
        val trimmed = input.trim()
        if(trimmed.isEmpty()){
            return "Fine. Be that way!"
        }
        val isQuestion = trimmed.endsWith("?")
        val hasLetter = trimmed.any{ it.isLetter()}
        val isYelling = hasLetter && trimmed.filter {it.isLetter()}.all{it.isUpperCase()}

        return when {
            isYelling && isQuestion -> "Calm down, I know what I'm doing!"
            isQuestion -> "Sure."
            isYelling -> "Whoa, chill out!"
            else -> "Whatever."
        }
    }
}
