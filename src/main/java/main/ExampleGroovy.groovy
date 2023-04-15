package main

class ExampleGroovy {

    static void groovyMethod(int[] arr) {
        def map = [:]
        def count
        def test = 0
        arr.each { int i ->
            if (map.get(i) == null) {
                count = 0
                for (int j = 0; j < arr.size(); j++) {
                    if (i == arr[j]) {
                        count++
                    }
                }
                map.put(i, count)
                println(test++)
            }
        }
        println("Groovy: " + map)
    }
}
