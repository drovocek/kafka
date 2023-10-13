- create topic 'test'
```shell
docker exec -ti kafka-kafkaedu /usr/bin/kafka-topics --bootstrap-server localhost:9091 --create --replication-factor 1 --partitions 1 --topic test
```

- topic 'test' info
```shell
docker exec -ti kafka-kafkaedu /usr/bin/kafka-topics --bootstrap-server localhost:9091 --describe --topic test
```

- write messages to topic 'test'
```shell
docker exec -ti kafka-kafkaedu /usr/bin/kafka-console-producer -bootstrap-server localhost:9091 --topic test
```

- read messages from topic 'test'
```shell
docker exec -ti kafka-kafkaedu  /usr/bin/kafka-console-consumer --bootstrap-server localhost:9091 --topic test --from-beginning
```



