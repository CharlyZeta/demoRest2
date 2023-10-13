package ar.gerardo.demorest;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data // usa lombok para el uso de Setter y Getters, contructores, etc.
@Entity
@RequiredArgsConstructor    //genera un constructor con los argumentos obligatorios con @NotNull
public class Curso {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @NotNull
    @NotBlank   //anotacion de spring.validation para controlar y validar los datos. Para que no tenga valores nulos
    private String titulo;

    @NotNull
    @Positive   //validación para que el precio sea positivo
    private Float precio;


}
