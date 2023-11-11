# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_noetic
inherit ros_superflore_generated

DESCRIPTION = "Driver module between Aldebaran's NAOqiOS and ROS. It publishes all sensor and actuator data as well as basic diagnostic for battery, temperature. It subscribes also to RVIZ simple goal and cmd_vel for teleop."
AUTHOR = "Marine Chamoux <mchamoux@softbankrobotics.com>"
ROS_AUTHOR = "Karsten Knese"
HOMEPAGE = "https://wiki.ros.org"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=12;endline=12;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_CN = "naoqi_driver"
ROS_BPN = "naoqi_driver"

ROS_BUILD_DEPENDS = " \
    boost \
    cv-bridge \
    diagnostic-msgs \
    diagnostic-updater \
    geometry-msgs \
    image-transport \
    kdl-parser \
    naoqi-bridge-msgs \
    naoqi-libqi \
    naoqi-libqicore \
    orocos-kdl \
    robot-state-publisher \
    rosbag-storage \
    rosconsole \
    rosgraph-msgs \
    sensor-msgs \
    tf2-geometry-msgs \
    tf2-msgs \
    tf2-ros \
"

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = ""

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    boost \
    cv-bridge \
    image-transport \
    kdl-parser \
    naoqi-bridge-msgs \
    naoqi-libqi \
    naoqi-libqicore \
    orocos-kdl \
    robot-state-publisher \
    rosbag-storage \
    rosconsole \
    tf2-ros \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS:${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/ros-naoqi/naoqi_driver-release/archive/release/noetic/naoqi_driver/0.6.0-1.tar.gz
ROS_BRANCH ?= "branch=release/noetic/naoqi_driver"
SRC_URI = "git://github.com/ros-naoqi/naoqi_driver-release;${ROS_BRANCH};protocol=https"
SRCREV = "946da122abdd02fb2914eef2c2f881493c68038d"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "catkin"

inherit ros_${ROS_BUILD_TYPE}