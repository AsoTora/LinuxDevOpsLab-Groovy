def mulEvenOdd(list){
    def isOdd = { it%2 != 0 }
    res = list.collect{
        return (isOdd(it)) ? it.multiply(3) : it.multiply(2)
    }
    return res
}

return this