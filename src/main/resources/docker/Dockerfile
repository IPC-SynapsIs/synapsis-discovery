FROM java:8

MAINTAINER Mohamed BASRI <mohamed.basri@capgemini.com>

ADD *.jar /etc/synapsis/synapsis-discovery/synapsis-discovery.jar
ADD docker/run.sh /etc/synapsis/synapsis-discovery/run.sh

RUN chmod +x /etc/synapsis/synapsis-discovery/synapsis-discovery.jar
RUN chmod +x /etc/synapsis/synapsis-discovery/run.sh

EXPOSE 8761

ENTRYPOINT ["bash","run.sh"]

WORKDIR /etc/synapsis/synapsis-discovery/