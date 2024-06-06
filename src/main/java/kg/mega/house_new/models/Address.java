package kg.mega.house_new.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "addresses")
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    String localityName;
    @ManyToOne
    @JoinColumn(name = "locality_type_id")
    Dictionary localityType;
    @ManyToOne
    @JoinColumn(name = "parent_locality_type_id")
    Dictionary parentLocalityType;
    String street;
    String house;
    int flat;
}
