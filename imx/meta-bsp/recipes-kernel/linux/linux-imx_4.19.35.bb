# Copyright (C) 2013-2016 Freescale Semiconductor
# Copyright 2017-2018 NXP
# Released under the MIT license (see COPYING.MIT for the terms)

SUMMARY = "Linux Kernel provided and supported by NXP"
DESCRIPTION = "Linux Kernel provided and supported by NXP with focus on \
i.MX Family Reference Boards. It includes support for many IPs such as GPU, VPU and IPU."

require recipes-kernel/linux/linux-imx.inc

LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://COPYING;md5=bbea815ee2795b2f4230826c0c6b8814"
DEPENDS += "lzop-native bc-native"

SRCBRANCH = "imx_4.19.y"
LOCALVERSION = "-1.1.0"
KERNEL_SRC ?= "git://source.codeaurora.org/external/imx/linux-imx.git;protocol=https"
SRC_URI = "${KERNEL_SRC};branch=${SRCBRANCH} \
           file://0001-compiler-attributes-add-support-for-copy-gcc-9.patch \
           file://0002-include-linux-module.h-copy-init-exit-attrs-to-.patch"
SRCREV = "81757a1880e62c09b0ff1f0b931666723afc17dd"

S = "${WORKDIR}/git"

DEFAULT_PREFERENCE = "1"

DEFCONFIG     = "defconfig"
DEFCONFIG_mx6 = "imx_v7_defconfig"
DEFCONFIG_mx7 = "imx_v7_defconfig"

do_preconfigure_prepend() {
    # meta-freescale/classes/fsl-kernel-localversion.bbclass requires
    # defconfig in ${WORKDIR}
    install -d ${B}
    cp ${S}/arch/${ARCH}/configs/${DEFCONFIG} ${WORKDIR}/defconfig
}

COMPATIBLE_MACHINE = "(mx6|mx7|mx8)"