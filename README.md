# Artifactory Provisioning with Docker-Compose

This directory provides a script to spin up different type of Artifactory with Docker Compose.
Artifactory is available as Docker Pro images.
These images are available for download from [JFrog Bintray](https://bintray.com/jfrog) 

## Persistent Storage

For persistent storage, all volumes are mounted from the host.  
All examples default to the host's **/data** directory.
- Artifactory data: **/data/artifactory**
- PostgreSQL data: **/data/postgresql**
- NginX
  - Logs: **/data/nginx/log**
  - SSL: **/data/nginx/ssl**
After executing the script, the needed set of data directories for Artifactory Pro or HA will be created under /data (on Mac it defaults to ~/.artifactory).

### Prerequisites

- Docker
- Docker-Compose
- Python

```
Example on MAC OS (High Sierra 10.13.6):

Docker version 18.06.1-ce
docker-compose version 1.22.0
Python 3.7.1

Example on Linux (CentOS 7.5):

Docker version 18.09.0
docker-compose version 1.23.1
Python 3.6.3
```

### Installing on Mac OS

A step by step series of how to get a development env running on Mac OS Sierra
To learn how to set Docker Compose up, please refer to the [Docker Compose](https://docs.docker.com/compose/install/).

```bash
brew install python3

python3 --version

python3 -m venv provision

source provision/bin/activate

pip install --upgrade pip

pip install -r bin/python/noversion_requirements.txt
```

### Installing on Linux

A step by step series of how to get a development env running on Linux CentOS 7
To learn how to set Docker Compose up, please refer to the [Docker Compose](https://docs.docker.com/compose/install/).

```bash
sudo yum install centos-release-scl

sudo yum install rh-python36

scl enable rh-python36 bash

python --version

python -m venv provision

source provision/bin/activate

pip install --upgrade pip

pip install -r bin/python/noversion_requirements.txt
```

## Running the script on Mac OS

To run with default arguements (defined in bin/.env):

```bash
./bin/construct.sh
```

To run with customized arguements:

```bash
./bin/construct.sh -a 5.11.0 -n 2 -cf
```

To find further help, please run:

```bash
./bin/construct.sh -h
```

## Running the script on CentOS

To run with default arguements (defined in bin/.env):

```bash
cd bin
sudo sh -c ". ../provision/bin/activate ; pip install -r python/noversion_requirements.txt; ./construct.sh"
```

To run with customized arguements:

```bash
cd bin
sudo sh -c ". ../provision/bin/activate ; pip install -r python/noversion_requirements.txt; ./construct.sh -a 5.11.0 -n 2 -cf"
```

To find further help, please run:

```bash
cd bin
sudo sh -c ". ../provision/bin/activate ; pip install -r python/noversion_requirements.txt; ./construct.sh -h"
```

### Break down into end to end tests

Explain what these tests test and why

```bash
Give an example
```

