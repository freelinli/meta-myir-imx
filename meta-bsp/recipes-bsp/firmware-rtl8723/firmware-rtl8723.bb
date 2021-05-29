SUMMARY = "rtl8723b  firmware"
LICENSE = "GPLv2"
PV = "0.1"
LIC_FILES_CHKSUM = "file://LICENCE;md5=309cc7bace8769cfabdd34577f654f8e"

SRC_URI = " \
    file://rtl8723b_config.bin  \
	file://rtl8723b_fw.bin \
	file://rtl8723bu_ap_wowlan.bin \
	file://rtl8723bu_bt.bin \
	file://rtl8723bu_nic.bin \
	file://rtl8723bu_wowlan.bin \
    file://LICENCE \
"

S = "${WORKDIR}"

do_deploy (){
    install -d ${D}${base_libdir}/firmware/rtlwifi/
    cp -rfv ${S}/*  ${D}${base_libdir}/firmware/rtlwifi/
}


FILES_${PN} = "${base_libdir}/firmware/rtlwifi/ \
"
