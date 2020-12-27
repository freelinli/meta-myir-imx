# Copyright 2018-2019 NXP
# Released under the MIT license (see COPYING.MIT for the terms)

DESCRIPTION = "This is the basic core image with minimal tests"

inherit core-image

IMAGE_FEATURES += " \
    splash \
    nfs-server \
    ssh-server-dropbear \
    hwcodecs \
"
SDKIMAGE_FEATURES_append = " \
    staticdev-pkgs \
"
IMAGE_INSTALL += " \
    ${@bb.utils.contains('DISTRO_FEATURES', 'wayland', ' weston weston-examples weston-init','', d)} \
    alsa-utils \
    ppp-quectel \
    staticip-network \
    start-service \
    u-boot-imx-fw-utils \
    libgpiod \
    sqlite3 \
    v4l-utils \
    myir-linux-examples \
    quectel-cm \
    packagegroup-imx-core-tools \
    packagegroup-meta-webserver-php \
    minicom \
    ffmpeg \
    tcpdump \
    python3 \
    curl \
    libsrtp \
    opencv \
    dhcp \
    paho-mqtt-c \
    tftp-hpa \
"
export IMAGE_BASENAME = "myir-image-core"
