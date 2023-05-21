package com.example.starbucks.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Data
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "user")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(updatable = false, name = "userId")
    private Long id;
    @Column
    private Role role;
    @Column
    private String bio;
    @Column(unique = true)
    private Integer phone;
    @Column
    private String address;
    @Column
    private Integer password;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "fk_order_id", referencedColumnName = "userId")
    private List<Order> order;

}
