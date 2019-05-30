# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation

inherit ros_distro_${ROS_DISTRO}
inherit ros_superflore_generated

DESCRIPTION = "Demos for fetch_gazebo package."
AUTHOR = "Alex Moriarty <amoriarty@fetchrobotics.com>"
ROS_AUTHOR = "Michael Ferguson"
HOMEPAGE = "http://ros.org/wiki/fetch_gazebo_demo"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_CN = "fetch_gazebo"
ROS_BPN = "fetch_gazebo_demo"

ROS_BUILD_DEPENDS = ""

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    actionlib \
    fetch-gazebo \
    fetch-moveit-config \
    fetch-navigation \
    moveit-commander \
    moveit-python \
    simple-grasping \
    teleop-twist-keyboard \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    actionlib \
    fetch-gazebo \
    fetch-moveit-config \
    fetch-navigation \
    moveit-commander \
    moveit-python \
    simple-grasping \
    teleop-twist-keyboard \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

SRC_URI = "https://github.com/fetchrobotics-gbp/fetch_gazebo-release/archive/release/melodic/fetch_gazebo_demo/0.9.2-1.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "1849f3d0d6366145f81798e6a69e60c2"
SRC_URI[sha256sum] = "05bdd08b42eef924bb22fe4761ce314019a5192c9c4905c65cecb83aa42de1e3"
S = "${WORKDIR}/fetch_gazebo-release-release-melodic-fetch_gazebo_demo-0.9.2-1"

ROS_COMPONENT_TYPE = "${@ros_distro__get_component_type('fetch-gazebo', d)}"
ROS_BUILD_TYPE = "catkin"

# Allow the above settings to be overridden.
ROS_INCLUDES_TREE := "${@ros_superflore_generated__get_includes_tree('fetch-gazebo', d)}"
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/fetch-gazebo/fetch-gazebo_common.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/fetch-gazebo/fetch-gazebo-${PV}_common.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/fetch-gazebo/${BPN}.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/fetch-gazebo/${BPN}-${PV}.inc

inherit ${ROS_COMPONENT_TYPE}_component
inherit ros_${ROS_BUILD_TYPE}