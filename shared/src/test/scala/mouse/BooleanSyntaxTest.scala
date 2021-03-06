package mouse

import cats.syntax.either._

class BooleanSyntaxTest extends MouseSuite {

  true.option(1) shouldEqual Option(1)

  false.option(1) shouldEqual Option.empty[Int]

  true.xor("error", 1) shouldEqual Either.right(1)

  false.xor("error", 1) shouldEqual Either.left("error")

}
