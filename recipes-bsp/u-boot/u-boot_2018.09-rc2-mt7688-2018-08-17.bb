require u-boot-common_${PV}.inc
require recipes-bsp/u-boot/u-boot.inc

PR = "r1"

DEPENDS += "bc-native dtc-native"
