# README

## How to start ironpdf docker
```
# Create a file with a valid license key:
echo IRONPDF_ENGINE_LICENSE_KEY=IRONPDF.FOO > docker.env

# start the container:
docker compose up --build -d
```

## How to run the application
```
# Make sure you have a jdk of version 17 installed, or adapt the build.gradle.kts to use another version
# Then run the application:
./gradlew run
```



