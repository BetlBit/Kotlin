fun main() {
	var array: Array<Int> = arrayOf(1, 2, 9) // Впишите нужный массив
	var goal: Int = 10 // Впишите заданное число

	println(isSumNumber(array, goal))
}

fun isSumNumber(arr: Array<Int>, goal: Int, i: Int = 0) : Boolean {
	var n: Int = arr.size
		
	if (goal <= 0 || i >= n) return goal == 0;
		else return isSumNumber(arr, goal - arr[i], i + 1) || isSumNumber(arr, goal, i + 1);
}