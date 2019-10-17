package edu.ustc.SpringStart.tmall.service;

import edu.ustc.SpringStart.tmall.pojo.Review;
import org.springframework.stereotype.Service;

import java.util.List;


public interface ReviewService {
    void add(Review record);

    void delete(int id);
    void update(Review record);
    Review get(int id);
    List list(int pid);

    int getCount(int pid);
}
