# Featurama

Is a Feature Toggle Service that allows you to manage feature toggles in your software products. With this service, you can selectively enable or disable parts of your application, which is especially useful for enabling gradual rollouts and for A/B testing.

The service provides gradual dial-up of features such that you can allocate a percentage of users to a feature. For example, you can enable a feature for 10% of users, and then gradually increase the percentage to 100% over time. This allows you to test new features with a small subset of users before rolling them out to everyone.

## Getting Started

These instructions will get you a copy of the project up and running on your local machine for development and testing purposes.

### Prerequisites

- Java 17 or higher
- Maven 3.6.0 or higher

### Installation

1. Clone the repository
   1. `git clone https://github.com/username/Featurama.git`
2. Navigate into the directory
    1. `cd Featurama`
3. Build the project
    1. `mvn clean install`
4. Run the project
   1. `mvn spring-boot:run`


## Using the Service

After the service is running, you can create, update, and delete feature toggles, as well as check the status of a feature toggle.

The main endpoints are:

- `GET /api/v1/experiment`: Get all feature toggles under team ownership.
- `GET /api/v1/experiment/{experimentName}`: Get a specific feature toggle.
- `POST /api/v1/experiment`: Create a new feature toggle.
- `PUT /api/v1/experiment/{experimentName}`: Update a specific feature toggle.
- `DELETE /api/v1/experiment/{experimentName}`: Delete a specific feature toggle.

You can use a REST client like Postman to interact with these endpoints.

## Running Tests

To run the unit tests, use: `mvn test`



