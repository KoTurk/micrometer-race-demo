### From my talk  "Controlling your race with Micrometer, Spring Boot and Cloud Foundry"
[![IMAGE ALT TEXT HERE](https://img.youtube.com/vi/UNszkYpaMZc/0.jpg)](https://www.youtube.com/watch?v=UNszkYpaMZc)

#### Micrometer
In this repository you will find the micrometer demo I live coded.
<br><br>


#### Prometheus
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

#### Grafana
Please note that I downloaded and run Grafana as my preferred monitoring dashboard tool. <br> 
You can download it from here: https://grafana.com/grafana/download <br><br>
You need to manually connect it to the prometheus database (through dashboard).
