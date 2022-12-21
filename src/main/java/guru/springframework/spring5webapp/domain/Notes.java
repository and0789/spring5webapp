package guru.springframework.spring5webapp.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
public class Notes {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne
    private Recipe recipe;

    @Lob // untuk mengijinkan agar bisa di isi lebih dari 255 karakter
    private String recipeNotes;
}
