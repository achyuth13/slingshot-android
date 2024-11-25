#!/bin/bash

echo "Some of these dependencies are optional - please select the ones that you want for your project!"
echo "This project has both AppCompat and Compose dependencies, AppCompat is the default, please configure accordingly."


read -p "Do you want to continue with the default setup? AppCompat, RoomDB, Network, Glide? (y/n) " keep_default
if [[ "$keep_default" == "y" || "$keep_default" == "Y" ]]; then
    echo "Proceeding with the default setup. No changes made."
    exit 0
fi

read -p "Do you want to include the Room Database setup? (y/n): " include_db
read -p "Do you want to include Network setup (Retrofit)? (y/n): " include_network
read -p "Does your app need a RecyclerView? (y/n) " include_recycler
read -p "Do you want to include Glide for image loading? (y/n): " include_glide

if [[ "$include_db" != "y" && "$include_db" != "Y" ]]; then
    echo "Skipping database setup..."
    echo "Removing DB dependencies from build.gradle"
    sed -i '' '/room-runtime/d' app/build.gradle
    sed -i '' '/room-compiler/d' app/build.gradle
    rm -rf app/src/main/java/com/caramel/slingshot/db
fi

if [[ "$include_network" != "y" && "$include_network" != "Y" ]]; then
    echo "Skipping Network setup..."
    echo "Removing Network dependencies from build.gradle"
    sed -i '' '/retrofit/d' app/build.gradle
    sed -i '' '/converter-gson/d' app/build.gradle
    sed -i '' '/okhttp/d' app/build.gradle
    rm -rf app/src/main/java/com/caramel/slingshot/network
fi

if [[ "$include_glide" != "y" && "$include_glide" != "Y" ]]; then
    echo "Skipping Glide setup..."
    echo "Removing Glide dependencies from build.gradle"
    sed -i '' '/glide/d' app/build.gradle
    sed -i '' '/compiler/d' app/build.gradle
    rm -rf app/src/main/java/com/caramel/slingshot/util/ImageUtil.kt
fi

if [[ "$include_recycler" != "y" && "$include_recycler" != "Y" ]]; then
    echo "Skipping RecyclerView setup..."
    echo "Removing RecyclerView dependency from build.gradle"
    sed -i '' '/recyclerview/d' app/build.gradle
    rm -rf app/src/main/java/com/caramel/slingshot/adapters
fi

echo "Slingshot is ready!, don't forget to sync the gradle!"
