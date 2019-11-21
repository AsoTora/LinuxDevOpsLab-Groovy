import groovy.json.JsonSlurper 
import groovy.json.JsonOutput 

def parseAndFilterJson(string){
    def jsonSlurper = new JsonSlurper()
    def object = jsonSlurper.parseText(string)
    return JsonOutput.toJson(object.findAll { Integer.toString(it.value).collect { Integer.parseInt(it) }.sum() == 9 })
}

return this
