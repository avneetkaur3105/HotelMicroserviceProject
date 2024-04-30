package com.app.service.hotel.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name="Hotel_micro")
public class Hotel {
    @Id
    @Column(name="hotel_id")
    private String id;
    @Column(name="hotel_name")
    private String name;
    @Column(name="hotel_location")
    private String location;
    @Column(name="hotel_about")
    private String about;
}
