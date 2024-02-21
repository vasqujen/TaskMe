# <img width="30" alt="Screenshot 2024-02-20 at 10 47 35 PM" src="https://github.com/vasqujen/TaskMe/assets/59947755/338a3b44-0607-4c00-8fa9-ed57358c3643"> TaskMe

## Description
TaskMe helps users organize tasks, prioritize activities, and manage time effectively. TaskMe offers a convenient 
platform for tracking tasks and boosting productivity. By providing a structured approach to task management, 
TaskMe aids in achieving goals and maintaining focus on essential activities.

## Screenshots
<img width="358" alt="Screenshot 2024-02-20 at 11 04 56 PM" src="https://github.com/vasqujen/TaskMe/assets/59947755/b43d8238-6c5f-48ca-a03b-de2c3eb473c2">

## Installation

1. Open the project in Android Studio.
2. Build and run the project on an emulator or physical device.

## Features

- Add a new task by entering Title & Description.
- Option to sort tasks alphabetically or by date added.
- Lists tasks that have yet to be completed.
- Items persist acrosss app sessions.

 ## Architecture
- MVVM architecture was chosen for the TaskMe app to enhance code organization, 
  promote testability, support future scalability, and leverage native Android Jetpack support, 
  thereby ensuring the app's long-term stability, maintainability, and user satisfaction.
- 'com/example/taskme/data' will contain all Database related files
- 'com/example/taskme/presentation' will contain all files made to handle how the data from the database gets displayed to the user.


## Technologies Used

- Room Library
- Jetpack Compose

## Considerations
- UI Enhancements
- Set reminders for a specific task
- 'Done' section where user is able to look at completed tasks for the day.
