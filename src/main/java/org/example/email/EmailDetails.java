package org.example.email;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class EmailDetails {


    private String recipient;
    private String subject;
    private String messageBody;
}
