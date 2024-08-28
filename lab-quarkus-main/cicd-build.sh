#!/bin/bash -xe
APP=$1
ROOT=$(pwd)

cd "$APP"

./mvnw clean
./mvnw versions:set -DremoveSnapshot
APP_VERSION=$(./mvnw -q -Dexec.executable=echo -Dexec.args='${project.version}' --non-recursive exec:exec | grep -oE '[0-9]+\.[0-9]+\.[0-9]+')
./mvnw package
./mvnw versions:set -DnextSnapshot

git add pom.xml
git commit -m "cicd: bump version ${APP}:${APP_VERSION}"

cd "$ROOT"
TAG=$APP_VERSION docker compose build --no-cache "$APP"

docker images "dio/${APP}"
