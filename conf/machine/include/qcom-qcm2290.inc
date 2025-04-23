# Configurations and variables for QCM2290 (aka QRB2210) SoC family.

SOC_FAMILY = "qcm2290"
require conf/machine/include/qcom-base.inc
require conf/machine/include/qcom-common.inc

require conf/machine/include/arm/armv8a/tune-cortexa53.inc

MACHINE_ESSENTIAL_EXTRA_RRECOMMENDS += " \
    packagegroup-qcom-boot-essential \
"

MACHINE_EXTRA_RRECOMMENDS += " \
    packagegroup-qcom-boot-additional \
"

EXTRA_IMAGEDEPENDS += "firmware-qcom-boot-qrb2210-rb1 qcom-gen-partition-bins"
