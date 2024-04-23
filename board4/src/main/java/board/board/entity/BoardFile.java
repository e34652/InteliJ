package board.board.entity;

import lombok.Data;
import lombok.ToString;
import org.hibernate.annotations.ColumnDefault;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;


@Data
@Entity
@Table(name = "t_file")
public class BoardFile{

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int boardIdx;

	private String title;
	
	private String contents;
	@ColumnDefault("0")
	private int hitCnt;

	private String creatorId;
	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	private String createdDatetime;

	private String updaterId;

	private String updatedDatetime;

	@Column(columnDefinition = "varchar(2) default 'N'")
	private String deletedYn;
}
