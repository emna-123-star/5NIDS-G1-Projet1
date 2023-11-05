package tn.esprit.spring.services;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.*;
import org.mockito.junit.jupiter.MockitoExtension;
import tn.esprit.spring.entities.Course;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.boot.test.context.SpringBootTest;
import tn.esprit.spring.repositories.ICourseRepository;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest
@ExtendWith(MockitoExtension.class)

class CourseServicesImplTest {

    @InjectMocks
    private CourseServicesImpl courseServices;

    @Mock
    private ICourseRepository courseRepository;
    @BeforeEach
    void setUp() {
        // Initialize Mockito annotations
        MockitoAnnotations.openMocks(this);
        // Clear the database before each test

    }
    @Test
    void retrieveAllCourses() {
        // Create a sample list of courses for testing
        List<Course> courses = List.of(new Course(), new Course());

        // Set up the behavior of the courseRepository mock
        Mockito.when(courseRepository.findAll()).thenReturn(courses);

        // Test the retrieveAllCourses method
        List<Course> retrievedCourses = courseServices.retrieveAllCourses();
        assertNotNull(retrievedCourses);
        assertEquals(2, retrievedCourses.size());
    }

    @Test
    void addCourse() {
        // Create a sample course for testing
        Course newCourse = new Course();
        newCourse.setNumCourse(1L);

        // Set up the behavior of the courseRepository mock
        Mockito.when(courseRepository.save(Mockito.any(Course.class))).thenReturn(newCourse);

        // Test the addCourse method
        Course addedCourse = courseServices.addCourse(newCourse);
        assertNotNull(addedCourse);
        assertEquals(1L, addedCourse.getNumCourse());
    }

    @Test
    void updateCourse() {
        // Create a sample course for testing
        Course updatedCourse = new Course();
        updatedCourse.setNumCourse(1L);

        // Set up the behavior of the courseRepository mock
        Mockito.when(courseRepository.save(Mockito.any(Course.class))).thenReturn(updatedCourse);

        // Test the updateCourse method
        Course result = courseServices.updateCourse(updatedCourse);
        assertNotNull(result);
        assertEquals(1L, result.getNumCourse());
    }

    @Test
    void retrieveCourse() {
        // Create a sample course for testing
        Course course = new Course();
        course.setNumCourse(1L);

        // Set up the behavior of the courseRepository mock
        Mockito.when(courseRepository.findById(1L)).thenReturn(Optional.of(course));

        // Test the retrieveCourse method
        Course retrievedCourse = courseServices.retrieveCourse(1L);
        assertNotNull(retrievedCourse);
        assertEquals(1L, retrievedCourse.getNumCourse());
    }
}