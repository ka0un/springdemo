# Project Documentation

## Project Overview

Simple Spring boot demo that store name of a user with id 

## Getting Started

1. Clone
3. Run (using Maven)

```
mvn spring-boot:run
```

port 8080.

## API Documentation

### Get All Users

- **URL:** `/users`
- **Method:** `GET`
- **Response:** A list of all users.

### Get User by ID

- **URL:** `/users/{id}`
- **Method:** `GET`
- **URL Params:** `id=[integer]`
- **Response:** The user with the specified ID.

### Create User

- **URL:** `/users`
- **Method:** `POST`
- **Data Params:** JSON object representing the user.

```json
{
    "name": "[string]"
}
```

- **Response:** The created user.

### Update User

- **URL:** `/users/{id}`
- **Method:** `PUT`
- **URL Params:** `id=[integer]`
- **Data Params:** JSON object representing the user.

```json
{
    "name": "[string]"
}
```

- **Response:** The updated user.

### Delete User

- **URL:** `/users/{id}`
- **Method:** `DELETE`
- **URL Params:** `id=[integer]`
- **Response:** No content.

## Database

This application user H2 in-memory database and ibatis sql mapping tool to communicate with it
[!] database is volatile and stays in the memory itself
