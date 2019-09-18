package com.sungjoonhong.springboot.domain;

import lombok.Data;

public @Data class BoardVO {

	private Integer bno;
	private String title;
	private String writer;
	private String contents;
}
