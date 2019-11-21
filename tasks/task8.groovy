import groovy.json.JsonSlurper 

def parseAndFilterJson(string){
    def jsonSlurper = new JsonSlurper()
    def object = jsonSlurper.parseText(string)
    return object.findAll { Integer.toString(it.value).collect { Integer.parseInt(it) }.sum() == 9 }
}

return this
