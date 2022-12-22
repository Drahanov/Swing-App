# Swing-App
This project was written as a Java Swing coursework.

It is not here to demonstrate knowledge of the swing framework.
Rather, just to confirm knowledge of basic Java skills and understanding of relational databases

# Why is this app needed and what problems does it solve?

Atelier repairs and sews clothes to order. Orders are placed in the studio with the administrator or by phone.
It is necessary to maintain documentation for all orders made, as well as their status (awaiting execution, completed), service performed and which of the seamstresses made them.
The information is stored in order to be able to review the development of the company and analyze the work in the atelier.

The program is developed for use in the company by the owner and workers, with the administrator having switch rights and the seamstresses having the ability to see their tasks and be able to monitor their work. 
The aim is to facilitate the maintenance of documentation as well as the storage, editing and verification of data.

# Code Architecture

Due to the fact that the project is very small, I did not bother much with the implementation of such architectures as MVP, MVVM, MVC, but still, in order not to write all the communication logic with the database inside each View, we divided the application into conditional modules, where The main workhorse for working with the database is the repositories.

# Screens


