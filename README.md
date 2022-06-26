# IPL Dashboard

Browse your favorite IPL teams and access their past games details, wins and losses ratios - accessible by team and tournament year.

## Technologies Used

* Spring Boot
* Spring Batch
* Java Persistence API, Repositories and JPQL
* HSQL DB
* React JS
* AWS BeanStalk

## Data Set Used
https://www.kaggle.com/patrickb1912/ipl-complete-dataset-20082020/metadata

## How To Run?
- Go to the frontend folder path and do **npm install** to fetch the dependencies.
- This should be followed by a **npm start** to start the frontend app.
- Start the springboot application and visit **localhost:3000**.
- **Note** - The springboot app runs on the port 8080 (default) whereas the react app runs on the port 3000 (default) in this case.

## How To Build?
- Change the root url in the env file.
- Go to the frontend folder path and do **npm install** to fetch the dependencies.
- This should be followed by a **npm run build** to generate the build for the react app (also gets copied to the appropriate path in the springboot app).
- Start the springboot application and visit **localhost:8080**.
- **Note** - In this case, since the frontend build resources are now part of the springboot app hence they can be accessed directly by the springboot app and we do not need to run the react app separately.

## How To Deploy?
- Go to the frontend folder path and do **npm install** to fetch the dependencies.
- This should be followed by a **npm run build** to generate the build for the react app (also gets copied to the appropriate path in the springboot app).
- Change path to the springboot application and then run **./mvnw install** to generate a build (jar file) for the springboot application.
- This jar file can now be deployed to a cloud provider of your choice.