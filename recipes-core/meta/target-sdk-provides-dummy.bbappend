# Set dependencies for target-sdk-provides-dummy.
# Poky rev: 0e392026ffefee098a890c39bc3ca1f697bacb52

VIRTUAL-RUNTIME_base-utils-syslog ?= "busybox-syslog"
DUMMYPROVIDES =+ " ${VIRTUAL-RUNTIME_base-utils-syslog}"

VIRTUAL-RUNTIME_initscripts ?= "sysvinit"
SYSVINIT_SCRIPTS = "${VIRTUAL-RUNTIME_base-utils-hwclock} \
                    modutils-initscripts \
                    init-ifupdown \
                    ${VIRTUAL-RUNTIME_initscripts} \
                   "

DUMMYPROVIDES =+ " ${SYSVINIT_SCRIPTS}"