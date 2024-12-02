def countElements(list) {
    def elementCount = [:]
    list.each { element ->
        elementCount[element] = (elementCount[element] ?: 0) + 1
    }
    return elementCount
}

def list = [1, 3, 4, 5, 1, 5, 4]
println(countElements(list))
