# Cucumber + Selenium

## Introduction

Cucumber testing proves itself as a power test orchestration tool when used alongside Selenium, allowing front-end user
stories to be used directly for testing, and allowing for reusable code to be written.

## Use

1. Clone this repository
2. Install Firefox
   - [Firefox](https://firefox.com)
3. Install geckodriver
   - From GitHub Releases: [geckodriver](https://github.com/mozilla/geckodriver/releases)
   - From cargo with the Rust toolchain: `cargo install geckodriver`
4. Run `mvn clean test`

## Troubleshooting Common Problems

### `mvn test` isn't running my Cucumber Tests!

Add the Maven Surefire Plugin to the POM.xml:

```xml
<build>
  <plugins>
    <plugin>
      <groupId>org.apache.maven.plugins</groupId>
      <artifactId>maven-surefire-plugin</artifactId>
      <version>2.12.4</version> <!-- or the latest available -->
      <configuration>
         <includes>
            <include>**/CucumberTests.java</include> <!-- or the name of your cucumber runner file -->
         </includes>
         <testFailureIgnore>true</testFailureIgnore>
      </configuration>
    </plugin>
  </plugins>
</build>
```

