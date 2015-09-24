# Copyright (C) 2015 Voipac
# Released under the MIT license (see COPYING.MIT for the terms)

SUMMARY = "Linux kernel for for imx6q/dl/s TinyRex/Rex boards"
DESCRIPTION = "Linux kernel for for imx6q/dl/s TinyRex/Rex boards. It includes \
support for many IPs such as GPU, VPU and IPU."

require recipes-kernel/linux/linux-imx.inc
require recipes-kernel/linux/linux-dtb.inc

DEPENDS += "lzop-native bc-native"

SRCBRANCH = "imxtinyrex_3.14.28"
LOCALVERSION = "-yocto"
SRCREV = "${AUTOREV}"
KERNEL_SRC ?= "git://github.com/allanm84/linux-imx.git;protocol=git"
SRC_URI = "${KERNEL_SRC};branch=${SRCBRANCH} file://defconfig"

DEFAULT_PREFERENCE = "1"              

COMPATIBLE_MACHINE = "(mx6|imx6q-tinyrex|imx6dl-tinyrex|imx6s-tinyrex)"
