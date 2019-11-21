def mulEvenOdd(list){
    def isOdd = { it%2 != 0 }
    list.each{
        it = (isOdd(it)) ? it*3 : it*2
    }
    return list
}

return this