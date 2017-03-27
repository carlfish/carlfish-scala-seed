import sbt._

object CommonDeps {
  object v {
    val cats = "$catsversion$"
    val http4s = "$http4sversion$"
    val circe = "$circeversion$"
    val scalatest = "$scalatestversion$"
    val scalacheck = "$scalacheckversion$"
    val scalalogging = "$scalaloggingversion$"
    val logback = "$logbackversion$"
  }

  val cats = Seq (
    "org.typelevel" %% "cats" % v.cats
  )

  val http4s_common = Seq(
    "org.http4s" %% "http4s-circe" % v.http4s
  )

  val http4s = http4s_common ++ Seq(
    "org.http4s" %% "http4s-dsl"          % v.http4s,
    "org.http4s" %% "http4s-blaze-server" % v.http4s)

  val http4s_client = http4s_common ++ Seq(
    "org.http4s" %% "http4s-client"       % v.http4s,
    "org.http4s" %% "http4s-blaze-client" % v.http4s)

  val circe = Seq(
    "io.circe" %% "circe-core"    % v.circe,
    "io.circe" %% "circe-generic" % v.circe,
    "io.circe" %% "circe-parser"  % v.circe)

  val scalatest = Seq(
    "org.scalatest" %% "scalatest"   % v.scalatest % "test",
    "org.scalacheck" %% "scalacheck" % v.scalacheck % "test")

  val logging = Seq(
    "com.typesafe.scala-logging" %% "scala-logging"   % v.scalalogging,
    "ch.qos.logback"              % "logback-classic" % v.logback
  )
}
