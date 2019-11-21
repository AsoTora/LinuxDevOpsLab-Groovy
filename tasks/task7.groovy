def encryptThis(string){
    def res = []
    for (String word : string.split(" ")) {
        res << (int) word[0] + word[-1] + word[2..-2] + word[1]
    }
    return res.join(" ")
}

return this 