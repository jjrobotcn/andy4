#!/bin/bash

LAN=
DIR=

gen() {
    echo "generating language ${LAN}"

    WITH_GO_GATEWAY=
    if [[ ${LAN} == "go" ]]; then
        echo "with go gateway"
        WITH_GO_GATEWAY="--with-gateway \\"
    else
        WITH_GO_GATEWAY=
    fi

    docker run --rm \
            --user 1000:1000 \
            --mount type=bind,src=${DIR},target=/defs \
            namely/protoc-all \
            -l ${LAN} \
            -d /defs \
            -o /defs/${LAN}pb \
            ${WITH_GO_GATEWAY}

    rm -f ${DIR}/__init__.py
}

all() {
    for lan in go ruby csharp java python objc gogo php node cpp
    do
        LAN=${lan}
        gen
    done
}

for ARGUMENT in $@
do
    KEY=$(echo ${ARGUMENT} | cut -f1 -d=)
    VALUE=$(echo ${ARGUMENT} | cut -f2 -d=)

    case ${KEY} in
        -dir)    DIR=${VALUE};;
        -lan)    LAN=${VALUE};;
        *)
    esac
done


if [[ ${LAN} == "" ]]; then
    all
else
    gen
fi
