object DecToHex extends App {

  /**
   * dec2hex
   * converts decimal number to text representation of hexadecimal number:
   *
   * dec2hex(14)     // E
   * dec2hex(1023)   // 3FF
   * dec2hex(122)    // 7A
   *
   */

  def dec2hex(n: Int): String = {

    def getChar(i: Int ): String = "0123456789ABCDEF".charAt(i).toString

    val r = n % 16

    if (n - r == 0) {
      getChar(r)
    } else {
     dec2hex((n - r)/16) + getChar(r)
    }

  }


}