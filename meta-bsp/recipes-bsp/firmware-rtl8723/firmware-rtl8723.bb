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

do_install (){
    install -d 0775  ${D}/lib/firmware/rtlwifi/
    install -d 0775  ${D}/lib/firmware/rtl_bt/
    install -m 0775  ${S}/rtl8723b_config.bin  ${D}/lib/firmware/rtlwifi/
    install -m 0775  ${S}/rtl8723b_fw.bin  ${D}/lib/firmware/rtlwifi/
    install -m 0775  ${S}/rtl8723bu_ap_wowlan.bin  ${D}/lib/firmware/rtlwifi/
    install -m 0775  ${S}/rtl8723bu_bt.bin  ${D}/lib/firmware/rtlwifi/
    install -m 0775  ${S}/rtl8723bu_nic.bin  ${D}/lib/firmware/rtlwifi/
    install -m 0775  ${S}/rtl8723bu_wowlan.bin  ${D}/lib/firmware/rtlwifi/
    cp  ${D}/lib/firmware/rtlwifi/*  ${D}/lib/firmware/rtl_bt/
}


FILES_${PN} = "/lib/firmware/rtlwifi/ \
               /lib/firmware/rtl_bt/ \
"
