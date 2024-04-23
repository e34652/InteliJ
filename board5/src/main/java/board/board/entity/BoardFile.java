package board.board.entity;

import lombok.Data;
import org.hibernate.annotations.ColumnDefault;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name="t_file")
public class BoardFile {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idx;
	
	private int boardIdx;
	
	private String originalFileName;
	
	private String storedFilePath;
	
	private long fileSize;


	private String creatorId;
	private LocalDateTime createdDatetime;
	private String updaterId;
	private LocalDateTime updatedDatetime;

	@Column(columnDefinition = "varchar(2) default 'N'")
	private String deletedYn;
}
