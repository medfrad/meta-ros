# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_foxy
inherit ros_superflore_generated

DESCRIPTION = "This rqt plugin provides a way to view and edit parameters on nodes."
AUTHOR = "Scott K Logan <logans@cottsay.net>"
ROS_AUTHOR = "Isaac Saito"
HOMEPAGE = "http://wiki.ros.org/rqt_reconfigure"
SECTION = "devel"
# Original license in package.xml, joined with "&" when multiple license tags were used:
#         "BSD & Apache License 2.0"
LICENSE = "BSD & Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_CN = "rqt_reconfigure"
ROS_BPN = "rqt_reconfigure"

ROS_BUILD_DEPENDS = ""

ROS_BUILDTOOL_DEPENDS = ""

ROS_EXPORT_DEPENDS = ""

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    ament-index-python \
    python-qt-binding \
    python3-pyyaml \
    qt-gui-py-common \
    rclpy \
    rqt-console \
    rqt-gui \
    rqt-gui-py \
    rqt-py-common \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = " \
    ament-copyright \
    ament-flake8 \
    ament-xmllint \
"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/ros2-gbp/rqt_reconfigure-release/archive/release/foxy/rqt_reconfigure/1.0.6-1.tar.gz
ROS_BRANCH ?= "branch=release/foxy/rqt_reconfigure"
SRC_URI = "git://github.com/ros2-gbp/rqt_reconfigure-release;${ROS_BRANCH};protocol=https"
SRCREV = "aeedb5cfd4129e33851bba3cc122daecfc6fb92c"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "ament_python"

inherit ros_${ROS_BUILD_TYPE}
