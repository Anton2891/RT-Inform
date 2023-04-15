package main

class ExampleGroovy {

    static void groovyMethod(int[] arr) {
        def map = [:]
        def count
        arr.each { int i ->
            if (map.get(i) == null) {
                count = 0
                for (int j = 0; j < arr.size(); j++) {
                    if (i == arr[j]) {
                        count++
                    }
                }
                map.put(i, count)
            }
        }
        println("Groovy: " + map)
    }
}
