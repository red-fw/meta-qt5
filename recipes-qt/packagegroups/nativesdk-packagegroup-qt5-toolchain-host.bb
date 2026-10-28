# Copyright (C) 2014 O.S. Systems Software LTDA.

SUMMARY = "Host packages for the Qt5 standalone SDK or external toolchain"
LICENSE = "MIT"

# Set explicitly (matches what nativesdk.bbclass itself would set) so
# packagegroup.bbclass's allarch check - which reads PACKAGE_ARCH before
# nativesdk.bbclass is inherited - doesn't misclassify this as allarch and
# defer an inherit of allarch.bbclass after nativesdk [native-last].
PACKAGE_ARCH = "${SDK_ARCH}-${SDKPKGSUFFIX}"

inherit packagegroup nativesdk

PACKAGEGROUP_DISABLE_COMPLEMENTARY = "1"

RDEPENDS_${PN} += " \
    nativesdk-packagegroup-sdk-host \
    nativesdk-qttools-tools \
    nativesdk-qtbase-tools \
"
