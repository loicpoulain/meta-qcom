# Copyright (C) 2014 Linaro
# Released under the MIT license (see COPYING.MIT for the terms)

DESCRIPTION = "Linaro Qualcomm Landing team 4.9 Kernel"

inherit pythonnative

require recipes-kernel/linux/linux-linaro-qcom.inc
require recipes-kernel/linux/linux-dtb.inc
require recipes-kernel/linux/linux-qcom-bootimg.inc

LOCALVERSION ?= "-linaro-lt-qcom"
SRCBRANCH ?= "release/qcomlt-4.9"
SRCREV ?= "8165c999c87f1fe205e6fad779ded1f3e9bc382f"

COMPATIBLE_MACHINE = "(ifc6410|sd-600eval|dragonboard-410c)"

FILESEXTRAPATHS_prepend := "${THISDIR}/files:"
SRC_URI += " \
    file://0001-Bluetooth-make-baswap-src-const.patch \
    file://v2-0001-Bluetooth-btqcomsmd-BD-address-setup.patch \
"

# Wifi firmware has a recognizable arch :(
ERROR_QA_remove = "arch"
