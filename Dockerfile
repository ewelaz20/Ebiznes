FROM ubuntu:19.04

# Install OpenJDK-8
RUN apt-get update && \
    apt-get install -y openjdk-8-jdk && \
    apt-get install -y ant && \
    apt-get clean;

#Install vim unzip curl wget
RUN apt update && apt install -y \
  unzip \
  wget \
  vim \
  curl;

#Install scala 2.12.8
RUN wget https://downloads.lightbend.com/scala/2.12.8/scala-2.12.8.deb &&\
  dpkg -i scala-2.12.8.deb &&\
  rm scala-2.12.8.deb

ARG SBT_VERSION=1.3.8

# Install sbt
RUN \
  curl -L -o sbt-$SBT_VERSION.deb http://dl.bintray.com/sbt/debian/sbt-$SBT_VERSION.deb && \
  dpkg -i sbt-$SBT_VERSION.deb && \
  rm sbt-$SBT_VERSION.deb && \
  apt-get update && \
  apt-get install sbt && \
  sbt sbtVersion

#Install npm
RUN curl -o- https://raw.githubusercontent.com/nvm-sh/nvm/v0.35.3/install.sh | bash 
RUN /bin/bash -c "source ~/.nvm/nvm.sh && nvm install 11.15.0 && nvm use --delete-prefix 11.15.0 && npm i -g npm@6.8.0"

  
  
EXPOSE 9000
EXPOSE 8000
EXPOSE 5000
EXPOSE 8888

VOLUME /home/ezieblinska/projekt

WORKDIR /home/ezieblinska/projekt
