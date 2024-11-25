# Slingshot 🚀 

**Slingshot**, for **Android** is a boilerplate project designed to accelerate the development of Android applications. With an emphasis on scalability and maintainability, this project provides a ready-made structure based on the **MVVM** architecture pattern and comes pre-configured with essential tools.

This repository is perfect for developers who want to quickly set up an Android app while following best practices and architecture patterns, enabling you to focus on writing the features and logic that matter.

---

## Prerequisites
- Android Studio 
- JDK 11 or higher
- Gradle (usually bundled with Android Studio)

## Getting Started
- Just click on **Use this template**
  
  <img width="500" alt="Use this template" src="https://github.com/user-attachments/assets/1ac174f2-64d9-4d66-b9a8-c01db01aa849">
- And then choose
<img width="185" alt="Create a new repo" src="https://github.com/user-attachments/assets/67a9e934-1184-419d-9d22-4040e2fbdc8e">

- Create a new repo, of your liking.

- Sync the gradle - **and SLINGSHOT your app into the ethos!** 🚀🚀🚀, (I mean run the application xD)

### Optional Setup Customization (Template Configuration)
This template includes several optional configurations for your app (like Room Database, Retrofit Network setup, RecyclerView, and Glide).

You can easily choose what to include or exclude using a bash script during the setup. Here's how:
The script will prompt you to select which setups you want to include in your app (Room Database, Retrofit, RecyclerView, Glide, etc.).

- Run `make setup`, in the terminal.

<img width="1015" alt="Make file in terminal" src="https://github.com/user-attachments/assets/0fad1b6d-5eb5-4f9b-bb57-f0251944c00e">'

If you want to stick with the default setup, simply choose **y** when prompted, and the script will proceed without any changes.

If you choose **n** for any feature, the corresponding dependencies and folders will be removed from your project.

This setup will allow you to quickly customize the project to suit your needs.

## Libraries Used

- **MVVM Architecture**: Easily scale and manage your app's complexity.
- **Retrofit**: Simple, type-safe HTTP client for making network requests.
- **Room Database**: Local storage implementation that allows seamless data persistence.
- **Glide**: Efficient image loading and caching.

## Components Breakdown
1. **ViewModel + Base ViewModel**
   The ViewModel handles UI-related data and persists it during configuration changes. The BaseViewModel class includes common functionality like error handling and loading state management, which can be shared across all ViewModels. The child ViewModel extends BaseViewModel to focus on business logic.

2. **Retrofit + Network Layer**
   Retrofit handles all HTTP requests, and the network layer is abstracted with the help of a repository. This makes it easy to switch data sources or handle responses consistently across the app. The RetrofitClient provides the instance of Retrofit and ensures a single point of configuration for API calls.

3. **Room Database**
   Room is used for local persistence. The repository layer abstracts all interactions with Room, making it simple to fetch, insert, or update data from the local database. It provides a clear separation of concerns, where data access is decoupled from business logic.

4. **Glide for Image Loading**
   Glide is integrated for smooth and efficient image loading. We provide a utility method for consistent image handling across the app, including caching and placeholder management.

5. **Factory Pattern for ViewModels**
   A custom ViewModelFactory is provided to inject dependencies into the ViewModel. This allows for a clean and testable architecture, especially when the ViewModel requires dependencies like repositories or other services.



## Contributing
1. Fork the repository.
2. Create your feature branch (`git checkout -b feature/YourFeature`).
3. Commit your changes (`git commit -m 'Add new feature'`).
4. Push to the branch (`git push origin feature/YourFeature`).
5. Open a pull request.

Please follow the code style and submit tests for new features.

## License
This project is licensed under the MIT License - see the [LICENSE](./LICENSE) file for details.


