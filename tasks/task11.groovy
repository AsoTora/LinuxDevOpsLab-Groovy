def gstring(inp, num) {
    def list = []
    for(int x = 1; x <= 3; x++)
        x == num ? list.add(x.toString() + "(" + inp + ")") : list.add(x.toString() + "()")  
    return list.join(" ")
}

return this