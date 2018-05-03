import scalariform.formatter.preferences._

lazy val root = (project in file("."))
  .settings(CommonSettings.compiler)
  .settings(CommonSettings.console)
  .settings(Seq(
    organization := "$organization$",
    name := "$name$",
    description := "$desc$"
  ))
  .settings(Seq(
    libraryDependencies ++=
      CommonDeps.cats ++
      CommonDeps.scalatest,
    scalariformPreferences := scalariformPreferences.value
      .setPreference(DanglingCloseParenthesis, Force)
      .setPreference(RewriteArrowSymbols, true)
  ))
