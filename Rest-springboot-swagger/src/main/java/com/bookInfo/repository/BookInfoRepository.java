/**
 * 
 */
package com.bookInfo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bookInfo.entity.BookInfo;

/**
 * @author hjadhav1
 *
 */
@Repository
public interface BookInfoRepository  extends JpaRepository<BookInfo,Long>{

}
