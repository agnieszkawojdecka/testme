# mission-control-env-utils

This directory provides a script to spin up different types of Artifactory with Docker Compose.
Artifactory is started with its dependencies PostgreSQL and Nginx.
These Artifactory images are available for download from [JFrog Bintray](https://bintray.com/jfrog) 

## Persistent Storage

For persistent storage, all volumes are mounted from the host.  
All examples default to the host's **data** directory that is created next to bin.
- Artifactory data: **data/<project-global-name>/<timestamp>/<project-index>/artifactory**
- PostgreSQL data: **data/<project-global-name>/<timestamp>/<project-index>/postgresql**
- NginX
  - Logs: **data/<project-global-name>/<timestamp>/<project-index>/nginx/log**
  - SSL: **data/<project-global-name>/<timestamp>/<project-index>/nginx/ssl**

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

cd mission-control-env-utils

python3 -m venv provision

source provision/bin/activate

pip install --upgrade pip

pip install -r bin/python/noversion_requirements.txt
```

## Running the script on Mac OS

Input needs to be defined first in

```bash
vi bin/input.json
```

To run:

```bash
cd bin
python run_provision.py input.json
```

To rerun:

```bash
python run_provision.py input.json -c
```








