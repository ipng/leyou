# leyou
乐优商城项目，maven依赖版本和视频中的不一致，都是使用当时比较新的版本

- springboot：2.1.10

- springcloud：Greenwich.SR4

- nginx: 1.14.2

- elasticsearch: 6.4.3

- elasticsearch-analysis-ik-6.4.3

- kibana-6.4.3-windows-x86_64

- rabbitmq-server-3.8.1-1.el7.noarch

- erlang-22.2.1-1.el7.x86_64

- redis-5.0.7

- day16出错可以添加

  <dependency>

    <groupId> org.springframework.boot </groupId>

    <artifactId> spring-boot-configuration-processor </artifactId>

    <optional> true </optional>

  </dependency>

  ```
  如果发现@ConfigurationPropertie不生效，有可能是项目的目录结构问题，可以通过@EnableConfigurationProperties(ConnectionSettings.class)来明确指定需要用哪个实体类来装载配置信息。
  
  Spring boot 1.5以上去除了location属性，可采用@Component的方式注册为组件，然后使用@PropertySource来指定自定义的资源目录。
  ```

  如果还是有问题就加@Component

  实在不行就

  @Component

  @PropertySource(prefix = "leyou.sms")

  

