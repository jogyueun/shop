package cloud2.shopingmall.order.entity;

import cloud2.shopingmall.order.dto.OrderDTO;
import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class OrderEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private OrderStatus orderStatus;

    @Column
    @JsonFormat(pattern = "yyyy-MM-dd'T'HH:mm:ss")
    private LocalDateTime orderCreatedAt;

    @Column
    @JsonFormat(pattern = "yyyy-MM-dd'T'HH:mm:ss")
    private LocalDateTime orderModifiedAt;

    @OneToOne
    @JoinColumn(name = "order_user_id")
    private OrderUserEntity orderUserEntity;

    public enum OrderStatus {
        ONE, TWO, THREE,
    }

}
