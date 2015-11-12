#!/bin/bash

PROJECT_DIR=$1

mkdir -p $PROJECT_DIR

pushd .
cd $PROJECT_DIR

LOCAL_PROPS_FILE=local.properties

if [ ! -e $LOCAL_PROPS_FILE ]; then
	touch $LOCAL_PROPS_FILE
fi

echo j2objc.home=../localJ2objcDist/j2objc-0.9.8.2.1 > $LOCAL_PROPS_FILE

#translateOnly mode in linux for Android
if [ "$USING_OS" = "linux" ]; then
	echo j2objc.translateOnlyMode=true >> $LOCAL_PROPS_FILE
fi
#See results
echo "./$PROJECT_DIR/local.properties configured:"
cat $LOCAL_PROPS_FILE

if [ "$USING_OS" = "osx" ]; then
	#Build only shared project
	SETTINGS_FILE=settings.gradle

	echo "include ':shared'" > $SETTINGS_FILE
	echo "./$PROJECT_DIR/settings.gradle configured:"
	cat $SETTINGS_FILE
fi

popd