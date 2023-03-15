fun main() {
	var array: Array<Int> = arrayOf(1, 2, 5, 4, 4, 5, 2, 3, 6, 5) // Впишите нужный массив
	
	array.forEachIndexed { index, element ->
		println("$index : $element") }
}