/**
 * 
 */
package com.bookInfo.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bookInfo.entity.BookInfo;
import com.bookInfo.repository.BookInfoRepository;
import com.bookInfo.service.BookInfoService;

/**
 * @author hjadhav1
 *
 */
@Service
public class BookInfoServiceImpl implements BookInfoService{

	 @Autowired
	 private BookInfoRepository bookInfoRepository;

	 public void setBookInfoRepository(BookInfoRepository bookInfoRepository) {
	  this.bookInfoRepository = bookInfoRepository;
	 }
	 
	 public List<BookInfo> retrieveBooks() {
	  List<BookInfo> bookInfos = bookInfoRepository.findAll();
	  return bookInfos;
	 }
	 
	 public BookInfo getBookInfo(Long bookInfoId) {
	  Optional<BookInfo> optEmp = bookInfoRepository.findById(bookInfoId);
	  return optEmp.get();
	 }
	 
	 public void saveBookInfo(BookInfo bookInfo){
	  bookInfoRepository.save(bookInfo);
	 }
	 
	 public void deleteBookInfo(Long bookInfoId){
	  bookInfoRepository.deleteById(bookInfoId);
	 }
	 
	 public void updateBookInfo(BookInfo bookInfo) {
	  bookInfoRepository.save(bookInfo);
	 }
}
