# base recipe: meta/recipes-graphics/xorg-lib/xtrans_1.3.5.bb
# base branch: warrior
# base commit: 0609f4fee30494792d7c5b9e9113a6275dc93d1c

SUMMARY = "XTrans: X Transport library"

DESCRIPTION = "The X Transport Interface is intended to combine all \
system and transport specific code into a single place.  This API should \
be used by all libraries, clients and servers of the X Window System. \
Use of this API should allow the addition of new types of transports and \
support for new platforms without making any changes to the source \
except in the X Transport Interface code."

require ${COREBASE}/meta/recipes-graphics/xorg-lib/xorg-lib-common.inc

# clear SRC_URI
SRC_URI = ""
inherit debian-package
require recipes-debian/sources/xtrans.inc
DEBIAN_PATCH_TYPE = "nopatch"
FILESPATH_append = ":${COREBASE}/meta/recipes-graphics/xorg-lib/xtrans"

LICENSE = "MIT & MIT-style"
LIC_FILES_CHKSUM = "file://COPYING;md5=49347921d4d5268021a999f250edc9ca"

SRC_URI += "file://multilibfix.patch"

inherit gettext

BBCLASSEXTEND = "native nativesdk"
