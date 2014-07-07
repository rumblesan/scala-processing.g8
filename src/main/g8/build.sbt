name := "$name$"

organization := "$organization$"

version := "$version$"

scalaVersion := "$scalaversion$"

libraryDependencies ++= Seq(
  "org.specs2" %% "specs2" % "$specs2version$" % "test"
)

initialCommands := "import $organization$.$name;format="lower,word"$._"

scalacOptions ++= Seq("-unchecked", "-deprecation", "-language:_")
