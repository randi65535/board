package kr.randi.domain;

import java.util.Date;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class ReplyVO {

	private Long rno;
	private Long bno;
	private Long level;
	private String replyContent;
	private String replyer;
	private Date replyDate;
	private Date updateDate;
	private int deleted;
}
