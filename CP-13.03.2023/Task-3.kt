fun main() {
	var customerArray = CustomerArray()
	customerArray.createArr(5, 1) // Выводит [I@3d4eac69
}

class CustomerArray {
	fun createArr(length: Int, untilNumber: Int) : IntArray {
		// Примитивный тип массива
		var arr = IntArray(length) { it * untilNumber } // Должен вывести 0, 1, 2, 3, 4
		for (item in arr) {
			println(item)
		}
		return arr;
	}
}