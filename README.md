# WebExtension for stackoverflow.com

Adds some styling to stackoverflow.com. Written in Kotlin

### Development
``./gradlew runDceKotlinJs --continuous`` (https://kotlinlang.org/docs/reference/javascript-dce.html)

``web-ext run`` (Starts Firefox, with Reload)

### Sign Web App
Execute in source directory:

``web-ext sign -s . --api-key=user123 --api-secret=xy``