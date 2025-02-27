import scala.io.StdIn.readLine

object Quec02 {
  def main(args: Array[String]): Unit = {
    println();
    print("Enter a integer: ");
    val number = readLine().toInt;

    println(categorize(number));
  }

  def categorize: Int => String = {
    case n if n % 3 == 0 && n % 5 == 0 => "Multiple of Both Three and Five"
    case n if n % 3 == 0 => "Multiple of Three"
    case n if n % 5 == 0 => "Multiple of Five"
    case _ => "Not a Multiple of Three or Five"
  }
}
