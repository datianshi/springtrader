./gradlew -Dskip.tests clean build release
vmc delete-service rabbitmq
vmc create-service rabbitmq rabbitmq 
vmc bind-service rabbitmq spring-nanotrader-asynch-services
vmc bind-service rabbitmq spring-nanotrader-services
cd dist
vmc update
cd ..
