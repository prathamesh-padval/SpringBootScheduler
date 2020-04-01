Spring boot scheduler application
=======================================

If someone needs to change the specified time, they should go to application.properties and change the cron expression using following rules


1.Seconds can have values 0-59 or the special characters , - * / .

2.Minutes can have values 0-59 or the special characters , - * / .

3.Hours can have values 0-59 or the special characters , - * / .

4.Day of month can have values 1-31 or the special characters , - * ? / L W C .

5.Month can have values 1-12, JAN-DEC or the special characters , - * / .

6.Day of week can have values 1-7, SUN-SAT or the special characters , - * ? / L C # .

7.Year can be empty, have values 1970-2099 or the special characters , - * / .


Scheduled(cron = "[Seconds] [Minutes] [Hours] [Day of month] [Month] [Day of week] [Year]")
