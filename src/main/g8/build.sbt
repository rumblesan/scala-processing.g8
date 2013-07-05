name := "$name$"

organization := "$organization$"

version := "$version$"

scalaVersion := "2.10.2"

libraryDependencies ++= Seq(
  "org.specs2" %% "specs2" % "2.1-SNAPSHOT" % "test"
)

initialCommands := "import $organization$.$name;format="lower,word"$._"

scalacOptions ++= Seq("-unchecked", "-deprecation", "-language:_")
