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

# Utility rule file for tweet_hh.

CMakeFiles/tweet_hh: tweet.hh

tweet.hh: avrogencpp
tweet.hh: jsonschemas/tweet
	$(CMAKE_COMMAND) -E cmake_progress_report /home/vagrant/impala/thirdparty/avro-1.7.4/lang/c++/CMakeFiles $(CMAKE_PROGRESS_1)
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --blue --bold "Generating tweet.hh"
	./avrogencpp -p - -i /home/vagrant/impala/thirdparty/avro-1.7.4/lang/c++/jsonschemas/tweet -o tweet.hh -n testgen3 -U

tweet_hh: CMakeFiles/tweet_hh
tweet_hh: tweet.hh
tweet_hh: CMakeFiles/tweet_hh.dir/build.make
.PHONY : tweet_hh

# Rule to build all files generated by this target.
CMakeFiles/tweet_hh.dir/build: tweet_hh
.PHONY : CMakeFiles/tweet_hh.dir/build

CMakeFiles/tweet_hh.dir/clean:
	$(CMAKE_COMMAND) -P CMakeFiles/tweet_hh.dir/cmake_clean.cmake
.PHONY : CMakeFiles/tweet_hh.dir/clean

CMakeFiles/tweet_hh.dir/depend:
	cd /home/vagrant/impala/thirdparty/avro-1.7.4/lang/c++ && $(CMAKE_COMMAND) -E cmake_depends "Unix Makefiles" /home/vagrant/impala/thirdparty/avro-1.7.4/lang/c++ /home/vagrant/impala/thirdparty/avro-1.7.4/lang/c++ /home/vagrant/impala/thirdparty/avro-1.7.4/lang/c++ /home/vagrant/impala/thirdparty/avro-1.7.4/lang/c++ /home/vagrant/impala/thirdparty/avro-1.7.4/lang/c++/CMakeFiles/tweet_hh.dir/DependInfo.cmake --color=$(COLOR)
.PHONY : CMakeFiles/tweet_hh.dir/depend

