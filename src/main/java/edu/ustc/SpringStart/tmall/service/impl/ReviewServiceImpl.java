package edu.ustc.SpringStart.tmall.service.impl;

import edu.ustc.SpringStart.tmall.mapper.ReviewMapper;
import edu.ustc.SpringStart.tmall.pojo.Review;
import edu.ustc.SpringStart.tmall.pojo.ReviewExample;
import edu.ustc.SpringStart.tmall.pojo.User;
import edu.ustc.SpringStart.tmall.service.ReviewService;
import edu.ustc.SpringStart.tmall.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReviewServiceImpl implements ReviewService {
    @Autowired
    ReviewMapper reviewMapper;
    @Autowired
    UserService userService;

    @Override
    public void add(Review record) {
        reviewMapper.insert(record);
    }

    @Override
    public void delete(int id) {
        reviewMapper.deleteByPrimaryKey(id);
    }

    @Override
    public void update(Review record) {
        reviewMapper.updateByPrimaryKey(record);
    }

    @Override
    public Review get(int id) {
        Review review = reviewMapper.selectByPrimaryKey(id);
        setUser(review);
        return review;
    }

    @Override
    public List<Review> list(int pid) {
        ReviewExample example = new ReviewExample();
        example.createCriteria().andPidEqualTo(pid);
        example.setOrderByClause("id desc");

        List<Review> reviews = reviewMapper.selectByExample(example);
        setUser(reviews);
        return reviews;
    }

    @Override
    public int getCount(int pid) {
        return list(pid).size();
    }

    public void setUser(List<Review> reviews) {
        for (Review review : reviews) {
            setUser(review);
        }
    }

    private void setUser(Review review) {
        review.setUser(userService.get(review.getUid()));
    }
}
