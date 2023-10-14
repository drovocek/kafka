- create topic 'topic1'
```shell
docker exec -ti broker-c /usr/bin/kafka-topics --bootstrap-server localhost:9092 --create --replication-factor 1 --partitions 1 --topic topic1
```

- topic 'topic1' info
```shell
docker exec -ti broker-c /usr/bin/kafka-topics --bootstrap-server localhost:9092 --describe --topic topic1
```

- write messages to topic 'topic1'
```shell
docker exec -ti broker-c /usr/bin/kafka-console-producer -bootstrap-server localhost:9092 --topic topic1
```

- read messages from topic 'topic1'
```shell
docker exec -ti broker-c  /usr/bin/kafka-console-consumer --bootstrap-server localhost:9092 --topic topic1 --from-beginning
```



