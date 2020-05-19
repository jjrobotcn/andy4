DOCKER_IMAGE=namely/protoc-all:1.29_1

all: gen_sdks python_2to3

gen_sdks:
	docker run --rm \
		--mount type=bind,src="${PWD}/scripts",target=/scripts \
		--mount type=bind,src="${PWD}/proto",target=/proto \
		-v $(PWD)/gosdk:/defs/gosdk \
		-v $(PWD)/nodesdk:/defs/nodesdk \
		-v $(PWD)/javasdk:/defs/javasdk \
		-v $(PWD)/pythonsdk:/defs/pythonsdk \
		--entrypoint /scripts/generate.sh \
		${DOCKER_IMAGE}

python_2to3:
	docker run --rm \
    -v $(PWD)/pythonsdk:/pythonsdk \
    -w /pythonsdk \
    python:3.8-slim \
    2to3 -w -n .

clean:
	for sdk in gosdk javasdk nodesdk pythonsdk; do \
    find $${sdk}/* -maxdepth 0 -type d -exec rm -r {} \; ;\
	done
