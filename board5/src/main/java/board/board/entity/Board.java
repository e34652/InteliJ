package board.board.entity;

import lombok.Data;
import lombok.ToString;
import org.hibernate.annotations.ColumnDefault;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.time.LocalDateTime;


@Entity
@Table(name = "t_board")
public class Board{

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int boardIdx;
	
	private String title;
	
	private String contents;
	@ColumnDefault("0")
	private int hitCnt;
	
	private String creatorId;

	private LocalDateTime createdDatetime;
	
	private String updaterId;
	
	private LocalDateTime updatedDatetime;

	@Column(columnDefinition = "varchar(2) default 'N'")
	private String deletedYn;
}
