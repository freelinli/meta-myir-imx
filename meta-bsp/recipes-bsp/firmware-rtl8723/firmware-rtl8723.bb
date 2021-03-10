SUMMARY = "rtl8723b  firmware"
LICENSE = "GPLv2"
PV = "0.1"
LIC_FILES_CHKSUM = "file://LICENCE;md5=309cc7bace8769cfabdd34577f654f8e"

SRC_URI = " \
    file://rtl8723b_config.bin  \
    file://LICENCE \
"

S = "${WORKDIR}"

do_install (){
    install -d ${D}${base_libdir}/firmware/rtl_bt/
    cp -rfv rtl8723b_config.bin  ${D}${base_libdir}/firmware/rtl_bt/rtl8723b_config.bin 
}


FILES_${PN} = "${base_libdir}/firmware/rtl_bt/ \
"
