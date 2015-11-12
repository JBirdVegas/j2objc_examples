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

#translateOnly mode
if [ "${J2OBJC_TRANSLATE_ONLY:=false}" == "true" ]; then
	echo j2objc.translateOnlyMode=true >> $LOCAL_PROPS_FILE
fi
#See results
echo "./$PROJECT_DIR/local.properties configured:"
cat $LOCAL_PROPS_FILE

#Build only shared project
SETTINGS_FILE=settings.gradle

echo "include ':shared'" > $SETTINGS_FILE
echo "./$PROJECT_DIR/settings.gradle configured:"
cat $SETTINGS_FILE

popd