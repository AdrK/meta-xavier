SUMMARY = "Application Qt5 demo using Qt5 with QtQuick2"
AUTHOR = "Cleiton Bueno"
DESCRIPTION = " \
               Application development in Qt5 with QtQuick2 to simple test \
               instalation framework Qt5 \
               "
HOMEPAGE = "http://www.b2open.com"

LICENSE = "( Apache-2.0 & BSD )"
LIC_FILES_CHKSUM = "file://LICENSE;md5=86d3f3a95c324c9479bd8986968f4327"

DEPENDS += "qtbase qtquickcontrols2"

SRC_URI = "\
           git://github.com/b2open/simpleDemoQt5Quick.git;branch=master \
    "
SRCREV = "dc1af35cabe6e8efb302da338e22c64f38e639d3"

S = "${WORKDIR}/git"

COMPATIBLE_MACHINE = "stm32mp1-disco"

do_install_append() {
  install -d ${D}/opt/b2open/bin/
}

FILES_${PN} += "/opt/b2open/bin"

inherit qmake5
