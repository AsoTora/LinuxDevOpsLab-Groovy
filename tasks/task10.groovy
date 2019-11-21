def urlText(str){
    def get = new URL(str).openConnection()
    def getRC = get.getResponseCode()
    return get.getInputStream().getText()
}

return this

// if(getRC.equals(200)) {
//     return get.getInputStream().getText()
// }