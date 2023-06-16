    package com.example.taw3;

    import org.springframework.boot.SpringApplication;
    import org.springframework.boot.autoconfigure.SpringBootApplication;
    import org.springframework.web.bind.annotation.*;

    import java.util.ArrayList;
    import java.util.List;

    @SpringBootApplication
    public class Taw3Application {

        private List<Subject> subjects = new ArrayList<>(); // Przechowuje listę przedmiotów
        private int nextSubjectId = 1; // Następne dostępne ID dla nowego przedmiotu

        public static void main(String[] args)
        {
            SpringApplication.run(Taw3Application.class, args);
        }

        @RestController
        public class ApiController
        {

            // Metoda do wprowadzania nowych przedmiotów - wielu naraz
            @PostMapping("/subject")
            public String addSubjects(@RequestBody List<Subject> newSubjects) {
                for (Subject subject : newSubjects) {
                    subject.setId(nextSubjectId++);
                    subjects.add(subject);
                }
                return "Added subjects";
            }

            // Metoda do pobierania przedmiotów
            @GetMapping("/subject")
            public List<Subject> getAllSubjects(@RequestParam(required = false) Boolean hasExam, @RequestParam(required = false) String classroom) {
                List<Subject> filteredSubjects = new ArrayList<>();

                for (Subject subject : subjects) {
                    boolean examMatches = (hasExam == null) || (subject.hasExam() == hasExam);
                    boolean classroomMatches = (classroom == null) || (subject.getClassroom().equals(classroom));

                    if (examMatches && classroomMatches) {
                        filteredSubjects.add(subject);
                    }
                }
                return filteredSubjects;
            }

            // Metoda do pobierania przedmiotu o określonym ID
            @GetMapping("/subject/{id}")
            public Subject getSubjectById(@PathVariable int id) {
                for (Subject subject : subjects) {
                    if (subject.getId() == id) {
                        return subject;
                    }
                }
                return null; // Jeżeli przedmiot o podanym ID nie został znaleziony
            }

            // Metoda do usuwania przedmiotu o określonym ID
            @DeleteMapping("/subject/{id}")
            public String deleteSubject(@PathVariable int id)
            {
                for (Subject subject : subjects)
                {
                    if (subject.getId() == id)
                    {
                        subjects.remove(subject);
                        return "Deleted subject with ID: " + id;
                    }
                }
                return "Subject with ID " + id + " not found";
            }
            // Metoda do usuwania wszystkich przedmiotow
            @DeleteMapping("/subject")
            public String deleteAllSubjects()
            {
                subjects.clear();
                return "Deleted all subjects";
            }

            // Metoda do filtracji "po egzaminie"
            @GetMapping("/subject/exam")
            public List<Subject> subjectsByExam(@RequestParam boolean hasExam)
            {
                List<Subject> filteredSubjects = new ArrayList<>();
                for (Subject subject : subjects)
                {
                    if (subject.hasExam() == hasExam)
                    {
                        filteredSubjects.add(subject);
                    }
                }
                return filteredSubjects;
            }

            // Metoda do filtracji "po sali"
            @GetMapping("/subject/classroom")
            public List<Subject> subjectsByClassroom(@RequestParam String classroom)
            {
                List<Subject> filteredSubjects = new ArrayList<>();
                for (Subject subject : subjects)
                {
                    if (subject.getClassroom().equals(classroom))
                    {
                        filteredSubjects.add(subject);
                    }
                }
                return filteredSubjects;
            }

        }
    }
