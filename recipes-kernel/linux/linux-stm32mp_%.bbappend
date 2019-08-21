SRC_URI += "file://stm32mp157c-dk2-custom.dts;subdir=linux-4.19.9/arch/${ARCH}/boot/dts"

FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}:"

PACKAGE_ARCH = "${MACHINE_ARCH}"

KERNEL_DEVICETREE += "stm32mp157c-dk2-custom.dtb"
