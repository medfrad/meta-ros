# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_humble
inherit ros_superflore_generated

DESCRIPTION = "Launch Gazebo simulation with Andino"
AUTHOR = "Olmer Garcia <olmerg@ekumenlabs.com>"
HOMEPAGE = "https://wiki.ros.org"
SECTION = "devel"
# Original license in package.xml, joined with "&" when multiple license tags were used:
#         "BSD Clause 3"
LICENSE = "BSD-Clause-3"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=e2197b8633fd51a47f897d9d6f820c24"

ROS_CN = "andino"
ROS_BPN = "andino_gz_classic"

ROS_BUILD_DEPENDS = ""

ROS_BUILDTOOL_DEPENDS = " \
    ament-cmake-native \
"

ROS_EXPORT_DEPENDS = ""

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    andino-control \
    andino-description \
    control-msgs \
    gazebo-ros \
    gazebo-ros-pkgs \
    gazebo-ros2-control \
    robot-state-publisher \
    ros2launch \
    rviz2 \
    xacro \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = " \
    ament-lint-auto \
    ament-lint-common \
"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS:${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/ros2-gbp/andino-release/archive/release/humble/andino_gz_classic/0.1.0-1.tar.gz
ROS_BRANCH ?= "branch=release/humble/andino_gz_classic"
SRC_URI = "git://github.com/ros2-gbp/andino-release;${ROS_BRANCH};protocol=https"
SRCREV = "dfced6c860b3ba037265c5bbba7345ab398c72b9"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "ament_cmake"

inherit ros_${ROS_BUILD_TYPE}
