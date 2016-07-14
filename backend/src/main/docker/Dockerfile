FROM java:8
WORKDIR /mozea-pos
ADD ./build/libs/pos-0.0.1.jar /mozea-pos/pos.jar
CMD java -Xdebug -Xrunjdwp:server=y,transport=dt_socket,suspend=n -jar pos.jar