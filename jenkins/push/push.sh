#!/bin/bash
echo "########################"
echo "*** Preparing to push ***"
echo "########################"
REGISTRY="ec2-3-142-164-78.us-east-2.compute.amazonaws.com:5000"
IMAGE="app"
echo "*** Tagging image ***"
docker tag $IMAGE:$BUILD_TAG $REGISTRY/$IMAGE:$BUILD_TAG
echo "*** Pushing image ***"
docker push $REGISTRY/$IMAGE:$BUILD_TAG

