package com.project88.banking.entity;

import java.io.Serializable;
import java.time.LocalDateTime;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "`transaction_history`")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class TransactionHistory implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "`trans_id`")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long transID;

    @Column(name = "createDate", updatable = false, insertable = false)
    private LocalDateTime createDate;

    @Column(name = "transType", nullable = false)
    private String transType;

    @Column(name = "content", length = 800)
    private String content;

    @ManyToOne
    @JoinColumn(name = "`user_id`")
    @JsonManagedReference
    private User user;

    @Column(name = "fee", nullable = false)
    private int fee;

    // văn thêm
    @Column(name = "end_balance", nullable = false)
    private int endBalance;

    public TransactionHistory(LocalDateTime createDate, String transType, String content, int fee) {
        this.createDate = createDate;
        this.transType = transType;
        this.content = content;
        this.fee = fee;
    }

    // văn thêm
    public TransactionHistory(String transType, String content, int fee, User user, int endBalance) {
        this.transType = transType;
        this.content = content;
        this.fee = fee;
        this.user = user;
        this.endBalance = endBalance;
    }
}
