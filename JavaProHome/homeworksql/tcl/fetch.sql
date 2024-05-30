SELECT *
FROM Homework;

SELECT Lesson.*, Homework.name AS homework_name, Homework.description AS homework_description
FROM Lesson
         LEFT JOIN Homework ON Lesson.homework_id = Homework.id;

SELECT Lesson.*, Homework.name AS homework_name, Homework.description AS homework_description
FROM Lesson
         LEFT JOIN Homework ON Lesson.homework_id = Homework.id
ORDER BY Lesson.updatedAt;

SELECT Schedule.*, Lesson.name AS lesson_name, Lesson.updatedAt AS lesson_updatedAt
FROM Schedule
         LEFT JOIN Schedule_Lesson ON Schedule.id = Schedule_Lesson.schedule_id
         LEFT JOIN Lesson ON Schedule_Lesson.lesson_id = Lesson.id;

SELECT Schedule.id, Schedule.name, COUNT(Schedule_Lesson.lesson_id) AS lesson_count
FROM Schedule
         LEFT JOIN Schedule_Lesson ON Schedule.id = Schedule_Lesson.schedule_id
GROUP BY Schedule.id, Schedule.name;