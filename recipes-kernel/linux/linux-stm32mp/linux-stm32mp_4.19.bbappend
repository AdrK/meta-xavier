FILESEXTRAPATHS_prepend := "${THISDIR}/4.19/4.19.9:"

SRC_URI_append += " \
	    file://0000-i2c5-dts.patch \
	    file://0001-i2c5-mpu9250-dts.patch \
            file://0002-i2c5-mpu9250-interrupts-dts.patch \
            file://fragment-02-mpu-6050.config \
"

SRC_URI_append += " file://fragment-02-mpu-6050.config;subdir=fragments "
KERNEL_CONFIG_FRAGMENTS_append += " ${WORKDIR}/fragments/fragment-02-mpu-6050.config "
