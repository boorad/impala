# CMAKE generated file: DO NOT EDIT!
# Generated by "Unix Makefiles" Generator, CMake Version 2.6

#=============================================================================
# Special targets provided by cmake.

# Disable implicit rules so canoncical targets will work.
.SUFFIXES:

# Remove some rules from gmake that .SUFFIXES does not remove.
SUFFIXES =

.SUFFIXES: .hpux_make_needs_suffix_list

# Suppress display of executed commands.
$(VERBOSE).SILENT:

# A target that is always out of date.
cmake_force:
.PHONY : cmake_force

#=============================================================================
# Set environment variables for the build.

# The shell in which to execute make rules.
SHELL = /bin/sh

# The CMake executable.
CMAKE_COMMAND = /usr/bin/cmake

# The command to remove a file.
RM = /usr/bin/cmake -E remove -f

# The program to use to edit the cache.
CMAKE_EDIT_COMMAND = /usr/bin/ccmake

# The top-level source directory on which CMake was run.
CMAKE_SOURCE_DIR = /home/vagrant/impala/thirdparty/avro-1.7.4/lang/c++

# The top-level build directory on which CMake was run.
CMAKE_BINARY_DIR = /home/vagrant/impala/thirdparty/avro-1.7.4/lang/c++

# Include any dependencies generated for this target.
include CMakeFiles/unittest.dir/depend.make

# Include the progress variables for this target.
include CMakeFiles/unittest.dir/progress.make

# Include the compile flags for this target's objects.
include CMakeFiles/unittest.dir/flags.make

CMakeFiles/unittest.dir/test/unittest.cc.o: CMakeFiles/unittest.dir/flags.make
CMakeFiles/unittest.dir/test/unittest.cc.o: test/unittest.cc
	$(CMAKE_COMMAND) -E cmake_progress_report /home/vagrant/impala/thirdparty/avro-1.7.4/lang/c++/CMakeFiles $(CMAKE_PROGRESS_1)
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green "Building CXX object CMakeFiles/unittest.dir/test/unittest.cc.o"
	/usr/bin/c++   $(CXX_DEFINES) $(CXX_FLAGS) -o CMakeFiles/unittest.dir/test/unittest.cc.o -c /home/vagrant/impala/thirdparty/avro-1.7.4/lang/c++/test/unittest.cc

CMakeFiles/unittest.dir/test/unittest.cc.i: cmake_force
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green "Preprocessing CXX source to CMakeFiles/unittest.dir/test/unittest.cc.i"
	/usr/bin/c++  $(CXX_DEFINES) $(CXX_FLAGS) -E /home/vagrant/impala/thirdparty/avro-1.7.4/lang/c++/test/unittest.cc > CMakeFiles/unittest.dir/test/unittest.cc.i

CMakeFiles/unittest.dir/test/unittest.cc.s: cmake_force
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green "Compiling CXX source to assembly CMakeFiles/unittest.dir/test/unittest.cc.s"
	/usr/bin/c++  $(CXX_DEFINES) $(CXX_FLAGS) -S /home/vagrant/impala/thirdparty/avro-1.7.4/lang/c++/test/unittest.cc -o CMakeFiles/unittest.dir/test/unittest.cc.s

CMakeFiles/unittest.dir/test/unittest.cc.o.requires:
.PHONY : CMakeFiles/unittest.dir/test/unittest.cc.o.requires

CMakeFiles/unittest.dir/test/unittest.cc.o.provides: CMakeFiles/unittest.dir/test/unittest.cc.o.requires
	$(MAKE) -f CMakeFiles/unittest.dir/build.make CMakeFiles/unittest.dir/test/unittest.cc.o.provides.build
.PHONY : CMakeFiles/unittest.dir/test/unittest.cc.o.provides

CMakeFiles/unittest.dir/test/unittest.cc.o.provides.build: CMakeFiles/unittest.dir/test/unittest.cc.o
.PHONY : CMakeFiles/unittest.dir/test/unittest.cc.o.provides.build

# Object files for target unittest
unittest_OBJECTS = \
"CMakeFiles/unittest.dir/test/unittest.cc.o"

# External object files for target unittest
unittest_EXTERNAL_OBJECTS =

unittest: CMakeFiles/unittest.dir/test/unittest.cc.o
unittest: libavrocpp.so.1.7.4.0
unittest: /usr/lib/libboost_filesystem-gcc44-mt-1_42.so
unittest: /usr/lib/libboost_system-gcc44-mt-1_42.so
unittest: /usr/lib/libboost_program_options-gcc44-mt-1_42.so
unittest: CMakeFiles/unittest.dir/build.make
unittest: CMakeFiles/unittest.dir/link.txt
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --red --bold "Linking CXX executable unittest"
	$(CMAKE_COMMAND) -E cmake_link_script CMakeFiles/unittest.dir/link.txt --verbose=$(VERBOSE)

# Rule to build all files generated by this target.
CMakeFiles/unittest.dir/build: unittest
.PHONY : CMakeFiles/unittest.dir/build

CMakeFiles/unittest.dir/requires: CMakeFiles/unittest.dir/test/unittest.cc.o.requires
.PHONY : CMakeFiles/unittest.dir/requires

CMakeFiles/unittest.dir/clean:
	$(CMAKE_COMMAND) -P CMakeFiles/unittest.dir/cmake_clean.cmake
.PHONY : CMakeFiles/unittest.dir/clean

CMakeFiles/unittest.dir/depend:
	cd /home/vagrant/impala/thirdparty/avro-1.7.4/lang/c++ && $(CMAKE_COMMAND) -E cmake_depends "Unix Makefiles" /home/vagrant/impala/thirdparty/avro-1.7.4/lang/c++ /home/vagrant/impala/thirdparty/avro-1.7.4/lang/c++ /home/vagrant/impala/thirdparty/avro-1.7.4/lang/c++ /home/vagrant/impala/thirdparty/avro-1.7.4/lang/c++ /home/vagrant/impala/thirdparty/avro-1.7.4/lang/c++/CMakeFiles/unittest.dir/DependInfo.cmake --color=$(COLOR)
.PHONY : CMakeFiles/unittest.dir/depend

