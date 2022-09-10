package com.example.restaurant.wishList.dto;

import com.example.restaurant.db.MemoryDbEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class WishListDto {

    private int index;
    private String title;                       // 음식, 장소명
    private String category;                    // 카테고리
    private String address;                     // 주소
    private String readAddress;                 // 도로명
    private String homePageLink;                // 홈페이지
    private String imageLink;
    private boolean isVisit;                    // 방문여부
    private int visitCount;                     // 방문 횟수
    private LocalDateTime lastVisitDate;        // 마지막 방문일지

}
