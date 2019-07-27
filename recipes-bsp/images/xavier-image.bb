SUMMARY = "Simple image"
LICENSE = "Proprietary"

include recipes-st/images/st-image.inc

inherit core-image distro_features_check
inherit populate_sdk_qt5

# let's make sure we have a good image..
CONFLICT_DISTRO_FEATURES = "x11 wayland"

IMAGE_LINGUAS = "en-us"

IMAGE_FEATURES += "package-management ssh-server-dropbear hwcodecs"

# Define to null ROOTFS_MAXSIZE to avoid partition size restriction
IMAGE_ROOTFS_MAXSIZE = ""

#
# Multimedia part addons
#
IMAGE_MM_PART = " \
    ${@bb.utils.contains('DISTRO_FEATURES', 'gstreamer', 'packagegroup-gstreamer1-0', '', d)} \
    tiff \
    libv4l \
    rc-keymaps \
    ${@bb.utils.contains('DISTRO_FEATURES', 'opengl', 'kmscube', '', d)} \
    "

#
# Display part addons
#
IMAGE_DISPLAY_PART = " \
    fb-test         \
    libdrm          \
    libdrm-tests    \
    "

#
# QT part Essentials
#
IMAGE_QT_MANDATORY_PART = " \
   qtbase                  \
   liberation-fonts        \
   qtbase-plugins          \
   qtbase-tools            \
   \
   qtdeclarative           \
   qtdeclarative-qmlplugins\
   qtdeclarative-tools     \
   \
   qtgraphicaleffects-qmlplugins \
   \
   qtmultimedia            \
   qtmultimedia-plugins    \
   qtmultimedia-qmlplugins \
   \
   qtscript                \
   \
   openstlinux-qt-eglfs \
   "

#
# QT part add-ons
#
IMAGE_QT_OPTIONAL_PART = " \
"

#
# QT part examples
#
IMAGE_QT_EXAMPLES_PART = " \
   "

#
# QT apps
# 
IMAGE_QT_APPS_PART = " \
    demo-b2clock \
    "

# INSTALL addons
#
CORE_IMAGE_EXTRA_INSTALL += " \
    systemd-networkd-configuration \
    \
    packagegroup-framework-tools-core-base      \
    packagegroup-framework-tools-kernel-base    \
    packagegroup-framework-tools-network-base   \
    packagegroup-framework-tools-audio-base     \
    packagegroup-framework-tools-ui-base        \
    packagegroup-framework-tools-python2-base   \
    packagegroup-framework-tools-python3-base   \
    \
    packagegroup-framework-tools-core       \
    packagegroup-framework-tools-kernel     \
    packagegroup-framework-tools-network    \
    packagegroup-framework-tools-audio      \
    packagegroup-framework-tools-ui         \
    packagegroup-framework-tools-python2    \
    packagegroup-framework-tools-python3    \
    \
    packagegroup-core-eclipse-debug         \
    \
    hello-mod \
    \
"
#    ${IMAGE_DISPLAY_PART}       \
#    ${IMAGE_MM_PART}            \
#    \
#    ${IMAGE_QT_MANDATORY_PART}  \
#    ${IMAGE_QT_OPTIONAL_PART}   \
#    ${IMAGE_QT_EXAMPLES_PART}   \
#    ${IMAGE_QT_APPS_PART}   \
#    "

