# SpekExampleInKotlin
Spek Test in android using kotlin

- (Kotlin)[https://kotlinlang.org/]
- (Spek)[http://spekframework.org/docs/latest/]

### What is Spek?

Tests are not only to check the code you’ve written executes and works, but also that it works as it should, that is, that as a developer what’s been implemented matches the requirements. More about [spek](http://spekframework.org/docs/latest/).

### Setting up Spek

You have to do in Gradle

JUnit Platform provides a gradle plugin.

build.gradle
```java
// setup the plugin
buildscript {
    dependencies {
        classpath 'org.junit.platform:junit-platform-gradle-plugin:1.0.0'
    }
}

apply plugin: 'org.junit.platform.gradle.plugin'

junitPlatform {
    filters {
        engines {
            include 'spek'
        }
    }
}

repositories {
    maven { url "http://dl.bintray.com/jetbrains/spek" }
}

// setup dependencies
dependencies {
    testCompile 'org.jetbrains.spek:spek-api:1.1.5'
    testRuntime 'org.jetbrains.spek:spek-junit-platform-engine:1.1.5'
}
```
and
You have to do in Maven

JUnit provides support for Maven.
pom.xml
```xml
...
<dependency>
  <groupId>org.jetbrains.spek</groupId>
  <artifactId>spek-api</artifactId>
  <version>1.1.5</version>
  <type>pom</type>
</dependency>
```

More learn spek please visit official website: (http://spekframework.org/docs/latest/)[http://spekframework.org/docs/latest/]

### About Me

(Dharma Kshetri)[www.dharmakshetri.me], Android Engineer and blog (PrAndroid)[www.prandroid.com]
#IloveKotlin #PrAndroid #Kotlin #Spek #Android
