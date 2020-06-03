import mill._, scalalib._

object $moduleName$ extends ScalaModule {
  def scalaVersion = "$scala_version$"

  object test extends Tests {
    def ivyDeps = Agg(ivy"org.scalameta::munit:$munit_version$")
    def testFrameworks = Seq("munit.Framework")
  }
}