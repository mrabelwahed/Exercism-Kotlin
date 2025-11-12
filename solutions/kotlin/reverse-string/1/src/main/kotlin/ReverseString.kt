fun reverse(input: String): String {
    var chars = input.toCharArray()
    var l = 0
    var r = chars.lastIndex
    while(l<r) {
        var ch = chars[l]
        chars[l] = chars[r] 
        chars[r]= ch
        l++
        r--
    }
    return String(chars)
}
