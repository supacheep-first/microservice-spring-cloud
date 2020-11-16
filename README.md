# microservice-spring-cloud
# step:1
  run discovery : 9001 <br>
    for all service register this <br>
    discovery look like dashboard.
# step:2
  run student : 8081
# step:3
  run employee : 8082
# step:4
  run gateway : 8080 <br>
    for gateway service <br>
    if want call employee service url is http://localhost:8080/api/employees/1234
