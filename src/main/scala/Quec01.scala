import scala.io.StdIn.readLine

object Quec01 {

    def main(args: Array[String]): Unit = {
      println();
      println("Enter the text: ")
      val text = readLine()

      println();
      println("Enter the shift value: ")
      val shift = readLine().toInt // Convert the shift value to an integer

      println();
      println("Do you want to encrypt your text (y/n): ")
      val ans1 = readLine()

      println();
      val encryptedText = encryFun(text, shift);
      if (ans1 == "y") { // Use double equals (==) for string comparison
        println("Here is your encrypted text: " + encryptedText) // Print the result with println
      } else {
        println("Encryption skipped.")
      }

      println();
      println("Do you want to decrypt your text again (y/n): ")
      val ans2 = readLine();

      println();
      if (ans2 == "y") { // Use double equals (==) for string comparison
        println("Here is your decrypted text: " + decryFun(encryptedText, shift)) // Print the result with println
      } else {
        println("Decryption skipped.")
      }
    }

    def encryFun(text: String, shift: Int): String = {
      var encrypted_text = ""

      for (char <- text) {
        if (char.isUpper) {
          encrypted_text = encrypted_text + ((char - 'A' + shift) % 26 + 'A').toChar
        } else if (char.isLower) {
          encrypted_text = encrypted_text + ((char - 'a' + shift) % 26 + 'a').toChar
        } else {
          encrypted_text = encrypted_text + char
        }
      }
      encrypted_text
    }

    def decryFun(encryText: String, shift: Int): String = {
      encryFun(encryText, -shift)
    }
}
