/**
 * 
 */
package com.bookInfo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.bookInfo.entity.BookInfo;
import com.bookInfo.service.BookInfoService;

/**
 * @author hjadhav1
 *
 */
@RestController
public class BookInfoRestController {

	@Autowired
	 private BookInfoService bookInfoService;
	 
	 public void setBookInfoService(BookInfoService bookInfoService) {
	  this.bookInfoService = bookInfoService;
	 }

	 @GetMapping("/api/bookInfos")
	 public List<BookInfo> getBookInfos() {
	  List<BookInfo> bookInfos = bookInfoService.retrieveBooks();
	  return bookInfos;
	 }
	 
	 @GetMapping("/api/bookInfos/{bookInfoId}")
	 public BookInfo getBookInfo(@PathVariable(name="bookInfoId")Long bookInfoId) {
	  return bookInfoService.getBookInfo(bookInfoId);
	 }
	 
	 @PostMapping("/api/bookInfos")
	 public void saveBookInfo(BookInfo bookInfo){
	  bookInfoService.saveBookInfo(bookInfo);
	  System.out.println("BookInfo Saved Successfully");
	 }
	 
	 @DeleteMapping("/api/bookInfos/{bookInfoId}")
	 public void deleteBookInfo(@PathVariable(name="bookInfoId")Long bookInfoId){
	  bookInfoService.deleteBookInfo(bookInfoId);
	  System.out.println("BookInfo Deleted Successfully");
	 }
	 
	 @PutMapping("/api/bookInfos/{bookInfoId}")
	 public void updateBookInfo(@RequestBody BookInfo bookInfo,
	   @PathVariable(name="bookInfoId")Long bookInfoId){
	  BookInfo emp = bookInfoService.getBookInfo(bookInfoId);
	  if(emp != null){
	   bookInfoService.updateBookInfo(bookInfo);
	  }
	  
	 }
}
