# BadCookiesOut - Exe version

## Currently solves cookie consent banners:

- Solves >>> https://www.kdomivolal.eu/
- Solves >>> https://www.mediafire.com/download/gp00z1oqvlmc4pr
- WIP >>> https://icon-icons.com/search/icons/?filtro=google+chrome

## Warning

- The automatic unchecking currently works only in the default browser tab. 

- Additionally, if the program has been launched, you will need to either restart your computer or end the task in Task Manager before you can remove or move the program.

## Overview
This is a modified version of the Selenium-based Java program that has been packaged to be executed via an `.exe` shortcut located directly in the project folder. Users no longer need to run the program through an IDE (like IntelliJ IDEA) or worry about setup. With this version, you can simply execute the `.exe` shortcut, and the program will automatically launch the browser, detect cookie consent banners, and uncheck unwanted cookie options.

The `.exe` shortcut version makes it easier for non-technical users to run the program without needing to install or configure any development tools.

## Features:

**Selenium WebDriver Automation:** Detects and manages cookie consent banners on supported websites.

**Simple Setup:** Users can run the program directly without installing IntelliJ IDEA or other development tools.

**Privacy-Focused:** Unchecks unwanted cookies related to tracking and advertising, improving user privacy.

**Support for Multiple Websites:** Currently supports for most common cookie consent banners with the option to expand in the future.

## Use Cases
#### - Avoiding Tracking and Advertisement Cookies:
Users who want to browse the web without being tracked or bombarded by targeted ads can use the program to automatically uncheck all cookies related to tracking, advertising, and analytics.

#### - Time-Saving for Frequent Visitors:
For users who visit websites with intrusive cookie banners frequently, the program can save time by automatically managing cookie preferences every time they visit these sites, removing the need for manual intervention.

## User Story
As a privacy-conscious user, I want a tool that will automatically detect and uncheck all unwanted cookies whenever I visit certain websites, so that I can maintain my privacy without the need to manually adjust cookie settings each time I visit.

## How It Works
#### - Cookie Detection:
The program  detects a cookie consent popup on the websites you visit. This includes identifying cookie settings that offer options to accept cookies for tracking, advertising, or analytics.

#### - Automatic Unchecking:
The program automatically identifies the checkboxes that typically relate to privacy-invasive cookies (such as analytics or marketing cookies) and unchecks them.

## Requirements
- **Browser:** Latest version of Chrome.
- **Operating System:** Windows, macOS, or Linux.
- **Java:** Make sure Java is installed on your system.

## Installation Guide
#### - Prerequisites
Make sure Java is installed on your system. You can verify this by running the following in your terminal or command prompt:

`java -version`

If Java is not installed, download and install it from Oracle's website.

#### - Clone or Download the Repository:
Clone the repository or download it as a ZIP file to your local machine.

#### - Locate the Shortcut:
After downloading or cloning the repository, navigate to the project folder. In this folder, you will find a shortcut to the `BadCookiesOut(Chrome).exe` file.

#### - Run the Program:
Double-click the shortcut to run the program. The `.exe` will automatically execute the `.jar` file and start the automated process without needing to modify anything.

#### - Move the Shortcut (Optional):
You can move the shortcut anywhere on your computer (e.g., your desktop) for quick access to the program.

## Troubleshooting:
#### - Java Not Found:
If you get an error saying `java` is not recognized, make sure Java is installed and the `java` command is accessible by adding it to your system’s PATH environment variable.
You can verify Java is installed by running:

`java -version`

#### - Program Does Not Start:
If the program does not start when double-clicking the shortcut, ensure that the .exe file and the .jar file are still in the same directory (BadCookiesOut\out\artifacts\BadCookiesOut_jar). The .exe relies on the .jar file being in the same folder to execute properly.

## Credits

- "Chrome" icon by [Icons8](https://icons8.com/icon/ejub91zEY6Sl/chrome).
- "Cookies" icon by [Icons8](https://icons8.com/icon/51173/cookies).
- Icon created using [Icons8 Lunacy](https://icons8.com/lunacy).
