# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_foxy
inherit ros_superflore_generated

DESCRIPTION = "A package that contains ROS message corresponding to microstrain message types."
AUTHOR = "Rob Fisher <rob.fisher@parker.com>"
ROS_AUTHOR = "Dr. Kristopher Krasnosky"
HOMEPAGE = "https://github.com/LORD-MicroStrain/microstrain_inertial"
SECTION = "devel"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://package.xml;beginline=15;endline=15;md5=2c00b8d2854109dbebef7818b4dae1e2"

ROS_CN = "microstrain_inertial"
ROS_BPN = "microstrain_inertial_msgs"

ROS_BUILD_DEPENDS = " \
    geometry-msgs \
    std-msgs \
"

ROS_BUILDTOOL_DEPENDS = " \
    rosidl-default-generators-native \
"

ROS_EXPORT_DEPENDS = " \
    geometry-msgs \
    std-msgs \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    geometry-msgs \
    std-msgs \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS:${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/LORD-MicroStrain/microstrain_inertial-ros2-release/archive/release/foxy/microstrain_inertial_msgs/2.0.6-1.tar.gz
ROS_BRANCH ?= "branch=release/foxy/microstrain_inertial_msgs"
SRC_URI = "git://github.com/LORD-MicroStrain/microstrain_inertial-ros2-release;${ROS_BRANCH};protocol=https"
SRCREV = "67baa6e5c142035cca8be2df2866b811a1e4274e"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "ament_cmake"

inherit ros_${ROS_BUILD_TYPE}
