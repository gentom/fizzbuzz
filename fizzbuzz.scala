//FizzBuzz
/*
for(i <- 1 to 50) {
  if(i % 15 == 0) {
    println("FizzBuzz")
  }else if (i % 3 == 0) {
    println("Fizz")
  }else if (i % 5 == 0) {
    println("Buzz")
  }else {
    println(i)
  }
}
*/

object FizzBuzz extends App {

  1 to 50 foreach { n =>

    println((n % 3, n % 5) match {

      case (0, 0) => "FizzBuzz"

      case (0, _) => "Fizz"

      case (_, 0) => "Buzz"

      case _ => n

    })

  }

}

/*
def FizzBuzz(i: Int) = (i % 3, i % 5) match {
  case (0, 0) => "FizzBuzz"
  case (0, _) => "Fizz"
  case (_, 0) => "Buzz"
  case _      => i
}
(1 to 50).map(FizzBuzz).foreach(println)
*/