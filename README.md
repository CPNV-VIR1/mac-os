# MAC-OS

## Description

This project is a simple example of a REST API. The goal is to learn docker with it.

## Getting Started
### Prerequisites
- Docker 26.1.1
- PostGreSQL
- IntelliJ IDEA 2024.1.1
- Maven 3.9.7
- Java 17

### Configuration

## Deployment

### On dev environment

1. Clone the repository
2. Start by creating main app image `docker build --tag app .`
3. Then start all containers using this command `docker compose up --build`

### On production environment

1. Clone the repository
2. Start by creating main app image `sudo docker build --tag app .`
3. Then start all containers using this command `sudo docker compose up --build`

## Directory structure

* Tip: try the tree bash command

```shell
├── Dockerfile
├── Makefile
├── README.Docker.md
├── README.md
├── compose.yaml
├── docs
│   └── useCaseDiagram.wsd
├── ms-api-gateway
│   ├── Dockerfile
│   ├── html
│   │   └── 404.html
│   └── nginx
│       ├── api_backends.conf
│       ├── api_conf.d
│       │   ├── errors.conf
│       │   └── macbooks_api.conf
│       ├── api_gateway.conf
│       ├── logs
│       │   ├── access.log
│       │   └── error.log
│       └── nginx.conf
├── ms-db
│   └── Dockerfile
├── ms-delete
│   ├── Dockerfile                 >     Dockerfile that create image based on the main app and copy the specific controller
│   └── MacBookController.java     >     Controller with only delete method
├── ms-get
│   ├── Dockerfile                 >     Dockerfile that create image based on the main app and copy the specific controller
│   └── MacBookController.java     >     Controller with only get methods
├── ms-post
│   ├── Dockerfile                 >     Dockerfile that create image based on the main app and copy the specific controller
│   └── MacBookController.java     >     Controller with only post method
├── ms-put
│   ├── Dockerfile                 >     Dockerfile that create image based on the main app and copy the specific controller
│   └── MacBookController.java     >     Controller with only put method
├── mvnw
├── mvnw.cmd
├── pom.xml
└── src
    ├── main
    └── test
```

## Collaborate

Please respect the git flow conventions by naming your branch the right way.
For the commit please follow the [conventional commits](https://www.conventionalcommits.org/en/v1.0.0/).

## License

[Apache-2.0](https://github.com/CPNV-VIR1/mac-os/blob/main/LICENSE)

## Contact

Please contact us by creating an issue on the repository
