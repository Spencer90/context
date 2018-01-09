#!/bin/sh
sudo docker network create jnet
sudo docker run -it --network-alias serv --network jnet spencerjang/javaserver:0.1
sudo docker -H tcp://192.168.1.198 run --name app3 --network jnet spencerjang/javaclient:0.1
sudo docker -H tcp://192.168.1.161 run --name app4 --network jnet spencerjang/javaclient:0.1

