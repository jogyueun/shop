package cloud2.shopingmall.order.entity;

import cloud2.shopingmall.order.dto.PaymentDTO;
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
public class PaymentEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private Integer payTotalPrice;

    @Column
    @JsonFormat(pattern = "yyyy-MM-dd'T'HH:mm:ss")
    private LocalDateTime payCreatedAt;

    @Column
    @JsonFormat(pattern = "yyyy-MM-dd'T'HH:mm:ss")
    private LocalDateTime payModifiedAt;

    @Column
    private PayStatus payStatus;

    @OneToOne
    @JoinColumn(name = "order_id")
    private OrderEntity orderEntity;

    public enum PayStatus {
        ONE, TWO, THREE,
    }
}
