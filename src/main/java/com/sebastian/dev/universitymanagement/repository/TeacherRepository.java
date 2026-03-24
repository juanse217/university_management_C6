package com.sebastian.dev.universitymanagement.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.sebastian.dev.universitymanagement.model.entity.Teacher;

public interface TeacherRepository extends JpaRepository<Teacher, Long> {
        // We want to find teachers by dean (teachers -> faculty -> dean)

        List<Teacher> findByFacultyDeanIdentification(Long deanId);

        @Query("""
                        SELECT t FROM Teacher t
                        JOIN t.faculty f
                        JOIN f.dean d
                        WHERE d.identification = :deanId
                        """)
        List<Teacher> findByDeanIdJPQL(Long deanId);

        @Query("""
                        SELECT t FROM Teacher t
                        WHERE t.faculty.dean.identification = :deanId
                        """)
        List<Teacher> findByDeanIdSimplified(Long deanId); // no need for joins, JPA navigates automatically the path.

        @Query(value = """
                        SELECT t.* FROM teachers t
                        JOIN faculties f ON (f.faculty_number = t.faculty_id)
                        JOIN deans d ON (d.faculty_number = f.faculty_number)
                        WHERE d.identification = :deanId
                        """, nativeQuery = true)
        List<Teacher> findByDeanIdSQL(Long deanId);

}
