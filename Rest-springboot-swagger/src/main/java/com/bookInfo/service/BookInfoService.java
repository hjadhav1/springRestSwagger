/**
 * 
 */
package com.bookInfo.service;

import java.util.List;

import com.bookInfo.entity.BookInfo;

/**
 * @author hjadhav1
 *
 */
public interface BookInfoService {

	 public List<BookInfo> retrieveBooks();
	 
	 public BookInfo getBookInfo(Long bookId);
	 
	 public void saveBookInfo(BookInfo bookInfo);
	 
	 public void deleteBookInfo(Long bookInfoId);
	 
	 public void updateBookInfo(BookInfo bookInfo);
}
