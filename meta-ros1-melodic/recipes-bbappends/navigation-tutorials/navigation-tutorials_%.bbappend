# Copyright (c) 2019 LG Electronics, Inc.

# Depends on (navigation-stage,roomba-stage)->stage-ros->stage->mesa with this restriction:
inherit features_check
ANY_OF_DISTRO_FEATURES = "opengl vulkan"
