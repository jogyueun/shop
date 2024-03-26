package cloud2.shopingmall.user.entity;

import cloud2.shopingmall.user.dto.ProfileDTO;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class UserProfileEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String userName;

    @Column
    private String userEmail;

    @Column
    private String userPhoneNumber;

    @Column
    private String userAddress;

    @Column
    private ProfileDTO.Gender gender;

    @Column
    private String birthDate;

    @OneToOne
    @JoinColumn(name = "user_id")
    private UserEntity userEntity;
}
