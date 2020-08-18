package challange.aceleradev.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.time.LocalDateTime;

@Data
@EqualsAndHashCode(of = "id")
@AllArgsConstructor
@NoArgsConstructor
@Entity
@EntityListeners(AuditingEntityListener.class)
public class Log {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private short level;
    @Column
    @NotNull
    @Size(max = 100)
    private String description;
    @Column
    @NotNull
    @Size(max = 500)
    private String logEvent;
    @Column
    @NotNull
    @Size(max = 100)
    private String application;

    private LocalDateTime dateEvent;

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm")
    @CreatedDate
    private LocalDateTime createdAt;

    private int Count;
}
