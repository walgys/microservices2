package com.walgys.student;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Student {
    @Id
    private Long id;
    private String firstName;
    private String lastName;
    private String email;
    private Integer schoolId;
}
