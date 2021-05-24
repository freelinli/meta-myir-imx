#!/bin/sh

#udhcpc -i eth0

echo "start MQTTAsync_publish process"
/opt/apps/MQTTAsync_publish &

echo "start MQTTAsync_subscribe process"
/opt/apps/MQTTAsync_subscribe &

echo "start cloud_protocol process"
/opt/apps/cloud_protocol &

echo "start camera process"
/opt/apps/camera &

echo "start motor process"
/opt/apps/motor &

echo "start sensor process"
/opt/apps/sensor &

echo "start process done"
