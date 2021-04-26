#Provide our own rc.local file
FILESEXTRAPATHS_prepend := "${THISDIR}/files:"

S = "${WORKDIR}"
SRC_URI += "file://do_snake.sh"

do_install_append () {
    install -m 755 ${S}/do_snake.sh ${D}/${sysconfdir}/do_snake.sh
}
