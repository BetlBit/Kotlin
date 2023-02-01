// hardcode
// ==================
// fun main() {
// 	var cat = Cat(1, 0)
// 	var cat1 = Cat(6, 0)
// 	var cat2 = Cat(3, 0)
// 	var cat3 = Cat(0, 0)
// 	var cat4 = Cat(9, 7)
	
// 	println("Cat 1")
// 	println(cat.FindWeight())
// 	println(cat.Feeding())
// 	println(cat.Feeding())
// 	println(cat.FindWeight())
// 	println("\nCat 2")
// 	println(cat1.FindWeight())
// 	println(cat1.Feeding())
// 	println(cat1.Feeding())
// 	println(cat1.FindWeight())
// 	println("\nCat 3")
// 	println(cat2.FindWeight())
// 	println(cat2.Feeding())
// 	println(cat2.Feeding())
// 	println(cat2.FindWeight())
// 	println("\nCat 4")
// 	println(cat3.FindWeight())
// 	println(cat3.Feeding())
// 	println(cat3.Feeding())
// 	println(cat3.FindWeight())
// 	println("\nCat 5")
// 	println(cat4.FindWeight())
// 	println(cat4.Feeding())
// 	println(cat4.Feeding())
// 	println(cat4.FindWeight())
// 	println("\nCat 5 - Meow")
// 	println(cat4.MeowDeath())
// 	println(cat4.MeowDeath())
// 	println(cat4.MeowDeath())

// }

// class Cat (var weight: Int = 0, var meow: Int = 0) {
// 	fun Feeding(): String{
// 		weight += 1
// 		return "After Feeding: $weight"
// 	}
	
// 	fun FindWeight(): String{
// 		return "Weight: $weight"
// 	}
	
// 	fun MeowDeath(): String{
// 		meow += 1
// 		if (meow >= 10) {
// 			return "Meow Death"
// 		} else {
// 			return "Meow: $meow"
// 		}
// 	}
// }


// With cycles
// ==================
fun main() {
	var cat = Cat(1, 3, 3, 3)
	var cat1 = Cat(6, 0, 4, 10)
	var cat2 = Cat(3, 2, 9, 0)
	var cat3 = Cat(1, 4, 1, 4)
	var cat4 = Cat(0, 1, 0, 1)

	println("\nCat 1\n" + cat.Feeding())
	println(cat.MeowDeath())
	println("\nCat 2\n" + cat1.Feeding())
	println(cat1.MeowDeath())
	println("\nCat 3\n" + cat2.Feeding())
	println(cat2.MeowDeath())
	println("\nCat 4\n" + cat3.Feeding())
	println(cat3.MeowDeath())
	println("\nCat 5\n" + cat4.Feeding())
	println(cat4.MeowDeath())
}

class Cat (var weight: Int = 0, var meow: Int = 0, var weightPlus: Int = 0, var meowPlus: Int = 0) {
	fun Feeding(): String{
		var weightCycle = weightPlus + weight
		while (weight < weightCycle){
			weight += 1
		}
		return "After Feeding: $weight"
	}
	
	fun FindWeight(): String{
		return "Weight: $weight"
	}
	
	fun MeowDeath(): String{
		var meowCycle = meowPlus + meow
		while (meow < meowCycle) {
			meow += 1
		}
		if (meow >= 10) {
			return "Meow Death: over $meow"
		} else {
			return "Meow: $meow"
		}
	}
}