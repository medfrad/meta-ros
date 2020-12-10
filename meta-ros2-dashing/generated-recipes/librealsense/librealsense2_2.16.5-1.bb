# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_dashing
inherit ros_superflore_generated

DESCRIPTION = "Library for capturing data from the Intel(R) RealSense(TM) SR300 and D400 cameras. This effort was initiated to better support researchers, creative coders, and app developers in domains such as robotics, virtual reality, and the internet of things. Several often-requested features of RealSense(TM); devices are implemented in this project, including multi-camera capture."
AUTHOR = "Sergey Dorodnicov <sergey.dorodnicov@intel.com>"
ROS_AUTHOR = "Sergey Dorodnicov <sergey.dorodnicov@intel.com>"
HOMEPAGE = "https://github.com/IntelRealSense/librealsense/"
SECTION = "devel"
# Original license in package.xml, joined with "&" when multiple license tags were used:
#         "Apache License, Version 2.0"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=24;endline=24;md5=e8978a5103d23266fc6f8ec03dc9eb16"

ROS_CN = "librealsense"
ROS_BPN = "librealsense2"

ROS_BUILD_DEPENDS = " \
    glfw \
    gtk+3 \
    libusb1 \
    linux-libc-headers \
    mesa \
    openssl \
    pkgconfig \
    udev \
"

ROS_BUILDTOOL_DEPENDS = " \
    ament-cmake-native \
"

ROS_EXPORT_DEPENDS = " \
    glfw \
    gtk+3 \
    libusb1 \
    linux-libc-headers \
    mesa \
    openssl \
    udev \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    glfw \
    gtk+3 \
    libusb1 \
    linux-libc-headers \
    mesa \
    openssl \
    udev \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/ros2-gbp/librealsense-release/archive/release/dashing/librealsense2/2.16.5-1.tar.gz
ROS_BRANCH ?= "branch=release/dashing/librealsense2"
SRC_URI = "git://github.com/ros2-gbp/librealsense-release;${ROS_BRANCH};protocol=https"
SRCREV = "788aab004dbc1d1cf5b6af37fb09d62d5421f5ee"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "ament_cmake"

inherit ros_${ROS_BUILD_TYPE}
