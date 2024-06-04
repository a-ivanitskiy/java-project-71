.DEFAULT_GOAL := build-run

build:
	 ./gradlew clean build

install:
	./gradlew clean install

run-dist:
	./build/install/app/bin/app -h

run:
	./gradlew run --args="-h"

build-run: build run

.PHONY: build