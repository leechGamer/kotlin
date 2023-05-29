fun isLetterString(s: String?): Boolean {
    if (s.isEmpty()) return false // Only safe (?.) or non-null asserted (!!.) calls are allowed on a nullable receiver of type String?
    
    for (ch in s) { // Not nullable value required to call an 'iterator()' method on for-loop range
        if (!ch.isLetter()) return false
    }
    return true
}
