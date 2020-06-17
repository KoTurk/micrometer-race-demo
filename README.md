## From my talk  "Controlling your race with Micrometer, Spring Boot and Cloud Foundry"
[![IMAGE ALT TEXT HERE](https://img.youtube.com/vi/UNszkYpaMZc/0.jpg)](https://www.youtube.com/watch?v=UNszkYpaMZc)

### Slides <br>
[![IMAGE ALT TEXT HERE](https://image.slidesharecdn.com/controllingyourracewithmicrometer-200617203002/95/controlling-your-race-with-micrometer-spring-boot-and-cloud-foundry-1-638.jpg?cb=1592426045)](https://www.slideshare.net/KoTurk/controlling-your-race-with-micrometer-spring-boot-and-cloud-foundry)

### Micrometer
In this repository you will find the micrometer demo I live coded.<br>
Please run:
<pre><code>mvn clean install</code></pre>
and deploy it to a platform like cloud foundry:
<pre><code>cf push -f manifest-devtest.yml</code></pre>


### Prometheus
Please note that I downloaded and run Prometheus.
You can download it from:<br>
https://prometheus.io/download/ <br><br>

Don't forget to change the target url to your micrometer instance (targets) 
<pre><code>   static_configs:
    - targets: ['localhost:8080']
</code></pre>

and the security parameters in the prometheus.yml file<br>
<pre><code>  basic_auth:
      username: "user"
      password: "pass"
</code></pre>

You can deploy it with command:
<pre><code>cf push -f manifest-prometheus.yml</code></pre>

### Grafana
Please note that I downloaded and run Grafana as my preferred monitoring dashboard tool. <br> 
You can download it from here: https://grafana.com/grafana/download <br><br>

You can deploy it with command:
<pre><code>cf push -f manifest-grafana.yml</code></pre>

You need to manually connect it to the prometheus database (through dashboard).
Btw. the default password will be admin/admin and you're required to change it after logging in.


