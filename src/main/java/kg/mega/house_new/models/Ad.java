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
@Table(name = "ads")
public class Ad {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    @ManyToOne
    @JoinColumn(name = "room_type_id")
    Dictionary roomType;
    @ManyToOne
    @JoinColumn(name = "serial_id")
    Dictionary serial;
    @ManyToOne
    @JoinColumn(name = "deal_type_id")
    Dictionary dealType;
    @ManyToOne
    @JoinColumn(name = "real_estate_type_id")
    Dictionary realEstateType;
    @ManyToOne
    @JoinColumn(name = "building_type_id")
    Dictionary buildingType;
    @ManyToOne
    @JoinColumn(name = "heating_type_id")
    Dictionary heatingType;
    @ManyToOne
    @JoinColumn(name = "condition_id")
    Dictionary condition;
    @ManyToOne
    @JoinColumn(name = "currency_id")
    Dictionary currencyType;
    @ManyToOne
    @JoinColumn(name = "price_type_id")
    Dictionary priceType;
    @ManyToOne
    @JoinColumn(name = "exchange_variant_id")
    Dictionary exchangeVariant;
    boolean installment;
    boolean mortgage;
    @ManyToOne
    @JoinColumn(name = "address_id")
    Address address;
}
