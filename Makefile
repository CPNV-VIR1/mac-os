build:
	docker build --tag app .
	docker compose build

up: build
	docker compose up
